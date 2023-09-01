// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class AuthConfig extends TeaModel {
    @NameInMap("authInfo")
    public String authInfo;

    @NameInMap("authType")
    public String authType;

    public static AuthConfig build(java.util.Map<String, ?> map) throws Exception {
        AuthConfig self = new AuthConfig();
        return TeaModel.build(map, self);
    }

    public AuthConfig setAuthInfo(String authInfo) {
        this.authInfo = authInfo;
        return this;
    }
    public String getAuthInfo() {
        return this.authInfo;
    }

    public AuthConfig setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

}
