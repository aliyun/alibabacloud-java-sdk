// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class GetPipelineInstanceInfoRequest extends TeaModel {
    @NameInMap("OrgId")
    public String orgId;

    @NameInMap("PipelineId")
    public Long pipelineId;

    @NameInMap("FlowInstanceId")
    public String flowInstanceId;

    @NameInMap("UserPk")
    public String userPk;

    public static GetPipelineInstanceInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPipelineInstanceInfoRequest self = new GetPipelineInstanceInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetPipelineInstanceInfoRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public GetPipelineInstanceInfoRequest setPipelineId(Long pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public Long getPipelineId() {
        return this.pipelineId;
    }

    public GetPipelineInstanceInfoRequest setFlowInstanceId(String flowInstanceId) {
        this.flowInstanceId = flowInstanceId;
        return this;
    }
    public String getFlowInstanceId() {
        return this.flowInstanceId;
    }

    public GetPipelineInstanceInfoRequest setUserPk(String userPk) {
        this.userPk = userPk;
        return this;
    }
    public String getUserPk() {
        return this.userPk;
    }

}
