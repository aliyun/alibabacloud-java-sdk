// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetTaskListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Tasks")
    public java.util.List<GetTaskListResponseBodyTasks> tasks;

    public static GetTaskListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTaskListResponseBody self = new GetTaskListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTaskListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTaskListResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetTaskListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTaskListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTaskListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetTaskListResponseBody setTasks(java.util.List<GetTaskListResponseBodyTasks> tasks) {
        this.tasks = tasks;
        return this;
    }
    public java.util.List<GetTaskListResponseBodyTasks> getTasks() {
        return this.tasks;
    }

    public static class GetTaskListResponseBodyTasksContact extends TeaModel {
        @NameInMap("ContactId")
        public String contactId;

        @NameInMap("ContactName")
        public String contactName;

        @NameInMap("Honorific")
        public String honorific;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("PhoneNumber")
        public String phoneNumber;

        @NameInMap("ReferenceId")
        public String referenceId;

        @NameInMap("Role")
        public String role;

        @NameInMap("State")
        public String state;

        public static GetTaskListResponseBodyTasksContact build(java.util.Map<String, ?> map) throws Exception {
            GetTaskListResponseBodyTasksContact self = new GetTaskListResponseBodyTasksContact();
            return TeaModel.build(map, self);
        }

        public GetTaskListResponseBodyTasksContact setContactId(String contactId) {
            this.contactId = contactId;
            return this;
        }
        public String getContactId() {
            return this.contactId;
        }

        public GetTaskListResponseBodyTasksContact setContactName(String contactName) {
            this.contactName = contactName;
            return this;
        }
        public String getContactName() {
            return this.contactName;
        }

        public GetTaskListResponseBodyTasksContact setHonorific(String honorific) {
            this.honorific = honorific;
            return this;
        }
        public String getHonorific() {
            return this.honorific;
        }

        public GetTaskListResponseBodyTasksContact setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetTaskListResponseBodyTasksContact setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public GetTaskListResponseBodyTasksContact setReferenceId(String referenceId) {
            this.referenceId = referenceId;
            return this;
        }
        public String getReferenceId() {
            return this.referenceId;
        }

        public GetTaskListResponseBodyTasksContact setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public GetTaskListResponseBodyTasksContact setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

    public static class GetTaskListResponseBodyTasksConversationSummary extends TeaModel {
        @NameInMap("Category")
        public String category;

        @NameInMap("Content")
        public String content;

        @NameInMap("SummaryName")
        public String summaryName;

        public static GetTaskListResponseBodyTasksConversationSummary build(java.util.Map<String, ?> map) throws Exception {
            GetTaskListResponseBodyTasksConversationSummary self = new GetTaskListResponseBodyTasksConversationSummary();
            return TeaModel.build(map, self);
        }

        public GetTaskListResponseBodyTasksConversationSummary setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public GetTaskListResponseBodyTasksConversationSummary setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetTaskListResponseBodyTasksConversationSummary setSummaryName(String summaryName) {
            this.summaryName = summaryName;
            return this;
        }
        public String getSummaryName() {
            return this.summaryName;
        }

    }

    public static class GetTaskListResponseBodyTasksConversation extends TeaModel {
        @NameInMap("Script")
        public String script;

        @NameInMap("Speaker")
        public String speaker;

        @NameInMap("Summary")
        public java.util.List<GetTaskListResponseBodyTasksConversationSummary> summary;

        @NameInMap("Timestamp")
        public Long timestamp;

        public static GetTaskListResponseBodyTasksConversation build(java.util.Map<String, ?> map) throws Exception {
            GetTaskListResponseBodyTasksConversation self = new GetTaskListResponseBodyTasksConversation();
            return TeaModel.build(map, self);
        }

        public GetTaskListResponseBodyTasksConversation setScript(String script) {
            this.script = script;
            return this;
        }
        public String getScript() {
            return this.script;
        }

        public GetTaskListResponseBodyTasksConversation setSpeaker(String speaker) {
            this.speaker = speaker;
            return this;
        }
        public String getSpeaker() {
            return this.speaker;
        }

        public GetTaskListResponseBodyTasksConversation setSummary(java.util.List<GetTaskListResponseBodyTasksConversationSummary> summary) {
            this.summary = summary;
            return this;
        }
        public java.util.List<GetTaskListResponseBodyTasksConversationSummary> getSummary() {
            return this.summary;
        }

        public GetTaskListResponseBodyTasksConversation setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

    public static class GetTaskListResponseBodyTasks extends TeaModel {
        @NameInMap("ActualTime")
        public Long actualTime;

        @NameInMap("Brief")
        public String brief;

        @NameInMap("CallId")
        public String callId;

        @NameInMap("CalledNumber")
        public String calledNumber;

        @NameInMap("CallingNumber")
        public String callingNumber;

        @NameInMap("ChatbotId")
        public String chatbotId;

        @NameInMap("Contact")
        public GetTaskListResponseBodyTasksContact contact;

        @NameInMap("Conversation")
        public java.util.List<GetTaskListResponseBodyTasksConversation> conversation;

        @NameInMap("Duration")
        public Integer duration;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("PlanedTime")
        public Long planedTime;

        @NameInMap("ScenarioId")
        public String scenarioId;

        @NameInMap("Status")
        public String status;

        @NameInMap("TaskId")
        public String taskId;

        public static GetTaskListResponseBodyTasks build(java.util.Map<String, ?> map) throws Exception {
            GetTaskListResponseBodyTasks self = new GetTaskListResponseBodyTasks();
            return TeaModel.build(map, self);
        }

        public GetTaskListResponseBodyTasks setActualTime(Long actualTime) {
            this.actualTime = actualTime;
            return this;
        }
        public Long getActualTime() {
            return this.actualTime;
        }

        public GetTaskListResponseBodyTasks setBrief(String brief) {
            this.brief = brief;
            return this;
        }
        public String getBrief() {
            return this.brief;
        }

        public GetTaskListResponseBodyTasks setCallId(String callId) {
            this.callId = callId;
            return this;
        }
        public String getCallId() {
            return this.callId;
        }

        public GetTaskListResponseBodyTasks setCalledNumber(String calledNumber) {
            this.calledNumber = calledNumber;
            return this;
        }
        public String getCalledNumber() {
            return this.calledNumber;
        }

        public GetTaskListResponseBodyTasks setCallingNumber(String callingNumber) {
            this.callingNumber = callingNumber;
            return this;
        }
        public String getCallingNumber() {
            return this.callingNumber;
        }

        public GetTaskListResponseBodyTasks setChatbotId(String chatbotId) {
            this.chatbotId = chatbotId;
            return this;
        }
        public String getChatbotId() {
            return this.chatbotId;
        }

        public GetTaskListResponseBodyTasks setContact(GetTaskListResponseBodyTasksContact contact) {
            this.contact = contact;
            return this;
        }
        public GetTaskListResponseBodyTasksContact getContact() {
            return this.contact;
        }

        public GetTaskListResponseBodyTasks setConversation(java.util.List<GetTaskListResponseBodyTasksConversation> conversation) {
            this.conversation = conversation;
            return this;
        }
        public java.util.List<GetTaskListResponseBodyTasksConversation> getConversation() {
            return this.conversation;
        }

        public GetTaskListResponseBodyTasks setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public GetTaskListResponseBodyTasks setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetTaskListResponseBodyTasks setPlanedTime(Long planedTime) {
            this.planedTime = planedTime;
            return this;
        }
        public Long getPlanedTime() {
            return this.planedTime;
        }

        public GetTaskListResponseBodyTasks setScenarioId(String scenarioId) {
            this.scenarioId = scenarioId;
            return this;
        }
        public String getScenarioId() {
            return this.scenarioId;
        }

        public GetTaskListResponseBodyTasks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetTaskListResponseBodyTasks setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
