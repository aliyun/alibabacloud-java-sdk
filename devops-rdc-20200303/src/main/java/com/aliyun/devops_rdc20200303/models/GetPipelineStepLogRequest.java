// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class GetPipelineStepLogRequest extends TeaModel {
    @NameInMap("OrgId")
    public String orgId;

    @NameInMap("PipelineId")
    public Long pipelineId;

    @NameInMap("UserPk")
    public String userPk;

    @NameInMap("JobId")
    public Long jobId;

    @NameInMap("StepIndex")
    public String stepIndex;

    @NameInMap("Offset")
    public Long offset;

    @NameInMap("Limit")
    public Long limit;

    public static GetPipelineStepLogRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPipelineStepLogRequest self = new GetPipelineStepLogRequest();
        return TeaModel.build(map, self);
    }

    public GetPipelineStepLogRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public GetPipelineStepLogRequest setPipelineId(Long pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public Long getPipelineId() {
        return this.pipelineId;
    }

    public GetPipelineStepLogRequest setUserPk(String userPk) {
        this.userPk = userPk;
        return this;
    }
    public String getUserPk() {
        return this.userPk;
    }

    public GetPipelineStepLogRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

    public GetPipelineStepLogRequest setStepIndex(String stepIndex) {
        this.stepIndex = stepIndex;
        return this;
    }
    public String getStepIndex() {
        return this.stepIndex;
    }

    public GetPipelineStepLogRequest setOffset(Long offset) {
        this.offset = offset;
        return this;
    }
    public Long getOffset() {
        return this.offset;
    }

    public GetPipelineStepLogRequest setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

}
