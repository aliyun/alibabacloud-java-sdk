// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class DeletePipelineMemberRequest extends TeaModel {
    @NameInMap("OrgId")
    public String orgId;

    @NameInMap("PipelineId")
    public Long pipelineId;

    @NameInMap("UserPk")
    public String userPk;

    @NameInMap("UserId")
    public String userId;

    public static DeletePipelineMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePipelineMemberRequest self = new DeletePipelineMemberRequest();
        return TeaModel.build(map, self);
    }

    public DeletePipelineMemberRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public DeletePipelineMemberRequest setPipelineId(Long pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public Long getPipelineId() {
        return this.pipelineId;
    }

    public DeletePipelineMemberRequest setUserPk(String userPk) {
        this.userPk = userPk;
        return this;
    }
    public String getUserPk() {
        return this.userPk;
    }

    public DeletePipelineMemberRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
