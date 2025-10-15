// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DisableFederatedCredentialProviderRequest extends TeaModel {
    /**
     * <p>联邦凭证提供方ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>fcp_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
     */
    @NameInMap("FederatedCredentialProviderId")
    public String federatedCredentialProviderId;

    /**
     * <p>IDaaS EIAM实例的ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static DisableFederatedCredentialProviderRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableFederatedCredentialProviderRequest self = new DisableFederatedCredentialProviderRequest();
        return TeaModel.build(map, self);
    }

    public DisableFederatedCredentialProviderRequest setFederatedCredentialProviderId(String federatedCredentialProviderId) {
        this.federatedCredentialProviderId = federatedCredentialProviderId;
        return this;
    }
    public String getFederatedCredentialProviderId() {
        return this.federatedCredentialProviderId;
    }

    public DisableFederatedCredentialProviderRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
