// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeScheduledTaskExecutionsResponseBody extends TeaModel {
    /**
     * <p>The status code of the operation.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The list of task execution records.</p>
     */
    @NameInMap("Executions")
    public java.util.List<DescribeScheduledTaskExecutionsResponseBodyExecutions> executions;

    /**
     * <p>The maximum number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>Success.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The pagination token for the next page.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6kU****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9A51B1DF-96FF-3BCC-B08C-783161D3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeScheduledTaskExecutionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScheduledTaskExecutionsResponseBody self = new DescribeScheduledTaskExecutionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScheduledTaskExecutionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeScheduledTaskExecutionsResponseBody setExecutions(java.util.List<DescribeScheduledTaskExecutionsResponseBodyExecutions> executions) {
        this.executions = executions;
        return this;
    }
    public java.util.List<DescribeScheduledTaskExecutionsResponseBodyExecutions> getExecutions() {
        return this.executions;
    }

    public DescribeScheduledTaskExecutionsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeScheduledTaskExecutionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeScheduledTaskExecutionsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeScheduledTaskExecutionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScheduledTaskExecutionsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeScheduledTaskExecutionsResponseBodyExecutions extends TeaModel {
        /**
         * <p>The end time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-06-12T00:05:30</p>
         */
        @NameInMap("CompletedAt")
        public String completedAt;

        /**
         * <p>The configuration snapshot in JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;maxSteps&quot;:10}</p>
         */
        @NameInMap("ConfigSnapshot")
        public String configSnapshot;

        /**
         * <p>The execution duration in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>330000</p>
         */
        @NameInMap("DurationMs")
        public Long durationMs;

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>TaskTimeout</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>task timeout after 600s</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>acp-axxkuuxahbu1*****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The execution output in JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;result&quot;:&quot;ok&quot;}</p>
         */
        @NameInMap("Output")
        public String output;

        /**
         * <p>The ID of the scheduled task.</p>
         * 
         * <strong>example:</strong>
         * <p>sch-260705-agb*****</p>
         */
        @NameInMap("ScheduledId")
        public String scheduledId;

        /**
         * <p>The start time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-06-12T00:00:00</p>
         */
        @NameInMap("StartedAt")
        public String startedAt;

        /**
         * <p>The execution status.</p>
         * 
         * <strong>example:</strong>
         * <p>COMPLETED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the scheduled task execution record.</p>
         * 
         * <strong>example:</strong>
         * <p>t-260703-gby*****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static DescribeScheduledTaskExecutionsResponseBodyExecutions build(java.util.Map<String, ?> map) throws Exception {
            DescribeScheduledTaskExecutionsResponseBodyExecutions self = new DescribeScheduledTaskExecutionsResponseBodyExecutions();
            return TeaModel.build(map, self);
        }

        public DescribeScheduledTaskExecutionsResponseBodyExecutions setCompletedAt(String completedAt) {
            this.completedAt = completedAt;
            return this;
        }
        public String getCompletedAt() {
            return this.completedAt;
        }

        public DescribeScheduledTaskExecutionsResponseBodyExecutions setConfigSnapshot(String configSnapshot) {
            this.configSnapshot = configSnapshot;
            return this;
        }
        public String getConfigSnapshot() {
            return this.configSnapshot;
        }

        public DescribeScheduledTaskExecutionsResponseBodyExecutions setDurationMs(Long durationMs) {
            this.durationMs = durationMs;
            return this;
        }
        public Long getDurationMs() {
            return this.durationMs;
        }

        public DescribeScheduledTaskExecutionsResponseBodyExecutions setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeScheduledTaskExecutionsResponseBodyExecutions setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeScheduledTaskExecutionsResponseBodyExecutions setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeScheduledTaskExecutionsResponseBodyExecutions setOutput(String output) {
            this.output = output;
            return this;
        }
        public String getOutput() {
            return this.output;
        }

        public DescribeScheduledTaskExecutionsResponseBodyExecutions setScheduledId(String scheduledId) {
            this.scheduledId = scheduledId;
            return this;
        }
        public String getScheduledId() {
            return this.scheduledId;
        }

        public DescribeScheduledTaskExecutionsResponseBodyExecutions setStartedAt(String startedAt) {
            this.startedAt = startedAt;
            return this;
        }
        public String getStartedAt() {
            return this.startedAt;
        }

        public DescribeScheduledTaskExecutionsResponseBodyExecutions setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeScheduledTaskExecutionsResponseBodyExecutions setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
