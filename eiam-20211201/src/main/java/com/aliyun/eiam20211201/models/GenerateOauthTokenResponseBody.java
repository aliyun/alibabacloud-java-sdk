// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GenerateOauthTokenResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4XXXXXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TokenResponse")
    public GenerateOauthTokenResponseBodyTokenResponse tokenResponse;

    public static GenerateOauthTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateOauthTokenResponseBody self = new GenerateOauthTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateOauthTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateOauthTokenResponseBody setTokenResponse(GenerateOauthTokenResponseBodyTokenResponse tokenResponse) {
        this.tokenResponse = tokenResponse;
        return this;
    }
    public GenerateOauthTokenResponseBodyTokenResponse getTokenResponse() {
        return this.tokenResponse;
    }

    public static class GenerateOauthTokenResponseBodyTokenResponse extends TeaModel {
        /**
         * <p>Access Token。</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("AccessToken")
        public String accessToken;

        /**
         * <strong>example:</strong>
         * <p>1770186372</p>
         */
        @NameInMap("ExpiresAt")
        public Long expiresAt;

        /**
         * <strong>example:</strong>
         * <p>1200</p>
         */
        @NameInMap("ExpiresIn")
        public Long expiresIn;

        /**
         * <strong>example:</strong>
         * <p>Bearer</p>
         */
        @NameInMap("TokenType")
        public String tokenType;

        public static GenerateOauthTokenResponseBodyTokenResponse build(java.util.Map<String, ?> map) throws Exception {
            GenerateOauthTokenResponseBodyTokenResponse self = new GenerateOauthTokenResponseBodyTokenResponse();
            return TeaModel.build(map, self);
        }

        public GenerateOauthTokenResponseBodyTokenResponse setAccessToken(String accessToken) {
            this.accessToken = accessToken;
            return this;
        }
        public String getAccessToken() {
            return this.accessToken;
        }

        public GenerateOauthTokenResponseBodyTokenResponse setExpiresAt(Long expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }
        public Long getExpiresAt() {
            return this.expiresAt;
        }

        public GenerateOauthTokenResponseBodyTokenResponse setExpiresIn(Long expiresIn) {
            this.expiresIn = expiresIn;
            return this;
        }
        public Long getExpiresIn() {
            return this.expiresIn;
        }

        public GenerateOauthTokenResponseBodyTokenResponse setTokenType(String tokenType) {
            this.tokenType = tokenType;
            return this;
        }
        public String getTokenType() {
            return this.tokenType;
        }

    }

}
