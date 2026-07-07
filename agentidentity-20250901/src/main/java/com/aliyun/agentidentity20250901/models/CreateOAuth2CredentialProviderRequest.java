// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class CreateOAuth2CredentialProviderRequest extends TeaModel {
    @NameInMap("CallbackURL")
    public String callbackURL;

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

    public static CreateOAuth2CredentialProviderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOAuth2CredentialProviderRequest self = new CreateOAuth2CredentialProviderRequest();
        return TeaModel.build(map, self);
    }

    public CreateOAuth2CredentialProviderRequest setCallbackURL(String callbackURL) {
        this.callbackURL = callbackURL;
        return this;
    }
    public String getCallbackURL() {
        return this.callbackURL;
    }

    public CreateOAuth2CredentialProviderRequest setCredentialProviderVendor(String credentialProviderVendor) {
        this.credentialProviderVendor = credentialProviderVendor;
        return this;
    }
    public String getCredentialProviderVendor() {
        return this.credentialProviderVendor;
    }

    public CreateOAuth2CredentialProviderRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateOAuth2CredentialProviderRequest setOAuth2CredentialProviderName(String OAuth2CredentialProviderName) {
        this.OAuth2CredentialProviderName = OAuth2CredentialProviderName;
        return this;
    }
    public String getOAuth2CredentialProviderName() {
        return this.OAuth2CredentialProviderName;
    }

    public CreateOAuth2CredentialProviderRequest setOAuth2ProviderConfig(OAuth2ProviderConfig OAuth2ProviderConfig) {
        this.OAuth2ProviderConfig = OAuth2ProviderConfig;
        return this;
    }
    public OAuth2ProviderConfig getOAuth2ProviderConfig() {
        return this.OAuth2ProviderConfig;
    }

    public CreateOAuth2CredentialProviderRequest setOAuthType(String OAuthType) {
        this.OAuthType = OAuthType;
        return this;
    }
    public String getOAuthType() {
        return this.OAuthType;
    }

    public CreateOAuth2CredentialProviderRequest setTokenVaultName(String tokenVaultName) {
        this.tokenVaultName = tokenVaultName;
        return this;
    }
    public String getTokenVaultName() {
        return this.tokenVaultName;
    }

}
