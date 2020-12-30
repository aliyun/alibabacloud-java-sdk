// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetTaskListResponseBody extends TeaModel {
    @NameInMap("Tasks")
    public java.util.List<GetTaskListResponseBodyTasks> tasks;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static GetTaskListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTaskListResponseBody self = new GetTaskListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTaskListResponseBody setTasks(java.util.List<GetTaskListResponseBodyTasks> tasks) {
        this.tasks = tasks;
        return this;
    }
    public java.util.List<GetTaskListResponseBodyTasks> getTasks() {
        return this.tasks;
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

    public GetTaskListResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetTaskListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTaskListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetTaskListResponseBodyTasksContact extends TeaModel {
        @NameInMap("PhoneNumber")
        public String phoneNumber;

        @NameInMap("ContactId")
        public String contactId;

        @NameInMap("State")
        public String state;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("Honorific")
        public String honorific;

        @NameInMap("ContactName")
        public String contactName;

        @NameInMap("Role")
        public String role;

        @NameInMap("ReferenceId")
        public String referenceId;

        public static GetTaskListResponseBodyTasksContact build(java.util.Map<String, ?> map) throws Exception {
            GetTaskListResponseBodyTasksContact self = new GetTaskListResponseBodyTasksContact();
            return TeaModel.build(map, self);
        }

        public GetTaskListResponseBodyTasksContact setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public GetTaskListResponseBodyTasksContact setContactId(String contactId) {
            this.contactId = contactId;
            return this;
        }
        public String getContactId() {
            return this.contactId;
        }

        public GetTaskListResponseBodyTasksContact setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public GetTaskListResponseBodyTasksContact setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetTaskListResponseBodyTasksContact setHonorific(String honorific) {
            this.honorific = honorific;
            return this;
        }
        public String getHonorific() {
            return this.honorific;
        }

        public GetTaskListResponseBodyTasksContact setContactName(String contactName) {
            this.contactName = contactName;
            return this;
        }
        public String getContactName() {
            return this.contactName;
        }

        public GetTaskListResponseBodyTasksContact setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public GetTaskListResponseBodyTasksContact setReferenceId(String referenceId) {
            this.referenceId = referenceId;
            return this;
        }
        public String getReferenceId() {
            return this.referenceId;
        }

    }

    public static class GetTaskListResponseBodyTasksConversationSummary extends TeaModel {
        @NameInMap("SummaryName")
        public String summaryName;

        @NameInMap("Category")
        public String category;

        @NameInMap("Content")
        public String content;

        public static GetTaskListResponseBodyTasksConversationSummary build(java.util.Map<String, ?> map) throws Exception {
            GetTaskListResponseBodyTasksConversationSummary self = new GetTaskListResponseBodyTasksConversationSummary();
            return TeaModel.build(map, self);
        }

        public GetTaskListResponseBodyTasksConversationSummary setSummaryName(String summaryName) {
            this.summaryName = summaryName;
            return this;
        }
        public String getSummaryName() {
            return this.summaryName;
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

    }

    public static class GetTaskListResponseBodyTasksConversation extends TeaModel {
        @NameInMap("Summary")
        public java.util.List<GetTaskListResponseBodyTasksConversationSummary> summary;

        @NameInMap("Speaker")
        public String speaker;

        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("Script")
        public String script;

        public static GetTaskListResponseBodyTasksConversation build(java.util.Map<String, ?> map) throws Exception {
            GetTaskListResponseBodyTasksConversation self = new GetTaskListResponseBodyTasksConversation();
            return TeaModel.build(map, self);
        }

        public GetTaskListResponseBodyTasksConversation setSummary(java.util.List<GetTaskListResponseBodyTasksConversationSummary> summary) {
            this.summary = summary;
            return this;
        }
        public java.util.List<GetTaskListResponseBodyTasksConversationSummary> getSummary() {
            return this.summary;
        }

        public GetTaskListResponseBodyTasksConversation setSpeaker(String speaker) {
            this.speaker = speaker;
            return this;
        }
        public String getSpeaker() {
            return this.speaker;
        }

        public GetTaskListResponseBodyTasksConversation setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public GetTaskListResponseBodyTasksConversation setScript(String script) {
            this.script = script;
            return this;
        }
        public String getScript() {
            return this.script;
        }

    }

    public static class GetTaskListResponseBodyTasks extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("PlanedTime")
        public Long planedTime;

        @NameInMap("ChatbotId")
        public String chatbotId;

        @NameInMap("ActualTime")
        public Long actualTime;

        @NameInMap("CalledNumber")
        public String calledNumber;

        @NameInMap("ScenarioId")
        public String scenarioId;

        @NameInMap("Contact")
        public GetTaskListResponseBodyTasksContact contact;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("CallId")
        public String callId;

        @NameInMap("CallingNumber")
        public String callingNumber;

        @NameInMap("Brief")
        public String brief;

        @NameInMap("Duration")
        public Integer duration;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("Conversation")
        public java.util.List<GetTaskListResponseBodyTasksConversation> conversation;

        public static GetTaskListResponseBodyTasks build(java.util.Map<String, ?> map) throws Exception {
            GetTaskListResponseBodyTasks self = new GetTaskListResponseBodyTasks();
            return TeaModel.build(map, self);
        }

        public GetTaskListResponseBodyTasks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetTaskListResponseBodyTasks setPlanedTime(Long planedTime) {
            this.planedTime = planedTime;
            return this;
        }
        public Long getPlanedTime() {
            return this.planedTime;
        }

        public GetTaskListResponseBodyTasks setChatbotId(String chatbotId) {
            this.chatbotId = chatbotId;
            return this;
        }
        public String getChatbotId() {
            return this.chatbotId;
        }

        public GetTaskListResponseBodyTasks setActualTime(Long actualTime) {
            this.actualTime = actualTime;
            return this;
        }
        public Long getActualTime() {
            return this.actualTime;
        }

        public GetTaskListResponseBodyTasks setCalledNumber(String calledNumber) {
            this.calledNumber = calledNumber;
            return this;
        }
        public String getCalledNumber() {
            return this.calledNumber;
        }

        public GetTaskListResponseBodyTasks setScenarioId(String scenarioId) {
            this.scenarioId = scenarioId;
            return this;
        }
        public String getScenarioId() {
            return this.scenarioId;
        }

        public GetTaskListResponseBodyTasks setContact(GetTaskListResponseBodyTasksContact contact) {
            this.contact = contact;
            return this;
        }
        public GetTaskListResponseBodyTasksContact getContact() {
            return this.contact;
        }

        public GetTaskListResponseBodyTasks setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetTaskListResponseBodyTasks setCallId(String callId) {
            this.callId = callId;
            return this;
        }
        public String getCallId() {
            return this.callId;
        }

        public GetTaskListResponseBodyTasks setCallingNumber(String callingNumber) {
            this.callingNumber = callingNumber;
            return this;
        }
        public String getCallingNumber() {
            return this.callingNumber;
        }

        public GetTaskListResponseBodyTasks setBrief(String brief) {
            this.brief = brief;
            return this;
        }
        public String getBrief() {
            return this.brief;
        }

        public GetTaskListResponseBodyTasks setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public GetTaskListResponseBodyTasks setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetTaskListResponseBodyTasks setConversation(java.util.List<GetTaskListResponseBodyTasksConversation> conversation) {
            this.conversation = conversation;
            return this;
        }
        public java.util.List<GetTaskListResponseBodyTasksConversation> getConversation() {
            return this.conversation;
        }

    }

}
