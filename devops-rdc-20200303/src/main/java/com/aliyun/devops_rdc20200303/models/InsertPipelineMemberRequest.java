// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class InsertPipelineMemberRequest extends TeaModel {
    @NameInMap("OrgId")
    public String orgId;

    @NameInMap("PipelineId")
    public Long pipelineId;

    @NameInMap("UserPk")
    public String userPk;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("RoleName")
    public String roleName;

    public static InsertPipelineMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        InsertPipelineMemberRequest self = new InsertPipelineMemberRequest();
        return TeaModel.build(map, self);
    }

    public InsertPipelineMemberRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public InsertPipelineMemberRequest setPipelineId(Long pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public Long getPipelineId() {
        return this.pipelineId;
    }

    public InsertPipelineMemberRequest setUserPk(String userPk) {
        this.userPk = userPk;
        return this;
    }
    public String getUserPk() {
        return this.userPk;
    }

    public InsertPipelineMemberRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public InsertPipelineMemberRequest setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

}
