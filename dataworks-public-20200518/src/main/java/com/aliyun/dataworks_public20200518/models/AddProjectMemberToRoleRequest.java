// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class AddProjectMemberToRoleRequest extends TeaModel {
    @NameInMap("ProjectId")
    @Validation(required = true)
    public Long projectId;

    @NameInMap("UserId")
    @Validation(required = true)
    public String userId;

    @NameInMap("RoleCode")
    @Validation(required = true)
    public String roleCode;

    @NameInMap("ClientToken")
    public String clientToken;

    public static AddProjectMemberToRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        AddProjectMemberToRoleRequest self = new AddProjectMemberToRoleRequest();
        return TeaModel.build(map, self);
    }

    public AddProjectMemberToRoleRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public AddProjectMemberToRoleRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public AddProjectMemberToRoleRequest setRoleCode(String roleCode) {
        this.roleCode = roleCode;
        return this;
    }
    public String getRoleCode() {
        return this.roleCode;
    }

    public AddProjectMemberToRoleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
