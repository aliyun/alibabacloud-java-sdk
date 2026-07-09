// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class GetEvaluationRunResponseBody extends TeaModel {
    /**
     * <p>The creation time, in seconds-level UNIX timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1782816000</p>
     */
    @NameInMap("createdAt")
    public Long createdAt;

    /**
     * <p>The end time of the data window for the run, in seconds-level UNIX timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1782902400</p>
     */
    @NameInMap("dataEndTime")
    public Long dataEndTime;

    /**
     * <p>The start time of the data window for the run, in seconds-level UNIX timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1782816000</p>
     */
    @NameInMap("dataStartTime")
    public Long dataStartTime;

    /**
     * <p>The list of progress details by evaluator.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;evaluatorName&quot;:&quot;Builtin.agent_task_completion&quot;,&quot;totalCount&quot;:100,&quot;successCount&quot;:96,&quot;failedCount&quot;:4}]</p>
     */
    @NameInMap("evaluatorProgress")
    public java.util.List<GetEvaluationRunResponseBodyEvaluatorProgress> evaluatorProgress;

    /**
     * <p>The evaluator configuration snapshot at the time the run was created, in JSON string format.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;evaluatorRef&quot;:&quot;Builtin.agent_task_completion&quot;}]</p>
     */
    @NameInMap("evaluators")
    public String evaluators;

    /**
     * <p>The number of failed entries.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("failedCount")
    public Integer failedCount;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3FE4CD1E-FF41-56BE-B590-7A021D9C1524</p>
     */
    @NameInMap("requestId")
    public String requestId;

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

    public static GetEvaluationRunResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEvaluationRunResponseBody self = new GetEvaluationRunResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEvaluationRunResponseBody setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public Long getCreatedAt() {
        return this.createdAt;
    }

    public GetEvaluationRunResponseBody setDataEndTime(Long dataEndTime) {
        this.dataEndTime = dataEndTime;
        return this;
    }
    public Long getDataEndTime() {
        return this.dataEndTime;
    }

    public GetEvaluationRunResponseBody setDataStartTime(Long dataStartTime) {
        this.dataStartTime = dataStartTime;
        return this;
    }
    public Long getDataStartTime() {
        return this.dataStartTime;
    }

    public GetEvaluationRunResponseBody setEvaluatorProgress(java.util.List<GetEvaluationRunResponseBodyEvaluatorProgress> evaluatorProgress) {
        this.evaluatorProgress = evaluatorProgress;
        return this;
    }
    public java.util.List<GetEvaluationRunResponseBodyEvaluatorProgress> getEvaluatorProgress() {
        return this.evaluatorProgress;
    }

    public GetEvaluationRunResponseBody setEvaluators(String evaluators) {
        this.evaluators = evaluators;
        return this;
    }
    public String getEvaluators() {
        return this.evaluators;
    }

    public GetEvaluationRunResponseBody setFailedCount(Integer failedCount) {
        this.failedCount = failedCount;
        return this;
    }
    public Integer getFailedCount() {
        return this.failedCount;
    }

    public GetEvaluationRunResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetEvaluationRunResponseBody setRunId(String runId) {
        this.runId = runId;
        return this;
    }
    public String getRunId() {
        return this.runId;
    }

    public GetEvaluationRunResponseBody setRunName(String runName) {
        this.runName = runName;
        return this;
    }
    public String getRunName() {
        return this.runName;
    }

    public GetEvaluationRunResponseBody setRunType(String runType) {
        this.runType = runType;
        return this;
    }
    public String getRunType() {
        return this.runType;
    }

    public GetEvaluationRunResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetEvaluationRunResponseBody setSuccessCount(Integer successCount) {
        this.successCount = successCount;
        return this;
    }
    public Integer getSuccessCount() {
        return this.successCount;
    }

    public GetEvaluationRunResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetEvaluationRunResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public GetEvaluationRunResponseBody setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

    public static class GetEvaluationRunResponseBodyEvaluatorProgress extends TeaModel {
        /**
         * <p>The evaluator name.</p>
         * 
         * <strong>example:</strong>
         * <p>Builtin.agent_task_completion</p>
         */
        @NameInMap("evaluatorName")
        public String evaluatorName;

        /**
         * <p>The number of failed entries for this evaluator.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("failedCount")
        public Integer failedCount;

        /**
         * <p>The number of successful entries for this evaluator.</p>
         * 
         * <strong>example:</strong>
         * <p>96</p>
         */
        @NameInMap("successCount")
        public Integer successCount;

        /**
         * <p>The total number of entries for this evaluator.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("totalCount")
        public Integer totalCount;

        public static GetEvaluationRunResponseBodyEvaluatorProgress build(java.util.Map<String, ?> map) throws Exception {
            GetEvaluationRunResponseBodyEvaluatorProgress self = new GetEvaluationRunResponseBodyEvaluatorProgress();
            return TeaModel.build(map, self);
        }

        public GetEvaluationRunResponseBodyEvaluatorProgress setEvaluatorName(String evaluatorName) {
            this.evaluatorName = evaluatorName;
            return this;
        }
        public String getEvaluatorName() {
            return this.evaluatorName;
        }

        public GetEvaluationRunResponseBodyEvaluatorProgress setFailedCount(Integer failedCount) {
            this.failedCount = failedCount;
            return this;
        }
        public Integer getFailedCount() {
            return this.failedCount;
        }

        public GetEvaluationRunResponseBodyEvaluatorProgress setSuccessCount(Integer successCount) {
            this.successCount = successCount;
            return this;
        }
        public Integer getSuccessCount() {
            return this.successCount;
        }

        public GetEvaluationRunResponseBodyEvaluatorProgress setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
