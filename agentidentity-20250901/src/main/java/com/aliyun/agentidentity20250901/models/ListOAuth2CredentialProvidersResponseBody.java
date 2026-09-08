// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class ListOAuth2CredentialProvidersResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OAuth2CredentialProviders")
    public java.util.List<ListOAuth2CredentialProvidersResponseBodyOAuth2CredentialProviders> OAuth2CredentialProviders;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("CallbackURL")
        public String callbackURL;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CredentialProviderArn")
        public String credentialProviderArn;

        @NameInMap("CredentialProviderVendor")
        public String credentialProviderVendor;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>idaas_xxxx</p>
         */
        @NameInMap("IDaaSInstanceId")
        public String IDaaSInstanceId;

        @NameInMap("OAuth2CredentialProviderName")
        public String OAuth2CredentialProviderName;

        @NameInMap("OAuth2ProviderConfig")
        public OAuth2ProviderConfig OAuth2ProviderConfig;

        @NameInMap("OAuthType")
        public String OAuthType;

        /**
         * <strong>example:</strong>
         * <p>app_xxxx</p>
         */
        @NameInMap("OutboundApplicationId")
        public String outboundApplicationId;

        /**
         * <strong>example:</strong>
         * <p>agent-xxxxx</p>
         */
        @NameInMap("OutboundAudience")
        public String outboundAudience;

        /**
         * <strong>example:</strong>
         * <p>client_xxxx</p>
         */
        @NameInMap("OutboundClientId")
        public String outboundClientId;

        @NameInMap("SourcePlatform")
        public String sourcePlatform;

        @NameInMap("TokenVaultName")
        public String tokenVaultName;

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
