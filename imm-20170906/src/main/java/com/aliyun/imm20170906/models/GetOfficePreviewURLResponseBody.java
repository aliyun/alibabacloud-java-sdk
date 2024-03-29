// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class GetOfficePreviewURLResponseBody extends TeaModel {
    @NameInMap("AccessToken")
    public String accessToken;

    @NameInMap("AccessTokenExpiredTime")
    public String accessTokenExpiredTime;

    @NameInMap("PreviewURL")
    public String previewURL;

    @NameInMap("RefreshToken")
    public String refreshToken;

    @NameInMap("RefreshTokenExpiredTime")
    public String refreshTokenExpiredTime;

    @NameInMap("RequestId")
    public String requestId;

    public static GetOfficePreviewURLResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOfficePreviewURLResponseBody self = new GetOfficePreviewURLResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOfficePreviewURLResponseBody setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public GetOfficePreviewURLResponseBody setAccessTokenExpiredTime(String accessTokenExpiredTime) {
        this.accessTokenExpiredTime = accessTokenExpiredTime;
        return this;
    }
    public String getAccessTokenExpiredTime() {
        return this.accessTokenExpiredTime;
    }

    public GetOfficePreviewURLResponseBody setPreviewURL(String previewURL) {
        this.previewURL = previewURL;
        return this;
    }
    public String getPreviewURL() {
        return this.previewURL;
    }

    public GetOfficePreviewURLResponseBody setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }
    public String getRefreshToken() {
        return this.refreshToken;
    }

    public GetOfficePreviewURLResponseBody setRefreshTokenExpiredTime(String refreshTokenExpiredTime) {
        this.refreshTokenExpiredTime = refreshTokenExpiredTime;
        return this;
    }
    public String getRefreshTokenExpiredTime() {
        return this.refreshTokenExpiredTime;
    }

    public GetOfficePreviewURLResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
