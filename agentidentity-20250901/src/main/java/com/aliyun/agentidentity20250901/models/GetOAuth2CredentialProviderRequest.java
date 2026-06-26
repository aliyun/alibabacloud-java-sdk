// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class GetOAuth2CredentialProviderRequest extends TeaModel {
    @NameInMap("OAuth2CredentialProviderName")
    public String OAuth2CredentialProviderName;

    @NameInMap("TokenVaultName")
    public String tokenVaultName;

    public static GetOAuth2CredentialProviderRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOAuth2CredentialProviderRequest self = new GetOAuth2CredentialProviderRequest();
        return TeaModel.build(map, self);
    }

    public GetOAuth2CredentialProviderRequest setOAuth2CredentialProviderName(String OAuth2CredentialProviderName) {
        this.OAuth2CredentialProviderName = OAuth2CredentialProviderName;
        return this;
    }
    public String getOAuth2CredentialProviderName() {
        return this.OAuth2CredentialProviderName;
    }

    public GetOAuth2CredentialProviderRequest setTokenVaultName(String tokenVaultName) {
        this.tokenVaultName = tokenVaultName;
        return this;
    }
    public String getTokenVaultName() {
        return this.tokenVaultName;
    }

}
