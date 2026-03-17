// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class GenerateTokenByAuthorizationServerResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>eyJraWQiOiJLRVlLZ0Iyxxxxx</p>
     */
    @NameInMap("access_token")
    public String accessToken;

    /**
     * <strong>example:</strong>
     * <p>1653288641</p>
     */
    @NameInMap("expires_at")
    public Long expiresAt;

    /**
     * <strong>example:</strong>
     * <p>1200</p>
     */
    @NameInMap("expires_in")
    public Long expiresIn;

    /**
     * <strong>example:</strong>
     * <p>eyJraWQiOiJLRVlLZ0Iyxxxxx</p>
     */
    @NameInMap("id_token")
    public String idToken;

    /**
     * <strong>example:</strong>
     * <p>ATxxxxx</p>
     */
    @NameInMap("refresh_token")
    public String refreshToken;

    /**
     * <strong>example:</strong>
     * <p>openid</p>
     */
    @NameInMap("scope")
    public String scope;

    /**
     * <strong>example:</strong>
     * <p>Bearer</p>
     */
    @NameInMap("token_type")
    public String tokenType;

    public static GenerateTokenByAuthorizationServerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateTokenByAuthorizationServerResponseBody self = new GenerateTokenByAuthorizationServerResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateTokenByAuthorizationServerResponseBody setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public GenerateTokenByAuthorizationServerResponseBody setExpiresAt(Long expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }
    public Long getExpiresAt() {
        return this.expiresAt;
    }

    public GenerateTokenByAuthorizationServerResponseBody setExpiresIn(Long expiresIn) {
        this.expiresIn = expiresIn;
        return this;
    }
    public Long getExpiresIn() {
        return this.expiresIn;
    }

    public GenerateTokenByAuthorizationServerResponseBody setIdToken(String idToken) {
        this.idToken = idToken;
        return this;
    }
    public String getIdToken() {
        return this.idToken;
    }

    public GenerateTokenByAuthorizationServerResponseBody setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }
    public String getRefreshToken() {
        return this.refreshToken;
    }

    public GenerateTokenByAuthorizationServerResponseBody setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public GenerateTokenByAuthorizationServerResponseBody setTokenType(String tokenType) {
        this.tokenType = tokenType;
        return this;
    }
    public String getTokenType() {
        return this.tokenType;
    }

}
