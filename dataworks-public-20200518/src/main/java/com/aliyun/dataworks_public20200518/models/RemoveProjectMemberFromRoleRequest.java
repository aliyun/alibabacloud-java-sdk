// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class RemoveProjectMemberFromRoleRequest extends TeaModel {
    /**
     * <p>The ID of the DataWorks workspace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>27</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The role code of the DataWorks workspace. You can invoke the ListProjectRoles operation to obtain the list of role codes for a project.
     * The default preset roles are as follows:</p>
     * <ul>
     * <li>role_project_owner: Project owner.</li>
     * <li>role_project_admin: Storage management administrator.</li>
     * <li>role_project_dev: Developer.</li>
     * <li>role_project_pe: O&amp;M engineer.</li>
     * <li>role_project_deploy: Deployment.</li>
     * <li>role_project_guest: Visitor.</li>
     * <li>role_project_security: Security administrator.</li>
     * <li>role_project_tester: Experience user.</li>
     * <li>role_project_erd: Model designer.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>role_project_guest</p>
     */
    @NameInMap("RoleCode")
    public String roleCode;

    /**
     * <p>The ID of the user.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
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
