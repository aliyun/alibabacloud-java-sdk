// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class GetMessageTokenResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>16A96B9A-****-CB92E68F4CD8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Return results.</p>
     */
    @NameInMap("Result")
    public GetMessageTokenResponseBodyResult result;

    public static GetMessageTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMessageTokenResponseBody self = new GetMessageTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMessageTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMessageTokenResponseBody setResult(GetMessageTokenResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetMessageTokenResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetMessageTokenResponseBodyResult extends TeaModel {
        /**
         * <p>Token used for establishing persistent connections.</p>
         * 
         * <strong>example:</strong>
         * <p>oauth_cloud_key:***-b0YY5Gy6Q</p>
         */
        @NameInMap("AccessToken")
        public String accessToken;

        /**
         * <p>Logon token expiration time in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>86400000</p>
         */
        @NameInMap("AccessTokenExpiredTime")
        public Long accessTokenExpiredTime;

        /**
         * <p>Refresh token. If the AccessToken expires, you can use the RefreshToken to obtain a new token.</p>
         * 
         * <strong>example:</strong>
         * <p>oauth_cloud_key:****-Q62xggOTdgk3gw=</p>
         */
        @NameInMap("RefreshToken")
        public String refreshToken;

        public static GetMessageTokenResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetMessageTokenResponseBodyResult self = new GetMessageTokenResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetMessageTokenResponseBodyResult setAccessToken(String accessToken) {
            this.accessToken = accessToken;
            return this;
        }
        public String getAccessToken() {
            return this.accessToken;
        }

        public GetMessageTokenResponseBodyResult setAccessTokenExpiredTime(Long accessTokenExpiredTime) {
            this.accessTokenExpiredTime = accessTokenExpiredTime;
            return this;
        }
        public Long getAccessTokenExpiredTime() {
            return this.accessTokenExpiredTime;
        }

        public GetMessageTokenResponseBodyResult setRefreshToken(String refreshToken) {
            this.refreshToken = refreshToken;
            return this;
        }
        public String getRefreshToken() {
            return this.refreshToken;
        }

    }

}
