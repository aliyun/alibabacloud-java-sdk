// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateProjectMemberRequest extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. We recommend that you set this parameter to a UUID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("RoleCode")
    public String roleCode;

    /**
     * <p>The code of the role. This parameter is optional. If you specify the RoleCode parameter, the user is assigned the role.</p>
     * <br>
     * <p>This parameter is required.</p>
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
