// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class CreateExperimentPlanRequest extends TeaModel {
    /**
     * <p>The ID of the associated dataset. If you do not specify this parameter, the execution phase is processed in simple mode.</p>
     * 
     * <strong>example:</strong>
     * <p>rca_benckmark_eval</p>
     */
    @NameInMap("datasetId")
    public String datasetId;

    /**
     * <p>The description of the experiment plan.</p>
     * 
     * <strong>example:</strong>
     * <p>rca_benchmark_eval_experiment offline experiment</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The list of evaluators. After you configure this parameter, an evaluation is automatically triggered when the experiment is completed.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;evaluatorRef&quot;: &quot;Builtin.agent_correctness&quot;, &quot;name&quot;: &quot;Builtin.agent_correctness&quot;, &quot;type&quot;: &quot;AGENT&quot;, &quot;resultName&quot;: &quot;Builtin.agent_correctness&quot;, &quot;resultType&quot;: &quot;score&quot;, &quot;variableMapping&quot;: {&quot;input&quot;: &quot;experiment_input&quot;, &quot;output&quot;: &quot;experiment_output&quot;, &quot;expected_output&quot;: &quot;dataset.ground_truth_json&quot;}, &quot;filters&quot;: {&quot;query&quot;: &quot;&quot;, &quot;sample&quot;: &quot;100&quot;}, &quot;config&quot;: {&quot;variables&quot;: [], &quot;prompt&quot;: &quot;&quot;}}, {&quot;evaluatorRef&quot;: &quot;rca-toxicity-safety-accuracy&quot;, &quot;name&quot;: &quot;rca-toxicity-safety-accuracy&quot;, &quot;type&quot;: &quot;AGENT&quot;, &quot;resultName&quot;: &quot;rca-toxicity-safety-accuracy&quot;, &quot;resultType&quot;: &quot;score&quot;, &quot;variableMapping&quot;: {&quot;input&quot;: &quot;experiment_input&quot;, &quot;output&quot;: &quot;experiment_output&quot;, &quot;question&quot;: &quot;dataset.question&quot;, &quot;expected_output&quot;: &quot;dataset.ground_truth_json&quot;, &quot;payload_json&quot;: &quot;dataset.payload_json&quot;}, &quot;filters&quot;: {&quot;query&quot;: &quot;&quot;, &quot;sample&quot;: &quot;100&quot;}, &quot;config&quot;: {&quot;variables&quot;: [], &quot;prompt&quot;: &quot;&quot;}}]</p>
     */
    @NameInMap("evaluators")
    public java.util.List<Evaluator> evaluators;

    /**
     * <p>The type of the experiment. Valid values: OFFLINE and ONLINE.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>OFFLINE</p>
     */
    @NameInMap("experimentType")
    public String experimentType;

    /**
     * <p>The list of experiment configurations. You can specify up to 5 configurations. This parameter is optional or can be left empty for offline experiments. For online experiments, you must specify at least one configuration.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;label&quot;: &quot;A&quot;, &quot;name&quot;: &quot;experimentA&quot;, &quot;modelName&quot;: &quot;qwen3.7-plus&quot;, &quot;modelProvider&quot;: &quot;dashscope&quot;, &quot;modelParameters&quot;: {&quot;temperature&quot;: 0.7, &quot;topP&quot;: 0.8, &quot;presencePenalty&quot;: 0.0, &quot;frequencyPenalty&quot;: 0.0}, &quot;promptTemplate&quot;: [{&quot;role&quot;: &quot;system&quot;, &quot;content&quot;: &quot;You are the Alibaba Cloud ARMS product Q&amp;A bot.&quot;}, {&quot;role&quot;: &quot;user&quot;, &quot;content&quot;: &quot;{{input}}&quot;}]}, {&quot;label&quot;: &quot;B&quot;, &quot;name&quot;: &quot;experimentB&quot;, &quot;modelName&quot;: &quot;qwen3.7-max&quot;, &quot;modelProvider&quot;: &quot;dashscope&quot;, &quot;modelParameters&quot;: {&quot;temperature&quot;: 0.7, &quot;topP&quot;: 0.8, &quot;presencePenalty&quot;: 0.0, &quot;frequencyPenalty&quot;: 0.0}, &quot;promptTemplate&quot;: [{&quot;role&quot;: &quot;system&quot;, &quot;content&quot;: &quot;You are the Alibaba Cloud ARMS product Q&amp;A bot.&quot;}, {&quot;role&quot;: &quot;user&quot;, &quot;content&quot;: &quot;{{input}}&quot;}]}]</p>
     */
    @NameInMap("experiments")
    public java.util.List<ExperimentConfig> experiments;

    /**
     * <p>Optional.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;question&quot;: &quot;How do I request a refund?&quot;}</p>
     */
    @NameInMap("input")
    public java.util.Map<String, ?> input;

    /**
     * <p>The name of the associated data processing pipeline. This parameter is optional. After you associate a pipeline, when the experiment execution under this plan is completed and the experiment results are written to the Logstore, the system filters the data by the traceId of the current experiment trace and calls PreviewPipeline to write the results processed by the pipeline.</p>
     */
    @NameInMap("pipelineName")
    public String pipelineName;

    /**
     * <p>The name of the experiment plan. The name must be unique within the same account in an AgentSpace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rca_benchmark_eval_experiment</p>
     */
    @NameInMap("planName")
    public String planName;

    /**
     * <p>The custom query SQL clause in partial dataset mode. You can use this parameter when selectedItemIds is empty.</p>
     * 
     * <strong>example:</strong>
     * <p>status=\&quot;OK\&quot;</p>
     */
    @NameInMap("querySql")
    public String querySql;

    /**
     * <p>The list of selected data item IDs in partial dataset mode. This parameter must be used together with the datasetId parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;019ef4d5-a0f0-7114-832d-5542d771cd8c&quot;, &quot;019f1729-be9b-7769-a006-8e98023ad7ad&quot;]</p>
     */
    @NameInMap("selectedItemIds")
    public java.util.List<String> selectedItemIds;

    public static CreateExperimentPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateExperimentPlanRequest self = new CreateExperimentPlanRequest();
        return TeaModel.build(map, self);
    }

    public CreateExperimentPlanRequest setDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public String getDatasetId() {
        return this.datasetId;
    }

    public CreateExperimentPlanRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateExperimentPlanRequest setEvaluators(java.util.List<Evaluator> evaluators) {
        this.evaluators = evaluators;
        return this;
    }
    public java.util.List<Evaluator> getEvaluators() {
        return this.evaluators;
    }

    public CreateExperimentPlanRequest setExperimentType(String experimentType) {
        this.experimentType = experimentType;
        return this;
    }
    public String getExperimentType() {
        return this.experimentType;
    }

    public CreateExperimentPlanRequest setExperiments(java.util.List<ExperimentConfig> experiments) {
        this.experiments = experiments;
        return this;
    }
    public java.util.List<ExperimentConfig> getExperiments() {
        return this.experiments;
    }

    public CreateExperimentPlanRequest setInput(java.util.Map<String, ?> input) {
        this.input = input;
        return this;
    }
    public java.util.Map<String, ?> getInput() {
        return this.input;
    }

    public CreateExperimentPlanRequest setPipelineName(String pipelineName) {
        this.pipelineName = pipelineName;
        return this;
    }
    public String getPipelineName() {
        return this.pipelineName;
    }

    public CreateExperimentPlanRequest setPlanName(String planName) {
        this.planName = planName;
        return this;
    }
    public String getPlanName() {
        return this.planName;
    }

    public CreateExperimentPlanRequest setQuerySql(String querySql) {
        this.querySql = querySql;
        return this;
    }
    public String getQuerySql() {
        return this.querySql;
    }

    public CreateExperimentPlanRequest setSelectedItemIds(java.util.List<String> selectedItemIds) {
        this.selectedItemIds = selectedItemIds;
        return this;
    }
    public java.util.List<String> getSelectedItemIds() {
        return this.selectedItemIds;
    }

}
