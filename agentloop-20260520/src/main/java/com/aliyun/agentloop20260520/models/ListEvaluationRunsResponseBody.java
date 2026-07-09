// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class ListEvaluationRunsResponseBody extends TeaModel {
    /**
     * <p>The list of run summaries.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;runId&quot;:&quot;eval-run-4fd47f3d7e684e15b1d3d178c6a5b81a&quot;,&quot;runType&quot;:&quot;backfill&quot;,&quot;status&quot;:&quot;Running&quot;,&quot;totalCount&quot;:100}]</p>
     */
    @NameInMap("evaluationRuns")
    public java.util.List<ListEvaluationRunsResponseBodyEvaluationRuns> evaluationRuns;

    /**
     * <p>The number of entries per page used in this request.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token for the next page. An empty value indicates that no more pages exist.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJsYXN0SWQiOjEyMH0=</p>
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
     * <p>The total number of runs that match the filter conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("totalCount")
    public Long totalCount;

    public static ListEvaluationRunsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEvaluationRunsResponseBody self = new ListEvaluationRunsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEvaluationRunsResponseBody setEvaluationRuns(java.util.List<ListEvaluationRunsResponseBodyEvaluationRuns> evaluationRuns) {
        this.evaluationRuns = evaluationRuns;
        return this;
    }
    public java.util.List<ListEvaluationRunsResponseBodyEvaluationRuns> getEvaluationRuns() {
        return this.evaluationRuns;
    }

    public ListEvaluationRunsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListEvaluationRunsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListEvaluationRunsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEvaluationRunsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListEvaluationRunsResponseBodyEvaluationRuns extends TeaModel {
        /**
         * <p>The creation time, in seconds-level UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1782816000</p>
         */
        @NameInMap("createdAt")
        public Long createdAt;

        /**
         * <p>The end time of the data window for this run, in seconds-level UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1782902400</p>
         */
        @NameInMap("dataEndTime")
        public Long dataEndTime;

        /**
         * <p>The start time of the data window for this run, in seconds-level UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1782816000</p>
         */
        @NameInMap("dataStartTime")
        public Long dataStartTime;

        /**
         * <p>The number of failed entries.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("failedCount")
        public Integer failedCount;

        /**
         * <p>The run ID.</p>
         * 
         * <strong>example:</strong>
         * <p>eval-run-4fd47f3d7e684e15b1d3d178c6a5b81a</p>
         */
        @NameInMap("runId")
        public String runId;

        /**
         * <p>The run name.</p>
         * 
         * <strong>example:</strong>
         * <p>trace_task_completion_eval-backfill</p>
         */
        @NameInMap("runName")
        public String runName;

        /**
         * <p>The run type.</p>
         * 
         * <strong>example:</strong>
         * <p>backfill</p>
         */
        @NameInMap("runType")
        public String runType;

        /**
         * <p>The run status.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The number of successful entries.</p>
         * 
         * <strong>example:</strong>
         * <p>96</p>
         */
        @NameInMap("successCount")
        public Integer successCount;

        /**
         * <p>The evaluation task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>eval-task-8b36f2e2b1f94f9c91ce7a4b0f6d9c25</p>
         */
        @NameInMap("taskId")
        public String taskId;

        /**
         * <p>The total number of evaluation entries.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("totalCount")
        public Integer totalCount;

        /**
         * <p>The update time, in seconds-level UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1782816600</p>
         */
        @NameInMap("updatedAt")
        public Long updatedAt;

        public static ListEvaluationRunsResponseBodyEvaluationRuns build(java.util.Map<String, ?> map) throws Exception {
            ListEvaluationRunsResponseBodyEvaluationRuns self = new ListEvaluationRunsResponseBodyEvaluationRuns();
            return TeaModel.build(map, self);
        }

        public ListEvaluationRunsResponseBodyEvaluationRuns setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public ListEvaluationRunsResponseBodyEvaluationRuns setDataEndTime(Long dataEndTime) {
            this.dataEndTime = dataEndTime;
            return this;
        }
        public Long getDataEndTime() {
            return this.dataEndTime;
        }

        public ListEvaluationRunsResponseBodyEvaluationRuns setDataStartTime(Long dataStartTime) {
            this.dataStartTime = dataStartTime;
            return this;
        }
        public Long getDataStartTime() {
            return this.dataStartTime;
        }

        public ListEvaluationRunsResponseBodyEvaluationRuns setFailedCount(Integer failedCount) {
            this.failedCount = failedCount;
            return this;
        }
        public Integer getFailedCount() {
            return this.failedCount;
        }

        public ListEvaluationRunsResponseBodyEvaluationRuns setRunId(String runId) {
            this.runId = runId;
            return this;
        }
        public String getRunId() {
            return this.runId;
        }

        public ListEvaluationRunsResponseBodyEvaluationRuns setRunName(String runName) {
            this.runName = runName;
            return this;
        }
        public String getRunName() {
            return this.runName;
        }

        public ListEvaluationRunsResponseBodyEvaluationRuns setRunType(String runType) {
            this.runType = runType;
            return this;
        }
        public String getRunType() {
            return this.runType;
        }

        public ListEvaluationRunsResponseBodyEvaluationRuns setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListEvaluationRunsResponseBodyEvaluationRuns setSuccessCount(Integer successCount) {
            this.successCount = successCount;
            return this;
        }
        public Integer getSuccessCount() {
            return this.successCount;
        }

        public ListEvaluationRunsResponseBodyEvaluationRuns setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListEvaluationRunsResponseBodyEvaluationRuns setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListEvaluationRunsResponseBodyEvaluationRuns setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

    }

}
