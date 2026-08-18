// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class RevokeMemberProjectRolesShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the DataWorks workspace. You can log on to the <a href="https://dataworks.console.aliyun.com/workspace/list">DataWorks console</a> and go to the workspace settings page to obtain the workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>105149</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The list of workspace role codes. You can call <a href="https://help.aliyun.com/document_detail/2853930.html">ListProjectRoles</a> to obtain the role codes. </p>
     * <p>This parameter specifies the workspace roles to be revoked by this API call.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RoleCodes")
    public String roleCodesShrink;

    /**
     * <p>The ID of the DataWorks account. You can log on to the <a href="https://dataworks.console.aliyun.com/product/ms_menu">DataWorks console - Management Center</a>, select the workspace that you want to manage, go to the Tenant Members and Roles page, and view the account ID of the member whose roles you want to revoke.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123422344899</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static RevokeMemberProjectRolesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RevokeMemberProjectRolesShrinkRequest self = new RevokeMemberProjectRolesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RevokeMemberProjectRolesShrinkRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public RevokeMemberProjectRolesShrinkRequest setRoleCodesShrink(String roleCodesShrink) {
        this.roleCodesShrink = roleCodesShrink;
        return this;
    }
    public String getRoleCodesShrink() {
        return this.roleCodesShrink;
    }

    public RevokeMemberProjectRolesShrinkRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
