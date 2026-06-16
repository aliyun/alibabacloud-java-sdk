// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateCredentialProviderDescriptionRequest extends TeaModel {
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
     * <p>A description of the credential provider.</p>
     * <blockquote>
     * <p>The description can be up to 128 characters long.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>This is an example description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static UpdateCredentialProviderDescriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCredentialProviderDescriptionRequest self = new UpdateCredentialProviderDescriptionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCredentialProviderDescriptionRequest setCredentialProviderId(String credentialProviderId) {
        this.credentialProviderId = credentialProviderId;
        return this;
    }
    public String getCredentialProviderId() {
        return this.credentialProviderId;
    }

    public UpdateCredentialProviderDescriptionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateCredentialProviderDescriptionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
