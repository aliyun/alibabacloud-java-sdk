// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateApplicationRoleRequest extends TeaModel {
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
     * <p>应用角色名称</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>管理员角色</p>
     */
    @NameInMap("ApplicationRoleName")
    public String applicationRoleName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>admin_role</p>
     */
    @NameInMap("ApplicationRoleValue")
    public String applicationRoleValue;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>client-token-example</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>IDaaS EIAM实例的ID。</p>
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
