// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class HTTPTriggerConfig extends TeaModel {
    // 认证类型
    @NameInMap("authType")
    public String authType;

    // 允许的HTTP方法列表
    @NameInMap("methods")
    public java.util.List<String> methods;

    public static HTTPTriggerConfig build(java.util.Map<String, ?> map) throws Exception {
        HTTPTriggerConfig self = new HTTPTriggerConfig();
        return TeaModel.build(map, self);
    }

    public HTTPTriggerConfig setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public HTTPTriggerConfig setMethods(java.util.List<String> methods) {
        this.methods = methods;
        return this;
    }
    public java.util.List<String> getMethods() {
        return this.methods;
    }

}
