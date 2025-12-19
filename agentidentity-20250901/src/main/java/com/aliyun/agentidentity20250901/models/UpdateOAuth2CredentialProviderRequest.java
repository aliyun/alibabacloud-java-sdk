// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class UpdateOAuth2CredentialProviderRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="https://agentidentitydata.cn-beijing.aliyuncs.com/oauth2/callback/d51171bc-0dae-3219-8e65-6b4cdafa3beb">https://agentidentitydata.cn-beijing.aliyuncs.com/oauth2/callback/d51171bc-0dae-3219-8e65-6b4cdafa3beb</a></p>
     */
    @NameInMap("CallbackURL")
    public String callbackURL;

    /**
     * <p>AliyunOAuth2</p>
     * 
     * <strong>example:</strong>
     * <p>AliyunOAuth2</p>
     */
    @NameInMap("CredentialProviderVendor")
    public String credentialProviderVendor;

    /**
     * <strong>example:</strong>
     * <p>new example provider</p>
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

    public static UpdateOAuth2CredentialProviderRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateOAuth2CredentialProviderRequest self = new UpdateOAuth2CredentialProviderRequest();
        return TeaModel.build(map, self);
    }

    public UpdateOAuth2CredentialProviderRequest setCallbackURL(String callbackURL) {
        this.callbackURL = callbackURL;
        return this;
    }
    public String getCallbackURL() {
        return this.callbackURL;
    }

    public UpdateOAuth2CredentialProviderRequest setCredentialProviderVendor(String credentialProviderVendor) {
        this.credentialProviderVendor = credentialProviderVendor;
        return this;
    }
    public String getCredentialProviderVendor() {
        return this.credentialProviderVendor;
    }

    public UpdateOAuth2CredentialProviderRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateOAuth2CredentialProviderRequest setOAuth2CredentialProviderName(String OAuth2CredentialProviderName) {
        this.OAuth2CredentialProviderName = OAuth2CredentialProviderName;
        return this;
    }
    public String getOAuth2CredentialProviderName() {
        return this.OAuth2CredentialProviderName;
    }

    public UpdateOAuth2CredentialProviderRequest setOAuth2ProviderConfig(OAuth2ProviderConfig OAuth2ProviderConfig) {
        this.OAuth2ProviderConfig = OAuth2ProviderConfig;
        return this;
    }
    public OAuth2ProviderConfig getOAuth2ProviderConfig() {
        return this.OAuth2ProviderConfig;
    }

}
