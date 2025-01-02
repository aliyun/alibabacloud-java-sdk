// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class AuthConfig extends TeaModel {
    @NameInMap("authMode")
    public String authMode;

    @NameInMap("authType")
    public String authType;

    public static AuthConfig build(java.util.Map<String, ?> map) throws Exception {
        AuthConfig self = new AuthConfig();
        return TeaModel.build(map, self);
    }

    public AuthConfig setAuthMode(String authMode) {
        this.authMode = authMode;
        return this;
    }
    public String getAuthMode() {
        return this.authMode;
    }

    public AuthConfig setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

}
