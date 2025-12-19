// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class UpdateAPIKeyCredentialProviderRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>new example api key</p>
     */
    @NameInMap("APIKey")
    public String APIKey;

    /**
     * <strong>example:</strong>
     * <p>api-key-dash-scope</p>
     */
    @NameInMap("APIKeyCredentialProviderName")
    public String APIKeyCredentialProviderName;

    /**
     * <strong>example:</strong>
     * <p>new example provider</p>
     */
    @NameInMap("Description")
    public String description;

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

}
