// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentitydata20251127.models;

import com.aliyun.tea.*;

public class GetResourceAPIKeyRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>test-api-key-provider</p>
     */
    @NameInMap("ResourceCredentialProviderName")
    public String resourceCredentialProviderName;

    /**
     * <strong>example:</strong>
     * <p>eyAgImFsZyI6ICJSUzI1N****</p>
     */
    @NameInMap("WorkloadAccessToken")
    public String workloadAccessToken;

    public static GetResourceAPIKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetResourceAPIKeyRequest self = new GetResourceAPIKeyRequest();
        return TeaModel.build(map, self);
    }

    public GetResourceAPIKeyRequest setResourceCredentialProviderName(String resourceCredentialProviderName) {
        this.resourceCredentialProviderName = resourceCredentialProviderName;
        return this;
    }
    public String getResourceCredentialProviderName() {
        return this.resourceCredentialProviderName;
    }

    public GetResourceAPIKeyRequest setWorkloadAccessToken(String workloadAccessToken) {
        this.workloadAccessToken = workloadAccessToken;
        return this;
    }
    public String getWorkloadAccessToken() {
        return this.workloadAccessToken;
    }

}
