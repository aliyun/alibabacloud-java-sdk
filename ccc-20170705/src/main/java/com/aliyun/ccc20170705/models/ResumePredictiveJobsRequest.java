// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ResumePredictiveJobsRequest extends TeaModel {
    @NameInMap("All")
    public Boolean all;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("JobGroupId")
    public String jobGroupId;

    @NameInMap("JobId")
    public java.util.List<String> jobId;

    @NameInMap("SkillGroupId")
    public String skillGroupId;

    public static ResumePredictiveJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        ResumePredictiveJobsRequest self = new ResumePredictiveJobsRequest();
        return TeaModel.build(map, self);
    }

    public ResumePredictiveJobsRequest setAll(Boolean all) {
        this.all = all;
        return this;
    }
    public Boolean getAll() {
        return this.all;
    }

    public ResumePredictiveJobsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ResumePredictiveJobsRequest setJobGroupId(String jobGroupId) {
        this.jobGroupId = jobGroupId;
        return this;
    }
    public String getJobGroupId() {
        return this.jobGroupId;
    }

    public ResumePredictiveJobsRequest setJobId(java.util.List<String> jobId) {
        this.jobId = jobId;
        return this;
    }
    public java.util.List<String> getJobId() {
        return this.jobId;
    }

    public ResumePredictiveJobsRequest setSkillGroupId(String skillGroupId) {
        this.skillGroupId = skillGroupId;
        return this;
    }
    public String getSkillGroupId() {
        return this.skillGroupId;
    }

}
