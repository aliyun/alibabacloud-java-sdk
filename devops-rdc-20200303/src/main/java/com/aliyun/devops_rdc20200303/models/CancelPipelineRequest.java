// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class CancelPipelineRequest extends TeaModel {
    @NameInMap("OrgId")
    public String orgId;

    @NameInMap("PipelineId")
    public Long pipelineId;

    @NameInMap("FlowInstanceId")
    public Long flowInstanceId;

    @NameInMap("UserPk")
    public String userPk;

    public static CancelPipelineRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelPipelineRequest self = new CancelPipelineRequest();
        return TeaModel.build(map, self);
    }

    public CancelPipelineRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public CancelPipelineRequest setPipelineId(Long pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public Long getPipelineId() {
        return this.pipelineId;
    }

    public CancelPipelineRequest setFlowInstanceId(Long flowInstanceId) {
        this.flowInstanceId = flowInstanceId;
        return this;
    }
    public Long getFlowInstanceId() {
        return this.flowInstanceId;
    }

    public CancelPipelineRequest setUserPk(String userPk) {
        this.userPk = userPk;
        return this;
    }
    public String getUserPk() {
        return this.userPk;
    }

}
