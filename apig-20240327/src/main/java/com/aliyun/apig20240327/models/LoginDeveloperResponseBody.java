// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class LoginDeveloperResponseBody extends TeaModel {
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
    public LoginDeveloperResponseBodyData data;

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

    public static LoginDeveloperResponseBody build(java.util.Map<String, ?> map) throws Exception {
        LoginDeveloperResponseBody self = new LoginDeveloperResponseBody();
        return TeaModel.build(map, self);
    }

    public LoginDeveloperResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public LoginDeveloperResponseBody setData(LoginDeveloperResponseBodyData data) {
        this.data = data;
        return this;
    }
    public LoginDeveloperResponseBodyData getData() {
        return this.data;
    }

    public LoginDeveloperResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public LoginDeveloperResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class LoginDeveloperResponseBodyData extends TeaModel {
        /**
         * <p>The access token returned for the current developer logon. This field is marked as sensitive in the API definition.</p>
         * 
         * <strong>example:</strong>
         * <p>access-token-xxxxxxxx</p>
         */
        @NameInMap("accessToken")
        public String accessToken;

        /**
         * <p>The int64 numeric field associated with the access token. The unit and exact meaning are not declared in the API definition.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        @NameInMap("expiresIn")
        public Long expiresIn;

        public static LoginDeveloperResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            LoginDeveloperResponseBodyData self = new LoginDeveloperResponseBodyData();
            return TeaModel.build(map, self);
        }

        public LoginDeveloperResponseBodyData setAccessToken(String accessToken) {
            this.accessToken = accessToken;
            return this;
        }
        public String getAccessToken() {
            return this.accessToken;
        }

        public LoginDeveloperResponseBodyData setExpiresIn(Long expiresIn) {
            this.expiresIn = expiresIn;
            return this;
        }
        public Long getExpiresIn() {
            return this.expiresIn;
        }

    }

}
