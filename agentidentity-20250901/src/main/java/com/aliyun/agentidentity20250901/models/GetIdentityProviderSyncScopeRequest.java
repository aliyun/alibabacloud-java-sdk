// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class GetIdentityProviderSyncScopeRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>DingTalk</p>
     */
    @NameInMap("IdentityProviderType")
    public String identityProviderType;

    /**
     * <strong>example:</strong>
     * <p>syncscope-example</p>
     */
    @NameInMap("UserPoolName")
    public String userPoolName;

    public static GetIdentityProviderSyncScopeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetIdentityProviderSyncScopeRequest self = new GetIdentityProviderSyncScopeRequest();
        return TeaModel.build(map, self);
    }

    public GetIdentityProviderSyncScopeRequest setIdentityProviderType(String identityProviderType) {
        this.identityProviderType = identityProviderType;
        return this;
    }
    public String getIdentityProviderType() {
        return this.identityProviderType;
    }

    public GetIdentityProviderSyncScopeRequest setUserPoolName(String userPoolName) {
        this.userPoolName = userPoolName;
        return this;
    }
    public String getUserPoolName() {
        return this.userPoolName;
    }

}
