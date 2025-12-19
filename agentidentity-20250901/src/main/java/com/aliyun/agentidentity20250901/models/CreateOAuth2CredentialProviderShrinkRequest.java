// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class CreateOAuth2CredentialProviderShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="https://agentidentitydata.cn-beijing.aliyuncs.com/oauth2/callback/d51171bc-0dae-3219-8e65-6b4cdafa3beb">https://agentidentitydata.cn-beijing.aliyuncs.com/oauth2/callback/d51171bc-0dae-3219-8e65-6b4cdafa3beb</a></p>
     */
    @NameInMap("CallbackURL")
    public String callbackURL;

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
     * <p>oauth-provider-aliyun</p>
     */
    @NameInMap("OAuth2CredentialProviderName")
    public String OAuth2CredentialProviderName;

    @NameInMap("OAuth2ProviderConfig")
    public String OAuth2ProviderConfigShrink;

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

}
