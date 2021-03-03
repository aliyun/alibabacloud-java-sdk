// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class CreatePredictiveJobGroupRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("SkillGroupId")
    public String skillGroupId;

    @NameInMap("StrategyJson")
    public String strategyJson;

    @NameInMap("Name")
    public String name;

    @NameInMap("Description")
    public String description;

    @NameInMap("TimingSchedule")
    public Boolean timingSchedule;

    @NameInMap("JobFilePath")
    public String jobFilePath;

    @NameInMap("IsDraft")
    public Boolean isDraft;

    @NameInMap("JobsJson")
    public java.util.List<String> jobsJson;

    public static CreatePredictiveJobGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePredictiveJobGroupRequest self = new CreatePredictiveJobGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreatePredictiveJobGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreatePredictiveJobGroupRequest setSkillGroupId(String skillGroupId) {
        this.skillGroupId = skillGroupId;
        return this;
    }
    public String getSkillGroupId() {
        return this.skillGroupId;
    }

    public CreatePredictiveJobGroupRequest setStrategyJson(String strategyJson) {
        this.strategyJson = strategyJson;
        return this;
    }
    public String getStrategyJson() {
        return this.strategyJson;
    }

    public CreatePredictiveJobGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreatePredictiveJobGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreatePredictiveJobGroupRequest setTimingSchedule(Boolean timingSchedule) {
        this.timingSchedule = timingSchedule;
        return this;
    }
    public Boolean getTimingSchedule() {
        return this.timingSchedule;
    }

    public CreatePredictiveJobGroupRequest setJobFilePath(String jobFilePath) {
        this.jobFilePath = jobFilePath;
        return this;
    }
    public String getJobFilePath() {
        return this.jobFilePath;
    }

    public CreatePredictiveJobGroupRequest setIsDraft(Boolean isDraft) {
        this.isDraft = isDraft;
        return this;
    }
    public Boolean getIsDraft() {
        return this.isDraft;
    }

    public CreatePredictiveJobGroupRequest setJobsJson(java.util.List<String> jobsJson) {
        this.jobsJson = jobsJson;
        return this;
    }
    public java.util.List<String> getJobsJson() {
        return this.jobsJson;
    }

}
