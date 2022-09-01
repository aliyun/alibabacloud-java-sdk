// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class AuthLoginWithTaobaoUserInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public AuthLoginWithTaobaoUserInfoResponseBodyResult result;

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
        @NameInMap("ExpiredTimeLong")
        public Long expiredTimeLong;

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
