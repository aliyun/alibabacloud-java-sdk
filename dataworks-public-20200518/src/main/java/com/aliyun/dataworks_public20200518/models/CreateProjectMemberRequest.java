// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateProjectMemberRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("RoleCode")
    public String roleCode;

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
