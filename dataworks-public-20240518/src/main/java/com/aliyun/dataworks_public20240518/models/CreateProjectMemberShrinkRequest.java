// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateProjectMemberShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the DataWorks workspace. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace Management page to obtain the ID.</p>
     * <p>This parameter specifies the DataWorks workspace for this API call operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>24054</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The list of workspace role codes. You can call <a href="https://help.aliyun.com/document_detail/2853930.html">ListProjectRoles</a> to obtain the role codes.</p>
     * <p>This parameter is used to grant workspace roles to the member when adding the member to the workspace.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RoleCodes")
    public String roleCodesShrink;

    /**
     * <p>The ID of the DataWorks account. You can log on to the <a href="https://dataworks.console.aliyun.com/product/ms_menu">DataWorks console - Management Center</a>, select the workspace to which you want to add a member, go to the Management Center page, and then navigate to the <strong>Tenant Members and Roles</strong> page to view the account ID of the user you want to add to the workspace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123422344899</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static CreateProjectMemberShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProjectMemberShrinkRequest self = new CreateProjectMemberShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateProjectMemberShrinkRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateProjectMemberShrinkRequest setRoleCodesShrink(String roleCodesShrink) {
        this.roleCodesShrink = roleCodesShrink;
        return this;
    }
    public String getRoleCodesShrink() {
        return this.roleCodesShrink;
    }

    public CreateProjectMemberShrinkRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
