// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieoauth2_1_0.models;

import com.aliyun.tea.*;

public class OAuth2TokenEndpointResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>UJMiksSwuMJvwXrJLULMykSw6qZ6VqaxOkN4qd5cW1Q4HhsLxvUR5xVOIv1WB3br5LoP20lPa8xiYLSMbt8JqHACXdSdw7fNkhRTIHnadxWW5jfDg7BELUB0FcFfPiv0</p>
     */
    @NameInMap("AccessToken")
    public String accessToken;

    /**
     * <strong>example:</strong>
     * <p>604799</p>
     */
    @NameInMap("ExpiresIn")
    public Long expiresIn;

    /**
     * <strong>example:</strong>
     * <p>zsEcmaUeb8-NZW4IIUDD7qdgBNflrj6fH8BXJYbW9iXihZTgvbcr1_utC9p5HJLn_lXVwhfivBTgUQZBCGvGl5lxqaxFhmFtt-OrBduFQKL9x8p2lpEMKlxuKHZZZJ3A</p>
     */
    @NameInMap("RefreshToken")
    public String refreshToken;

    /**
     * <strong>example:</strong>
     * <p>4070039E-5822-1F32-9295-1D2883E48BA5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>aligenie:user:basic:read aligenie:iot:scene:read</p>
     */
    @NameInMap("Scope")
    public String scope;

    /**
     * <strong>example:</strong>
     * <p>Bearer</p>
     */
    @NameInMap("TokenType")
    public String tokenType;

    public static OAuth2TokenEndpointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OAuth2TokenEndpointResponseBody self = new OAuth2TokenEndpointResponseBody();
        return TeaModel.build(map, self);
    }

    public OAuth2TokenEndpointResponseBody setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public OAuth2TokenEndpointResponseBody setExpiresIn(Long expiresIn) {
        this.expiresIn = expiresIn;
        return this;
    }
    public Long getExpiresIn() {
        return this.expiresIn;
    }

    public OAuth2TokenEndpointResponseBody setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }
    public String getRefreshToken() {
        return this.refreshToken;
    }

    public OAuth2TokenEndpointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OAuth2TokenEndpointResponseBody setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public OAuth2TokenEndpointResponseBody setTokenType(String tokenType) {
        this.tokenType = tokenType;
        return this;
    }
    public String getTokenType() {
        return this.tokenType;
    }

}
