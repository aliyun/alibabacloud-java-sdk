// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class GenerateTokenResponseBody extends TeaModel {
    // access_token
    @NameInMap("access_token")
    public String accessToken;

    // 过期时间
    @NameInMap("expires_at")
    public Long expiresAt;

    // 有效时长，单位秒
    @NameInMap("expires_in")
    public Long expiresIn;

    // id_token
    @NameInMap("id_token")
    public String idToken;

    // refresh_token
    @NameInMap("refresh_token")
    public String refreshToken;

    // token类型，包含Basic,Bearer
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
