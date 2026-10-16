// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class GetIdentityProviderRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>identity-provider-okta</p>
     */
    @NameInMap("IdentityProviderName")
    public String identityProviderName;

    public static GetIdentityProviderRequest build(java.util.Map<String, ?> map) throws Exception {
        GetIdentityProviderRequest self = new GetIdentityProviderRequest();
        return TeaModel.build(map, self);
    }

    public GetIdentityProviderRequest setIdentityProviderName(String identityProviderName) {
        this.identityProviderName = identityProviderName;
        return this;
    }
    public String getIdentityProviderName() {
        return this.identityProviderName;
    }

}
