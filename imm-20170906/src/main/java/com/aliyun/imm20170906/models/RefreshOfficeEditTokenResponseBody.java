// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class RefreshOfficeEditTokenResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AccessTokenExpiredTime")
    public String accessTokenExpiredTime;

    @NameInMap("RefreshToken")
    public String refreshToken;

    @NameInMap("AccessToken")
    public String accessToken;

    @NameInMap("RefreshTokenExpiredTime")
    public String refreshTokenExpiredTime;

    public static RefreshOfficeEditTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RefreshOfficeEditTokenResponseBody self = new RefreshOfficeEditTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public RefreshOfficeEditTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RefreshOfficeEditTokenResponseBody setAccessTokenExpiredTime(String accessTokenExpiredTime) {
        this.accessTokenExpiredTime = accessTokenExpiredTime;
        return this;
    }
    public String getAccessTokenExpiredTime() {
        return this.accessTokenExpiredTime;
    }

    public RefreshOfficeEditTokenResponseBody setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }
    public String getRefreshToken() {
        return this.refreshToken;
    }

    public RefreshOfficeEditTokenResponseBody setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public RefreshOfficeEditTokenResponseBody setRefreshTokenExpiredTime(String refreshTokenExpiredTime) {
        this.refreshTokenExpiredTime = refreshTokenExpiredTime;
        return this;
    }
    public String getRefreshTokenExpiredTime() {
        return this.refreshTokenExpiredTime;
    }

}
