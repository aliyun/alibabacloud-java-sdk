// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idaas_doraemon20210520.models;

import com.aliyun.tea.*;

public class FetchAccessTokenResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public FetchAccessTokenResponseBodyData data;

    public static FetchAccessTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FetchAccessTokenResponseBody self = new FetchAccessTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public FetchAccessTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FetchAccessTokenResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public FetchAccessTokenResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public FetchAccessTokenResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public FetchAccessTokenResponseBody setData(FetchAccessTokenResponseBodyData data) {
        this.data = data;
        return this;
    }
    public FetchAccessTokenResponseBodyData getData() {
        return this.data;
    }

    public static class FetchAccessTokenResponseBodyData extends TeaModel {
        @NameInMap("Access_token")
        public String accessToken;

        @NameInMap("Token_type")
        public String tokenType;

        @NameInMap("Scope")
        public String scope;

        @NameInMap("Expires_in")
        public String expiresIn;

        @NameInMap("Refresh_token")
        public String refreshToken;

        @NameInMap("Id_token")
        public String idToken;

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

        public FetchAccessTokenResponseBodyData setTokenType(String tokenType) {
            this.tokenType = tokenType;
            return this;
        }
        public String getTokenType() {
            return this.tokenType;
        }

        public FetchAccessTokenResponseBodyData setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public FetchAccessTokenResponseBodyData setExpiresIn(String expiresIn) {
            this.expiresIn = expiresIn;
            return this;
        }
        public String getExpiresIn() {
            return this.expiresIn;
        }

        public FetchAccessTokenResponseBodyData setRefreshToken(String refreshToken) {
            this.refreshToken = refreshToken;
            return this;
        }
        public String getRefreshToken() {
            return this.refreshToken;
        }

        public FetchAccessTokenResponseBodyData setIdToken(String idToken) {
            this.idToken = idToken;
            return this;
        }
        public String getIdToken() {
            return this.idToken;
        }

    }

}
