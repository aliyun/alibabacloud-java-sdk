// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class ListEvaluationTasksRequest extends TeaModel {
    /**
     * <p>The AgentSpace name.</p>
     * 
     * <strong>example:</strong>
     * <p>prod-agentspace</p>
     */
    @NameInMap("agentSpace")
    public String agentSpace;

    /**
     * <p>The filter condition for the task source. If this parameter is not specified, tasks from the default source are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("channel")
    public String channel;

    /**
     * <p>The data source type of the evaluation object. Set this parameter to <code>trace</code> for trace-based evaluation.</p>
     * 
     * <strong>example:</strong>
     * <p>trace</p>
     */
    @NameInMap("dataType")
    public String dataType;

    /**
     * <p>The number of entries per page. Default value: 20. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token for the next page, obtained from the previous response.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJsYXN0SWQiOjEyMywib2Zmc2V0IjoyMH0=</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The filter condition for the evaluation task status.</p>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The evaluation task mode. If this parameter is not specified, the default value is <code>batch</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>batch</p>
     */
    @NameInMap("taskMode")
    public String taskMode;

    /**
     * <p>The fuzzy match condition for the task name.</p>
     * 
     * <strong>example:</strong>
     * <p>trace_task_completion_eval</p>
     */
    @NameInMap("taskName")
    public String taskName;

    public static ListEvaluationTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEvaluationTasksRequest self = new ListEvaluationTasksRequest();
        return TeaModel.build(map, self);
    }

    public ListEvaluationTasksRequest setAgentSpace(String agentSpace) {
        this.agentSpace = agentSpace;
        return this;
    }
    public String getAgentSpace() {
        return this.agentSpace;
    }

    public ListEvaluationTasksRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public ListEvaluationTasksRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public ListEvaluationTasksRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListEvaluationTasksRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListEvaluationTasksRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListEvaluationTasksRequest setTaskMode(String taskMode) {
        this.taskMode = taskMode;
        return this;
    }
    public String getTaskMode() {
        return this.taskMode;
    }

    public ListEvaluationTasksRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}
