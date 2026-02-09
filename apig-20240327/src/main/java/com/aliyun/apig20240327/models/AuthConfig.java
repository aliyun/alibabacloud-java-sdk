// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class AuthConfig extends TeaModel {
    /**
     * <p>The authentication mode.</p>
     * 
     * <strong>example:</strong>
     * <p>NoAuth</p>
     */
    @NameInMap("authMode")
    public String authMode;

    /**
     * <p>The authentication type.</p>
     * 
     * <strong>example:</strong>
     * <p>Jwt</p>
     */
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
