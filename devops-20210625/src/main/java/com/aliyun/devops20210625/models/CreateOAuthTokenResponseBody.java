// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateOAuthTokenResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    // Id of the request
    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public CreateOAuthTokenResponseBodyResult result;

    @NameInMap("success")
    public String success;

    public static CreateOAuthTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateOAuthTokenResponseBody self = new CreateOAuthTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateOAuthTokenResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateOAuthTokenResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateOAuthTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateOAuthTokenResponseBody setResult(CreateOAuthTokenResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateOAuthTokenResponseBodyResult getResult() {
        return this.result;
    }

    public CreateOAuthTokenResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class CreateOAuthTokenResponseBodyResult extends TeaModel {
        @NameInMap("accessToken")
        public String accessToken;

        @NameInMap("id")
        public String id;

        @NameInMap("scope")
        public String scope;

        @NameInMap("tokenType")
        public String tokenType;

        public static CreateOAuthTokenResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateOAuthTokenResponseBodyResult self = new CreateOAuthTokenResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateOAuthTokenResponseBodyResult setAccessToken(String accessToken) {
            this.accessToken = accessToken;
            return this;
        }
        public String getAccessToken() {
            return this.accessToken;
        }

        public CreateOAuthTokenResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateOAuthTokenResponseBodyResult setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public CreateOAuthTokenResponseBodyResult setTokenType(String tokenType) {
            this.tokenType = tokenType;
            return this;
        }
        public String getTokenType() {
            return this.tokenType;
        }

    }

}
