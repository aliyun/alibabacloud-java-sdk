// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class RevokeApplicationFromUsersRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>应用角色ID。</p>
     * 
     * <strong>example:</strong>
     * <p>app_role_mkv7rgt4ds8d8v0qtzev2mxxxx</p>
     */
    @NameInMap("ApplicationRoleId")
    public String applicationRoleId;

    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The IDs of the accounts. You can revoke the access permissions from a maximum of 100 accounts at a time.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>user_d6sbsuumeta4h66ec3il7yxxxx</p>
     */
    @NameInMap("UserIds")
    public java.util.List<String> userIds;

    public static RevokeApplicationFromUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        RevokeApplicationFromUsersRequest self = new RevokeApplicationFromUsersRequest();
        return TeaModel.build(map, self);
    }

    public RevokeApplicationFromUsersRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public RevokeApplicationFromUsersRequest setApplicationRoleId(String applicationRoleId) {
        this.applicationRoleId = applicationRoleId;
        return this;
    }
    public String getApplicationRoleId() {
        return this.applicationRoleId;
    }

    public RevokeApplicationFromUsersRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RevokeApplicationFromUsersRequest setUserIds(java.util.List<String> userIds) {
        this.userIds = userIds;
        return this;
    }
    public java.util.List<String> getUserIds() {
        return this.userIds;
    }

}
