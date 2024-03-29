// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class RefreshTokenResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Token")
    public RefreshTokenResponseBodyToken token;

    public static RefreshTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RefreshTokenResponseBody self = new RefreshTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public RefreshTokenResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RefreshTokenResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public RefreshTokenResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RefreshTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RefreshTokenResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public RefreshTokenResponseBody setToken(RefreshTokenResponseBodyToken token) {
        this.token = token;
        return this;
    }
    public RefreshTokenResponseBodyToken getToken() {
        return this.token;
    }

    public static class RefreshTokenResponseBodyToken extends TeaModel {
        @NameInMap("SignData")
        public String signData;

        @NameInMap("Signature")
        public String signature;

        public static RefreshTokenResponseBodyToken build(java.util.Map<String, ?> map) throws Exception {
            RefreshTokenResponseBodyToken self = new RefreshTokenResponseBodyToken();
            return TeaModel.build(map, self);
        }

        public RefreshTokenResponseBodyToken setSignData(String signData) {
            this.signData = signData;
            return this;
        }
        public String getSignData() {
            return this.signData;
        }

        public RefreshTokenResponseBodyToken setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

    }

}
