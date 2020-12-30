// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class SuspendJobsRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("All")
    public Boolean all;

    @NameInMap("ScenarioId")
    public String scenarioId;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("JobId")
    public java.util.List<String> jobId;

    @NameInMap("JobReferenceId")
    public java.util.List<String> jobReferenceId;

    public static SuspendJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        SuspendJobsRequest self = new SuspendJobsRequest();
        return TeaModel.build(map, self);
    }

    public SuspendJobsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SuspendJobsRequest setAll(Boolean all) {
        this.all = all;
        return this;
    }
    public Boolean getAll() {
        return this.all;
    }

    public SuspendJobsRequest setScenarioId(String scenarioId) {
        this.scenarioId = scenarioId;
        return this;
    }
    public String getScenarioId() {
        return this.scenarioId;
    }

    public SuspendJobsRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public SuspendJobsRequest setJobId(java.util.List<String> jobId) {
        this.jobId = jobId;
        return this;
    }
    public java.util.List<String> getJobId() {
        return this.jobId;
    }

    public SuspendJobsRequest setJobReferenceId(java.util.List<String> jobReferenceId) {
        this.jobReferenceId = jobReferenceId;
        return this;
    }
    public java.util.List<String> getJobReferenceId() {
        return this.jobReferenceId;
    }

}
