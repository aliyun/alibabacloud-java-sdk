// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DeleteCredentialProviderRequest extends TeaModel {
    /**
     * <p>The ID of the credential provider.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>atp_01kr2cmj5gxxx4fvmls2e93dxxxxx</p>
     */
    @NameInMap("CredentialProviderId")
    public String credentialProviderId;

    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteCredentialProviderRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCredentialProviderRequest self = new DeleteCredentialProviderRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCredentialProviderRequest setCredentialProviderId(String credentialProviderId) {
        this.credentialProviderId = credentialProviderId;
        return this;
    }
    public String getCredentialProviderId() {
        return this.credentialProviderId;
    }

    public DeleteCredentialProviderRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
