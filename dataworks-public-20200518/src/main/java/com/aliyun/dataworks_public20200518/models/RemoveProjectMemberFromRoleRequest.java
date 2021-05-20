// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class RemoveProjectMemberFromRoleRequest extends TeaModel {
    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("RoleCode")
    public String roleCode;

    public static RemoveProjectMemberFromRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveProjectMemberFromRoleRequest self = new RemoveProjectMemberFromRoleRequest();
        return TeaModel.build(map, self);
    }

    public RemoveProjectMemberFromRoleRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public RemoveProjectMemberFromRoleRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public RemoveProjectMemberFromRoleRequest setRoleCode(String roleCode) {
        this.roleCode = roleCode;
        return this;
    }
    public String getRoleCode() {
        return this.roleCode;
    }

}
