// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class RefreshWebofficeTokenResponseBody extends TeaModel {
    // access token
    @NameInMap("AccessToken")
    public String accessToken;

    // access token 过期时间
    @NameInMap("AccessTokenExpiredTime")
    public String accessTokenExpiredTime;

    // refresh token
    @NameInMap("RefreshToken")
    public String refreshToken;

    // refresh token 过期时间
    @NameInMap("RefreshTokenExpiredTime")
    public String refreshTokenExpiredTime;

    // 请求 Id
    @NameInMap("RequestId")
    public String requestId;

    public static RefreshWebofficeTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RefreshWebofficeTokenResponseBody self = new RefreshWebofficeTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public RefreshWebofficeTokenResponseBody setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public RefreshWebofficeTokenResponseBody setAccessTokenExpiredTime(String accessTokenExpiredTime) {
        this.accessTokenExpiredTime = accessTokenExpiredTime;
        return this;
    }
    public String getAccessTokenExpiredTime() {
        return this.accessTokenExpiredTime;
    }

    public RefreshWebofficeTokenResponseBody setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }
    public String getRefreshToken() {
        return this.refreshToken;
    }

    public RefreshWebofficeTokenResponseBody setRefreshTokenExpiredTime(String refreshTokenExpiredTime) {
        this.refreshTokenExpiredTime = refreshTokenExpiredTime;
        return this;
    }
    public String getRefreshTokenExpiredTime() {
        return this.refreshTokenExpiredTime;
    }

    public RefreshWebofficeTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
