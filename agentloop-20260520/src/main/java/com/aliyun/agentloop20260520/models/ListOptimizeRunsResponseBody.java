// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class ListOptimizeRunsResponseBody extends TeaModel {
    /**
     * <p>The maximum number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next page.</p>
     * 
     * <strong>example:</strong>
     * <p>MTIzNDU2Nzg5MA==</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The list of run instances.</p>
     */
    @NameInMap("optimizeRuns")
    public java.util.List<ListOptimizeRunsResponseBodyOptimizeRuns> optimizeRuns;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9ACFB10A-1B2C-3D4E-5F6G-7H8I9J0K1L2M</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListOptimizeRunsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOptimizeRunsResponseBody self = new ListOptimizeRunsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOptimizeRunsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListOptimizeRunsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListOptimizeRunsResponseBody setOptimizeRuns(java.util.List<ListOptimizeRunsResponseBodyOptimizeRuns> optimizeRuns) {
        this.optimizeRuns = optimizeRuns;
        return this;
    }
    public java.util.List<ListOptimizeRunsResponseBodyOptimizeRuns> getOptimizeRuns() {
        return this.optimizeRuns;
    }

    public ListOptimizeRunsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOptimizeRunsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListOptimizeRunsResponseBodyOptimizeRuns extends TeaModel {
        /**
         * <p>The number of executed attempts.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("attemptCount")
        public Integer attemptCount;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-12T10:00:00Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The current execution stage.</p>
         * 
         * <strong>example:</strong>
         * <p>attribution</p>
         */
        @NameInMap("currentStage")
        public String currentStage;

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>InternalError</p>
         */
        @NameInMap("errorCode")
        public String errorCode;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>The optimize run failed.</p>
         */
        @NameInMap("errorMessage")
        public String errorMessage;

        /**
         * <p>The execution summary and finite-state information. To obtain complete result references, frozen outputs, and publish receipts, call GetOptimizeRun.</p>
         */
        @NameInMap("extra")
        public java.util.Map<String, ?> extra;

        /**
         * <p>The completion time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-12T10:01:00Z</p>
         */
        @NameInMap("finishTime")
        public String finishTime;

        /**
         * <p>The maximum number of attempts.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("maxAttempts")
        public Integer maxAttempts;

        /**
         * <p>The ID of the run instance.</p>
         * 
         * <strong>example:</strong>
         * <p>or-20260812-0001</p>
         */
        @NameInMap("optimizeRunId")
        public String optimizeRunId;

        /**
         * <p>The name of the optimization task.</p>
         * 
         * <strong>example:</strong>
         * <p>efficiency-analysis</p>
         */
        @NameInMap("optimizeTaskName")
        public String optimizeTaskName;

        /**
         * <p>The current execution progress. The fields are defined by the task type.</p>
         */
        @NameInMap("progress")
        public java.util.Map<String, ?> progress;

        /**
         * <p>The initial start time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-12T10:00:01Z</p>
         */
        @NameInMap("startTime")
        public String startTime;

        /**
         * <p>The execution status.</p>
         * 
         * <strong>example:</strong>
         * <p>Succeeded</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The number of analysis trajectories.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("trajectoryCount")
        public Long trajectoryCount;

        /**
         * <p>The trigger type.</p>
         * 
         * <strong>example:</strong>
         * <p>Scheduled</p>
         */
        @NameInMap("triggerType")
        public String triggerType;

        /**
         * <p>The snapshot of the task type.</p>
         * 
         * <strong>example:</strong>
         * <p>EfficiencyAnalysis</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The end time of the analysis window in UNIX seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1786432690000</p>
         */
        @NameInMap("windowEndTime")
        public Long windowEndTime;

        /**
         * <p>The start time of the analysis window in UNIX seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1786432688000</p>
         */
        @NameInMap("windowStartTime")
        public Long windowStartTime;

        public static ListOptimizeRunsResponseBodyOptimizeRuns build(java.util.Map<String, ?> map) throws Exception {
            ListOptimizeRunsResponseBodyOptimizeRuns self = new ListOptimizeRunsResponseBodyOptimizeRuns();
            return TeaModel.build(map, self);
        }

        public ListOptimizeRunsResponseBodyOptimizeRuns setAttemptCount(Integer attemptCount) {
            this.attemptCount = attemptCount;
            return this;
        }
        public Integer getAttemptCount() {
            return this.attemptCount;
        }

        public ListOptimizeRunsResponseBodyOptimizeRuns setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListOptimizeRunsResponseBodyOptimizeRuns setCurrentStage(String currentStage) {
            this.currentStage = currentStage;
            return this;
        }
        public String getCurrentStage() {
            return this.currentStage;
        }

        public ListOptimizeRunsResponseBodyOptimizeRuns setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ListOptimizeRunsResponseBodyOptimizeRuns setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public ListOptimizeRunsResponseBodyOptimizeRuns setExtra(java.util.Map<String, ?> extra) {
            this.extra = extra;
            return this;
        }
        public java.util.Map<String, ?> getExtra() {
            return this.extra;
        }

        public ListOptimizeRunsResponseBodyOptimizeRuns setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public ListOptimizeRunsResponseBodyOptimizeRuns setMaxAttempts(Integer maxAttempts) {
            this.maxAttempts = maxAttempts;
            return this;
        }
        public Integer getMaxAttempts() {
            return this.maxAttempts;
        }

        public ListOptimizeRunsResponseBodyOptimizeRuns setOptimizeRunId(String optimizeRunId) {
            this.optimizeRunId = optimizeRunId;
            return this;
        }
        public String getOptimizeRunId() {
            return this.optimizeRunId;
        }

        public ListOptimizeRunsResponseBodyOptimizeRuns setOptimizeTaskName(String optimizeTaskName) {
            this.optimizeTaskName = optimizeTaskName;
            return this;
        }
        public String getOptimizeTaskName() {
            return this.optimizeTaskName;
        }

        public ListOptimizeRunsResponseBodyOptimizeRuns setProgress(java.util.Map<String, ?> progress) {
            this.progress = progress;
            return this;
        }
        public java.util.Map<String, ?> getProgress() {
            return this.progress;
        }

        public ListOptimizeRunsResponseBodyOptimizeRuns setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListOptimizeRunsResponseBodyOptimizeRuns setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListOptimizeRunsResponseBodyOptimizeRuns setTrajectoryCount(Long trajectoryCount) {
            this.trajectoryCount = trajectoryCount;
            return this;
        }
        public Long getTrajectoryCount() {
            return this.trajectoryCount;
        }

        public ListOptimizeRunsResponseBodyOptimizeRuns setTriggerType(String triggerType) {
            this.triggerType = triggerType;
            return this;
        }
        public String getTriggerType() {
            return this.triggerType;
        }

        public ListOptimizeRunsResponseBodyOptimizeRuns setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListOptimizeRunsResponseBodyOptimizeRuns setWindowEndTime(Long windowEndTime) {
            this.windowEndTime = windowEndTime;
            return this;
        }
        public Long getWindowEndTime() {
            return this.windowEndTime;
        }

        public ListOptimizeRunsResponseBodyOptimizeRuns setWindowStartTime(Long windowStartTime) {
            this.windowStartTime = windowStartTime;
            return this;
        }
        public Long getWindowStartTime() {
            return this.windowStartTime;
        }

    }

}
