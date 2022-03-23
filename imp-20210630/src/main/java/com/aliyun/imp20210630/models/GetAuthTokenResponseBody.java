// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class GetAuthTokenResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public GetAuthTokenResponseBodyResult result;

    public static GetAuthTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAuthTokenResponseBody self = new GetAuthTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAuthTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAuthTokenResponseBody setResult(GetAuthTokenResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetAuthTokenResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetAuthTokenResponseBodyResult extends TeaModel {
        // 用于长连接建连的token
        @NameInMap("AccessToken")
        public String accessToken;

        // 登录token过期时间(毫秒)
        @NameInMap("AccessTokenExpiredTime")
        public Long accessTokenExpiredTime;

        // 更新Token，若AccessToken过期，则可以使用RefreshToken再次获取新Token
        @NameInMap("RefreshToken")
        public String refreshToken;

        public static GetAuthTokenResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetAuthTokenResponseBodyResult self = new GetAuthTokenResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetAuthTokenResponseBodyResult setAccessToken(String accessToken) {
            this.accessToken = accessToken;
            return this;
        }
        public String getAccessToken() {
            return this.accessToken;
        }

        public GetAuthTokenResponseBodyResult setAccessTokenExpiredTime(Long accessTokenExpiredTime) {
            this.accessTokenExpiredTime = accessTokenExpiredTime;
            return this;
        }
        public Long getAccessTokenExpiredTime() {
            return this.accessTokenExpiredTime;
        }

        public GetAuthTokenResponseBodyResult setRefreshToken(String refreshToken) {
            this.refreshToken = refreshToken;
            return this;
        }
        public String getRefreshToken() {
            return this.refreshToken;
        }

    }

}
