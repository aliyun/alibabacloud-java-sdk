// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class AuthLoginWithTaobaoUserInfoResponseBody extends TeaModel {
    /**
     * <p>Response code</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>Response message</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>73C67BD9-175A-1324-8202-9FAABBB3E6FA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Response Result</p>
     */
    @NameInMap("Result")
    public AuthLoginWithTaobaoUserInfoResponseBodyResult result;

    /**
     * <p>Flag indicating whether the invocation succeeded</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static AuthLoginWithTaobaoUserInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AuthLoginWithTaobaoUserInfoResponseBody self = new AuthLoginWithTaobaoUserInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public AuthLoginWithTaobaoUserInfoResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public AuthLoginWithTaobaoUserInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AuthLoginWithTaobaoUserInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AuthLoginWithTaobaoUserInfoResponseBody setResult(AuthLoginWithTaobaoUserInfoResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public AuthLoginWithTaobaoUserInfoResponseBodyResult getResult() {
        return this.result;
    }

    public AuthLoginWithTaobaoUserInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AuthLoginWithTaobaoUserInfoResponseBodyResult extends TeaModel {
        /**
         * <p>Expiration time of the login state access token (long integer)</p>
         * 
         * <strong>example:</strong>
         * <p>1659506854230</p>
         */
        @NameInMap("ExpiredTimeLong")
        public Long expiredTimeLong;

        /**
         * <p>Login state access token</p>
         * 
         * <strong>example:</strong>
         * <p>d15aa92de679d0d225aa845268be19ee</p>
         */
        @NameInMap("LoginStateAccessToken")
        public String loginStateAccessToken;

        public static AuthLoginWithTaobaoUserInfoResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            AuthLoginWithTaobaoUserInfoResponseBodyResult self = new AuthLoginWithTaobaoUserInfoResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public AuthLoginWithTaobaoUserInfoResponseBodyResult setExpiredTimeLong(Long expiredTimeLong) {
            this.expiredTimeLong = expiredTimeLong;
            return this;
        }
        public Long getExpiredTimeLong() {
            return this.expiredTimeLong;
        }

        public AuthLoginWithTaobaoUserInfoResponseBodyResult setLoginStateAccessToken(String loginStateAccessToken) {
            this.loginStateAccessToken = loginStateAccessToken;
            return this;
        }
        public String getLoginStateAccessToken() {
            return this.loginStateAccessToken;
        }

    }

}
