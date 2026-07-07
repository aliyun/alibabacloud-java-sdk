// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class GetOAuth2CredentialProviderResponseBody extends TeaModel {
    @NameInMap("OAuth2CredentialProvider")
    public GetOAuth2CredentialProviderResponseBodyOAuth2CredentialProvider OAuth2CredentialProvider;

    @NameInMap("RequestId")
    public String requestId;

    public static GetOAuth2CredentialProviderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOAuth2CredentialProviderResponseBody self = new GetOAuth2CredentialProviderResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOAuth2CredentialProviderResponseBody setOAuth2CredentialProvider(GetOAuth2CredentialProviderResponseBodyOAuth2CredentialProvider OAuth2CredentialProvider) {
        this.OAuth2CredentialProvider = OAuth2CredentialProvider;
        return this;
    }
    public GetOAuth2CredentialProviderResponseBodyOAuth2CredentialProvider getOAuth2CredentialProvider() {
        return this.OAuth2CredentialProvider;
    }

    public GetOAuth2CredentialProviderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetOAuth2CredentialProviderResponseBodyOAuth2CredentialProvider extends TeaModel {
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

        @NameInMap("OAuth2CredentialProviderName")
        public String OAuth2CredentialProviderName;

        @NameInMap("OAuth2ProviderConfig")
        public OAuth2ProviderConfig OAuth2ProviderConfig;

        @NameInMap("OAuthType")
        public String OAuthType;

        @NameInMap("TokenVaultName")
        public String tokenVaultName;

        @NameInMap("UpdateTime")
        public String updateTime;

        public static GetOAuth2CredentialProviderResponseBodyOAuth2CredentialProvider build(java.util.Map<String, ?> map) throws Exception {
            GetOAuth2CredentialProviderResponseBodyOAuth2CredentialProvider self = new GetOAuth2CredentialProviderResponseBodyOAuth2CredentialProvider();
            return TeaModel.build(map, self);
        }

        public GetOAuth2CredentialProviderResponseBodyOAuth2CredentialProvider setCallbackURL(String callbackURL) {
            this.callbackURL = callbackURL;
            return this;
        }
        public String getCallbackURL() {
            return this.callbackURL;
        }

        public GetOAuth2CredentialProviderResponseBodyOAuth2CredentialProvider setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetOAuth2CredentialProviderResponseBodyOAuth2CredentialProvider setCredentialProviderArn(String credentialProviderArn) {
            this.credentialProviderArn = credentialProviderArn;
            return this;
        }
        public String getCredentialProviderArn() {
            return this.credentialProviderArn;
        }

        public GetOAuth2CredentialProviderResponseBodyOAuth2CredentialProvider setCredentialProviderVendor(String credentialProviderVendor) {
            this.credentialProviderVendor = credentialProviderVendor;
            return this;
        }
        public String getCredentialProviderVendor() {
            return this.credentialProviderVendor;
        }

        public GetOAuth2CredentialProviderResponseBodyOAuth2CredentialProvider setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetOAuth2CredentialProviderResponseBodyOAuth2CredentialProvider setOAuth2CredentialProviderName(String OAuth2CredentialProviderName) {
            this.OAuth2CredentialProviderName = OAuth2CredentialProviderName;
            return this;
        }
        public String getOAuth2CredentialProviderName() {
            return this.OAuth2CredentialProviderName;
        }

        public GetOAuth2CredentialProviderResponseBodyOAuth2CredentialProvider setOAuth2ProviderConfig(OAuth2ProviderConfig OAuth2ProviderConfig) {
            this.OAuth2ProviderConfig = OAuth2ProviderConfig;
            return this;
        }
        public OAuth2ProviderConfig getOAuth2ProviderConfig() {
            return this.OAuth2ProviderConfig;
        }

        public GetOAuth2CredentialProviderResponseBodyOAuth2CredentialProvider setOAuthType(String OAuthType) {
            this.OAuthType = OAuthType;
            return this;
        }
        public String getOAuthType() {
            return this.OAuthType;
        }

        public GetOAuth2CredentialProviderResponseBodyOAuth2CredentialProvider setTokenVaultName(String tokenVaultName) {
            this.tokenVaultName = tokenVaultName;
            return this;
        }
        public String getTokenVaultName() {
            return this.tokenVaultName;
        }

        public GetOAuth2CredentialProviderResponseBodyOAuth2CredentialProvider setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
