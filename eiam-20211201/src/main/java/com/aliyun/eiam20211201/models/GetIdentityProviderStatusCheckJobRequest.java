// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetIdentityProviderStatusCheckJobRequest extends TeaModel {
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
     * <p>任务ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>async_000xxxx</p>
     */
    @NameInMap("IdentityProviderStatusCheckJobId")
    public String identityProviderStatusCheckJobId;

    /**
     * <p>IDaaS EIAM实例的ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetIdentityProviderStatusCheckJobRequest build(java.util.Map<String, ?> map) throws Exception {
        GetIdentityProviderStatusCheckJobRequest self = new GetIdentityProviderStatusCheckJobRequest();
        return TeaModel.build(map, self);
    }

    public GetIdentityProviderStatusCheckJobRequest setIdentityProviderId(String identityProviderId) {
        this.identityProviderId = identityProviderId;
        return this;
    }
    public String getIdentityProviderId() {
        return this.identityProviderId;
    }

    public GetIdentityProviderStatusCheckJobRequest setIdentityProviderStatusCheckJobId(String identityProviderStatusCheckJobId) {
        this.identityProviderStatusCheckJobId = identityProviderStatusCheckJobId;
        return this;
    }
    public String getIdentityProviderStatusCheckJobId() {
        return this.identityProviderStatusCheckJobId;
    }

    public GetIdentityProviderStatusCheckJobRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
