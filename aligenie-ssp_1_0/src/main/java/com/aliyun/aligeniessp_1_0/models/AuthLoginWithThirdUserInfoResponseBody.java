// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class AuthLoginWithThirdUserInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("DataObj")
    public AuthLoginWithThirdUserInfoResponseBodyDataObj dataObj;

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
    public AuthLoginWithThirdUserInfoResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static AuthLoginWithThirdUserInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AuthLoginWithThirdUserInfoResponseBody self = new AuthLoginWithThirdUserInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public AuthLoginWithThirdUserInfoResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public AuthLoginWithThirdUserInfoResponseBody setDataObj(AuthLoginWithThirdUserInfoResponseBodyDataObj dataObj) {
        this.dataObj = dataObj;
        return this;
    }
    public AuthLoginWithThirdUserInfoResponseBodyDataObj getDataObj() {
        return this.dataObj;
    }

    public AuthLoginWithThirdUserInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AuthLoginWithThirdUserInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AuthLoginWithThirdUserInfoResponseBody setResult(AuthLoginWithThirdUserInfoResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public AuthLoginWithThirdUserInfoResponseBodyResult getResult() {
        return this.result;
    }

    public AuthLoginWithThirdUserInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AuthLoginWithThirdUserInfoResponseBodyDataObj extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>dbe2eb4458302b9246c6da17fbc95f4b</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

        public static AuthLoginWithThirdUserInfoResponseBodyDataObj build(java.util.Map<String, ?> map) throws Exception {
            AuthLoginWithThirdUserInfoResponseBodyDataObj self = new AuthLoginWithThirdUserInfoResponseBodyDataObj();
            return TeaModel.build(map, self);
        }

        public AuthLoginWithThirdUserInfoResponseBodyDataObj setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

    }

    public static class AuthLoginWithThirdUserInfoResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1659428051452</p>
         */
        @NameInMap("ExpiredTimeLong")
        public Long expiredTimeLong;

        /**
         * <strong>example:</strong>
         * <p>bd9ccdb121ee950ddead51e943e081fe</p>
         */
        @NameInMap("LoginStateAccessToken")
        public String loginStateAccessToken;

        public static AuthLoginWithThirdUserInfoResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            AuthLoginWithThirdUserInfoResponseBodyResult self = new AuthLoginWithThirdUserInfoResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public AuthLoginWithThirdUserInfoResponseBodyResult setExpiredTimeLong(Long expiredTimeLong) {
            this.expiredTimeLong = expiredTimeLong;
            return this;
        }
        public Long getExpiredTimeLong() {
            return this.expiredTimeLong;
        }

        public AuthLoginWithThirdUserInfoResponseBodyResult setLoginStateAccessToken(String loginStateAccessToken) {
            this.loginStateAccessToken = loginStateAccessToken;
            return this;
        }
        public String getLoginStateAccessToken() {
            return this.loginStateAccessToken;
        }

    }

}
