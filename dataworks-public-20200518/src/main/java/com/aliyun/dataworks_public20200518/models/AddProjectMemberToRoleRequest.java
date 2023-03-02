// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class AddProjectMemberToRoleRequest extends TeaModel {
    /**
     * <p>The client token. It is a field with the idempotence property. We recommend that you use a universally unique identifier (UUID). This parameter is used to uniquely identify the API operation call.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the DataWorks workspace. You can call the [ListProjects](~~178393~~) operation to query the ID.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The code of the role that you want to assign to a member of a DataWorks workspace. You can call the [ListProjectRoles](~~178228~~) operation to query the code of all roles in a DataWorks workspace.</p>
     */
    @NameInMap("RoleCode")
    public String roleCode;

    /**
     * <p>The ID of your Alibaba Cloud account. To view the ID, log on to [the DataWorks console](https://workbench.data.aliyun.com/console) and move the pointer over the profile picture in the upper-right corner.</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static AddProjectMemberToRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        AddProjectMemberToRoleRequest self = new AddProjectMemberToRoleRequest();
        return TeaModel.build(map, self);
    }

    public AddProjectMemberToRoleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AddProjectMemberToRoleRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public AddProjectMemberToRoleRequest setRoleCode(String roleCode) {
        this.roleCode = roleCode;
        return this;
    }
    public String getRoleCode() {
        return this.roleCode;
    }

    public AddProjectMemberToRoleRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
