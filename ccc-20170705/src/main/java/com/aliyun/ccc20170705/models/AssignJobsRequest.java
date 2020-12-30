// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class AssignJobsRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("ScenarioId")
    public String scenarioId;

    @NameInMap("StrategyJson")
    public String strategyJson;

    @NameInMap("CallingNumber")
    public java.util.List<String> callingNumber;

    @NameInMap("JobsJson")
    public java.util.List<String> jobsJson;

    public static AssignJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        AssignJobsRequest self = new AssignJobsRequest();
        return TeaModel.build(map, self);
    }

    public AssignJobsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AssignJobsRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public AssignJobsRequest setScenarioId(String scenarioId) {
        this.scenarioId = scenarioId;
        return this;
    }
    public String getScenarioId() {
        return this.scenarioId;
    }

    public AssignJobsRequest setStrategyJson(String strategyJson) {
        this.strategyJson = strategyJson;
        return this;
    }
    public String getStrategyJson() {
        return this.strategyJson;
    }

    public AssignJobsRequest setCallingNumber(java.util.List<String> callingNumber) {
        this.callingNumber = callingNumber;
        return this;
    }
    public java.util.List<String> getCallingNumber() {
        return this.callingNumber;
    }

    public AssignJobsRequest setJobsJson(java.util.List<String> jobsJson) {
        this.jobsJson = jobsJson;
        return this;
    }
    public java.util.List<String> getJobsJson() {
        return this.jobsJson;
    }

}
