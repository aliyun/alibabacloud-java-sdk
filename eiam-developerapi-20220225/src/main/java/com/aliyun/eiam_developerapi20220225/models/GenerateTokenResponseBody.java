// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class GenerateTokenResponseBody extends TeaModel {
    /**
     * <p>access_token。</p>
     */
    @NameInMap("access_token")
    public String accessToken;

    @NameInMap("expires_at")
    public Long expiresAt;

    @NameInMap("expires_in")
    public Long expiresIn;

    /**
     * <p>id_token。</p>
     */
    @NameInMap("id_token")
    public String idToken;

    /**
     * <p>refresh_token。</p>
     */
    @NameInMap("refresh_token")
    public String refreshToken;

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
