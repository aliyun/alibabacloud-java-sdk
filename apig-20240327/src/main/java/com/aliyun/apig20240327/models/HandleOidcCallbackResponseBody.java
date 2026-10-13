// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class HandleOidcCallbackResponseBody extends TeaModel {
    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("data")
    public HandleOidcCallbackResponseBodyData data;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>393E2630-DBE7-5221-AB35-9E740675491A</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static HandleOidcCallbackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        HandleOidcCallbackResponseBody self = new HandleOidcCallbackResponseBody();
        return TeaModel.build(map, self);
    }

    public HandleOidcCallbackResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public HandleOidcCallbackResponseBody setData(HandleOidcCallbackResponseBodyData data) {
        this.data = data;
        return this;
    }
    public HandleOidcCallbackResponseBodyData getData() {
        return this.data;
    }

    public HandleOidcCallbackResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public HandleOidcCallbackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class HandleOidcCallbackResponseBodyData extends TeaModel {
        /**
         * <p>The access token returned for the current OIDC logon. The API definition marks this field as sensitive.</p>
         * 
         * <strong>example:</strong>
         * <p>access-token-xxxxxxxx</p>
         */
        @NameInMap("accessToken")
        public String accessToken;

        /**
         * <p>The validity period value of the access token. The unit is not specified in the API definition.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        @NameInMap("expiresIn")
        public Long expiresIn;

        /**
         * <p>The type identifier of the access token. The valid values are not specified in the API definition.</p>
         * 
         * <strong>example:</strong>
         * <p>token-type-xxxxxxxx</p>
         */
        @NameInMap("tokenType")
        public String tokenType;

        public static HandleOidcCallbackResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            HandleOidcCallbackResponseBodyData self = new HandleOidcCallbackResponseBodyData();
            return TeaModel.build(map, self);
        }

        public HandleOidcCallbackResponseBodyData setAccessToken(String accessToken) {
            this.accessToken = accessToken;
            return this;
        }
        public String getAccessToken() {
            return this.accessToken;
        }

        public HandleOidcCallbackResponseBodyData setExpiresIn(Long expiresIn) {
            this.expiresIn = expiresIn;
            return this;
        }
        public Long getExpiresIn() {
            return this.expiresIn;
        }

        public HandleOidcCallbackResponseBodyData setTokenType(String tokenType) {
            this.tokenType = tokenType;
            return this;
        }
        public String getTokenType() {
            return this.tokenType;
        }

    }

}
