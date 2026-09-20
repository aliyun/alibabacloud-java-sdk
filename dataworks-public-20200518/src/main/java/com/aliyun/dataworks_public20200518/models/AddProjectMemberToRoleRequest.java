// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class AddProjectMemberToRoleRequest extends TeaModel {
    /**
     * <p>The idempotency field. We recommend that you use a UUID. This field uniquely identifies this call operation.</p>
     * 
     * <strong>example:</strong>
     * <p>1AFAE64E-D1BE-432B-A9*****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the DataWorks workspace. You can call the <a href="https://help.aliyun.com/document_detail/2780068.html">ListProjects</a> operation to obtain the workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>27</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The code of the DataWorks workspace role. You can call the <a href="https://help.aliyun.com/document_detail/2780079.html">ListProjectRoles</a> operation to obtain the role code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>role_project_guest</p>
     */
    @NameInMap("RoleCode")
    public String roleCode;

    /**
     * <p>The Alibaba Cloud account ID. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and hover over the profile picture in the upper-right corner of the top navigation bar to view the account ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static AddProjectMemberToRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        AddProjectMemberToRoleRequest self = new AddProjectMemberToRoleRequest();
        return TeaModel.build(map, self);
    }

    public AddProjectMemberToRoleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AddProjectMemberToRoleRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public AddProjectMemberToRoleRequest setRoleCode(String roleCode) {
        this.roleCode = roleCode;
        return this;
    }
    public String getRoleCode() {
        return this.roleCode;
    }

    public AddProjectMemberToRoleRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
