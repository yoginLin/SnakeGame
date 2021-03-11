package com.yogin.snake;

import javax.swing.*;

public class StartGames {
    public static void main(String[] args) {
        // 1、绘制一个静态窗口 JFrame
        JFrame frame = new JFrame("贪吃蛇");
        // 设置界面的大小
        frame.setBounds(10,10,900,720);
        frame.setResizable(false);  //设置窗口大小不可改变
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //设置关闭事件，游戏就可以关闭了

        // 2、窗口只是相当于一张纸，我们要在上面画画，就需要面板 JPanel，可以加入到JFrame
        frame.add(new GamePanel());

        frame.setVisible(true); //让窗口能够展现出来
    }
}
