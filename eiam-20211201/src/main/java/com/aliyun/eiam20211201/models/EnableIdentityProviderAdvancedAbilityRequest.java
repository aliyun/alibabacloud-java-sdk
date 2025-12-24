// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class EnableIdentityProviderAdvancedAbilityRequest extends TeaModel {
    /**
     * <p>IDaaS的身份提供方主键id</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idp_11111</p>
     */
    @NameInMap("IdentityProviderId")
    public String identityProviderId;

    /**
     * <p>IDaaS EIAM的实例id</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_111ccc111xx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static EnableIdentityProviderAdvancedAbilityRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableIdentityProviderAdvancedAbilityRequest self = new EnableIdentityProviderAdvancedAbilityRequest();
        return TeaModel.build(map, self);
    }

    public EnableIdentityProviderAdvancedAbilityRequest setIdentityProviderId(String identityProviderId) {
        this.identityProviderId = identityProviderId;
        return this;
    }
    public String getIdentityProviderId() {
        return this.identityProviderId;
    }

    public EnableIdentityProviderAdvancedAbilityRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
