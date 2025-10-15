// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DeleteApplicationFederatedCredentialRequest extends TeaModel {
    /**
     * <p>应用联邦凭证Id</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>afc_aaaaa1111</p>
     */
    @NameInMap("ApplicationFederatedCredentialId")
    public String applicationFederatedCredentialId;

    /**
     * <p>IDaaS的应用资源ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>IDaaS EIAM实例的ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteApplicationFederatedCredentialRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteApplicationFederatedCredentialRequest self = new DeleteApplicationFederatedCredentialRequest();
        return TeaModel.build(map, self);
    }

    public DeleteApplicationFederatedCredentialRequest setApplicationFederatedCredentialId(String applicationFederatedCredentialId) {
        this.applicationFederatedCredentialId = applicationFederatedCredentialId;
        return this;
    }
    public String getApplicationFederatedCredentialId() {
        return this.applicationFederatedCredentialId;
    }

    public DeleteApplicationFederatedCredentialRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public DeleteApplicationFederatedCredentialRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
