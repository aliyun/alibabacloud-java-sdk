// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeScheduledTasksResponseBody extends TeaModel {
    /**
     * <p>The status code of the operation.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The maximum number of entries to return in this request.</p>
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
     * <p>The pagination token that indicates the position from which to start reading. Leave this parameter empty to read from the beginning.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6kU+SQXzm0H9mu/FiSc****</p>
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
     * <p>The list of scheduled tasks.</p>
     */
    @NameInMap("Tasks")
    public java.util.List<DescribeScheduledTasksResponseBodyTasks> tasks;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeScheduledTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScheduledTasksResponseBody self = new DescribeScheduledTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScheduledTasksResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeScheduledTasksResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeScheduledTasksResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeScheduledTasksResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeScheduledTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScheduledTasksResponseBody setTasks(java.util.List<DescribeScheduledTasksResponseBodyTasks> tasks) {
        this.tasks = tasks;
        return this;
    }
    public java.util.List<DescribeScheduledTasksResponseBodyTasks> getTasks() {
        return this.tasks;
    }

    public DescribeScheduledTasksResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeScheduledTasksResponseBodyTasksRunConfig extends TeaModel {
        /**
         * <p>The extra parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;batchSize&quot;:&quot;1000&quot;}</p>
         */
        @NameInMap("ExtraParams")
        public String extraParams;

        /**
         * <p>The maximum number of steps.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MaxSteps")
        public Integer maxSteps;

        /**
         * <p>The timeout period, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        @NameInMap("TimeoutSeconds")
        public Integer timeoutSeconds;

        public static DescribeScheduledTasksResponseBodyTasksRunConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeScheduledTasksResponseBodyTasksRunConfig self = new DescribeScheduledTasksResponseBodyTasksRunConfig();
            return TeaModel.build(map, self);
        }

        public DescribeScheduledTasksResponseBodyTasksRunConfig setExtraParams(String extraParams) {
            this.extraParams = extraParams;
            return this;
        }
        public String getExtraParams() {
            return this.extraParams;
        }

        public DescribeScheduledTasksResponseBodyTasksRunConfig setMaxSteps(Integer maxSteps) {
            this.maxSteps = maxSteps;
            return this;
        }
        public Integer getMaxSteps() {
            return this.maxSteps;
        }

        public DescribeScheduledTasksResponseBodyTasksRunConfig setTimeoutSeconds(Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }
        public Integer getTimeoutSeconds() {
            return this.timeoutSeconds;
        }

    }

    public static class DescribeScheduledTasksResponseBodyTasks extends TeaModel {
        /**
         * <p>The cron expression.</p>
         * 
         * <strong>example:</strong>
         * <p>0 0 * * *</p>
         */
        @NameInMap("CronExpression")
        public String cronExpression;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-01T00:00:00</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-06-12T10:00:00</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The list of associated instance IDs.</p>
         */
        @NameInMap("InstanceIds")
        public java.util.List<String> instanceIds;

        /**
         * <p>The last execution time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-06-12T00:00:00</p>
         */
        @NameInMap("LastExecutionAt")
        public String lastExecutionAt;

        /**
         * <p>The next execution time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-06-13T00:00:00</p>
         */
        @NameInMap("NextExecutionAt")
        public String nextExecutionAt;

        /**
         * <p>The run configuration.</p>
         */
        @NameInMap("RunConfig")
        public DescribeScheduledTasksResponseBodyTasksRunConfig runConfig;

        /**
         * <p>The scheduled task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sch-260705-agb*****</p>
         */
        @NameInMap("ScheduledId")
        public String scheduledId;

        /**
         * <p>The status.</p>
         * 
         * <strong>example:</strong>
         * <p>ACTIVE</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The task configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>tsk-260615-*****</p>
         */
        @NameInMap("TaskConfigId")
        public String taskConfigId;

        /**
         * <p>The task name.</p>
         * 
         * <strong>example:</strong>
         * <p>Daily data synchronization task.</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        /**
         * <p>The total number of executions.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalExecutions")
        public Long totalExecutions;

        /**
         * <p>The total number of failures.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("TotalFailures")
        public Long totalFailures;

        /**
         * <p>The user prompt or task description.</p>
         * 
         * <strong>example:</strong>
         * <p>Execute daily data synchronization task.</p>
         */
        @NameInMap("UserPrompt")
        public String userPrompt;

        /**
         * <p>The CAS version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Version")
        public Integer version;

        public static DescribeScheduledTasksResponseBodyTasks build(java.util.Map<String, ?> map) throws Exception {
            DescribeScheduledTasksResponseBodyTasks self = new DescribeScheduledTasksResponseBodyTasks();
            return TeaModel.build(map, self);
        }

        public DescribeScheduledTasksResponseBodyTasks setCronExpression(String cronExpression) {
            this.cronExpression = cronExpression;
            return this;
        }
        public String getCronExpression() {
            return this.cronExpression;
        }

        public DescribeScheduledTasksResponseBodyTasks setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeScheduledTasksResponseBodyTasks setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeScheduledTasksResponseBodyTasks setInstanceIds(java.util.List<String> instanceIds) {
            this.instanceIds = instanceIds;
            return this;
        }
        public java.util.List<String> getInstanceIds() {
            return this.instanceIds;
        }

        public DescribeScheduledTasksResponseBodyTasks setLastExecutionAt(String lastExecutionAt) {
            this.lastExecutionAt = lastExecutionAt;
            return this;
        }
        public String getLastExecutionAt() {
            return this.lastExecutionAt;
        }

        public DescribeScheduledTasksResponseBodyTasks setNextExecutionAt(String nextExecutionAt) {
            this.nextExecutionAt = nextExecutionAt;
            return this;
        }
        public String getNextExecutionAt() {
            return this.nextExecutionAt;
        }

        public DescribeScheduledTasksResponseBodyTasks setRunConfig(DescribeScheduledTasksResponseBodyTasksRunConfig runConfig) {
            this.runConfig = runConfig;
            return this;
        }
        public DescribeScheduledTasksResponseBodyTasksRunConfig getRunConfig() {
            return this.runConfig;
        }

        public DescribeScheduledTasksResponseBodyTasks setScheduledId(String scheduledId) {
            this.scheduledId = scheduledId;
            return this;
        }
        public String getScheduledId() {
            return this.scheduledId;
        }

        public DescribeScheduledTasksResponseBodyTasks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeScheduledTasksResponseBodyTasks setTaskConfigId(String taskConfigId) {
            this.taskConfigId = taskConfigId;
            return this;
        }
        public String getTaskConfigId() {
            return this.taskConfigId;
        }

        public DescribeScheduledTasksResponseBodyTasks setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public DescribeScheduledTasksResponseBodyTasks setTotalExecutions(Long totalExecutions) {
            this.totalExecutions = totalExecutions;
            return this;
        }
        public Long getTotalExecutions() {
            return this.totalExecutions;
        }

        public DescribeScheduledTasksResponseBodyTasks setTotalFailures(Long totalFailures) {
            this.totalFailures = totalFailures;
            return this;
        }
        public Long getTotalFailures() {
            return this.totalFailures;
        }

        public DescribeScheduledTasksResponseBodyTasks setUserPrompt(String userPrompt) {
            this.userPrompt = userPrompt;
            return this;
        }
        public String getUserPrompt() {
            return this.userPrompt;
        }

        public DescribeScheduledTasksResponseBodyTasks setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

    }

}
