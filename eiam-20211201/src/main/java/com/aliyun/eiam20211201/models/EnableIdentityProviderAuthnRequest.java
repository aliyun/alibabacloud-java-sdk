// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class EnableIdentityProviderAuthnRequest extends TeaModel {
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
     * <p>eiam-111ccc1111</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static EnableIdentityProviderAuthnRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableIdentityProviderAuthnRequest self = new EnableIdentityProviderAuthnRequest();
        return TeaModel.build(map, self);
    }

    public EnableIdentityProviderAuthnRequest setIdentityProviderId(String identityProviderId) {
        this.identityProviderId = identityProviderId;
        return this;
    }
    public String getIdentityProviderId() {
        return this.identityProviderId;
    }

    public EnableIdentityProviderAuthnRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
