// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class RefreshWebofficeTokenResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>4996466c690a4902846ce00f96********</p>
     */
    @NameInMap("AccessToken")
    public String accessToken;

    /**
     * <strong>example:</strong>
     * <p>2021-08-31T13:07:28.950065359Z</p>
     */
    @NameInMap("AccessTokenExpiredTime")
    public String accessTokenExpiredTime;

    /**
     * <strong>example:</strong>
     * <p>72a52ab3702a4123ab5594671a********</p>
     */
    @NameInMap("RefreshToken")
    public String refreshToken;

    /**
     * <strong>example:</strong>
     * <p>2021-09-01T12:37:28.950065359Z</p>
     */
    @NameInMap("RefreshTokenExpiredTime")
    public String refreshTokenExpiredTime;

    /**
     * <strong>example:</strong>
     * <p>501339F9-4B70-0CE2-AB8C-866C********</p>
     */
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
