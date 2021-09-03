// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GetWebofficeUrlResponseBody extends TeaModel {
    // 请求 id
    @NameInMap("RequestId")
    public String requestId;

    // 预览编辑地址
    @NameInMap("WebofficeUrl")
    public String webofficeUrl;

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

    public static GetWebofficeUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWebofficeUrlResponseBody self = new GetWebofficeUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWebofficeUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWebofficeUrlResponseBody setWebofficeUrl(String webofficeUrl) {
        this.webofficeUrl = webofficeUrl;
        return this;
    }
    public String getWebofficeUrl() {
        return this.webofficeUrl;
    }

    public GetWebofficeUrlResponseBody setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public GetWebofficeUrlResponseBody setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }
    public String getRefreshToken() {
        return this.refreshToken;
    }

    public GetWebofficeUrlResponseBody setAccessTokenExpiredTime(String accessTokenExpiredTime) {
        this.accessTokenExpiredTime = accessTokenExpiredTime;
        return this;
    }
    public String getAccessTokenExpiredTime() {
        return this.accessTokenExpiredTime;
    }

    public GetWebofficeUrlResponseBody setRefreshTokenExpiredTime(String refreshTokenExpiredTime) {
        this.refreshTokenExpiredTime = refreshTokenExpiredTime;
        return this;
    }
    public String getRefreshTokenExpiredTime() {
        return this.refreshTokenExpiredTime;
    }

}
