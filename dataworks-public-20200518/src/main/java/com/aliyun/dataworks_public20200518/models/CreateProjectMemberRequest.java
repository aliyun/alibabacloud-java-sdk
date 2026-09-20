// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateProjectMemberRequest extends TeaModel {
    /**
     * <p>The idempotence string. A UUID is recommended.</p>
     * 
     * <strong>example:</strong>
     * <p>1AFAE64E-D1BE-432B-A9****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

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
     * <p>The role code. This parameter is optional. If this parameter is specified, the user is also added to the specified role.</p>
     * 
     * <strong>example:</strong>
     * <p>role_project_guest</p>
     */
    @NameInMap("RoleCode")
    public String roleCode;

    /**
     * <p>The ID of the user to be added.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static CreateProjectMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProjectMemberRequest self = new CreateProjectMemberRequest();
        return TeaModel.build(map, self);
    }

    public CreateProjectMemberRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateProjectMemberRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateProjectMemberRequest setRoleCode(String roleCode) {
        this.roleCode = roleCode;
        return this;
    }
    public String getRoleCode() {
        return this.roleCode;
    }

    public CreateProjectMemberRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
