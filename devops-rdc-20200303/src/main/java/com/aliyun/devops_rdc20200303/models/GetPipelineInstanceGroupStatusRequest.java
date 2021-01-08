// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class GetPipelineInstanceGroupStatusRequest extends TeaModel {
    @NameInMap("OrgId")
    public String orgId;

    @NameInMap("PipelineId")
    public Long pipelineId;

    @NameInMap("UserPk")
    public String userPk;

    @NameInMap("FlowInstanceId")
    public Long flowInstanceId;

    public static GetPipelineInstanceGroupStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPipelineInstanceGroupStatusRequest self = new GetPipelineInstanceGroupStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetPipelineInstanceGroupStatusRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public GetPipelineInstanceGroupStatusRequest setPipelineId(Long pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public Long getPipelineId() {
        return this.pipelineId;
    }

    public GetPipelineInstanceGroupStatusRequest setUserPk(String userPk) {
        this.userPk = userPk;
        return this;
    }
    public String getUserPk() {
        return this.userPk;
    }

    public GetPipelineInstanceGroupStatusRequest setFlowInstanceId(Long flowInstanceId) {
        this.flowInstanceId = flowInstanceId;
        return this;
    }
    public Long getFlowInstanceId() {
        return this.flowInstanceId;
    }

}
