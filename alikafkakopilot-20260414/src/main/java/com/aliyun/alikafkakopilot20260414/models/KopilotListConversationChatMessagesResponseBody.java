// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafkakopilot20260414.models;

import com.aliyun.tea.*;

public class KopilotListConversationChatMessagesResponseBody extends TeaModel {
    /**
     * <p>The response code. A value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <p>The data returned when the call is successful.</p>
     */
    @NameInMap("Data")
    public KopilotListConversationChatMessagesResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F69385B9-2139-5A07-AE64-37C4B6ED308E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static KopilotListConversationChatMessagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        KopilotListConversationChatMessagesResponseBody self = new KopilotListConversationChatMessagesResponseBody();
        return TeaModel.build(map, self);
    }

    public KopilotListConversationChatMessagesResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public KopilotListConversationChatMessagesResponseBody setData(KopilotListConversationChatMessagesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public KopilotListConversationChatMessagesResponseBodyData getData() {
        return this.data;
    }

    public KopilotListConversationChatMessagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public KopilotListConversationChatMessagesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class KopilotListConversationChatMessagesResponseBodyDataMessages extends TeaModel {
        /**
         * <p>The actual content of the message.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The UNIX timestamp when the message was created, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>17575885545677</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The user satisfaction level.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Feedback")
        public String feedback;

        /**
         * <p>The role identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>assistant</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <p>The primary key ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2345</p>
         */
        @NameInMap("TurnId")
        public String turnId;

        public static KopilotListConversationChatMessagesResponseBodyDataMessages build(java.util.Map<String, ?> map) throws Exception {
            KopilotListConversationChatMessagesResponseBodyDataMessages self = new KopilotListConversationChatMessagesResponseBodyDataMessages();
            return TeaModel.build(map, self);
        }

        public KopilotListConversationChatMessagesResponseBodyDataMessages setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public KopilotListConversationChatMessagesResponseBodyDataMessages setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public KopilotListConversationChatMessagesResponseBodyDataMessages setFeedback(String feedback) {
            this.feedback = feedback;
            return this;
        }
        public String getFeedback() {
            return this.feedback;
        }

        public KopilotListConversationChatMessagesResponseBodyDataMessages setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public KopilotListConversationChatMessagesResponseBodyDataMessages setTurnId(String turnId) {
            this.turnId = turnId;
            return this;
        }
        public String getTurnId() {
            return this.turnId;
        }

    }

    public static class KopilotListConversationChatMessagesResponseBodyDataScheduledTaskInfoTasksActiveRun extends TeaModel {
        /**
         * <p>The time when the run ended, in UTC ISO 8601 format. This value is typically empty for queued or running tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-17T12:01:00Z</p>
         */
        @NameInMap("FinishedAt")
        public String finishedAt;

        /**
         * <p>The unique identifier of a single run.</p>
         * 
         * <strong>example:</strong>
         * <p>run_0123456789abcdef0123456789abcdef</p>
         */
        @NameInMap("RunId")
        public String runId;

        /**
         * <p>The status of a single run. A value of QUEUED indicates that the run is queued. A value of RUNNING indicates that the run is in progress.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("Status")
        public String status;

        public static KopilotListConversationChatMessagesResponseBodyDataScheduledTaskInfoTasksActiveRun build(java.util.Map<String, ?> map) throws Exception {
            KopilotListConversationChatMessagesResponseBodyDataScheduledTaskInfoTasksActiveRun self = new KopilotListConversationChatMessagesResponseBodyDataScheduledTaskInfoTasksActiveRun();
            return TeaModel.build(map, self);
        }

        public KopilotListConversationChatMessagesResponseBodyDataScheduledTaskInfoTasksActiveRun setFinishedAt(String finishedAt) {
            this.finishedAt = finishedAt;
            return this;
        }
        public String getFinishedAt() {
            return this.finishedAt;
        }

        public KopilotListConversationChatMessagesResponseBodyDataScheduledTaskInfoTasksActiveRun setRunId(String runId) {
            this.runId = runId;
            return this;
        }
        public String getRunId() {
            return this.runId;
        }

        public KopilotListConversationChatMessagesResponseBodyDataScheduledTaskInfoTasksActiveRun setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class KopilotListConversationChatMessagesResponseBodyDataScheduledTaskInfoTasksLastCompletedRun extends TeaModel {
        /**
         * <p>The time when the run ended, in UTC ISO 8601 format. This value is empty if the run has not ended.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-17T12:01:00Z</p>
         */
        @NameInMap("FinishedAt")
        public String finishedAt;

        /**
         * <p>The unique identifier of a single run.</p>
         * 
         * <strong>example:</strong>
         * <p>run_0123456789abcdef0123456789abcdef</p>
         */
        @NameInMap("RunId")
        public String runId;

        /**
         * <p>The status of the most recent completed run. For example, SUCCEEDED indicates success and FAILED indicates failure.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCEEDED</p>
         */
        @NameInMap("Status")
        public String status;

        public static KopilotListConversationChatMessagesResponseBodyDataScheduledTaskInfoTasksLastCompletedRun build(java.util.Map<String, ?> map) throws Exception {
            KopilotListConversationChatMessagesResponseBodyDataScheduledTaskInfoTasksLastCompletedRun self = new KopilotListConversationChatMessagesResponseBodyDataScheduledTaskInfoTasksLastCompletedRun();
            return TeaModel.build(map, self);
        }

        public KopilotListConversationChatMessagesResponseBodyDataScheduledTaskInfoTasksLastCompletedRun setFinishedAt(String finishedAt) {
            this.finishedAt = finishedAt;
            return this;
        }
        public String getFinishedAt() {
            return this.finishedAt;
        }

        public KopilotListConversationChatMessagesResponseBodyDataScheduledTaskInfoTasksLastCompletedRun setRunId(String runId) {
            this.runId = runId;
            return this;
        }
        public String getRunId() {
            return this.runId;
        }

        public KopilotListConversationChatMessagesResponseBodyDataScheduledTaskInfoTasksLastCompletedRun setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class KopilotListConversationChatMessagesResponseBodyDataScheduledTaskInfoTasks extends TeaModel {
        /**
         * <p>The run record that is currently queued or running. This value is empty if there is no active run.</p>
         */
        @NameInMap("ActiveRun")
        public KopilotListConversationChatMessagesResponseBodyDataScheduledTaskInfoTasksActiveRun activeRun;

        /**
         * <p>The most recent completed run record, including failed runs. This value is empty if no record exists.</p>
         */
        @NameInMap("LastCompletedRun")
        public KopilotListConversationChatMessagesResponseBodyDataScheduledTaskInfoTasksLastCompletedRun lastCompletedRun;

        /**
         * <p>The name of the scheduled task.</p>
         * 
         * <strong>example:</strong>
         * <p>Kafka Resource Inspection</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The next scheduled execution time, in UTC ISO 8601 format. This value is empty if no next execution is scheduled.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-17T12:15:00Z</p>
         */
        @NameInMap("NextRunAt")
        public String nextRunAt;

        /**
         * <p>The human-readable description of the execution schedule.</p>
         * 
         * <strong>example:</strong>
         * <p>Every 900 seconds</p>
         */
        @NameInMap("ScheduleDescription")
        public String scheduleDescription;

        /**
         * <p>The status of the scheduled task. Valid values:</p>
         * <ul>
         * <li>DRAFT: The task is a draft.</li>
         * <li>ENABLED: The task is enabled.</li>
         * <li>PAUSED: The task is paused.</li>
         * <li>NEEDS_AUTH: The task is pending authorization.</li>
         * <li>COMPLETED: The task is completed.</li>
         * </ul>
         * <p>This status is independent of the run status.</p>
         * 
         * <strong>example:</strong>
         * <p>ENABLED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The unique identifier of the scheduled task.</p>
         * 
         * <strong>example:</strong>
         * <p>task_0123456789abcdef0123456789abcdef</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static KopilotListConversationChatMessagesResponseBodyDataScheduledTaskInfoTasks build(java.util.Map<String, ?> map) throws Exception {
            KopilotListConversationChatMessagesResponseBodyDataScheduledTaskInfoTasks self = new KopilotListConversationChatMessagesResponseBodyDataScheduledTaskInfoTasks();
            return TeaModel.build(map, self);
        }

        public KopilotListConversationChatMessagesResponseBodyDataScheduledTaskInfoTasks setActiveRun(KopilotListConversationChatMessagesResponseBodyDataScheduledTaskInfoTasksActiveRun activeRun) {
            this.activeRun = activeRun;
            return this;
        }
        public KopilotListConversationChatMessagesResponseBodyDataScheduledTaskInfoTasksActiveRun getActiveRun() {
            return this.activeRun;
        }

        public KopilotListConversationChatMessagesResponseBodyDataScheduledTaskInfoTasks setLastCompletedRun(KopilotListConversationChatMessagesResponseBodyDataScheduledTaskInfoTasksLastCompletedRun lastCompletedRun) {
            this.lastCompletedRun = lastCompletedRun;
            return this;
        }
        public KopilotListConversationChatMessagesResponseBodyDataScheduledTaskInfoTasksLastCompletedRun getLastCompletedRun() {
            return this.lastCompletedRun;
        }

        public KopilotListConversationChatMessagesResponseBodyDataScheduledTaskInfoTasks setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public KopilotListConversationChatMessagesResponseBodyDataScheduledTaskInfoTasks setNextRunAt(String nextRunAt) {
            this.nextRunAt = nextRunAt;
            return this;
        }
        public String getNextRunAt() {
            return this.nextRunAt;
        }

        public KopilotListConversationChatMessagesResponseBodyDataScheduledTaskInfoTasks setScheduleDescription(String scheduleDescription) {
            this.scheduleDescription = scheduleDescription;
            return this;
        }
        public String getScheduleDescription() {
            return this.scheduleDescription;
        }

        public KopilotListConversationChatMessagesResponseBodyDataScheduledTaskInfoTasks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public KopilotListConversationChatMessagesResponseBodyDataScheduledTaskInfoTasks setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

    public static class KopilotListConversationChatMessagesResponseBodyDataScheduledTaskInfo extends TeaModel {
        /**
         * <p>The time when the overview was generated, in UTC ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-17T12:00:00Z</p>
         */
        @NameInMap("AsOf")
        public String asOf;

        /**
         * <p>The number of associated tasks in the ENABLED state.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("EnabledCount")
        public Long enabledCount;

        /**
         * <p>Indicates whether there is a next page of associated tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("HasMoreTasks")
        public Boolean hasMoreTasks;

        /**
         * <p>Indicates whether the current session has associated scheduled tasks in the enabled, paused, or pending authorization state.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasScheduledTask")
        public Boolean hasScheduledTask;

        /**
         * <p>The cursor for the next page. This value is empty if there is no next page.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("NextTaskCursor")
        public String nextTaskCursor;

        /**
         * <p>The total number of associated tasks. Only tasks in the ENABLED, PAUSED, or NEEDS_AUTH state are counted.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TaskCount")
        public Long taskCount;

        /**
         * <p>The list of associated tasks on the current page.</p>
         */
        @NameInMap("Tasks")
        public java.util.List<KopilotListConversationChatMessagesResponseBodyDataScheduledTaskInfoTasks> tasks;

        public static KopilotListConversationChatMessagesResponseBodyDataScheduledTaskInfo build(java.util.Map<String, ?> map) throws Exception {
            KopilotListConversationChatMessagesResponseBodyDataScheduledTaskInfo self = new KopilotListConversationChatMessagesResponseBodyDataScheduledTaskInfo();
            return TeaModel.build(map, self);
        }

        public KopilotListConversationChatMessagesResponseBodyDataScheduledTaskInfo setAsOf(String asOf) {
            this.asOf = asOf;
            return this;
        }
        public String getAsOf() {
            return this.asOf;
        }

        public KopilotListConversationChatMessagesResponseBodyDataScheduledTaskInfo setEnabledCount(Long enabledCount) {
            this.enabledCount = enabledCount;
            return this;
        }
        public Long getEnabledCount() {
            return this.enabledCount;
        }

        public KopilotListConversationChatMessagesResponseBodyDataScheduledTaskInfo setHasMoreTasks(Boolean hasMoreTasks) {
            this.hasMoreTasks = hasMoreTasks;
            return this;
        }
        public Boolean getHasMoreTasks() {
            return this.hasMoreTasks;
        }

        public KopilotListConversationChatMessagesResponseBodyDataScheduledTaskInfo setHasScheduledTask(Boolean hasScheduledTask) {
            this.hasScheduledTask = hasScheduledTask;
            return this;
        }
        public Boolean getHasScheduledTask() {
            return this.hasScheduledTask;
        }

        public KopilotListConversationChatMessagesResponseBodyDataScheduledTaskInfo setNextTaskCursor(String nextTaskCursor) {
            this.nextTaskCursor = nextTaskCursor;
            return this;
        }
        public String getNextTaskCursor() {
            return this.nextTaskCursor;
        }

        public KopilotListConversationChatMessagesResponseBodyDataScheduledTaskInfo setTaskCount(Long taskCount) {
            this.taskCount = taskCount;
            return this;
        }
        public Long getTaskCount() {
            return this.taskCount;
        }

        public KopilotListConversationChatMessagesResponseBodyDataScheduledTaskInfo setTasks(java.util.List<KopilotListConversationChatMessagesResponseBodyDataScheduledTaskInfoTasks> tasks) {
            this.tasks = tasks;
            return this;
        }
        public java.util.List<KopilotListConversationChatMessagesResponseBodyDataScheduledTaskInfoTasks> getTasks() {
            return this.tasks;
        }

    }

    public static class KopilotListConversationChatMessagesResponseBodyDataScheduledTaskQuota extends TeaModel {
        /**
         * <p>The maximum number of tasks or channels allowed, subject to the actual configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Limit")
        public Integer limit;

        /**
         * <p>The remaining quota, calculated as the limit minus the used quota. The minimum value is 0.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Remaining")
        public Long remaining;

        /**
         * <p>The used task quota. Tasks in the DRAFT, ENABLED, PAUSED, or NEEDS_AUTH state are counted. Completed or deleted tasks do not consume the quota.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Used")
        public Long used;

        public static KopilotListConversationChatMessagesResponseBodyDataScheduledTaskQuota build(java.util.Map<String, ?> map) throws Exception {
            KopilotListConversationChatMessagesResponseBodyDataScheduledTaskQuota self = new KopilotListConversationChatMessagesResponseBodyDataScheduledTaskQuota();
            return TeaModel.build(map, self);
        }

        public KopilotListConversationChatMessagesResponseBodyDataScheduledTaskQuota setLimit(Integer limit) {
            this.limit = limit;
            return this;
        }
        public Integer getLimit() {
            return this.limit;
        }

        public KopilotListConversationChatMessagesResponseBodyDataScheduledTaskQuota setRemaining(Long remaining) {
            this.remaining = remaining;
            return this;
        }
        public Long getRemaining() {
            return this.remaining;
        }

        public KopilotListConversationChatMessagesResponseBodyDataScheduledTaskQuota setUsed(Long used) {
            this.used = used;
            return this;
        }
        public Long getUsed() {
            return this.used;
        }

    }

    public static class KopilotListConversationChatMessagesResponseBodyData extends TeaModel {
        /**
         * <p>Indicates whether more data is available.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasMore")
        public Boolean hasMore;

        /**
         * <p>The list of messages.</p>
         */
        @NameInMap("Messages")
        public java.util.List<KopilotListConversationChatMessagesResponseBodyDataMessages> messages;

        /**
         * <p>The cursor for the next page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NextBeforeTurnId")
        public Long nextBeforeTurnId;

        /**
         * <p>The details of scheduled tasks associated with the current session. Only tasks in the enabled, paused, or pending authorization state are counted.</p>
         */
        @NameInMap("ScheduledTaskInfo")
        public KopilotListConversationChatMessagesResponseBodyDataScheduledTaskInfo scheduledTaskInfo;

        /**
         * <p>The scheduled task quota for the current Alibaba Cloud account in this environment, counted across regions.</p>
         */
        @NameInMap("ScheduledTaskQuota")
        public KopilotListConversationChatMessagesResponseBodyDataScheduledTaskQuota scheduledTaskQuota;

        /**
         * <p>The session ID.</p>
         * 
         * <strong>example:</strong>
         * <p>87ce9505-7dec-4fd7-bc7c-e66d949bfdc9</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

        /**
         * <p>The total number of turn IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("TotalTurns")
        public Long totalTurns;

        public static KopilotListConversationChatMessagesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            KopilotListConversationChatMessagesResponseBodyData self = new KopilotListConversationChatMessagesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public KopilotListConversationChatMessagesResponseBodyData setHasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }
        public Boolean getHasMore() {
            return this.hasMore;
        }

        public KopilotListConversationChatMessagesResponseBodyData setMessages(java.util.List<KopilotListConversationChatMessagesResponseBodyDataMessages> messages) {
            this.messages = messages;
            return this;
        }
        public java.util.List<KopilotListConversationChatMessagesResponseBodyDataMessages> getMessages() {
            return this.messages;
        }

        public KopilotListConversationChatMessagesResponseBodyData setNextBeforeTurnId(Long nextBeforeTurnId) {
            this.nextBeforeTurnId = nextBeforeTurnId;
            return this;
        }
        public Long getNextBeforeTurnId() {
            return this.nextBeforeTurnId;
        }

        public KopilotListConversationChatMessagesResponseBodyData setScheduledTaskInfo(KopilotListConversationChatMessagesResponseBodyDataScheduledTaskInfo scheduledTaskInfo) {
            this.scheduledTaskInfo = scheduledTaskInfo;
            return this;
        }
        public KopilotListConversationChatMessagesResponseBodyDataScheduledTaskInfo getScheduledTaskInfo() {
            return this.scheduledTaskInfo;
        }

        public KopilotListConversationChatMessagesResponseBodyData setScheduledTaskQuota(KopilotListConversationChatMessagesResponseBodyDataScheduledTaskQuota scheduledTaskQuota) {
            this.scheduledTaskQuota = scheduledTaskQuota;
            return this;
        }
        public KopilotListConversationChatMessagesResponseBodyDataScheduledTaskQuota getScheduledTaskQuota() {
            return this.scheduledTaskQuota;
        }

        public KopilotListConversationChatMessagesResponseBodyData setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public KopilotListConversationChatMessagesResponseBodyData setTotalTurns(Long totalTurns) {
            this.totalTurns = totalTurns;
            return this;
        }
        public Long getTotalTurns() {
            return this.totalTurns;
        }

    }

}
