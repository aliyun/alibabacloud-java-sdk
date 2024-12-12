// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GrantMemberProjectRolesRequest extends TeaModel {
    /**
     * <p>The DataWorks workspace ID. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace page to query the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>105149</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The codes of the roles in the workspace. You can call the <a href="https://help.aliyun.com/zh/dataworks/developer-reference/api-dataworks-public-2024-05-18-listprojectroles?spm=a2c4g.11186623.0.0.43841daeywTtF3">ListProjectRoles</a> operation to query the codes of all roles in the workspace.</p>
     * <p>You must configure this parameter to specify the roles that you want to assign to members in the workspace.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RoleCodes")
    public java.util.List<String> roleCodes;

    /**
     * <p>The DataWorks workspace ID. You can log on to the <a href="https://dataworks.console.aliyun.com/product/ms_menu">DataWorks console</a>, choose More &gt; Management Center in the left-side navigation pane, select the desired workspace on the Management Center page, and then click Go to Management Center. In the left-side navigation pane of the SettingCenter page, click Tenant Members and Roles. On the Tenant Members and Roles page, view the IDs of the accounts used by the members in the workspace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123422344899</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static GrantMemberProjectRolesRequest build(java.util.Map<String, ?> map) throws Exception {
        GrantMemberProjectRolesRequest self = new GrantMemberProjectRolesRequest();
        return TeaModel.build(map, self);
    }

    public GrantMemberProjectRolesRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public GrantMemberProjectRolesRequest setRoleCodes(java.util.List<String> roleCodes) {
        this.roleCodes = roleCodes;
        return this;
    }
    public java.util.List<String> getRoleCodes() {
        return this.roleCodes;
    }

    public GrantMemberProjectRolesRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
