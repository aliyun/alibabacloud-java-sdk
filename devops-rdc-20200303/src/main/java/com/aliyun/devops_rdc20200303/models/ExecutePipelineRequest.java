// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class ExecutePipelineRequest extends TeaModel {
    @NameInMap("OrgId")
    public String orgId;

    @NameInMap("PipelineId")
    public Long pipelineId;

    @NameInMap("Parameters")
    public String parameters;

    @NameInMap("UserPk")
    public String userPk;

    public static ExecutePipelineRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecutePipelineRequest self = new ExecutePipelineRequest();
        return TeaModel.build(map, self);
    }

    public ExecutePipelineRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public ExecutePipelineRequest setPipelineId(Long pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public Long getPipelineId() {
        return this.pipelineId;
    }

    public ExecutePipelineRequest setParameters(String parameters) {
        this.parameters = parameters;
        return this;
    }
    public String getParameters() {
        return this.parameters;
    }

    public ExecutePipelineRequest setUserPk(String userPk) {
        this.userPk = userPk;
        return this;
    }
    public String getUserPk() {
        return this.userPk;
    }

}
