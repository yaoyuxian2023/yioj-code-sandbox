package com.yupi.yiojcodesandbox;


import com.yupi.yiojcodesandbox.model.ExecuteCodeRequest;
import com.yupi.yiojcodesandbox.model.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 */
public interface CodeSandbox {

    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
