// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class GetOfficeEditURLResponseBody extends TeaModel {
    @NameInMap("RefreshToken")
    public String refreshToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("EditURL")
    public String editURL;

    @NameInMap("AccessToken")
    public String accessToken;

    @NameInMap("RefreshTokenExpiredTime")
    public String refreshTokenExpiredTime;

    @NameInMap("AccessTokenExpiredTime")
    public String accessTokenExpiredTime;

    public static GetOfficeEditURLResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOfficeEditURLResponseBody self = new GetOfficeEditURLResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOfficeEditURLResponseBody setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }
    public String getRefreshToken() {
        return this.refreshToken;
    }

    public GetOfficeEditURLResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOfficeEditURLResponseBody setEditURL(String editURL) {
        this.editURL = editURL;
        return this;
    }
    public String getEditURL() {
        return this.editURL;
    }

    public GetOfficeEditURLResponseBody setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public GetOfficeEditURLResponseBody setRefreshTokenExpiredTime(String refreshTokenExpiredTime) {
        this.refreshTokenExpiredTime = refreshTokenExpiredTime;
        return this;
    }
    public String getRefreshTokenExpiredTime() {
        return this.refreshTokenExpiredTime;
    }

    public GetOfficeEditURLResponseBody setAccessTokenExpiredTime(String accessTokenExpiredTime) {
        this.accessTokenExpiredTime = accessTokenExpiredTime;
        return this;
    }
    public String getAccessTokenExpiredTime() {
        return this.accessTokenExpiredTime;
    }

}
