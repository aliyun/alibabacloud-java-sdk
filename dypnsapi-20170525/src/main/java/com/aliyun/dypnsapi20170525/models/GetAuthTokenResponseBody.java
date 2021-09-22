// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class GetAuthTokenResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TokenInfo")
    public GetAuthTokenResponseBodyTokenInfo tokenInfo;

    public static GetAuthTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAuthTokenResponseBody self = new GetAuthTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAuthTokenResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAuthTokenResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAuthTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAuthTokenResponseBody setTokenInfo(GetAuthTokenResponseBodyTokenInfo tokenInfo) {
        this.tokenInfo = tokenInfo;
        return this;
    }
    public GetAuthTokenResponseBodyTokenInfo getTokenInfo() {
        return this.tokenInfo;
    }

    public static class GetAuthTokenResponseBodyTokenInfo extends TeaModel {
        @NameInMap("AccessToken")
        public String accessToken;

        @NameInMap("JwtToken")
        public String jwtToken;

        public static GetAuthTokenResponseBodyTokenInfo build(java.util.Map<String, ?> map) throws Exception {
            GetAuthTokenResponseBodyTokenInfo self = new GetAuthTokenResponseBodyTokenInfo();
            return TeaModel.build(map, self);
        }

        public GetAuthTokenResponseBodyTokenInfo setAccessToken(String accessToken) {
            this.accessToken = accessToken;
            return this;
        }
        public String getAccessToken() {
            return this.accessToken;
        }

        public GetAuthTokenResponseBodyTokenInfo setJwtToken(String jwtToken) {
            this.jwtToken = jwtToken;
            return this;
        }
        public String getJwtToken() {
            return this.jwtToken;
        }

    }

}
