// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class SetApplicationProvisioningUserPrimaryOrganizationalUnitRequest extends TeaModel {
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

    /**
     * <p>The organization ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ou_wovwffm62xifdziem7an7xxxxx</p>
     */
    @NameInMap("UserPrimaryOrganizationalUnitId")
    public String userPrimaryOrganizationalUnitId;

    public static SetApplicationProvisioningUserPrimaryOrganizationalUnitRequest build(java.util.Map<String, ?> map) throws Exception {
        SetApplicationProvisioningUserPrimaryOrganizationalUnitRequest self = new SetApplicationProvisioningUserPrimaryOrganizationalUnitRequest();
        return TeaModel.build(map, self);
    }

    public SetApplicationProvisioningUserPrimaryOrganizationalUnitRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public SetApplicationProvisioningUserPrimaryOrganizationalUnitRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SetApplicationProvisioningUserPrimaryOrganizationalUnitRequest setUserPrimaryOrganizationalUnitId(String userPrimaryOrganizationalUnitId) {
        this.userPrimaryOrganizationalUnitId = userPrimaryOrganizationalUnitId;
        return this;
    }
    public String getUserPrimaryOrganizationalUnitId() {
        return this.userPrimaryOrganizationalUnitId;
    }

}
