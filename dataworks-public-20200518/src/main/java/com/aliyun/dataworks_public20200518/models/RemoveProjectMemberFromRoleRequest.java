// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class RemoveProjectMemberFromRoleRequest extends TeaModel {
    /**
     * <p>The DataWorks workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>27</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The code of the role in the DataWorks workspace. You can call the ListProjectRoles operation to query the codes of all roles in a DataWorks workspace. Valid values:</p>
     * <ul>
     * <li>role_project_owner: workspace owner</li>
     * <li>role_project_admin: workspace administrator</li>
     * <li>role_project_dev: developer</li>
     * <li>role_project_pe: O\&amp;M engineer</li>
     * <li>role_project_deploy: deployment expert</li>
     * <li>role_project_guest: visitor</li>
     * <li>role_project_security: security administrator</li>
     * <li>role_project_tester: experiencer</li>
     * <li>role_project_erd: model designer</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>role_project_guest</p>
     */
    @NameInMap("RoleCode")
    public String roleCode;

    /**
     * <p>The user ID.</p>
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
