// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class ListOAuth2CredentialProvidersResponseBody extends TeaModel {
    /**
     * <p>The maximum number of results to return per page.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token used to retrieve the next page of results.</p>
     * <p>Leave this parameter empty for the first request. For subsequent requests, specify the NextToken value returned in the previous response.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6lURp7zQ6t4/95+g/5jN5r/</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The credential providers.</p>
     */
    @NameInMap("OAuth2CredentialProviders")
    public java.util.List<ListOAuth2CredentialProvidersResponseBodyOAuth2CredentialProviders> OAuth2CredentialProviders;

    /**
     * <p>The unique identifier of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>690C4C7A-AFB9-54ED-9A06-84426F5C6369</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of credential providers.</p>
     * 
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
         * <p>The unique callback URL assigned to the provider. You must configure this URL in the list of allowed callback URLs of the identity provider.
         * Format: <a href="https://agentidentitydata.%7B%7Bregion%7D%7D.aliyuncs.com/oauth2/callback/%7B%7BUUID%7D%7D">https://agentidentitydata.{{region}}.aliyuncs.com/oauth2/callback/{{UUID}}</a>
         * If a value is specified, the specified value is used.
         * If no value is specified, the server automatically generates one.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://agentidentitydata.cn-beijing.aliyuncs.com/oauth2/callback/d51171bc-0dae-3219-8e65-6b4cdafa3beb">https://agentidentitydata.cn-beijing.aliyuncs.com/oauth2/callback/d51171bc-0dae-3219-8e65-6b4cdafa3beb</a></p>
         */
        @NameInMap("CallbackURL")
        public String callbackURL;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-12-18T06:19:17Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ARN of the credential provider.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:agentidentity:cn-beijing:123456:tokenvault/default/oauth2credentialprovider/oauth-provider-aliyun</p>
         */
        @NameInMap("CredentialProviderArn")
        public String credentialProviderArn;

        /**
         * <p>The vendor of the provider, such as AliyunOAuth2, AlibabaCloudOAuth2, DingTalkOAuth2, FeiShuOAuth2, and CustomOAuth2.</p>
         * 
         * <strong>example:</strong>
         * <p>AliyunOAuth2</p>
         */
        @NameInMap("CredentialProviderVendor")
        public String credentialProviderVendor;

        /**
         * <p>The description of the OAuth 2.0 credential provider.</p>
         * 
         * <strong>example:</strong>
         * <p>example provider</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The IDaaS instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_xxxx</p>
         */
        @NameInMap("IDaaSInstanceId")
        public String IDaaSInstanceId;

        /**
         * <p>The name of the credential provider.</p>
         * 
         * <strong>example:</strong>
         * <p>oauth2-provider-aliyun</p>
         */
        @NameInMap("OAuth2CredentialProviderName")
        public String OAuth2CredentialProviderName;

        /**
         * <p>The object that contains provider-specific configurations, such as clientId and clientSecret.</p>
         */
        @NameInMap("OAuth2ProviderConfig")
        public OAuth2ProviderConfig OAuth2ProviderConfig;

        @NameInMap("OAuthType")
        public String OAuthType;

        /**
         * <p>The ID of the outbound application.</p>
         * 
         * <strong>example:</strong>
         * <p>app_xxxx</p>
         */
        @NameInMap("OutboundApplicationId")
        public String outboundApplicationId;

        /**
         * <p>The outbound audience.</p>
         * 
         * <strong>example:</strong>
         * <p>agent-xxxxx</p>
         */
        @NameInMap("OutboundAudience")
        public String outboundAudience;

        /**
         * <p>The outbound client ID.</p>
         * 
         * <strong>example:</strong>
         * <p>client_xxxx</p>
         */
        @NameInMap("OutboundClientId")
        public String outboundClientId;

        @NameInMap("SourcePlatform")
        public String sourcePlatform;

        @NameInMap("TokenVaultName")
        public String tokenVaultName;

        /**
         * <p>The update time.</p>
         * 
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

        public ListOAuth2CredentialProvidersResponseBodyOAuth2CredentialProviders setIDaaSInstanceId(String IDaaSInstanceId) {
            this.IDaaSInstanceId = IDaaSInstanceId;
            return this;
        }
        public String getIDaaSInstanceId() {
            return this.IDaaSInstanceId;
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

        public ListOAuth2CredentialProvidersResponseBodyOAuth2CredentialProviders setOAuthType(String OAuthType) {
            this.OAuthType = OAuthType;
            return this;
        }
        public String getOAuthType() {
            return this.OAuthType;
        }

        public ListOAuth2CredentialProvidersResponseBodyOAuth2CredentialProviders setOutboundApplicationId(String outboundApplicationId) {
            this.outboundApplicationId = outboundApplicationId;
            return this;
        }
        public String getOutboundApplicationId() {
            return this.outboundApplicationId;
        }

        public ListOAuth2CredentialProvidersResponseBodyOAuth2CredentialProviders setOutboundAudience(String outboundAudience) {
            this.outboundAudience = outboundAudience;
            return this;
        }
        public String getOutboundAudience() {
            return this.outboundAudience;
        }

        public ListOAuth2CredentialProvidersResponseBodyOAuth2CredentialProviders setOutboundClientId(String outboundClientId) {
            this.outboundClientId = outboundClientId;
            return this;
        }
        public String getOutboundClientId() {
            return this.outboundClientId;
        }

        public ListOAuth2CredentialProvidersResponseBodyOAuth2CredentialProviders setSourcePlatform(String sourcePlatform) {
            this.sourcePlatform = sourcePlatform;
            return this;
        }
        public String getSourcePlatform() {
            return this.sourcePlatform;
        }

        public ListOAuth2CredentialProvidersResponseBodyOAuth2CredentialProviders setTokenVaultName(String tokenVaultName) {
            this.tokenVaultName = tokenVaultName;
            return this;
        }
        public String getTokenVaultName() {
            return this.tokenVaultName;
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
