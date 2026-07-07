// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class RefreshAuthTokensResponseBody extends TeaModel {
    /**
     * <p>The token data.</p>
     */
    @NameInMap("Data")
    public RefreshAuthTokensResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9A51B1DF-96FF-3BCC-B08C-783161D3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RefreshAuthTokensResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RefreshAuthTokensResponseBody self = new RefreshAuthTokensResponseBody();
        return TeaModel.build(map, self);
    }

    public RefreshAuthTokensResponseBody setData(RefreshAuthTokensResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RefreshAuthTokensResponseBodyData getData() {
        return this.data;
    }

    public RefreshAuthTokensResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RefreshAuthTokensResponseBodyDataTokens extends TeaModel {
        /**
         * <p>The authorization token value.</p>
         * 
         * <strong>example:</strong>
         * <p>cp******lp</p>
         */
        @NameInMap("AuthToken")
        public String authToken;

        /**
         * <p>The expiration timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1719648600</p>
         */
        @NameInMap("ExpireAt")
        public Long expireAt;

        /**
         * <p>The validity period in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        @NameInMap("ExpireSeconds")
        public Long expireSeconds;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>acp-2zef0gov2nh2l3xxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The issuance timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1719648000</p>
         */
        @NameInMap("IssuedAt")
        public Long issuedAt;

        /**
         * <p>The license key.</p>
         * 
         * <strong>example:</strong>
         * <p>lk-abcdef1234567890</p>
         */
        @NameInMap("LicenseKey")
        public String licenseKey;

        public static RefreshAuthTokensResponseBodyDataTokens build(java.util.Map<String, ?> map) throws Exception {
            RefreshAuthTokensResponseBodyDataTokens self = new RefreshAuthTokensResponseBodyDataTokens();
            return TeaModel.build(map, self);
        }

        public RefreshAuthTokensResponseBodyDataTokens setAuthToken(String authToken) {
            this.authToken = authToken;
            return this;
        }
        public String getAuthToken() {
            return this.authToken;
        }

        public RefreshAuthTokensResponseBodyDataTokens setExpireAt(Long expireAt) {
            this.expireAt = expireAt;
            return this;
        }
        public Long getExpireAt() {
            return this.expireAt;
        }

        public RefreshAuthTokensResponseBodyDataTokens setExpireSeconds(Long expireSeconds) {
            this.expireSeconds = expireSeconds;
            return this;
        }
        public Long getExpireSeconds() {
            return this.expireSeconds;
        }

        public RefreshAuthTokensResponseBodyDataTokens setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public RefreshAuthTokensResponseBodyDataTokens setIssuedAt(Long issuedAt) {
            this.issuedAt = issuedAt;
            return this;
        }
        public Long getIssuedAt() {
            return this.issuedAt;
        }

        public RefreshAuthTokensResponseBodyDataTokens setLicenseKey(String licenseKey) {
            this.licenseKey = licenseKey;
            return this;
        }
        public String getLicenseKey() {
            return this.licenseKey;
        }

    }

    public static class RefreshAuthTokensResponseBodyData extends TeaModel {
        /**
         * <p>The model gateway access URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://ai-gateway.example.com/v1">https://ai-gateway.example.com/v1</a></p>
         */
        @NameInMap("BaseUrl")
        public String baseUrl;

        /**
         * <p>The list of tokens.</p>
         */
        @NameInMap("Tokens")
        public java.util.List<RefreshAuthTokensResponseBodyDataTokens> tokens;

        public static RefreshAuthTokensResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RefreshAuthTokensResponseBodyData self = new RefreshAuthTokensResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RefreshAuthTokensResponseBodyData setBaseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            return this;
        }
        public String getBaseUrl() {
            return this.baseUrl;
        }

        public RefreshAuthTokensResponseBodyData setTokens(java.util.List<RefreshAuthTokensResponseBodyDataTokens> tokens) {
            this.tokens = tokens;
            return this;
        }
        public java.util.List<RefreshAuthTokensResponseBodyDataTokens> getTokens() {
            return this.tokens;
        }

    }

}
