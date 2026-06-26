// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class UpdateOAuth2CredentialProviderShrinkRequest extends TeaModel {
    @NameInMap("CallbackURL")
    public String callbackURL;

    @NameInMap("CredentialProviderVendor")
    public String credentialProviderVendor;

    @NameInMap("Description")
    public String description;

    @NameInMap("OAuth2CredentialProviderName")
    public String OAuth2CredentialProviderName;

    @NameInMap("OAuth2ProviderConfig")
    public String OAuth2ProviderConfigShrink;

    @NameInMap("TokenVaultName")
    public String tokenVaultName;

    public static UpdateOAuth2CredentialProviderShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateOAuth2CredentialProviderShrinkRequest self = new UpdateOAuth2CredentialProviderShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateOAuth2CredentialProviderShrinkRequest setCallbackURL(String callbackURL) {
        this.callbackURL = callbackURL;
        return this;
    }
    public String getCallbackURL() {
        return this.callbackURL;
    }

    public UpdateOAuth2CredentialProviderShrinkRequest setCredentialProviderVendor(String credentialProviderVendor) {
        this.credentialProviderVendor = credentialProviderVendor;
        return this;
    }
    public String getCredentialProviderVendor() {
        return this.credentialProviderVendor;
    }

    public UpdateOAuth2CredentialProviderShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateOAuth2CredentialProviderShrinkRequest setOAuth2CredentialProviderName(String OAuth2CredentialProviderName) {
        this.OAuth2CredentialProviderName = OAuth2CredentialProviderName;
        return this;
    }
    public String getOAuth2CredentialProviderName() {
        return this.OAuth2CredentialProviderName;
    }

    public UpdateOAuth2CredentialProviderShrinkRequest setOAuth2ProviderConfigShrink(String OAuth2ProviderConfigShrink) {
        this.OAuth2ProviderConfigShrink = OAuth2ProviderConfigShrink;
        return this;
    }
    public String getOAuth2ProviderConfigShrink() {
        return this.OAuth2ProviderConfigShrink;
    }

    public UpdateOAuth2CredentialProviderShrinkRequest setTokenVaultName(String tokenVaultName) {
        this.tokenVaultName = tokenVaultName;
        return this;
    }
    public String getTokenVaultName() {
        return this.tokenVaultName;
    }

}
