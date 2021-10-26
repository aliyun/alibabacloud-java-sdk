// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class PreStop extends TeaModel {
    // PreStop handler
    @NameInMap("handler")
    public String handler;

    // PreStop hander timeout
    @NameInMap("timeout")
    public Integer timeout;

    public static PreStop build(java.util.Map<String, ?> map) throws Exception {
        PreStop self = new PreStop();
        return TeaModel.build(map, self);
    }

    public PreStop setHandler(String handler) {
        this.handler = handler;
        return this;
    }
    public String getHandler() {
        return this.handler;
    }

    public PreStop setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

}
