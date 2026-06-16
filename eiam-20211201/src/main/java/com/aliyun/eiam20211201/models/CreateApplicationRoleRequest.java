// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateApplicationRoleRequest extends TeaModel {
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
     * <p>The name of the application role.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Admin Role</p>
     */
    @NameInMap("ApplicationRoleName")
    public String applicationRoleName;

    /**
     * <p>The value of the application role.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>admin_role</p>
     */
    @NameInMap("ApplicationRoleValue")
    public String applicationRoleValue;

    /**
     * <p>A client token used to ensure the idempotence of the request. Generate a unique value for this parameter from your client. The client token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://www.alibabacloud.com/help/zh/ecs/developer-reference/how-to-ensure-idempotence">How to ensure idempotence</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>client-token-example</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static CreateApplicationRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationRoleRequest self = new CreateApplicationRoleRequest();
        return TeaModel.build(map, self);
    }

    public CreateApplicationRoleRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public CreateApplicationRoleRequest setApplicationRoleName(String applicationRoleName) {
        this.applicationRoleName = applicationRoleName;
        return this;
    }
    public String getApplicationRoleName() {
        return this.applicationRoleName;
    }

    public CreateApplicationRoleRequest setApplicationRoleValue(String applicationRoleValue) {
        this.applicationRoleValue = applicationRoleValue;
        return this;
    }
    public String getApplicationRoleValue() {
        return this.applicationRoleValue;
    }

    public CreateApplicationRoleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateApplicationRoleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
