// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class ListEvaluationTasksResponseBody extends TeaModel {
    /**
     * <p>The list of evaluation task summaries.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;taskId&quot;:&quot;eval-task-8b36f2e2b1f94f9c91ce7a4b0f6d9c25&quot;,&quot;taskName&quot;:&quot;trace_task_completion_eval&quot;,&quot;taskMode&quot;:&quot;batch&quot;,&quot;dataType&quot;:&quot;trace&quot;,&quot;status&quot;:&quot;Running&quot;}]</p>
     */
    @NameInMap("evaluationTasks")
    public java.util.List<ListEvaluationTasksResponseBodyEvaluationTasks> evaluationTasks;

    /**
     * <p>The number of entries per page used in this request.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token for the next page. An empty value indicates that no more pages are available.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJsYXN0SWQiOjEwMSwib2Zmc2V0IjoyMH0=</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3FE4CD1E-FF41-56BE-B590-7A021D9C1524</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The total number of records. The total count is returned only on the first page. This value may be empty on subsequent pages.</p>
     * 
     * <strong>example:</strong>
     * <p>126</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListEvaluationTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEvaluationTasksResponseBody self = new ListEvaluationTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEvaluationTasksResponseBody setEvaluationTasks(java.util.List<ListEvaluationTasksResponseBodyEvaluationTasks> evaluationTasks) {
        this.evaluationTasks = evaluationTasks;
        return this;
    }
    public java.util.List<ListEvaluationTasksResponseBodyEvaluationTasks> getEvaluationTasks() {
        return this.evaluationTasks;
    }

    public ListEvaluationTasksResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListEvaluationTasksResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListEvaluationTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEvaluationTasksResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListEvaluationTasksResponseBodyEvaluationTasks extends TeaModel {
        /**
         * <p>The data source and execution configuration summary.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;storeName&quot;:&quot;logstore-tracing&quot;,&quot;dataScope&quot;:&quot;trace&quot;}</p>
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
         * <p>The evaluator configuration summary, in JSON string format.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;evaluatorRef&quot;:&quot;Builtin.agent_task_completion&quot;}]</p>
         */
        @NameInMap("evaluators")
        public String evaluators;

        /**
         * <p>The structured run strategy configuration, including the parsed backfill strategy and continuous evaluation strategy.</p>
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
         * <p>The key-value pairs of task tags. This parameter is empty if no tags are set.</p>
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

        public static ListEvaluationTasksResponseBodyEvaluationTasks build(java.util.Map<String, ?> map) throws Exception {
            ListEvaluationTasksResponseBodyEvaluationTasks self = new ListEvaluationTasksResponseBodyEvaluationTasks();
            return TeaModel.build(map, self);
        }

        public ListEvaluationTasksResponseBodyEvaluationTasks setConfig(java.util.Map<String, String> config) {
            this.config = config;
            return this;
        }
        public java.util.Map<String, String> getConfig() {
            return this.config;
        }

        public ListEvaluationTasksResponseBodyEvaluationTasks setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public ListEvaluationTasksResponseBodyEvaluationTasks setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public ListEvaluationTasksResponseBodyEvaluationTasks setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListEvaluationTasksResponseBodyEvaluationTasks setEvaluators(String evaluators) {
            this.evaluators = evaluators;
            return this;
        }
        public String getEvaluators() {
            return this.evaluators;
        }

        public ListEvaluationTasksResponseBodyEvaluationTasks setRunStrategyConfig(RunStrategies runStrategyConfig) {
            this.runStrategyConfig = runStrategyConfig;
            return this;
        }
        public RunStrategies getRunStrategyConfig() {
            return this.runStrategyConfig;
        }

        public ListEvaluationTasksResponseBodyEvaluationTasks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListEvaluationTasksResponseBodyEvaluationTasks setTags(java.util.Map<String, String> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.Map<String, String> getTags() {
            return this.tags;
        }

        public ListEvaluationTasksResponseBodyEvaluationTasks setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListEvaluationTasksResponseBodyEvaluationTasks setTaskMode(String taskMode) {
            this.taskMode = taskMode;
            return this;
        }
        public String getTaskMode() {
            return this.taskMode;
        }

        public ListEvaluationTasksResponseBodyEvaluationTasks setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public ListEvaluationTasksResponseBodyEvaluationTasks setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

    }

}
