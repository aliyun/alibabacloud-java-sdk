// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class GetEvaluationTaskResponseBody extends TeaModel {
    /**
     * <p>The AgentSpace name.</p>
     * 
     * <strong>example:</strong>
     * <p>prod-agentspace</p>
     */
    @NameInMap("agentSpace")
    public String agentSpace;

    /**
     * <p>The task source.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("channel")
    public String channel;

    /**
     * <p>The data source and execution configuration. Tasks with <code>dataType=trace</code> typically include <code>project</code>, <code>storeName</code>, and <code>dataScope</code> fields populated by the backend.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;project&quot;:&quot;agentspace-project&quot;,&quot;storeName&quot;:&quot;logstore-tracing&quot;,&quot;dataScope&quot;:&quot;trace&quot;}</p>
     */
    @NameInMap("config")
    public java.util.Map<String, String> config;

    /**
     * <p>The creation time, in seconds-level UNIX timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1782816000</p>
     */
    @NameInMap("createdAt")
    public Long createdAt;

    /**
     * <p>The filter conditions for evaluation data, returned by the backend as a JSON string.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;query&quot;:&quot;serviceName=\&quot;checkout-service\&quot;&quot;,&quot;maxRecords&quot;:10,&quot;samplingRate&quot;:100}</p>
     */
    @NameInMap("dataFilter")
    public String dataFilter;

    /**
     * <p>The data source type of the evaluation object.</p>
     * 
     * <strong>example:</strong>
     * <p>trace</p>
     */
    @NameInMap("dataType")
    public String dataType;

    /**
     * <p>The evaluation task description.</p>
     * 
     * <strong>example:</strong>
     * <p>评估线上 Agent 链路任务完成度</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The list of evaluator configurations.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;evaluatorRef&quot;:&quot;Builtin.agent_task_completion&quot;,&quot;resultName&quot;:&quot;agent_task_completion&quot;,&quot;resultType&quot;:&quot;score&quot;,&quot;variableMapping&quot;:{&quot;input&quot;:&quot;trace.input&quot;,&quot;output&quot;:&quot;trace.output&quot;,&quot;agent_trajectory&quot;:&quot;trace.agent_trajectory&quot;}}]</p>
     */
    @NameInMap("evaluators")
    public java.util.List<Evaluator> evaluators;

    /**
     * <p>The region to which the task belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3FE4CD1E-FF41-56BE-B590-7A021D9C1524</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The structured configuration of the run strategy, including the parsed backfill strategy and continuous evaluation strategy.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;backfill&quot;:{&quot;enabled&quot;:true,&quot;startTime&quot;:1782816000000,&quot;endTime&quot;:1782902400000},&quot;continuous&quot;:{&quot;enabled&quot;:true,&quot;intervalUnit&quot;:&quot;HOUR&quot;,&quot;intervalValue&quot;:1,&quot;dataDelayMinutes&quot;:5}}</p>
     */
    @NameInMap("runStrategyConfig")
    public RunStrategies runStrategyConfig;

    /**
     * <p>The evaluation task status.</p>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The key-value pairs of task tags. Empty if not set.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;serviceId&quot;:&quot;checkout-service&quot;,&quot;env&quot;:&quot;prod&quot;}</p>
     */
    @NameInMap("tags")
    public java.util.Map<String, String> tags;

    /**
     * <p>The evaluation task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>eval-task-8b36f2e2b1f94f9c91ce7a4b0f6d9c25</p>
     */
    @NameInMap("taskId")
    public String taskId;

    /**
     * <p>The evaluation task mode.</p>
     * 
     * <strong>example:</strong>
     * <p>batch</p>
     */
    @NameInMap("taskMode")
    public String taskMode;

    /**
     * <p>The task name.</p>
     * 
     * <strong>example:</strong>
     * <p>trace_task_completion_eval</p>
     */
    @NameInMap("taskName")
    public String taskName;

    /**
     * <p>The last update time, in seconds-level UNIX timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1782816600</p>
     */
    @NameInMap("updatedAt")
    public Long updatedAt;

    public static GetEvaluationTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEvaluationTaskResponseBody self = new GetEvaluationTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEvaluationTaskResponseBody setAgentSpace(String agentSpace) {
        this.agentSpace = agentSpace;
        return this;
    }
    public String getAgentSpace() {
        return this.agentSpace;
    }

    public GetEvaluationTaskResponseBody setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public GetEvaluationTaskResponseBody setConfig(java.util.Map<String, String> config) {
        this.config = config;
        return this;
    }
    public java.util.Map<String, String> getConfig() {
        return this.config;
    }

    public GetEvaluationTaskResponseBody setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public Long getCreatedAt() {
        return this.createdAt;
    }

    public GetEvaluationTaskResponseBody setDataFilter(String dataFilter) {
        this.dataFilter = dataFilter;
        return this;
    }
    public String getDataFilter() {
        return this.dataFilter;
    }

    public GetEvaluationTaskResponseBody setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public GetEvaluationTaskResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetEvaluationTaskResponseBody setEvaluators(java.util.List<Evaluator> evaluators) {
        this.evaluators = evaluators;
        return this;
    }
    public java.util.List<Evaluator> getEvaluators() {
        return this.evaluators;
    }

    public GetEvaluationTaskResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetEvaluationTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetEvaluationTaskResponseBody setRunStrategyConfig(RunStrategies runStrategyConfig) {
        this.runStrategyConfig = runStrategyConfig;
        return this;
    }
    public RunStrategies getRunStrategyConfig() {
        return this.runStrategyConfig;
    }

    public GetEvaluationTaskResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetEvaluationTaskResponseBody setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.Map<String, String> getTags() {
        return this.tags;
    }

    public GetEvaluationTaskResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetEvaluationTaskResponseBody setTaskMode(String taskMode) {
        this.taskMode = taskMode;
        return this;
    }
    public String getTaskMode() {
        return this.taskMode;
    }

    public GetEvaluationTaskResponseBody setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public GetEvaluationTaskResponseBody setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

}
