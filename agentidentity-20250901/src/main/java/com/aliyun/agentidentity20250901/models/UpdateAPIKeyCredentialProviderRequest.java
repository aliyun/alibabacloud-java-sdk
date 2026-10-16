// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class UpdateAPIKeyCredentialProviderRequest extends TeaModel {
    /**
     * <p>The new API key value.</p>
     * 
     * <strong>example:</strong>
     * <p>new example api key</p>
     */
    @NameInMap("APIKey")
    public String APIKey;

    /**
     * <p>The name of the credential provider to update.</p>
     * 
     * <strong>example:</strong>
     * <p>api-key-dash-scope</p>
     */
    @NameInMap("APIKeyCredentialProviderName")
    public String APIKeyCredentialProviderName;

    /**
     * <p>The new description of the credential provider.</p>
     * 
     * <strong>example:</strong>
     * <p>new example provider</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the token vault. Default value: default.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("TokenVaultName")
    public String tokenVaultName;

    public static UpdateAPIKeyCredentialProviderRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAPIKeyCredentialProviderRequest self = new UpdateAPIKeyCredentialProviderRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAPIKeyCredentialProviderRequest setAPIKey(String APIKey) {
        this.APIKey = APIKey;
        return this;
    }
    public String getAPIKey() {
        return this.APIKey;
    }

    public UpdateAPIKeyCredentialProviderRequest setAPIKeyCredentialProviderName(String APIKeyCredentialProviderName) {
        this.APIKeyCredentialProviderName = APIKeyCredentialProviderName;
        return this;
    }
    public String getAPIKeyCredentialProviderName() {
        return this.APIKeyCredentialProviderName;
    }

    public UpdateAPIKeyCredentialProviderRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateAPIKeyCredentialProviderRequest setTokenVaultName(String tokenVaultName) {
        this.tokenVaultName = tokenVaultName;
        return this;
    }
    public String getTokenVaultName() {
        return this.tokenVaultName;
    }

}
