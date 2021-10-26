// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class LifecycleHook extends TeaModel {
    // handler name
    @NameInMap("handler")
    public String handler;

    // timeout in second
    @NameInMap("timeout")
    public Integer timeout;

    public static LifecycleHook build(java.util.Map<String, ?> map) throws Exception {
        LifecycleHook self = new LifecycleHook();
        return TeaModel.build(map, self);
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
