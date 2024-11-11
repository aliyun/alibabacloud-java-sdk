// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class AuthLoginWithAligenieUserInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>73C67BD9-175A-1324-8202-9FAABBB3E6FA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public AuthLoginWithAligenieUserInfoResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static AuthLoginWithAligenieUserInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AuthLoginWithAligenieUserInfoResponseBody self = new AuthLoginWithAligenieUserInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public AuthLoginWithAligenieUserInfoResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public AuthLoginWithAligenieUserInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AuthLoginWithAligenieUserInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AuthLoginWithAligenieUserInfoResponseBody setResult(AuthLoginWithAligenieUserInfoResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public AuthLoginWithAligenieUserInfoResponseBodyResult getResult() {
        return this.result;
    }

    public AuthLoginWithAligenieUserInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AuthLoginWithAligenieUserInfoResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1659506854230</p>
         */
        @NameInMap("ExpiredTimeLong")
        public Long expiredTimeLong;

        /**
         * <strong>example:</strong>
         * <p>d15aa92de679d0d225aa845268be19ee</p>
         */
        @NameInMap("LoginStateAccessToken")
        public String loginStateAccessToken;

        public static AuthLoginWithAligenieUserInfoResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            AuthLoginWithAligenieUserInfoResponseBodyResult self = new AuthLoginWithAligenieUserInfoResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public AuthLoginWithAligenieUserInfoResponseBodyResult setExpiredTimeLong(Long expiredTimeLong) {
            this.expiredTimeLong = expiredTimeLong;
            return this;
        }
        public Long getExpiredTimeLong() {
            return this.expiredTimeLong;
        }

        public AuthLoginWithAligenieUserInfoResponseBodyResult setLoginStateAccessToken(String loginStateAccessToken) {
            this.loginStateAccessToken = loginStateAccessToken;
            return this;
        }
        public String getLoginStateAccessToken() {
            return this.loginStateAccessToken;
        }

    }

}
