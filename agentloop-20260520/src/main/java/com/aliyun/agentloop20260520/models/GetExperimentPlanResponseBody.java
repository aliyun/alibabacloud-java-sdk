// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class GetExperimentPlanResponseBody extends TeaModel {
    /**
     * <p>The creation time, in millisecond Unix timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1782816000000</p>
     */
    @NameInMap("createdAt")
    public Long createdAt;

    /**
     * <p>The associated dataset ID.</p>
     * 
     * <strong>example:</strong>
     * <p>arms_customer_agent_level1</p>
     */
    @NameInMap("datasetId")
    public String datasetId;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>对比 checkout Agent 基线与优化版本</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The list of evaluators.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;evaluatorRef&quot;: &quot;Builtin.agent_task_completion&quot;}]</p>
     */
    @NameInMap("evaluators")
    public java.util.List<Evaluator> evaluators;

    /**
     * <p>The experiment type.</p>
     * 
     * <strong>example:</strong>
     * <p>online</p>
     */
    @NameInMap("experimentType")
    public String experimentType;

    /**
     * <p>The list of experiment configurations.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;label&quot;: &quot;A&quot;, &quot;name&quot;: &quot;baseline&quot;, &quot;modelName&quot;: &quot;qwen-max&quot;}]</p>
     */
    @NameInMap("experiments")
    public java.util.List<ExperimentConfig> experiments;

    /**
     * <p>Optional.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;question&quot;: &quot;如何退款？&quot;}</p>
     */
    @NameInMap("input")
    public java.util.Map<String, ?> input;

    /**
     * <p>The experiment plan ID.</p>
     * 
     * <strong>example:</strong>
     * <p>exp-plan-0242d983f5d340fd8479cf2c19eb279e</p>
     */
    @NameInMap("planId")
    public String planId;

    /**
     * <p>The experiment plan name.</p>
     * 
     * <strong>example:</strong>
     * <p>arms_agent_experiment</p>
     */
    @NameInMap("planName")
    public String planName;

    /**
     * <p>The custom query SQL clause in partial dataset mode.</p>
     * 
     * <strong>example:</strong>
     * <p>status=\&quot;OK\&quot;</p>
     */
    @NameInMap("querySql")
    public String querySql;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3FE4CD1E-FF41-56BE-B590-7A021D9C1524</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The list of selected data item IDs in partial dataset mode.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;019ef4d5-a0f0-7114-832d-5542d771cd8c&quot;]</p>
     */
    @NameInMap("selectedItemIds")
    public java.util.List<String> selectedItemIds;

    /**
     * <p>The plan status.</p>
     * 
     * <strong>example:</strong>
     * <p>stopped</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The update time, in millisecond Unix timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1782816600000</p>
     */
    @NameInMap("updatedAt")
    public Long updatedAt;

    public static GetExperimentPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetExperimentPlanResponseBody self = new GetExperimentPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public GetExperimentPlanResponseBody setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public Long getCreatedAt() {
        return this.createdAt;
    }

    public GetExperimentPlanResponseBody setDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public String getDatasetId() {
        return this.datasetId;
    }

    public GetExperimentPlanResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetExperimentPlanResponseBody setEvaluators(java.util.List<Evaluator> evaluators) {
        this.evaluators = evaluators;
        return this;
    }
    public java.util.List<Evaluator> getEvaluators() {
        return this.evaluators;
    }

    public GetExperimentPlanResponseBody setExperimentType(String experimentType) {
        this.experimentType = experimentType;
        return this;
    }
    public String getExperimentType() {
        return this.experimentType;
    }

    public GetExperimentPlanResponseBody setExperiments(java.util.List<ExperimentConfig> experiments) {
        this.experiments = experiments;
        return this;
    }
    public java.util.List<ExperimentConfig> getExperiments() {
        return this.experiments;
    }

    public GetExperimentPlanResponseBody setInput(java.util.Map<String, ?> input) {
        this.input = input;
        return this;
    }
    public java.util.Map<String, ?> getInput() {
        return this.input;
    }

    public GetExperimentPlanResponseBody setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

    public GetExperimentPlanResponseBody setPlanName(String planName) {
        this.planName = planName;
        return this;
    }
    public String getPlanName() {
        return this.planName;
    }

    public GetExperimentPlanResponseBody setQuerySql(String querySql) {
        this.querySql = querySql;
        return this;
    }
    public String getQuerySql() {
        return this.querySql;
    }

    public GetExperimentPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetExperimentPlanResponseBody setSelectedItemIds(java.util.List<String> selectedItemIds) {
        this.selectedItemIds = selectedItemIds;
        return this;
    }
    public java.util.List<String> getSelectedItemIds() {
        return this.selectedItemIds;
    }

    public GetExperimentPlanResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetExperimentPlanResponseBody setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

}
