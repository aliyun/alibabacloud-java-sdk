// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class UnbindIdentityProviderRequest extends TeaModel {
    @NameInMap("IdentityProviderType")
    public String identityProviderType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static UnbindIdentityProviderRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindIdentityProviderRequest self = new UnbindIdentityProviderRequest();
        return TeaModel.build(map, self);
    }

    public UnbindIdentityProviderRequest setIdentityProviderType(String identityProviderType) {
        this.identityProviderType = identityProviderType;
        return this;
    }
    public String getIdentityProviderType() {
        return this.identityProviderType;
    }

    public UnbindIdentityProviderRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
