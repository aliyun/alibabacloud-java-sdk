// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class CreateAPIKeyCredentialProviderRequest extends TeaModel {
    /**
     * <p>The API key value to be securely stored.</p>
     * 
     * <strong>example:</strong>
     * <p>example api key</p>
     */
    @NameInMap("APIKey")
    public String APIKey;

    /**
     * <p>The name of the credential provider.</p>
     * 
     * <strong>example:</strong>
     * <p>api-key-dash-scope</p>
     */
    @NameInMap("APIKeyCredentialProviderName")
    public String APIKeyCredentialProviderName;

    /**
     * <p>The description of the credential provider.</p>
     * 
     * <strong>example:</strong>
     * <p>example provider</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The TokenVault name.</p>
     */
    @NameInMap("TokenVaultName")
    public String tokenVaultName;

    public static CreateAPIKeyCredentialProviderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAPIKeyCredentialProviderRequest self = new CreateAPIKeyCredentialProviderRequest();
        return TeaModel.build(map, self);
    }

    public CreateAPIKeyCredentialProviderRequest setAPIKey(String APIKey) {
        this.APIKey = APIKey;
        return this;
    }
    public String getAPIKey() {
        return this.APIKey;
    }

    public CreateAPIKeyCredentialProviderRequest setAPIKeyCredentialProviderName(String APIKeyCredentialProviderName) {
        this.APIKeyCredentialProviderName = APIKeyCredentialProviderName;
        return this;
    }
    public String getAPIKeyCredentialProviderName() {
        return this.APIKeyCredentialProviderName;
    }

    public CreateAPIKeyCredentialProviderRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAPIKeyCredentialProviderRequest setTokenVaultName(String tokenVaultName) {
        this.tokenVaultName = tokenVaultName;
        return this;
    }
    public String getTokenVaultName() {
        return this.tokenVaultName;
    }

}
