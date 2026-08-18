// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class LifecycleHook extends TeaModel {
    /**
     * <p>The callback command for the function lifecycle initialization phase. The handler and command parameters for the lifecycle hook execution entry point cannot be configured at the same time. Only one can take effect. Configuring both produces an error.</p>
     */
    @NameInMap("command")
    public java.util.List<String> command;

    /**
     * <p>The execution entry point of the hook, similar in meaning to the handler.</p>
     * 
     * <strong>example:</strong>
     * <p>index.initializer</p>
     */
    @NameInMap("handler")
    public String handler;

    /**
     * <p>The timeout period of the hook, in seconds.</p>
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
