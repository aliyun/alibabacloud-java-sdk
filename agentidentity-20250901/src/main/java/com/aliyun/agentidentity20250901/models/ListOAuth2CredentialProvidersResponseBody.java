// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class ListOAuth2CredentialProvidersResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6lURp7zQ6t4/95+g/5jN5r/</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OAuth2CredentialProviders")
    public java.util.List<ListOAuth2CredentialProvidersResponseBodyOAuth2CredentialProviders> OAuth2CredentialProviders;

    /**
     * <strong>example:</strong>
     * <p>690C4C7A-AFB9-54ED-9A06-84426F5C6369</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>400</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListOAuth2CredentialProvidersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOAuth2CredentialProvidersResponseBody self = new ListOAuth2CredentialProvidersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOAuth2CredentialProvidersResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListOAuth2CredentialProvidersResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListOAuth2CredentialProvidersResponseBody setOAuth2CredentialProviders(java.util.List<ListOAuth2CredentialProvidersResponseBodyOAuth2CredentialProviders> OAuth2CredentialProviders) {
        this.OAuth2CredentialProviders = OAuth2CredentialProviders;
        return this;
    }
    public java.util.List<ListOAuth2CredentialProvidersResponseBodyOAuth2CredentialProviders> getOAuth2CredentialProviders() {
        return this.OAuth2CredentialProviders;
    }

    public ListOAuth2CredentialProvidersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOAuth2CredentialProvidersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListOAuth2CredentialProvidersResponseBodyOAuth2CredentialProviders extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="https://agentidentitydata.cn-beijing.aliyuncs.com/oauth2/callback/d51171bc-0dae-3219-8e65-6b4cdafa3beb">https://agentidentitydata.cn-beijing.aliyuncs.com/oauth2/callback/d51171bc-0dae-3219-8e65-6b4cdafa3beb</a></p>
         */
        @NameInMap("CallbackURL")
        public String callbackURL;

        /**
         * <strong>example:</strong>
         * <p>2025-12-18T06:19:17Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>acs:agentidentity:cn-beijing:123456:tokenvault/default/oauth2credentialprovider/oauth-provider-aliyun</p>
         */
        @NameInMap("CredentialProviderArn")
        public String credentialProviderArn;

        /**
         * <strong>example:</strong>
         * <p>AliyunOAuth2</p>
         */
        @NameInMap("CredentialProviderVendor")
        public String credentialProviderVendor;

        /**
         * <strong>example:</strong>
         * <p>example provider</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>oauth2-provider-aliyun</p>
         */
        @NameInMap("OAuth2CredentialProviderName")
        public String OAuth2CredentialProviderName;

        @NameInMap("OAuth2ProviderConfig")
        public OAuth2ProviderConfig OAuth2ProviderConfig;

        /**
         * <strong>example:</strong>
         * <p>2025-12-18T06:19:17Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListOAuth2CredentialProvidersResponseBodyOAuth2CredentialProviders build(java.util.Map<String, ?> map) throws Exception {
            ListOAuth2CredentialProvidersResponseBodyOAuth2CredentialProviders self = new ListOAuth2CredentialProvidersResponseBodyOAuth2CredentialProviders();
            return TeaModel.build(map, self);
        }

        public ListOAuth2CredentialProvidersResponseBodyOAuth2CredentialProviders setCallbackURL(String callbackURL) {
            this.callbackURL = callbackURL;
            return this;
        }
        public String getCallbackURL() {
            return this.callbackURL;
        }

        public ListOAuth2CredentialProvidersResponseBodyOAuth2CredentialProviders setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListOAuth2CredentialProvidersResponseBodyOAuth2CredentialProviders setCredentialProviderArn(String credentialProviderArn) {
            this.credentialProviderArn = credentialProviderArn;
            return this;
        }
        public String getCredentialProviderArn() {
            return this.credentialProviderArn;
        }

        public ListOAuth2CredentialProvidersResponseBodyOAuth2CredentialProviders setCredentialProviderVendor(String credentialProviderVendor) {
            this.credentialProviderVendor = credentialProviderVendor;
            return this;
        }
        public String getCredentialProviderVendor() {
            return this.credentialProviderVendor;
        }

        public ListOAuth2CredentialProvidersResponseBodyOAuth2CredentialProviders setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListOAuth2CredentialProvidersResponseBodyOAuth2CredentialProviders setOAuth2CredentialProviderName(String OAuth2CredentialProviderName) {
            this.OAuth2CredentialProviderName = OAuth2CredentialProviderName;
            return this;
        }
        public String getOAuth2CredentialProviderName() {
            return this.OAuth2CredentialProviderName;
        }

        public ListOAuth2CredentialProvidersResponseBodyOAuth2CredentialProviders setOAuth2ProviderConfig(OAuth2ProviderConfig OAuth2ProviderConfig) {
            this.OAuth2ProviderConfig = OAuth2ProviderConfig;
            return this;
        }
        public OAuth2ProviderConfig getOAuth2ProviderConfig() {
            return this.OAuth2ProviderConfig;
        }

        public ListOAuth2CredentialProvidersResponseBodyOAuth2CredentialProviders setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
