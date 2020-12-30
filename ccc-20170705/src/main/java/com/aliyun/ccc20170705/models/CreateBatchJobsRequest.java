// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class CreateBatchJobsRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Description")
    public String description;

    @NameInMap("ScenarioId")
    public String scenarioId;

    @NameInMap("StrategyJson")
    public String strategyJson;

    @NameInMap("JobFilePath")
    public String jobFilePath;

    @NameInMap("Submitted")
    public Boolean submitted;

    @NameInMap("CallingNumber")
    public java.util.List<String> callingNumber;

    public static CreateBatchJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBatchJobsRequest self = new CreateBatchJobsRequest();
        return TeaModel.build(map, self);
    }

    public CreateBatchJobsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateBatchJobsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateBatchJobsRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateBatchJobsRequest setScenarioId(String scenarioId) {
        this.scenarioId = scenarioId;
        return this;
    }
    public String getScenarioId() {
        return this.scenarioId;
    }

    public CreateBatchJobsRequest setStrategyJson(String strategyJson) {
        this.strategyJson = strategyJson;
        return this;
    }
    public String getStrategyJson() {
        return this.strategyJson;
    }

    public CreateBatchJobsRequest setJobFilePath(String jobFilePath) {
        this.jobFilePath = jobFilePath;
        return this;
    }
    public String getJobFilePath() {
        return this.jobFilePath;
    }

    public CreateBatchJobsRequest setSubmitted(Boolean submitted) {
        this.submitted = submitted;
        return this;
    }
    public Boolean getSubmitted() {
        return this.submitted;
    }

    public CreateBatchJobsRequest setCallingNumber(java.util.List<String> callingNumber) {
        this.callingNumber = callingNumber;
        return this;
    }
    public java.util.List<String> getCallingNumber() {
        return this.callingNumber;
    }

}
