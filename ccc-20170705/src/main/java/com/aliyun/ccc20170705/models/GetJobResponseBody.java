// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetJobResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Job")
    public GetJobResponseBodyJob job;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static GetJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetJobResponseBody self = new GetJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetJobResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetJobResponseBody setJob(GetJobResponseBodyJob job) {
        this.job = job;
        return this;
    }
    public GetJobResponseBodyJob getJob() {
        return this.job;
    }

    public GetJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetJobResponseBodyJobContacts extends TeaModel {
        @NameInMap("PhoneNumber")
        public String phoneNumber;

        @NameInMap("ContactId")
        public String contactId;

        @NameInMap("State")
        public String state;

        @NameInMap("Honorific")
        public String honorific;

        @NameInMap("ContactName")
        public String contactName;

        @NameInMap("Role")
        public String role;

        @NameInMap("ReferenceId")
        public String referenceId;

        public static GetJobResponseBodyJobContacts build(java.util.Map<String, ?> map) throws Exception {
            GetJobResponseBodyJobContacts self = new GetJobResponseBodyJobContacts();
            return TeaModel.build(map, self);
        }

        public GetJobResponseBodyJobContacts setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public GetJobResponseBodyJobContacts setContactId(String contactId) {
            this.contactId = contactId;
            return this;
        }
        public String getContactId() {
            return this.contactId;
        }

        public GetJobResponseBodyJobContacts setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public GetJobResponseBodyJobContacts setHonorific(String honorific) {
            this.honorific = honorific;
            return this;
        }
        public String getHonorific() {
            return this.honorific;
        }

        public GetJobResponseBodyJobContacts setContactName(String contactName) {
            this.contactName = contactName;
            return this;
        }
        public String getContactName() {
            return this.contactName;
        }

        public GetJobResponseBodyJobContacts setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public GetJobResponseBodyJobContacts setReferenceId(String referenceId) {
            this.referenceId = referenceId;
            return this;
        }
        public String getReferenceId() {
            return this.referenceId;
        }

    }

    public static class GetJobResponseBodyJobSummary extends TeaModel {
        @NameInMap("SummaryName")
        public String summaryName;

        @NameInMap("Category")
        public String category;

        @NameInMap("Content")
        public String content;

        public static GetJobResponseBodyJobSummary build(java.util.Map<String, ?> map) throws Exception {
            GetJobResponseBodyJobSummary self = new GetJobResponseBodyJobSummary();
            return TeaModel.build(map, self);
        }

        public GetJobResponseBodyJobSummary setSummaryName(String summaryName) {
            this.summaryName = summaryName;
            return this;
        }
        public String getSummaryName() {
            return this.summaryName;
        }

        public GetJobResponseBodyJobSummary setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public GetJobResponseBodyJobSummary setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class GetJobResponseBodyJobExtras extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static GetJobResponseBodyJobExtras build(java.util.Map<String, ?> map) throws Exception {
            GetJobResponseBodyJobExtras self = new GetJobResponseBodyJobExtras();
            return TeaModel.build(map, self);
        }

        public GetJobResponseBodyJobExtras setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetJobResponseBodyJobExtras setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetJobResponseBodyJobTasksContact extends TeaModel {
        @NameInMap("PhoneNumber")
        public String phoneNumber;

        @NameInMap("ContactId")
        public String contactId;

        @NameInMap("State")
        public String state;

        @NameInMap("Honorific")
        public String honorific;

        @NameInMap("ContactName")
        public String contactName;

        @NameInMap("Role")
        public String role;

        @NameInMap("ReferenceId")
        public String referenceId;

        public static GetJobResponseBodyJobTasksContact build(java.util.Map<String, ?> map) throws Exception {
            GetJobResponseBodyJobTasksContact self = new GetJobResponseBodyJobTasksContact();
            return TeaModel.build(map, self);
        }

        public GetJobResponseBodyJobTasksContact setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public GetJobResponseBodyJobTasksContact setContactId(String contactId) {
            this.contactId = contactId;
            return this;
        }
        public String getContactId() {
            return this.contactId;
        }

        public GetJobResponseBodyJobTasksContact setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public GetJobResponseBodyJobTasksContact setHonorific(String honorific) {
            this.honorific = honorific;
            return this;
        }
        public String getHonorific() {
            return this.honorific;
        }

        public GetJobResponseBodyJobTasksContact setContactName(String contactName) {
            this.contactName = contactName;
            return this;
        }
        public String getContactName() {
            return this.contactName;
        }

        public GetJobResponseBodyJobTasksContact setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public GetJobResponseBodyJobTasksContact setReferenceId(String referenceId) {
            this.referenceId = referenceId;
            return this;
        }
        public String getReferenceId() {
            return this.referenceId;
        }

    }

    public static class GetJobResponseBodyJobTasksConversationSummary extends TeaModel {
        @NameInMap("SummaryName")
        public String summaryName;

        @NameInMap("Category")
        public String category;

        @NameInMap("Content")
        public String content;

        public static GetJobResponseBodyJobTasksConversationSummary build(java.util.Map<String, ?> map) throws Exception {
            GetJobResponseBodyJobTasksConversationSummary self = new GetJobResponseBodyJobTasksConversationSummary();
            return TeaModel.build(map, self);
        }

        public GetJobResponseBodyJobTasksConversationSummary setSummaryName(String summaryName) {
            this.summaryName = summaryName;
            return this;
        }
        public String getSummaryName() {
            return this.summaryName;
        }

        public GetJobResponseBodyJobTasksConversationSummary setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public GetJobResponseBodyJobTasksConversationSummary setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class GetJobResponseBodyJobTasksConversation extends TeaModel {
        @NameInMap("Summary")
        public java.util.List<GetJobResponseBodyJobTasksConversationSummary> summary;

        @NameInMap("Speaker")
        public String speaker;

        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("Script")
        public String script;

        public static GetJobResponseBodyJobTasksConversation build(java.util.Map<String, ?> map) throws Exception {
            GetJobResponseBodyJobTasksConversation self = new GetJobResponseBodyJobTasksConversation();
            return TeaModel.build(map, self);
        }

        public GetJobResponseBodyJobTasksConversation setSummary(java.util.List<GetJobResponseBodyJobTasksConversationSummary> summary) {
            this.summary = summary;
            return this;
        }
        public java.util.List<GetJobResponseBodyJobTasksConversationSummary> getSummary() {
            return this.summary;
        }

        public GetJobResponseBodyJobTasksConversation setSpeaker(String speaker) {
            this.speaker = speaker;
            return this;
        }
        public String getSpeaker() {
            return this.speaker;
        }

        public GetJobResponseBodyJobTasksConversation setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public GetJobResponseBodyJobTasksConversation setScript(String script) {
            this.script = script;
            return this;
        }
        public String getScript() {
            return this.script;
        }

    }

    public static class GetJobResponseBodyJobTasks extends TeaModel {
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
        public GetJobResponseBodyJobTasksContact contact;

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
        public java.util.List<GetJobResponseBodyJobTasksConversation> conversation;

        public static GetJobResponseBodyJobTasks build(java.util.Map<String, ?> map) throws Exception {
            GetJobResponseBodyJobTasks self = new GetJobResponseBodyJobTasks();
            return TeaModel.build(map, self);
        }

        public GetJobResponseBodyJobTasks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetJobResponseBodyJobTasks setPlanedTime(Long planedTime) {
            this.planedTime = planedTime;
            return this;
        }
        public Long getPlanedTime() {
            return this.planedTime;
        }

        public GetJobResponseBodyJobTasks setChatbotId(String chatbotId) {
            this.chatbotId = chatbotId;
            return this;
        }
        public String getChatbotId() {
            return this.chatbotId;
        }

        public GetJobResponseBodyJobTasks setActualTime(Long actualTime) {
            this.actualTime = actualTime;
            return this;
        }
        public Long getActualTime() {
            return this.actualTime;
        }

        public GetJobResponseBodyJobTasks setCalledNumber(String calledNumber) {
            this.calledNumber = calledNumber;
            return this;
        }
        public String getCalledNumber() {
            return this.calledNumber;
        }

        public GetJobResponseBodyJobTasks setScenarioId(String scenarioId) {
            this.scenarioId = scenarioId;
            return this;
        }
        public String getScenarioId() {
            return this.scenarioId;
        }

        public GetJobResponseBodyJobTasks setContact(GetJobResponseBodyJobTasksContact contact) {
            this.contact = contact;
            return this;
        }
        public GetJobResponseBodyJobTasksContact getContact() {
            return this.contact;
        }

        public GetJobResponseBodyJobTasks setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetJobResponseBodyJobTasks setCallId(String callId) {
            this.callId = callId;
            return this;
        }
        public String getCallId() {
            return this.callId;
        }

        public GetJobResponseBodyJobTasks setCallingNumber(String callingNumber) {
            this.callingNumber = callingNumber;
            return this;
        }
        public String getCallingNumber() {
            return this.callingNumber;
        }

        public GetJobResponseBodyJobTasks setBrief(String brief) {
            this.brief = brief;
            return this;
        }
        public String getBrief() {
            return this.brief;
        }

        public GetJobResponseBodyJobTasks setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public GetJobResponseBodyJobTasks setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetJobResponseBodyJobTasks setConversation(java.util.List<GetJobResponseBodyJobTasksConversation> conversation) {
            this.conversation = conversation;
            return this;
        }
        public java.util.List<GetJobResponseBodyJobTasksConversation> getConversation() {
            return this.conversation;
        }

    }

    public static class GetJobResponseBodyJob extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("CallingNumbers")
        public java.util.List<String> callingNumbers;

        @NameInMap("Contacts")
        public java.util.List<GetJobResponseBodyJobContacts> contacts;

        @NameInMap("Summary")
        public java.util.List<GetJobResponseBodyJobSummary> summary;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("FailureReason")
        public String failureReason;

        @NameInMap("SystemPriority")
        public Integer systemPriority;

        @NameInMap("Extras")
        public java.util.List<GetJobResponseBodyJobExtras> extras;

        @NameInMap("ReferenceId")
        public String referenceId;

        @NameInMap("ScenarioId")
        public String scenarioId;

        @NameInMap("Tasks")
        public java.util.List<GetJobResponseBodyJobTasks> tasks;

        @NameInMap("StrategyId")
        public String strategyId;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("JobId")
        public String jobId;

        public static GetJobResponseBodyJob build(java.util.Map<String, ?> map) throws Exception {
            GetJobResponseBodyJob self = new GetJobResponseBodyJob();
            return TeaModel.build(map, self);
        }

        public GetJobResponseBodyJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetJobResponseBodyJob setCallingNumbers(java.util.List<String> callingNumbers) {
            this.callingNumbers = callingNumbers;
            return this;
        }
        public java.util.List<String> getCallingNumbers() {
            return this.callingNumbers;
        }

        public GetJobResponseBodyJob setContacts(java.util.List<GetJobResponseBodyJobContacts> contacts) {
            this.contacts = contacts;
            return this;
        }
        public java.util.List<GetJobResponseBodyJobContacts> getContacts() {
            return this.contacts;
        }

        public GetJobResponseBodyJob setSummary(java.util.List<GetJobResponseBodyJobSummary> summary) {
            this.summary = summary;
            return this;
        }
        public java.util.List<GetJobResponseBodyJobSummary> getSummary() {
            return this.summary;
        }

        public GetJobResponseBodyJob setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public GetJobResponseBodyJob setFailureReason(String failureReason) {
            this.failureReason = failureReason;
            return this;
        }
        public String getFailureReason() {
            return this.failureReason;
        }

        public GetJobResponseBodyJob setSystemPriority(Integer systemPriority) {
            this.systemPriority = systemPriority;
            return this;
        }
        public Integer getSystemPriority() {
            return this.systemPriority;
        }

        public GetJobResponseBodyJob setExtras(java.util.List<GetJobResponseBodyJobExtras> extras) {
            this.extras = extras;
            return this;
        }
        public java.util.List<GetJobResponseBodyJobExtras> getExtras() {
            return this.extras;
        }

        public GetJobResponseBodyJob setReferenceId(String referenceId) {
            this.referenceId = referenceId;
            return this;
        }
        public String getReferenceId() {
            return this.referenceId;
        }

        public GetJobResponseBodyJob setScenarioId(String scenarioId) {
            this.scenarioId = scenarioId;
            return this;
        }
        public String getScenarioId() {
            return this.scenarioId;
        }

        public GetJobResponseBodyJob setTasks(java.util.List<GetJobResponseBodyJobTasks> tasks) {
            this.tasks = tasks;
            return this;
        }
        public java.util.List<GetJobResponseBodyJobTasks> getTasks() {
            return this.tasks;
        }

        public GetJobResponseBodyJob setStrategyId(String strategyId) {
            this.strategyId = strategyId;
            return this;
        }
        public String getStrategyId() {
            return this.strategyId;
        }

        public GetJobResponseBodyJob setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public GetJobResponseBodyJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

    }

}
