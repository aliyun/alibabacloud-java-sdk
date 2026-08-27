// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class GetIdentityProviderRequest extends TeaModel {
    /**
     * <p>The identity provider type. Currently, only DingTalk is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DingTalk</p>
     */
    @NameInMap("IdentityProviderType")
    public String identityProviderType;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>agentteams-xxx</p>
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
