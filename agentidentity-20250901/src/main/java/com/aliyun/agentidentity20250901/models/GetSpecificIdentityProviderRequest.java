// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class GetSpecificIdentityProviderRequest extends TeaModel {
    @NameInMap("IdentityProviderType")
    public String identityProviderType;

    @NameInMap("UserPoolName")
    public String userPoolName;

    public static GetSpecificIdentityProviderRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSpecificIdentityProviderRequest self = new GetSpecificIdentityProviderRequest();
        return TeaModel.build(map, self);
    }

    public GetSpecificIdentityProviderRequest setIdentityProviderType(String identityProviderType) {
        this.identityProviderType = identityProviderType;
        return this;
    }
    public String getIdentityProviderType() {
        return this.identityProviderType;
    }

    public GetSpecificIdentityProviderRequest setUserPoolName(String userPoolName) {
        this.userPoolName = userPoolName;
        return this;
    }
    public String getUserPoolName() {
        return this.userPoolName;
    }

}
