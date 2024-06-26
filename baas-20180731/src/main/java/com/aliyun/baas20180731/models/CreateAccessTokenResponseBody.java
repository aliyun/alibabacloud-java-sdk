// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class CreateAccessTokenResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public CreateAccessTokenResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static CreateAccessTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAccessTokenResponseBody self = new CreateAccessTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAccessTokenResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public CreateAccessTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAccessTokenResponseBody setResult(CreateAccessTokenResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateAccessTokenResponseBodyResult getResult() {
        return this.result;
    }

    public CreateAccessTokenResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateAccessTokenResponseBodyResult extends TeaModel {
        @NameInMap("AccessToken")
        public String accessToken;

        @NameInMap("ExpiresIn")
        public Long expiresIn;

        @NameInMap("RefreshToken")
        public String refreshToken;

        @NameInMap("TokenType")
        public String tokenType;

        public static CreateAccessTokenResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateAccessTokenResponseBodyResult self = new CreateAccessTokenResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateAccessTokenResponseBodyResult setAccessToken(String accessToken) {
            this.accessToken = accessToken;
            return this;
        }
        public String getAccessToken() {
            return this.accessToken;
        }

        public CreateAccessTokenResponseBodyResult setExpiresIn(Long expiresIn) {
            this.expiresIn = expiresIn;
            return this;
        }
        public Long getExpiresIn() {
            return this.expiresIn;
        }

        public CreateAccessTokenResponseBodyResult setRefreshToken(String refreshToken) {
            this.refreshToken = refreshToken;
            return this;
        }
        public String getRefreshToken() {
            return this.refreshToken;
        }

        public CreateAccessTokenResponseBodyResult setTokenType(String tokenType) {
            this.tokenType = tokenType;
            return this;
        }
        public String getTokenType() {
            return this.tokenType;
        }

    }

}
