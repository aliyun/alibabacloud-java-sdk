// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetProjectRoleRequest extends TeaModel {
    /**
     * <p>The code of the workspace role. Valid values:</p>
     * <ul>
     * <li><p>role_project_admin: workspace administrator</p>
     * </li>
     * <li><p>role_project_dev: developer</p>
     * </li>
     * <li><p>role_project_dg_admin: data governance administrator</p>
     * </li>
     * <li><p>role_project_guest: guest</p>
     * </li>
     * <li><p>role_project_security: security administrator</p>
     * </li>
     * <li><p>role_project_deploy: deployer</p>
     * </li>
     * <li><p>role_project_owner: workspace owner</p>
     * </li>
     * <li><p>role_project_data_analyst: data analyst</p>
     * </li>
     * <li><p>role_project_pe: O\&amp;M engineer</p>
     * </li>
     * <li><p>role_project_erd: model designer</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>role_project_guest</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The ID of the DataWorks workspace. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace Management page to obtain the workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10002</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static GetProjectRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        GetProjectRoleRequest self = new GetProjectRoleRequest();
        return TeaModel.build(map, self);
    }

    public GetProjectRoleRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetProjectRoleRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
