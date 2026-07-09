// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class CreateEvaluationTaskRequest extends TeaModel {
    /**
     * <p>The task source. If this parameter is not specified, the backend uses <code>default</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("channel")
    public String channel;

    /**
     * <p>The data source and execution configuration. When <code>dataType</code> is set to <code>trace</code>, the backend automatically populates the SLS Project and sets <code>storeName</code> to <code>logstore-tracing</code>. For trace-level evaluation, set <code>dataScope</code> to <code>trace</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;dataScope&quot;:&quot;trace&quot;}</p>
     */
    @NameInMap("config")
    public java.util.Map<String, String> config;

    /**
     * <p>The filter conditions for evaluation data. This parameter supports a JSON object or a JSON string. Common fields include <code>query</code>, <code>provided</code>, <code>maxRecords</code>, and <code>samplingRate</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;query&quot;:&quot;serviceName=\&quot;checkout-service\&quot;&quot;,&quot;maxRecords&quot;:10,&quot;samplingRate&quot;:100}</p>
     */
    @NameInMap("dataFilter")
    public String dataFilter;

    /**
     * <p>The data source type of the evaluation object. Set this parameter to <code>trace</code> for trace-based evaluation.</p>
     * 
     * <strong>example:</strong>
     * <p>trace</p>
     */
    @NameInMap("dataType")
    public String dataType;

    /**
     * <p>The description of the evaluation task.</p>
     * 
     * <strong>example:</strong>
     * <p>评估线上 Agent 链路任务完成度</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The list of evaluator configurations. This parameter cannot be empty. Within the same task, <code>evaluatorRef</code> takes precedence as the unique identifier. Otherwise, <code>name</code> is used.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;evaluatorRef&quot;:&quot;Builtin.agent_task_completion&quot;,&quot;resultName&quot;:&quot;agent_task_completion&quot;,&quot;resultType&quot;:&quot;score&quot;,&quot;variableMapping&quot;:{&quot;input&quot;:&quot;trace.input&quot;,&quot;output&quot;:&quot;trace.output&quot;,&quot;agent_trajectory&quot;:&quot;trace.agent_trajectory&quot;}}]</p>
     */
    @NameInMap("evaluators")
    public java.util.List<Evaluator> evaluators;

    /**
     * <p>The task execution strategy. This parameter supports a JSON object or a JSON string. Set this parameter to <code>backfill</code> for historical data backfill or <code>continuous</code> for continuous evaluation of new data.</p>
     */
    @NameInMap("runStrategies")
    public RunStrategies runStrategies;

    /**
     * <p>The key-value pairs of task tags. You do not need to specify this parameter by default. Specify this parameter only when you want to associate or filter tasks by business tags.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;env&quot;:&quot;prod&quot;,&quot;serviceId&quot;:&quot;checkout-service&quot;,&quot;planId&quot;:&quot;plan-20260703&quot;}</p>
     */
    @NameInMap("tags")
    public java.util.Map<String, String> tags;

    /**
     * <p>The evaluation task mode. Set this parameter to <code>batch</code> to create a persistent evaluation task.</p>
     * 
     * <strong>example:</strong>
     * <p>batch</p>
     */
    @NameInMap("taskMode")
    public String taskMode;

    /**
     * <p>The task name. The name must be unique among non-deleted tasks within the same user and AgentSpace. The name can be up to 256 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>trace_task_completion_eval</p>
     */
    @NameInMap("taskName")
    public String taskName;

    /**
     * <p>The idempotency token. This query parameter is declared in CloudSpec, but the backend does not currently perform idempotency comparison.</p>
     * 
     * <strong>example:</strong>
     * <p>a1b2c3d4-1234-5678-90ab-cdef12345678</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static CreateEvaluationTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEvaluationTaskRequest self = new CreateEvaluationTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateEvaluationTaskRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public CreateEvaluationTaskRequest setConfig(java.util.Map<String, String> config) {
        this.config = config;
        return this;
    }
    public java.util.Map<String, String> getConfig() {
        return this.config;
    }

    public CreateEvaluationTaskRequest setDataFilter(String dataFilter) {
        this.dataFilter = dataFilter;
        return this;
    }
    public String getDataFilter() {
        return this.dataFilter;
    }

    public CreateEvaluationTaskRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public CreateEvaluationTaskRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateEvaluationTaskRequest setEvaluators(java.util.List<Evaluator> evaluators) {
        this.evaluators = evaluators;
        return this;
    }
    public java.util.List<Evaluator> getEvaluators() {
        return this.evaluators;
    }

    public CreateEvaluationTaskRequest setRunStrategies(RunStrategies runStrategies) {
        this.runStrategies = runStrategies;
        return this;
    }
    public RunStrategies getRunStrategies() {
        return this.runStrategies;
    }

    public CreateEvaluationTaskRequest setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.Map<String, String> getTags() {
        return this.tags;
    }

    public CreateEvaluationTaskRequest setTaskMode(String taskMode) {
        this.taskMode = taskMode;
        return this;
    }
    public String getTaskMode() {
        return this.taskMode;
    }

    public CreateEvaluationTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public CreateEvaluationTaskRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
