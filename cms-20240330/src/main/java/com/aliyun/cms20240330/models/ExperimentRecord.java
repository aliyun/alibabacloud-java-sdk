// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ExperimentRecord extends TeaModel {
    @NameInMap("completedAt")
    public Long completedAt;

    @NameInMap("completedTasks")
    public Integer completedTasks;

    @NameInMap("dataSourceType")
    public String dataSourceType;

    @NameInMap("datasetId")
    public String datasetId;

    @NameInMap("datasetProject")
    public String datasetProject;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("evaluators")
    public java.util.List<Evaluator> evaluators;

    @NameInMap("executedAt")
    public Long executedAt;

    @NameInMap("experimentConfig")
    public ExperimentConfig experimentConfig;

    @NameInMap("experimentName")
    public String experimentName;

    @NameInMap("failedTasks")
    public Integer failedTasks;

    @NameInMap("input")
    public java.util.Map<String, ?> input;

    @NameInMap("modelName")
    public String modelName;

    @NameInMap("planId")
    public String planId;

    @NameInMap("planName")
    public String planName;

    @NameInMap("progress")
    public Float progress;

    @NameInMap("recordId")
    public String recordId;

    @NameInMap("selectedItemIds")
    public java.util.List<String> selectedItemIds;

    @NameInMap("status")
    public String status;

    @NameInMap("totalTasks")
    public Integer totalTasks;

    public static ExperimentRecord build(java.util.Map<String, ?> map) throws Exception {
        ExperimentRecord self = new ExperimentRecord();
        return TeaModel.build(map, self);
    }

    public ExperimentRecord setCompletedAt(Long completedAt) {
        this.completedAt = completedAt;
        return this;
    }
    public Long getCompletedAt() {
        return this.completedAt;
    }

    public ExperimentRecord setCompletedTasks(Integer completedTasks) {
        this.completedTasks = completedTasks;
        return this;
    }
    public Integer getCompletedTasks() {
        return this.completedTasks;
    }

    public ExperimentRecord setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public ExperimentRecord setDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public String getDatasetId() {
        return this.datasetId;
    }

    public ExperimentRecord setDatasetProject(String datasetProject) {
        this.datasetProject = datasetProject;
        return this;
    }
    public String getDatasetProject() {
        return this.datasetProject;
    }

    public ExperimentRecord setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ExperimentRecord setEvaluators(java.util.List<Evaluator> evaluators) {
        this.evaluators = evaluators;
        return this;
    }
    public java.util.List<Evaluator> getEvaluators() {
        return this.evaluators;
    }

    public ExperimentRecord setExecutedAt(Long executedAt) {
        this.executedAt = executedAt;
        return this;
    }
    public Long getExecutedAt() {
        return this.executedAt;
    }

    public ExperimentRecord setExperimentConfig(ExperimentConfig experimentConfig) {
        this.experimentConfig = experimentConfig;
        return this;
    }
    public ExperimentConfig getExperimentConfig() {
        return this.experimentConfig;
    }

    public ExperimentRecord setExperimentName(String experimentName) {
        this.experimentName = experimentName;
        return this;
    }
    public String getExperimentName() {
        return this.experimentName;
    }

    public ExperimentRecord setFailedTasks(Integer failedTasks) {
        this.failedTasks = failedTasks;
        return this;
    }
    public Integer getFailedTasks() {
        return this.failedTasks;
    }

    public ExperimentRecord setInput(java.util.Map<String, ?> input) {
        this.input = input;
        return this;
    }
    public java.util.Map<String, ?> getInput() {
        return this.input;
    }

    public ExperimentRecord setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public ExperimentRecord setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

    public ExperimentRecord setPlanName(String planName) {
        this.planName = planName;
        return this;
    }
    public String getPlanName() {
        return this.planName;
    }

    public ExperimentRecord setProgress(Float progress) {
        this.progress = progress;
        return this;
    }
    public Float getProgress() {
        return this.progress;
    }

    public ExperimentRecord setRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }
    public String getRecordId() {
        return this.recordId;
    }

    public ExperimentRecord setSelectedItemIds(java.util.List<String> selectedItemIds) {
        this.selectedItemIds = selectedItemIds;
        return this;
    }
    public java.util.List<String> getSelectedItemIds() {
        return this.selectedItemIds;
    }

    public ExperimentRecord setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ExperimentRecord setTotalTasks(Integer totalTasks) {
        this.totalTasks = totalTasks;
        return this;
    }
    public Integer getTotalTasks() {
        return this.totalTasks;
    }

}
