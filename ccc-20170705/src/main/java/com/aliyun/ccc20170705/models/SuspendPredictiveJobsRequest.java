// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class SuspendPredictiveJobsRequest extends TeaModel {
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

    public static SuspendPredictiveJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        SuspendPredictiveJobsRequest self = new SuspendPredictiveJobsRequest();
        return TeaModel.build(map, self);
    }

    public SuspendPredictiveJobsRequest setAll(Boolean all) {
        this.all = all;
        return this;
    }
    public Boolean getAll() {
        return this.all;
    }

    public SuspendPredictiveJobsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SuspendPredictiveJobsRequest setJobGroupId(String jobGroupId) {
        this.jobGroupId = jobGroupId;
        return this;
    }
    public String getJobGroupId() {
        return this.jobGroupId;
    }

    public SuspendPredictiveJobsRequest setJobId(java.util.List<String> jobId) {
        this.jobId = jobId;
        return this;
    }
    public java.util.List<String> getJobId() {
        return this.jobId;
    }

    public SuspendPredictiveJobsRequest setSkillGroupId(String skillGroupId) {
        this.skillGroupId = skillGroupId;
        return this;
    }
    public String getSkillGroupId() {
        return this.skillGroupId;
    }

}
