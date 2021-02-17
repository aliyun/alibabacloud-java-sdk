// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class GetWebofficeURLResponseBody extends TeaModel {
    @NameInMap("RefreshToken")
    public String refreshToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AccessToken")
    public String accessToken;

    @NameInMap("RefreshTokenExpiredTime")
    public String refreshTokenExpiredTime;

    @NameInMap("WebofficeURL")
    public String webofficeURL;

    @NameInMap("AccessTokenExpiredTime")
    public String accessTokenExpiredTime;

    public static GetWebofficeURLResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWebofficeURLResponseBody self = new GetWebofficeURLResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWebofficeURLResponseBody setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }
    public String getRefreshToken() {
        return this.refreshToken;
    }

    public GetWebofficeURLResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWebofficeURLResponseBody setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public GetWebofficeURLResponseBody setRefreshTokenExpiredTime(String refreshTokenExpiredTime) {
        this.refreshTokenExpiredTime = refreshTokenExpiredTime;
        return this;
    }
    public String getRefreshTokenExpiredTime() {
        return this.refreshTokenExpiredTime;
    }

    public GetWebofficeURLResponseBody setWebofficeURL(String webofficeURL) {
        this.webofficeURL = webofficeURL;
        return this;
    }
    public String getWebofficeURL() {
        return this.webofficeURL;
    }

    public GetWebofficeURLResponseBody setAccessTokenExpiredTime(String accessTokenExpiredTime) {
        this.accessTokenExpiredTime = accessTokenExpiredTime;
        return this;
    }
    public String getAccessTokenExpiredTime() {
        return this.accessTokenExpiredTime;
    }

}
