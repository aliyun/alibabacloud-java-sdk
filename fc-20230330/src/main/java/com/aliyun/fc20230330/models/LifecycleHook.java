// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class LifecycleHook extends TeaModel {
    /**
     * <p>函数生命周期初始化阶段回调指令，生命周期回调方法的执行入口 handler 和 command 不允许同时配置，只能有一个生效，同时配置会产生错误提示</p>
     */
    @NameInMap("command")
    public java.util.List<String> command;

    /**
     * <p>The handler of the hook. The definition is similar to that of a request handler.</p>
     * 
     * <strong>example:</strong>
     * <p>index.initializer</p>
     */
    @NameInMap("handler")
    public String handler;

    /**
     * <p>The timeout period of the hook. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("timeout")
    public Integer timeout;

    public static LifecycleHook build(java.util.Map<String, ?> map) throws Exception {
        LifecycleHook self = new LifecycleHook();
        return TeaModel.build(map, self);
    }

    public LifecycleHook setCommand(java.util.List<String> command) {
        this.command = command;
        return this;
    }
    public java.util.List<String> getCommand() {
        return this.command;
    }

    public LifecycleHook setHandler(String handler) {
        this.handler = handler;
        return this;
    }
    public String getHandler() {
        return this.handler;
    }

    public LifecycleHook setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

}
