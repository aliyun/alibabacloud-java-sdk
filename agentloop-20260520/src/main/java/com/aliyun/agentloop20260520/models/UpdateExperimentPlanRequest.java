// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class UpdateExperimentPlanRequest extends TeaModel {
    /**
     * <p>The associated dataset ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rca_benckmark_eval</p>
     */
    @NameInMap("datasetId")
    public String datasetId;

    /**
     * <p>Optional.</p>
     * 
     * <strong>example:</strong>
     * <p>agentspace-project</p>
     */
    @NameInMap("datasetProject")
    public String datasetProject;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>rca_benchmark_eval_experiment offline experiment.</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The evaluator list. Omitting this field means no modification. Passing an empty array clears the list.</p>
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
     * <p>OFFLINE</p>
     */
    @NameInMap("experimentType")
    public String experimentType;

    /**
     * <p>The experiment configuration list. When passed, the entire list is replaced. The number of items must be 1 to 5.</p>
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
     * <p>{&quot;question&quot;: &quot;How do I get a refund?&quot;}</p>
     */
    @NameInMap("input")
    public java.util.Map<String, ?> input;

    /**
     * <p>The experiment plan name.</p>
     * 
     * <strong>example:</strong>
     * <p>rca_benchmark_eval_experiment</p>
     */
    @NameInMap("planName")
    public String planName;

    /**
     * <p>The custom query SQL clause in partial dataset mode.</p>
     * 
     * <strong>example:</strong>
     * <p>level &gt; 2</p>
     */
    @NameInMap("querySql")
    public String querySql;

    /**
     * <p>The list of selected data item IDs in partial dataset mode. Passing an empty array clears the list.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("selectedItemIds")
    public java.util.List<String> selectedItemIds;

    public static UpdateExperimentPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateExperimentPlanRequest self = new UpdateExperimentPlanRequest();
        return TeaModel.build(map, self);
    }

    public UpdateExperimentPlanRequest setDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public String getDatasetId() {
        return this.datasetId;
    }

    public UpdateExperimentPlanRequest setDatasetProject(String datasetProject) {
        this.datasetProject = datasetProject;
        return this;
    }
    public String getDatasetProject() {
        return this.datasetProject;
    }

    public UpdateExperimentPlanRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateExperimentPlanRequest setEvaluators(java.util.List<Evaluator> evaluators) {
        this.evaluators = evaluators;
        return this;
    }
    public java.util.List<Evaluator> getEvaluators() {
        return this.evaluators;
    }

    public UpdateExperimentPlanRequest setExperimentType(String experimentType) {
        this.experimentType = experimentType;
        return this;
    }
    public String getExperimentType() {
        return this.experimentType;
    }

    public UpdateExperimentPlanRequest setExperiments(java.util.List<ExperimentConfig> experiments) {
        this.experiments = experiments;
        return this;
    }
    public java.util.List<ExperimentConfig> getExperiments() {
        return this.experiments;
    }

    public UpdateExperimentPlanRequest setInput(java.util.Map<String, ?> input) {
        this.input = input;
        return this;
    }
    public java.util.Map<String, ?> getInput() {
        return this.input;
    }

    public UpdateExperimentPlanRequest setPlanName(String planName) {
        this.planName = planName;
        return this;
    }
    public String getPlanName() {
        return this.planName;
    }

    public UpdateExperimentPlanRequest setQuerySql(String querySql) {
        this.querySql = querySql;
        return this;
    }
    public String getQuerySql() {
        return this.querySql;
    }

    public UpdateExperimentPlanRequest setSelectedItemIds(java.util.List<String> selectedItemIds) {
        this.selectedItemIds = selectedItemIds;
        return this;
    }
    public java.util.List<String> getSelectedItemIds() {
        return this.selectedItemIds;
    }

}
