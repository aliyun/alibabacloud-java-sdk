// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CodeInterpreterSessionConfig extends TeaModel {
    /**
     * <p>代码解释器会话的环境变量配置</p>
     * 
     * <strong>example:</strong>
     * <p>PYTHONPATH=/app,DEBUG=true</p>
     */
    @NameInMap("environment")
    public java.util.Map<String, String> environment;

    /**
     * <p>代码解释器会话的超时时间，单位为秒</p>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("timeout")
    public Integer timeout;

    /**
     * <p>代码解释器会话的工作目录路径</p>
     * 
     * <strong>example:</strong>
     * <p>/app</p>
     */
    @NameInMap("workingDirectory")
    public String workingDirectory;

    public static CodeInterpreterSessionConfig build(java.util.Map<String, ?> map) throws Exception {
        CodeInterpreterSessionConfig self = new CodeInterpreterSessionConfig();
        return TeaModel.build(map, self);
    }

    public CodeInterpreterSessionConfig setEnvironment(java.util.Map<String, String> environment) {
        this.environment = environment;
        return this;
    }
    public java.util.Map<String, String> getEnvironment() {
        return this.environment;
    }

    public CodeInterpreterSessionConfig setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public CodeInterpreterSessionConfig setWorkingDirectory(String workingDirectory) {
        this.workingDirectory = workingDirectory;
        return this;
    }
    public String getWorkingDirectory() {
        return this.workingDirectory;
    }

}
