// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idaas_doraemon20210520.models;

import com.aliyun.tea.*;

public class FetchAccessTokenResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public FetchAccessTokenResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static FetchAccessTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FetchAccessTokenResponseBody self = new FetchAccessTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public FetchAccessTokenResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public FetchAccessTokenResponseBody setData(FetchAccessTokenResponseBodyData data) {
        this.data = data;
        return this;
    }
    public FetchAccessTokenResponseBodyData getData() {
        return this.data;
    }

    public FetchAccessTokenResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public FetchAccessTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FetchAccessTokenResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class FetchAccessTokenResponseBodyData extends TeaModel {
        @NameInMap("Access_token")
        public String accessToken;

        @NameInMap("Expires_in")
        public String expiresIn;

        @NameInMap("Id_token")
        public String idToken;

        @NameInMap("Refresh_token")
        public String refreshToken;

        @NameInMap("Scope")
        public String scope;

        @NameInMap("Token_type")
        public String tokenType;

        public static FetchAccessTokenResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            FetchAccessTokenResponseBodyData self = new FetchAccessTokenResponseBodyData();
            return TeaModel.build(map, self);
        }

        public FetchAccessTokenResponseBodyData setAccessToken(String accessToken) {
            this.accessToken = accessToken;
            return this;
        }
        public String getAccessToken() {
            return this.accessToken;
        }

        public FetchAccessTokenResponseBodyData setExpiresIn(String expiresIn) {
            this.expiresIn = expiresIn;
            return this;
        }
        public String getExpiresIn() {
            return this.expiresIn;
        }

        public FetchAccessTokenResponseBodyData setIdToken(String idToken) {
            this.idToken = idToken;
            return this;
        }
        public String getIdToken() {
            return this.idToken;
        }

        public FetchAccessTokenResponseBodyData setRefreshToken(String refreshToken) {
            this.refreshToken = refreshToken;
            return this;
        }
        public String getRefreshToken() {
            return this.refreshToken;
        }

        public FetchAccessTokenResponseBodyData setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public FetchAccessTokenResponseBodyData setTokenType(String tokenType) {
            this.tokenType = tokenType;
            return this;
        }
        public String getTokenType() {
            return this.tokenType;
        }

    }

}
