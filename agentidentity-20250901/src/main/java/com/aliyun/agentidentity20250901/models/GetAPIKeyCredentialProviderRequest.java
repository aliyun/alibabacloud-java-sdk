// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class GetAPIKeyCredentialProviderRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>api-key-dash-scope</p>
     */
    @NameInMap("APIKeyCredentialProviderName")
    public String APIKeyCredentialProviderName;

    public static GetAPIKeyCredentialProviderRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAPIKeyCredentialProviderRequest self = new GetAPIKeyCredentialProviderRequest();
        return TeaModel.build(map, self);
    }

    public GetAPIKeyCredentialProviderRequest setAPIKeyCredentialProviderName(String APIKeyCredentialProviderName) {
        this.APIKeyCredentialProviderName = APIKeyCredentialProviderName;
        return this;
    }
    public String getAPIKeyCredentialProviderName() {
        return this.APIKeyCredentialProviderName;
    }

}
