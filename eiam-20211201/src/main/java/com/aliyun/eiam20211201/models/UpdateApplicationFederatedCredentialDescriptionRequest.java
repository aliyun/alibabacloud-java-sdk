// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateApplicationFederatedCredentialDescriptionRequest extends TeaModel {
    /**
     * <p>The ID of the application\&quot;s federated credential.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>afc_aaaaa1111</p>
     */
    @NameInMap("ApplicationFederatedCredentialId")
    public String applicationFederatedCredentialId;

    /**
     * <p>The application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The description of the federated credential.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static UpdateApplicationFederatedCredentialDescriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationFederatedCredentialDescriptionRequest self = new UpdateApplicationFederatedCredentialDescriptionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationFederatedCredentialDescriptionRequest setApplicationFederatedCredentialId(String applicationFederatedCredentialId) {
        this.applicationFederatedCredentialId = applicationFederatedCredentialId;
        return this;
    }
    public String getApplicationFederatedCredentialId() {
        return this.applicationFederatedCredentialId;
    }

    public UpdateApplicationFederatedCredentialDescriptionRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public UpdateApplicationFederatedCredentialDescriptionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateApplicationFederatedCredentialDescriptionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
