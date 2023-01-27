package splashtest;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setSize(100,100);
        jFrame.getContentPane().add(new JLabel("Hello World!"));
        jFrame.setVisible(true);
    }
}
