// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetApplicationFederatedCredentialRequest extends TeaModel {
    /**
     * <p>The application federated credential ID.</p>
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
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetApplicationFederatedCredentialRequest build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationFederatedCredentialRequest self = new GetApplicationFederatedCredentialRequest();
        return TeaModel.build(map, self);
    }

    public GetApplicationFederatedCredentialRequest setApplicationFederatedCredentialId(String applicationFederatedCredentialId) {
        this.applicationFederatedCredentialId = applicationFederatedCredentialId;
        return this;
    }
    public String getApplicationFederatedCredentialId() {
        return this.applicationFederatedCredentialId;
    }

    public GetApplicationFederatedCredentialRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public GetApplicationFederatedCredentialRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
