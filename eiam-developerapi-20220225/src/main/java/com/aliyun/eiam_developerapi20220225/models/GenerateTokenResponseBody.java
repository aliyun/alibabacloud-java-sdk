// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class GenerateTokenResponseBody extends TeaModel {
    /**
     * <p>The access token.</p>
     * 
     * <strong>example:</strong>
     * <p>ATxxx</p>
     */
    @NameInMap("access_token")
    public String accessToken;

    /**
     * <p>The expiration time. The value is a UNIX timestamp in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1653288641</p>
     */
    @NameInMap("expires_at")
    public Long expiresAt;

    /**
     * <p>The validity period of the token in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1200</p>
     */
    @NameInMap("expires_in")
    public Long expiresIn;

    /**
     * <p>The ID token.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxx</p>
     */
    @NameInMap("id_token")
    public String idToken;

    /**
     * <p>The refresh token.</p>
     * 
     * <strong>example:</strong>
     * <p>RTxxx</p>
     */
    @NameInMap("refresh_token")
    public String refreshToken;

    /**
     * <p>The token type. Valid values:
     * Basic - Basic type
     * Bearer - Bearer type</p>
     * 
     * <strong>example:</strong>
     * <p>Bearer</p>
     */
    @NameInMap("token_type")
    public String tokenType;

    public static GenerateTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateTokenResponseBody self = new GenerateTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateTokenResponseBody setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public GenerateTokenResponseBody setExpiresAt(Long expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }
    public Long getExpiresAt() {
        return this.expiresAt;
    }

    public GenerateTokenResponseBody setExpiresIn(Long expiresIn) {
        this.expiresIn = expiresIn;
        return this;
    }
    public Long getExpiresIn() {
        return this.expiresIn;
    }

    public GenerateTokenResponseBody setIdToken(String idToken) {
        this.idToken = idToken;
        return this;
    }
    public String getIdToken() {
        return this.idToken;
    }

    public GenerateTokenResponseBody setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }
    public String getRefreshToken() {
        return this.refreshToken;
    }

    public GenerateTokenResponseBody setTokenType(String tokenType) {
        this.tokenType = tokenType;
        return this;
    }
    public String getTokenType() {
        return this.tokenType;
    }

}
