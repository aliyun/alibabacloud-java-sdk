// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateProjectMemberRequest extends TeaModel {
    /**
     * <p>The DataWorks workspace ID. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace page to query the ID.</p>
     * <p>You must configure this parameter to specify the DataWorks workspace to which the API operation is applied.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>24054</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The codes of the roles in the workspace. You can call the <a href="https://help.aliyun.com/zh/dataworks/developer-reference/api-dataworks-public-2024-05-18-listprojectroles?spm=a2c4g.11186623.0.0.43841daeywTtF3">ListProjectRoles</a> operation to query the codes of all roles in the workspace.</p>
     * <p>You must configure this parameter to specify the roles that you want to assign to the member.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RoleCodes")
    public java.util.List<String> roleCodes;

    /**
     * <p>The ID of the account that you want to add to the workspace as a member. You can log on to the <a href="https://workbench.data.aliyun.com/console?spm=openapi-amp.newDocPublishment.0.0.7159281fJ97yfv">DataWorks console</a>, choose More &gt; Management Center in the left-side navigation pane, select the desired workspace on the Management Center page, and then click Go to Management Center. In the left-side navigation pane of the SettingCenter page, click Tenant Members and Roles. On the Tenant Members and Roles page, view the ID of the account that you want to add to the workspace as a member.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123422344899</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static CreateProjectMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProjectMemberRequest self = new CreateProjectMemberRequest();
        return TeaModel.build(map, self);
    }

    public CreateProjectMemberRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateProjectMemberRequest setRoleCodes(java.util.List<String> roleCodes) {
        this.roleCodes = roleCodes;
        return this;
    }
    public java.util.List<String> getRoleCodes() {
        return this.roleCodes;
    }

    public CreateProjectMemberRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
