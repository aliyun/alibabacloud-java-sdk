// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class TriggerConfig extends TeaModel {
    @NameInMap("authType")
    public String authType;

    @NameInMap("methods")
    public java.util.List<String> methods;

    public static TriggerConfig build(java.util.Map<String, ?> map) throws Exception {
        TriggerConfig self = new TriggerConfig();
        return TeaModel.build(map, self);
    }

    public TriggerConfig setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public TriggerConfig setMethods(java.util.List<String> methods) {
        this.methods = methods;
        return this;
    }
    public java.util.List<String> getMethods() {
        return this.methods;
    }

}
