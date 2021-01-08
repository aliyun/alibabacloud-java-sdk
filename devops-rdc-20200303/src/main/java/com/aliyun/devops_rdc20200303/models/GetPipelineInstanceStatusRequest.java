// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class GetPipelineInstanceStatusRequest extends TeaModel {
    @NameInMap("OrgId")
    public String orgId;

    @NameInMap("PipelineId")
    public Long pipelineId;

    @NameInMap("FlowInstanceId")
    public Long flowInstanceId;

    @NameInMap("UserPk")
    public String userPk;

    public static GetPipelineInstanceStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPipelineInstanceStatusRequest self = new GetPipelineInstanceStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetPipelineInstanceStatusRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public GetPipelineInstanceStatusRequest setPipelineId(Long pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public Long getPipelineId() {
        return this.pipelineId;
    }

    public GetPipelineInstanceStatusRequest setFlowInstanceId(Long flowInstanceId) {
        this.flowInstanceId = flowInstanceId;
        return this;
    }
    public Long getFlowInstanceId() {
        return this.flowInstanceId;
    }

    public GetPipelineInstanceStatusRequest setUserPk(String userPk) {
        this.userPk = userPk;
        return this;
    }
    public String getUserPk() {
        return this.userPk;
    }

}
