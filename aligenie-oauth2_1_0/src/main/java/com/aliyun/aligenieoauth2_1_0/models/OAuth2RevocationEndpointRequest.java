// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieoauth2_1_0.models;

import com.aliyun.tea.*;

public class OAuth2RevocationEndpointRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>UJMiksSwuMJvwXrJLULMykSw6qZ6VqaxOkN4qd5cW1Q4HhsLxvUR5xVOIv1WB3br5LoP20lPa8xiYLSMbt8JqHACXdSdw7fNkhRTIHnadxWW5jfDg7BELUB0FcFfPiv0</p>
     */
    @NameInMap("Token")
    public String token;

    /**
     * <strong>example:</strong>
     * <p>refresh_token</p>
     */
    @NameInMap("TokenTypeHint")
    public String tokenTypeHint;

    public static OAuth2RevocationEndpointRequest build(java.util.Map<String, ?> map) throws Exception {
        OAuth2RevocationEndpointRequest self = new OAuth2RevocationEndpointRequest();
        return TeaModel.build(map, self);
    }

    public OAuth2RevocationEndpointRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public OAuth2RevocationEndpointRequest setTokenTypeHint(String tokenTypeHint) {
        this.tokenTypeHint = tokenTypeHint;
        return this;
    }
    public String getTokenTypeHint() {
        return this.tokenTypeHint;
    }

}
