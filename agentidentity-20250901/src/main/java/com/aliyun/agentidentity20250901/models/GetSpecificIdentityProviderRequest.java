// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class GetSpecificIdentityProviderRequest extends TeaModel {
    /**
     * <p>The type of the identity provider. Currently, only DingTalk is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>DingTalk</p>
     */
    @NameInMap("IdentityProviderType")
    public String identityProviderType;

    /**
     * <p>The name of the user pool.</p>
     * 
     * <strong>example:</strong>
     * <p>my-agent-userpool</p>
     */
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
