// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class DeleteAPIKeyCredentialProviderRequest extends TeaModel {
    @NameInMap("APIKeyCredentialProviderName")
    public String APIKeyCredentialProviderName;

    @NameInMap("TokenVaultName")
    public String tokenVaultName;

    public static DeleteAPIKeyCredentialProviderRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAPIKeyCredentialProviderRequest self = new DeleteAPIKeyCredentialProviderRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAPIKeyCredentialProviderRequest setAPIKeyCredentialProviderName(String APIKeyCredentialProviderName) {
        this.APIKeyCredentialProviderName = APIKeyCredentialProviderName;
        return this;
    }
    public String getAPIKeyCredentialProviderName() {
        return this.APIKeyCredentialProviderName;
    }

    public DeleteAPIKeyCredentialProviderRequest setTokenVaultName(String tokenVaultName) {
        this.tokenVaultName = tokenVaultName;
        return this;
    }
    public String getTokenVaultName() {
        return this.tokenVaultName;
    }

}
