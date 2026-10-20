// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class ExperimentRecord extends TeaModel {
    /**
     * <p>The completion timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1767229200000</p>
     */
    @NameInMap("completedAt")
    public Long completedAt;

    /**
     * <p>The number of completed tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("completedTasks")
    public Integer completedTasks;

    /**
     * <p>The data source type. Valid values: simple, dataset-full, and dataset-partial.</p>
     * 
     * <strong>example:</strong>
     * <p>dataset-full</p>
     */
    @NameInMap("dataSourceType")
    public String dataSourceType;

    /**
     * <p>The dataset ID.</p>
     * 
     * <strong>example:</strong>
     * <p>dataset-123456</p>
     */
    @NameInMap("datasetId")
    public String datasetId;

    /**
     * <p>The Simple Log Service (SLS) project where the dataset is located.</p>
     * 
     * <strong>example:</strong>
     * <p>agentspace-project</p>
     */
    @NameInMap("datasetProject")
    public String datasetProject;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Model invocation timeout</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the associated evaluation task.</p>
     * 
     * <strong>example:</strong>
     * <p>eval-task-6bec93bfa03740dd86ce2bf1496e65fb</p>
     */
    @NameInMap("evaluationTaskId")
    public String evaluationTaskId;

    /**
     * <p>The list of evaluators.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;name&quot;:&quot;Builtin.agent_correctness&quot;}]</p>
     */
    @NameInMap("evaluators")
    public java.util.List<Evaluator> evaluators;

    /**
     * <p>The execution timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1767225600000</p>
     */
    @NameInMap("executedAt")
    public Long executedAt;

    /**
     * <p>The list of experiment configurations.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;label&quot;:&quot;A&quot;,&quot;name&quot;:&quot;baseline&quot;,&quot;modelName&quot;:&quot;qwen-max&quot;}]</p>
     */
    @NameInMap("experimentConfig")
    public java.util.List<ExperimentConfig> experimentConfig;

    /**
     * <p>The ID of the associated experiment plan.</p>
     * 
     * <strong>example:</strong>
     * <p>exp-plan-0242d983f5d340fd8479cf2c19eb279e</p>
     */
    @NameInMap("experimentPlanId")
    public String experimentPlanId;

    /**
     * <p>The number of failed tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("failedTasks")
    public Integer failedTasks;

    /**
     * <p>The single-line input in SIMPLE mode.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;test&quot;:&quot;test&quot;,&quot;test2&quot;:1}</p>
     */
    @NameInMap("input")
    public java.util.Map<String, ?> input;

    /**
     * <p>The list of model names used.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;qwen-max&quot;]</p>
     */
    @NameInMap("modelNames")
    public java.util.List<String> modelNames;

    /**
     * <p>The name of the associated experiment plan.</p>
     * 
     * <strong>example:</strong>
     * <p>customer-service-eval</p>
     */
    @NameInMap("planName")
    public String planName;

    /**
     * <p>The execution progress, ranging from 0 to 1.</p>
     * 
     * <strong>example:</strong>
     * <p>0.5</p>
     */
    @NameInMap("progress")
    public Float progress;

    /**
     * <p>The custom query SQL clause in dataset-partial mode.</p>
     * 
     * <strong>example:</strong>
     * <p>level &gt; 2</p>
     */
    @NameInMap("querySql")
    public String querySql;

    /**
     * <p>The experiment record ID.</p>
     * 
     * <strong>example:</strong>
     * <p>exp-run-f6d419b0ed3d43a7b585948a55efc07b</p>
     */
    @NameInMap("recordId")
    public String recordId;

    /**
     * <p>The experiment record name.</p>
     * 
     * <strong>example:</strong>
     * <p>baseline-run</p>
     */
    @NameInMap("recordName")
    public String recordName;

    /**
     * <p>The list of selected data item IDs in dataset-partial mode.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;item-123456&quot;]</p>
     */
    @NameInMap("selectedItemIds")
    public java.util.List<String> selectedItemIds;

    /**
     * <p>The status. Valid values: pending, running, completed, and failed.</p>
     * 
     * <strong>example:</strong>
     * <p>running</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The total number of tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
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

    public ExperimentRecord setEvaluationTaskId(String evaluationTaskId) {
        this.evaluationTaskId = evaluationTaskId;
        return this;
    }
    public String getEvaluationTaskId() {
        return this.evaluationTaskId;
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

    public ExperimentRecord setExperimentConfig(java.util.List<ExperimentConfig> experimentConfig) {
        this.experimentConfig = experimentConfig;
        return this;
    }
    public java.util.List<ExperimentConfig> getExperimentConfig() {
        return this.experimentConfig;
    }

    public ExperimentRecord setExperimentPlanId(String experimentPlanId) {
        this.experimentPlanId = experimentPlanId;
        return this;
    }
    public String getExperimentPlanId() {
        return this.experimentPlanId;
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

    public ExperimentRecord setModelNames(java.util.List<String> modelNames) {
        this.modelNames = modelNames;
        return this;
    }
    public java.util.List<String> getModelNames() {
        return this.modelNames;
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

    public ExperimentRecord setQuerySql(String querySql) {
        this.querySql = querySql;
        return this;
    }
    public String getQuerySql() {
        return this.querySql;
    }

    public ExperimentRecord setRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }
    public String getRecordId() {
        return this.recordId;
    }

    public ExperimentRecord setRecordName(String recordName) {
        this.recordName = recordName;
        return this;
    }
    public String getRecordName() {
        return this.recordName;
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
