// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateOAuthTokenResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Openapi.RequestError</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>”“</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>C2F153F6-BB43-50C4-9F4F-40593203E19A</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public CreateOAuthTokenResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>2aeb4cd012af879e54f0d37dfa526f51</p>
         */
        @NameInMap("accessToken")
        public String accessToken;

        /**
         * <p>id</p>
         * 
         * <strong>example:</strong>
         * <p>30815</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>read:repo</p>
         */
        @NameInMap("scope")
        public String scope;

        /**
         * <strong>example:</strong>
         * <p>code</p>
         */
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
