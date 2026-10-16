// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class CreateOAuth2CredentialProviderShrinkRequest extends TeaModel {
    /**
     * <p>The unique callback URL assigned to the provider. You must configure this URL in the list of allowed callback URLs of the identity provider.
     * Format: <a href="https://agentidentitydata.%7B%7Bregion%7D%7D.aliyuncs.com/oauth2/callback/%7B%7BUUID%7D%7D">https://agentidentitydata.{{region}}.aliyuncs.com/oauth2/callback/{{UUID}}</a>
     * If you specify this parameter, the specified value is used.
     * If you do not specify this parameter, the server automatically generates a value.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://agentidentitydata.cn-beijing.aliyuncs.com/oauth2/callback/d51171bc-0dae-3219-8e65-6b4cdafa3beb">https://agentidentitydata.cn-beijing.aliyuncs.com/oauth2/callback/d51171bc-0dae-3219-8e65-6b4cdafa3beb</a></p>
     */
    @NameInMap("CallbackURL")
    public String callbackURL;

    /**
     * <p>The vendor of the provider, such as AliyunOAuth2, AlibabaCloudOAuth2, DingTalkOAuth2, FeiShuOAuth2, or CustomOAuth2.</p>
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
     * <p>The name of the credential provider.</p>
     * 
     * <strong>example:</strong>
     * <p>oauth-provider-aliyun</p>
     */
    @NameInMap("OAuth2CredentialProviderName")
    public String OAuth2CredentialProviderName;

    /**
     * <p>The object that contains provider-specific configurations, such as clientId and clientSecret.</p>
     */
    @NameInMap("OAuth2ProviderConfig")
    public String OAuth2ProviderConfigShrink;

    @NameInMap("OAuthType")
    public String OAuthType;

    /**
     * <p>The name of the token vault.</p>
     */
    @NameInMap("TokenVaultName")
    public String tokenVaultName;

    public static CreateOAuth2CredentialProviderShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOAuth2CredentialProviderShrinkRequest self = new CreateOAuth2CredentialProviderShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateOAuth2CredentialProviderShrinkRequest setCallbackURL(String callbackURL) {
        this.callbackURL = callbackURL;
        return this;
    }
    public String getCallbackURL() {
        return this.callbackURL;
    }

    public CreateOAuth2CredentialProviderShrinkRequest setCredentialProviderVendor(String credentialProviderVendor) {
        this.credentialProviderVendor = credentialProviderVendor;
        return this;
    }
    public String getCredentialProviderVendor() {
        return this.credentialProviderVendor;
    }

    public CreateOAuth2CredentialProviderShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateOAuth2CredentialProviderShrinkRequest setOAuth2CredentialProviderName(String OAuth2CredentialProviderName) {
        this.OAuth2CredentialProviderName = OAuth2CredentialProviderName;
        return this;
    }
    public String getOAuth2CredentialProviderName() {
        return this.OAuth2CredentialProviderName;
    }

    public CreateOAuth2CredentialProviderShrinkRequest setOAuth2ProviderConfigShrink(String OAuth2ProviderConfigShrink) {
        this.OAuth2ProviderConfigShrink = OAuth2ProviderConfigShrink;
        return this;
    }
    public String getOAuth2ProviderConfigShrink() {
        return this.OAuth2ProviderConfigShrink;
    }

    public CreateOAuth2CredentialProviderShrinkRequest setOAuthType(String OAuthType) {
        this.OAuthType = OAuthType;
        return this;
    }
    public String getOAuthType() {
        return this.OAuthType;
    }

    public CreateOAuth2CredentialProviderShrinkRequest setTokenVaultName(String tokenVaultName) {
        this.tokenVaultName = tokenVaultName;
        return this;
    }
    public String getTokenVaultName() {
        return this.tokenVaultName;
    }

}
