// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class AuthLoginWithAligenieUserInfoGeneratedByPhoneNumberResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public AuthLoginWithAligenieUserInfoGeneratedByPhoneNumberResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static AuthLoginWithAligenieUserInfoGeneratedByPhoneNumberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AuthLoginWithAligenieUserInfoGeneratedByPhoneNumberResponseBody self = new AuthLoginWithAligenieUserInfoGeneratedByPhoneNumberResponseBody();
        return TeaModel.build(map, self);
    }

    public AuthLoginWithAligenieUserInfoGeneratedByPhoneNumberResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public AuthLoginWithAligenieUserInfoGeneratedByPhoneNumberResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AuthLoginWithAligenieUserInfoGeneratedByPhoneNumberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AuthLoginWithAligenieUserInfoGeneratedByPhoneNumberResponseBody setResult(AuthLoginWithAligenieUserInfoGeneratedByPhoneNumberResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public AuthLoginWithAligenieUserInfoGeneratedByPhoneNumberResponseBodyResult getResult() {
        return this.result;
    }

    public AuthLoginWithAligenieUserInfoGeneratedByPhoneNumberResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AuthLoginWithAligenieUserInfoGeneratedByPhoneNumberResponseBodyResult extends TeaModel {
        @NameInMap("ExpiredTimeLong")
        public Long expiredTimeLong;

        @NameInMap("LoginStateAccessToken")
        public String loginStateAccessToken;

        public static AuthLoginWithAligenieUserInfoGeneratedByPhoneNumberResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            AuthLoginWithAligenieUserInfoGeneratedByPhoneNumberResponseBodyResult self = new AuthLoginWithAligenieUserInfoGeneratedByPhoneNumberResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public AuthLoginWithAligenieUserInfoGeneratedByPhoneNumberResponseBodyResult setExpiredTimeLong(Long expiredTimeLong) {
            this.expiredTimeLong = expiredTimeLong;
            return this;
        }
        public Long getExpiredTimeLong() {
            return this.expiredTimeLong;
        }

        public AuthLoginWithAligenieUserInfoGeneratedByPhoneNumberResponseBodyResult setLoginStateAccessToken(String loginStateAccessToken) {
            this.loginStateAccessToken = loginStateAccessToken;
            return this;
        }
        public String getLoginStateAccessToken() {
            return this.loginStateAccessToken;
        }

    }

}
