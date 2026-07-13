// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class GetIdentityProviderRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("IdentityProviderType")
    public String identityProviderType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetIdentityProviderRequest build(java.util.Map<String, ?> map) throws Exception {
        GetIdentityProviderRequest self = new GetIdentityProviderRequest();
        return TeaModel.build(map, self);
    }

    public GetIdentityProviderRequest setIdentityProviderType(String identityProviderType) {
        this.identityProviderType = identityProviderType;
        return this;
    }
    public String getIdentityProviderType() {
        return this.identityProviderType;
    }

    public GetIdentityProviderRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
