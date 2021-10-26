// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class PreFreeze extends TeaModel {
    // preFreeze handler name
    @NameInMap("handler")
    public String handler;

    // handler timeout
    @NameInMap("timeout")
    public Integer timeout;

    public static PreFreeze build(java.util.Map<String, ?> map) throws Exception {
        PreFreeze self = new PreFreeze();
        return TeaModel.build(map, self);
    }

    public PreFreeze setHandler(String handler) {
        this.handler = handler;
        return this;
    }
    public String getHandler() {
        return this.handler;
    }

    public PreFreeze setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

}
