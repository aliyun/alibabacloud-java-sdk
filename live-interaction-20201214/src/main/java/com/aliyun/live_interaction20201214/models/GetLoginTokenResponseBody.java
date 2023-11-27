// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class GetLoginTokenResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public GetLoginTokenResponseBodyResult result;

    public static GetLoginTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLoginTokenResponseBody self = new GetLoginTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLoginTokenResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetLoginTokenResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLoginTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLoginTokenResponseBody setResult(GetLoginTokenResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetLoginTokenResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetLoginTokenResponseBodyResult extends TeaModel {
        @NameInMap("AccessToken")
        public String accessToken;

        @NameInMap("AccessTokenExpiredTime")
        public Long accessTokenExpiredTime;

        @NameInMap("RefreshToken")
        public String refreshToken;

        public static GetLoginTokenResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLoginTokenResponseBodyResult self = new GetLoginTokenResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLoginTokenResponseBodyResult setAccessToken(String accessToken) {
            this.accessToken = accessToken;
            return this;
        }
        public String getAccessToken() {
            return this.accessToken;
        }

        public GetLoginTokenResponseBodyResult setAccessTokenExpiredTime(Long accessTokenExpiredTime) {
            this.accessTokenExpiredTime = accessTokenExpiredTime;
            return this;
        }
        public Long getAccessTokenExpiredTime() {
            return this.accessTokenExpiredTime;
        }

        public GetLoginTokenResponseBodyResult setRefreshToken(String refreshToken) {
            this.refreshToken = refreshToken;
            return this;
        }
        public String getRefreshToken() {
            return this.refreshToken;
        }

    }

}
