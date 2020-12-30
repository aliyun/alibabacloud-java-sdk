// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetJobStatusByCallIdResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Job")
    public GetJobStatusByCallIdResponseBodyJob job;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static GetJobStatusByCallIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetJobStatusByCallIdResponseBody self = new GetJobStatusByCallIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetJobStatusByCallIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetJobStatusByCallIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetJobStatusByCallIdResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetJobStatusByCallIdResponseBody setJob(GetJobStatusByCallIdResponseBodyJob job) {
        this.job = job;
        return this;
    }
    public GetJobStatusByCallIdResponseBodyJob getJob() {
        return this.job;
    }

    public GetJobStatusByCallIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetJobStatusByCallIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetJobStatusByCallIdResponseBodyJobContacts extends TeaModel {
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

        public static GetJobStatusByCallIdResponseBodyJobContacts build(java.util.Map<String, ?> map) throws Exception {
            GetJobStatusByCallIdResponseBodyJobContacts self = new GetJobStatusByCallIdResponseBodyJobContacts();
            return TeaModel.build(map, self);
        }

        public GetJobStatusByCallIdResponseBodyJobContacts setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public GetJobStatusByCallIdResponseBodyJobContacts setContactId(String contactId) {
            this.contactId = contactId;
            return this;
        }
        public String getContactId() {
            return this.contactId;
        }

        public GetJobStatusByCallIdResponseBodyJobContacts setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public GetJobStatusByCallIdResponseBodyJobContacts setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetJobStatusByCallIdResponseBodyJobContacts setHonorific(String honorific) {
            this.honorific = honorific;
            return this;
        }
        public String getHonorific() {
            return this.honorific;
        }

        public GetJobStatusByCallIdResponseBodyJobContacts setContactName(String contactName) {
            this.contactName = contactName;
            return this;
        }
        public String getContactName() {
            return this.contactName;
        }

        public GetJobStatusByCallIdResponseBodyJobContacts setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public GetJobStatusByCallIdResponseBodyJobContacts setReferenceId(String referenceId) {
            this.referenceId = referenceId;
            return this;
        }
        public String getReferenceId() {
            return this.referenceId;
        }

    }

    public static class GetJobStatusByCallIdResponseBodyJobSummary extends TeaModel {
        @NameInMap("SummaryName")
        public String summaryName;

        @NameInMap("Category")
        public String category;

        @NameInMap("Content")
        public String content;

        @NameInMap("SummaryId")
        public String summaryId;

        public static GetJobStatusByCallIdResponseBodyJobSummary build(java.util.Map<String, ?> map) throws Exception {
            GetJobStatusByCallIdResponseBodyJobSummary self = new GetJobStatusByCallIdResponseBodyJobSummary();
            return TeaModel.build(map, self);
        }

        public GetJobStatusByCallIdResponseBodyJobSummary setSummaryName(String summaryName) {
            this.summaryName = summaryName;
            return this;
        }
        public String getSummaryName() {
            return this.summaryName;
        }

        public GetJobStatusByCallIdResponseBodyJobSummary setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public GetJobStatusByCallIdResponseBodyJobSummary setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetJobStatusByCallIdResponseBodyJobSummary setSummaryId(String summaryId) {
            this.summaryId = summaryId;
            return this;
        }
        public String getSummaryId() {
            return this.summaryId;
        }

    }

    public static class GetJobStatusByCallIdResponseBodyJobExtras extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static GetJobStatusByCallIdResponseBodyJobExtras build(java.util.Map<String, ?> map) throws Exception {
            GetJobStatusByCallIdResponseBodyJobExtras self = new GetJobStatusByCallIdResponseBodyJobExtras();
            return TeaModel.build(map, self);
        }

        public GetJobStatusByCallIdResponseBodyJobExtras setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetJobStatusByCallIdResponseBodyJobExtras setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetJobStatusByCallIdResponseBodyJobTasksContact extends TeaModel {
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

        public static GetJobStatusByCallIdResponseBodyJobTasksContact build(java.util.Map<String, ?> map) throws Exception {
            GetJobStatusByCallIdResponseBodyJobTasksContact self = new GetJobStatusByCallIdResponseBodyJobTasksContact();
            return TeaModel.build(map, self);
        }

        public GetJobStatusByCallIdResponseBodyJobTasksContact setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public GetJobStatusByCallIdResponseBodyJobTasksContact setContactId(String contactId) {
            this.contactId = contactId;
            return this;
        }
        public String getContactId() {
            return this.contactId;
        }

        public GetJobStatusByCallIdResponseBodyJobTasksContact setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public GetJobStatusByCallIdResponseBodyJobTasksContact setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetJobStatusByCallIdResponseBodyJobTasksContact setHonorific(String honorific) {
            this.honorific = honorific;
            return this;
        }
        public String getHonorific() {
            return this.honorific;
        }

        public GetJobStatusByCallIdResponseBodyJobTasksContact setContactName(String contactName) {
            this.contactName = contactName;
            return this;
        }
        public String getContactName() {
            return this.contactName;
        }

        public GetJobStatusByCallIdResponseBodyJobTasksContact setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public GetJobStatusByCallIdResponseBodyJobTasksContact setReferenceId(String referenceId) {
            this.referenceId = referenceId;
            return this;
        }
        public String getReferenceId() {
            return this.referenceId;
        }

    }

    public static class GetJobStatusByCallIdResponseBodyJobTasksConversationSummary extends TeaModel {
        @NameInMap("SummaryName")
        public String summaryName;

        @NameInMap("Category")
        public String category;

        @NameInMap("Content")
        public String content;

        @NameInMap("SummaryId")
        public String summaryId;

        public static GetJobStatusByCallIdResponseBodyJobTasksConversationSummary build(java.util.Map<String, ?> map) throws Exception {
            GetJobStatusByCallIdResponseBodyJobTasksConversationSummary self = new GetJobStatusByCallIdResponseBodyJobTasksConversationSummary();
            return TeaModel.build(map, self);
        }

        public GetJobStatusByCallIdResponseBodyJobTasksConversationSummary setSummaryName(String summaryName) {
            this.summaryName = summaryName;
            return this;
        }
        public String getSummaryName() {
            return this.summaryName;
        }

        public GetJobStatusByCallIdResponseBodyJobTasksConversationSummary setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public GetJobStatusByCallIdResponseBodyJobTasksConversationSummary setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetJobStatusByCallIdResponseBodyJobTasksConversationSummary setSummaryId(String summaryId) {
            this.summaryId = summaryId;
            return this;
        }
        public String getSummaryId() {
            return this.summaryId;
        }

    }

    public static class GetJobStatusByCallIdResponseBodyJobTasksConversation extends TeaModel {
        @NameInMap("Summary")
        public java.util.List<GetJobStatusByCallIdResponseBodyJobTasksConversationSummary> summary;

        @NameInMap("Speaker")
        public String speaker;

        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("Script")
        public String script;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("ConversationDetailId")
        public String conversationDetailId;

        public static GetJobStatusByCallIdResponseBodyJobTasksConversation build(java.util.Map<String, ?> map) throws Exception {
            GetJobStatusByCallIdResponseBodyJobTasksConversation self = new GetJobStatusByCallIdResponseBodyJobTasksConversation();
            return TeaModel.build(map, self);
        }

        public GetJobStatusByCallIdResponseBodyJobTasksConversation setSummary(java.util.List<GetJobStatusByCallIdResponseBodyJobTasksConversationSummary> summary) {
            this.summary = summary;
            return this;
        }
        public java.util.List<GetJobStatusByCallIdResponseBodyJobTasksConversationSummary> getSummary() {
            return this.summary;
        }

        public GetJobStatusByCallIdResponseBodyJobTasksConversation setSpeaker(String speaker) {
            this.speaker = speaker;
            return this;
        }
        public String getSpeaker() {
            return this.speaker;
        }

        public GetJobStatusByCallIdResponseBodyJobTasksConversation setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public GetJobStatusByCallIdResponseBodyJobTasksConversation setScript(String script) {
            this.script = script;
            return this;
        }
        public String getScript() {
            return this.script;
        }

        public GetJobStatusByCallIdResponseBodyJobTasksConversation setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetJobStatusByCallIdResponseBodyJobTasksConversation setConversationDetailId(String conversationDetailId) {
            this.conversationDetailId = conversationDetailId;
            return this;
        }
        public String getConversationDetailId() {
            return this.conversationDetailId;
        }

    }

    public static class GetJobStatusByCallIdResponseBodyJobTasks extends TeaModel {
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

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("ScenarioId")
        public String scenarioId;

        @NameInMap("Contact")
        public GetJobStatusByCallIdResponseBodyJobTasksContact contact;

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
        public java.util.List<GetJobStatusByCallIdResponseBodyJobTasksConversation> conversation;

        public static GetJobStatusByCallIdResponseBodyJobTasks build(java.util.Map<String, ?> map) throws Exception {
            GetJobStatusByCallIdResponseBodyJobTasks self = new GetJobStatusByCallIdResponseBodyJobTasks();
            return TeaModel.build(map, self);
        }

        public GetJobStatusByCallIdResponseBodyJobTasks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetJobStatusByCallIdResponseBodyJobTasks setPlanedTime(Long planedTime) {
            this.planedTime = planedTime;
            return this;
        }
        public Long getPlanedTime() {
            return this.planedTime;
        }

        public GetJobStatusByCallIdResponseBodyJobTasks setChatbotId(String chatbotId) {
            this.chatbotId = chatbotId;
            return this;
        }
        public String getChatbotId() {
            return this.chatbotId;
        }

        public GetJobStatusByCallIdResponseBodyJobTasks setActualTime(Long actualTime) {
            this.actualTime = actualTime;
            return this;
        }
        public Long getActualTime() {
            return this.actualTime;
        }

        public GetJobStatusByCallIdResponseBodyJobTasks setCalledNumber(String calledNumber) {
            this.calledNumber = calledNumber;
            return this;
        }
        public String getCalledNumber() {
            return this.calledNumber;
        }

        public GetJobStatusByCallIdResponseBodyJobTasks setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public GetJobStatusByCallIdResponseBodyJobTasks setScenarioId(String scenarioId) {
            this.scenarioId = scenarioId;
            return this;
        }
        public String getScenarioId() {
            return this.scenarioId;
        }

        public GetJobStatusByCallIdResponseBodyJobTasks setContact(GetJobStatusByCallIdResponseBodyJobTasksContact contact) {
            this.contact = contact;
            return this;
        }
        public GetJobStatusByCallIdResponseBodyJobTasksContact getContact() {
            return this.contact;
        }

        public GetJobStatusByCallIdResponseBodyJobTasks setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetJobStatusByCallIdResponseBodyJobTasks setCallId(String callId) {
            this.callId = callId;
            return this;
        }
        public String getCallId() {
            return this.callId;
        }

        public GetJobStatusByCallIdResponseBodyJobTasks setCallingNumber(String callingNumber) {
            this.callingNumber = callingNumber;
            return this;
        }
        public String getCallingNumber() {
            return this.callingNumber;
        }

        public GetJobStatusByCallIdResponseBodyJobTasks setBrief(String brief) {
            this.brief = brief;
            return this;
        }
        public String getBrief() {
            return this.brief;
        }

        public GetJobStatusByCallIdResponseBodyJobTasks setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public GetJobStatusByCallIdResponseBodyJobTasks setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetJobStatusByCallIdResponseBodyJobTasks setConversation(java.util.List<GetJobStatusByCallIdResponseBodyJobTasksConversation> conversation) {
            this.conversation = conversation;
            return this;
        }
        public java.util.List<GetJobStatusByCallIdResponseBodyJobTasksConversation> getConversation() {
            return this.conversation;
        }

    }

    public static class GetJobStatusByCallIdResponseBodyJob extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("CallingNumbers")
        public java.util.List<String> callingNumbers;

        @NameInMap("Contacts")
        public java.util.List<GetJobStatusByCallIdResponseBodyJobContacts> contacts;

        @NameInMap("Summary")
        public java.util.List<GetJobStatusByCallIdResponseBodyJobSummary> summary;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("FailureReason")
        public String failureReason;

        @NameInMap("Extras")
        public java.util.List<GetJobStatusByCallIdResponseBodyJobExtras> extras;

        @NameInMap("ReferenceId")
        public String referenceId;

        @NameInMap("ScenarioId")
        public String scenarioId;

        @NameInMap("Tasks")
        public java.util.List<GetJobStatusByCallIdResponseBodyJobTasks> tasks;

        @NameInMap("StrategyId")
        public String strategyId;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("JobId")
        public String jobId;

        public static GetJobStatusByCallIdResponseBodyJob build(java.util.Map<String, ?> map) throws Exception {
            GetJobStatusByCallIdResponseBodyJob self = new GetJobStatusByCallIdResponseBodyJob();
            return TeaModel.build(map, self);
        }

        public GetJobStatusByCallIdResponseBodyJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetJobStatusByCallIdResponseBodyJob setCallingNumbers(java.util.List<String> callingNumbers) {
            this.callingNumbers = callingNumbers;
            return this;
        }
        public java.util.List<String> getCallingNumbers() {
            return this.callingNumbers;
        }

        public GetJobStatusByCallIdResponseBodyJob setContacts(java.util.List<GetJobStatusByCallIdResponseBodyJobContacts> contacts) {
            this.contacts = contacts;
            return this;
        }
        public java.util.List<GetJobStatusByCallIdResponseBodyJobContacts> getContacts() {
            return this.contacts;
        }

        public GetJobStatusByCallIdResponseBodyJob setSummary(java.util.List<GetJobStatusByCallIdResponseBodyJobSummary> summary) {
            this.summary = summary;
            return this;
        }
        public java.util.List<GetJobStatusByCallIdResponseBodyJobSummary> getSummary() {
            return this.summary;
        }

        public GetJobStatusByCallIdResponseBodyJob setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public GetJobStatusByCallIdResponseBodyJob setFailureReason(String failureReason) {
            this.failureReason = failureReason;
            return this;
        }
        public String getFailureReason() {
            return this.failureReason;
        }

        public GetJobStatusByCallIdResponseBodyJob setExtras(java.util.List<GetJobStatusByCallIdResponseBodyJobExtras> extras) {
            this.extras = extras;
            return this;
        }
        public java.util.List<GetJobStatusByCallIdResponseBodyJobExtras> getExtras() {
            return this.extras;
        }

        public GetJobStatusByCallIdResponseBodyJob setReferenceId(String referenceId) {
            this.referenceId = referenceId;
            return this;
        }
        public String getReferenceId() {
            return this.referenceId;
        }

        public GetJobStatusByCallIdResponseBodyJob setScenarioId(String scenarioId) {
            this.scenarioId = scenarioId;
            return this;
        }
        public String getScenarioId() {
            return this.scenarioId;
        }

        public GetJobStatusByCallIdResponseBodyJob setTasks(java.util.List<GetJobStatusByCallIdResponseBodyJobTasks> tasks) {
            this.tasks = tasks;
            return this;
        }
        public java.util.List<GetJobStatusByCallIdResponseBodyJobTasks> getTasks() {
            return this.tasks;
        }

        public GetJobStatusByCallIdResponseBodyJob setStrategyId(String strategyId) {
            this.strategyId = strategyId;
            return this;
        }
        public String getStrategyId() {
            return this.strategyId;
        }

        public GetJobStatusByCallIdResponseBodyJob setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public GetJobStatusByCallIdResponseBodyJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

    }

}
