// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GetWebofficeURLResponseBody extends TeaModel {
    // 请求 id
    @NameInMap("RequestId")
    public String requestId;

    // 预览编辑地址
    @NameInMap("WebofficeURL")
    public String webofficeURL;

    // access token
    @NameInMap("AccessToken")
    public String accessToken;

    // refresh token
    @NameInMap("RefreshToken")
    public String refreshToken;

    // access token 过期时间
    @NameInMap("AccessTokenExpiredTime")
    public String accessTokenExpiredTime;

    // refresh token 过期时间
    @NameInMap("RefreshTokenExpiredTime")
    public String refreshTokenExpiredTime;

    public static GetWebofficeURLResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWebofficeURLResponseBody self = new GetWebofficeURLResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWebofficeURLResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWebofficeURLResponseBody setWebofficeURL(String webofficeURL) {
        this.webofficeURL = webofficeURL;
        return this;
    }
    public String getWebofficeURL() {
        return this.webofficeURL;
    }

    public GetWebofficeURLResponseBody setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public GetWebofficeURLResponseBody setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }
    public String getRefreshToken() {
        return this.refreshToken;
    }

    public GetWebofficeURLResponseBody setAccessTokenExpiredTime(String accessTokenExpiredTime) {
        this.accessTokenExpiredTime = accessTokenExpiredTime;
        return this;
    }
    public String getAccessTokenExpiredTime() {
        return this.accessTokenExpiredTime;
    }

    public GetWebofficeURLResponseBody setRefreshTokenExpiredTime(String refreshTokenExpiredTime) {
        this.refreshTokenExpiredTime = refreshTokenExpiredTime;
        return this;
    }
    public String getRefreshTokenExpiredTime() {
        return this.refreshTokenExpiredTime;
    }

}
