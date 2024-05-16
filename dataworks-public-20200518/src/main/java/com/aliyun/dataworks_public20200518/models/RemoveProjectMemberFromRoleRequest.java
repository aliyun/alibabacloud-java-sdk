// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class RemoveProjectMemberFromRoleRequest extends TeaModel {
    /**
     * <p>The ID of the DataWorks workspace.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The role in the DataWorks workspace. You can call the ListProjectRoles operation to query codes of the roles in the workspace.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   role_project_owner: workspace owner</p>
     * <p>*   role_project_admin: workspace administrator</p>
     * <p>*   role_project_dev: developer</p>
     * <p>*   role_project_pe: O\\&M engineer</p>
     * <p>*   role_project_deploy: deployment expert</p>
     * <p>*   role_project_guest: visitor</p>
     * <p>*   role_project_security: security administrator</p>
     * <p>*   role_project_tester: experiencer</p>
     * <p>*   role_project_erd: model designer</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RoleCode")
    public String roleCode;

    /**
     * <p>The ID of the user.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserId")
    public String userId;

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

    public RemoveProjectMemberFromRoleRequest setRoleCode(String roleCode) {
        this.roleCode = roleCode;
        return this;
    }
    public String getRoleCode() {
        return this.roleCode;
    }

    public RemoveProjectMemberFromRoleRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
