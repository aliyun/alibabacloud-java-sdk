// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class DeleteOAuth2CredentialProviderRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>oauth2-provider-aliyun</p>
     */
    @NameInMap("OAuth2CredentialProviderName")
    public String OAuth2CredentialProviderName;

    public static DeleteOAuth2CredentialProviderRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteOAuth2CredentialProviderRequest self = new DeleteOAuth2CredentialProviderRequest();
        return TeaModel.build(map, self);
    }

    public DeleteOAuth2CredentialProviderRequest setOAuth2CredentialProviderName(String OAuth2CredentialProviderName) {
        this.OAuth2CredentialProviderName = OAuth2CredentialProviderName;
        return this;
    }
    public String getOAuth2CredentialProviderName() {
        return this.OAuth2CredentialProviderName;
    }

}
