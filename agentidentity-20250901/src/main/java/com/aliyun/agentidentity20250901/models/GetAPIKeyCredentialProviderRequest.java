// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class GetAPIKeyCredentialProviderRequest extends TeaModel {
    @NameInMap("APIKeyCredentialProviderName")
    public String APIKeyCredentialProviderName;

    @NameInMap("TokenVaultName")
    public String tokenVaultName;

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

    public GetAPIKeyCredentialProviderRequest setTokenVaultName(String tokenVaultName) {
        this.tokenVaultName = tokenVaultName;
        return this;
    }
    public String getTokenVaultName() {
        return this.tokenVaultName;
    }

}
