// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GrantMemberProjectRolesShrinkRequest extends TeaModel {
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
    public String roleCodesShrink;

    /**
     * <p>The IDs of the accounts used by the members in the workspace. You can log on to the <a href="https://workbench.data.aliyun.com/console?spm=openapi-amp.newDocPublishment.0.0.51d7281fjgBRmo">DataWorks console</a>, choose More &gt; Management Center in the left-side navigation pane, select the desired workspace on the Management Center page, and then click Go to Management Center. In the left-side navigation pane of the SettingCenter page, click Tenant Members and Roles. On the Tenant Members and Roles page, view the IDs of the accounts used by the members in the workspace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123422344899</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static GrantMemberProjectRolesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GrantMemberProjectRolesShrinkRequest self = new GrantMemberProjectRolesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GrantMemberProjectRolesShrinkRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public GrantMemberProjectRolesShrinkRequest setRoleCodesShrink(String roleCodesShrink) {
        this.roleCodesShrink = roleCodesShrink;
        return this;
    }
    public String getRoleCodesShrink() {
        return this.roleCodesShrink;
    }

    public GrantMemberProjectRolesShrinkRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
