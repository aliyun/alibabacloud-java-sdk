// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class UpdateEvaluationTaskRequest extends TeaModel {
    /**
     * <p>The new task configuration. Some fields that are set during creation cannot be modified.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;dataScope&quot;:&quot;trace&quot;}</p>
     */
    @NameInMap("config")
    public java.util.Map<String, String> config;

    /**
     * <p>The filter condition for evaluation data. A JSON object or JSON string is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;query&quot;:&quot;serviceName=\&quot;checkout-service\&quot; AND status=\&quot;OK\&quot;&quot;,&quot;maxRecords&quot;:10,&quot;samplingRate&quot;:50}</p>
     */
    @NameInMap("dataFilter")
    public String dataFilter;

    /**
     * <p>The description of the evaluation task.</p>
     * 
     * <strong>example:</strong>
     * <p>更新后的链路 Trace 任务完成度评估</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The new list of evaluator configurations. When specified, this list entirely replaces the existing evaluator list of the task, and the system re-validates evaluator uniqueness and variable mappings.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;evaluatorRef&quot;:&quot;Builtin.agent_task_completion&quot;,&quot;resultName&quot;:&quot;agent_task_completion&quot;,&quot;resultType&quot;:&quot;score&quot;,&quot;variableMapping&quot;:{&quot;input&quot;:&quot;trace.input&quot;,&quot;output&quot;:&quot;trace.output&quot;,&quot;agent_trajectory&quot;:&quot;trace.agent_trajectory&quot;}}]</p>
     */
    @NameInMap("evaluators")
    public java.util.List<Evaluator> evaluators;

    /**
     * <p>The new task execution strategies. A JSON object or JSON string is supported. If the task is in <code>Completed</code>, <code>Terminated</code>, or <code>Failed</code> status and the new strategy enables backfill or continuous mode, the backend resets the task to <code>Pending</code> and triggers orchestration.</p>
     */
    @NameInMap("runStrategies")
    public RunStrategies runStrategies;

    /**
     * <p>The task status. Currently the backend only allows users to explicitly set this to <code>Terminated</code>. Other statuses are managed by the system.</p>
     * 
     * <strong>example:</strong>
     * <p>Terminated</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The key-value pairs of task tags. You do not need to specify this parameter by default. Specify this parameter only when you want to associate or filter tasks by business tags.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;env&quot;:&quot;prod&quot;,&quot;serviceId&quot;:&quot;checkout-service&quot;,&quot;planId&quot;:&quot;plan-20260703&quot;}</p>
     */
    @NameInMap("tags")
    public java.util.Map<String, String> tags;

    /**
     * <p>The idempotency token. CloudSpec declares this query parameter, but the backend does not currently perform idempotency comparison.</p>
     * 
     * <strong>example:</strong>
     * <p>a1b2c3d4-1234-5678-90ab-cdef12345678</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static UpdateEvaluationTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEvaluationTaskRequest self = new UpdateEvaluationTaskRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEvaluationTaskRequest setConfig(java.util.Map<String, String> config) {
        this.config = config;
        return this;
    }
    public java.util.Map<String, String> getConfig() {
        return this.config;
    }

    public UpdateEvaluationTaskRequest setDataFilter(String dataFilter) {
        this.dataFilter = dataFilter;
        return this;
    }
    public String getDataFilter() {
        return this.dataFilter;
    }

    public UpdateEvaluationTaskRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateEvaluationTaskRequest setEvaluators(java.util.List<Evaluator> evaluators) {
        this.evaluators = evaluators;
        return this;
    }
    public java.util.List<Evaluator> getEvaluators() {
        return this.evaluators;
    }

    public UpdateEvaluationTaskRequest setRunStrategies(RunStrategies runStrategies) {
        this.runStrategies = runStrategies;
        return this;
    }
    public RunStrategies getRunStrategies() {
        return this.runStrategies;
    }

    public UpdateEvaluationTaskRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateEvaluationTaskRequest setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.Map<String, String> getTags() {
        return this.tags;
    }

    public UpdateEvaluationTaskRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
