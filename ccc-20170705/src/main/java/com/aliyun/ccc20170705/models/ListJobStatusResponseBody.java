// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListJobStatusResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Jobs")
    public ListJobStatusResponseBodyJobs jobs;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static ListJobStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListJobStatusResponseBody self = new ListJobStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ListJobStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListJobStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListJobStatusResponseBody setJobs(ListJobStatusResponseBodyJobs jobs) {
        this.jobs = jobs;
        return this;
    }
    public ListJobStatusResponseBodyJobs getJobs() {
        return this.jobs;
    }

    public ListJobStatusResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListJobStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListJobStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListJobStatusResponseBodyJobsListContacts extends TeaModel {
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

        public static ListJobStatusResponseBodyJobsListContacts build(java.util.Map<String, ?> map) throws Exception {
            ListJobStatusResponseBodyJobsListContacts self = new ListJobStatusResponseBodyJobsListContacts();
            return TeaModel.build(map, self);
        }

        public ListJobStatusResponseBodyJobsListContacts setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public ListJobStatusResponseBodyJobsListContacts setContactId(String contactId) {
            this.contactId = contactId;
            return this;
        }
        public String getContactId() {
            return this.contactId;
        }

        public ListJobStatusResponseBodyJobsListContacts setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListJobStatusResponseBodyJobsListContacts setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListJobStatusResponseBodyJobsListContacts setHonorific(String honorific) {
            this.honorific = honorific;
            return this;
        }
        public String getHonorific() {
            return this.honorific;
        }

        public ListJobStatusResponseBodyJobsListContacts setContactName(String contactName) {
            this.contactName = contactName;
            return this;
        }
        public String getContactName() {
            return this.contactName;
        }

        public ListJobStatusResponseBodyJobsListContacts setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public ListJobStatusResponseBodyJobsListContacts setReferenceId(String referenceId) {
            this.referenceId = referenceId;
            return this;
        }
        public String getReferenceId() {
            return this.referenceId;
        }

    }

    public static class ListJobStatusResponseBodyJobsListSummary extends TeaModel {
        @NameInMap("SummaryName")
        public String summaryName;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("Category")
        public String category;

        @NameInMap("Content")
        public String content;

        @NameInMap("SummaryId")
        public String summaryId;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("ConversationDetailId")
        public String conversationDetailId;

        public static ListJobStatusResponseBodyJobsListSummary build(java.util.Map<String, ?> map) throws Exception {
            ListJobStatusResponseBodyJobsListSummary self = new ListJobStatusResponseBodyJobsListSummary();
            return TeaModel.build(map, self);
        }

        public ListJobStatusResponseBodyJobsListSummary setSummaryName(String summaryName) {
            this.summaryName = summaryName;
            return this;
        }
        public String getSummaryName() {
            return this.summaryName;
        }

        public ListJobStatusResponseBodyJobsListSummary setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ListJobStatusResponseBodyJobsListSummary setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListJobStatusResponseBodyJobsListSummary setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ListJobStatusResponseBodyJobsListSummary setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListJobStatusResponseBodyJobsListSummary setSummaryId(String summaryId) {
            this.summaryId = summaryId;
            return this;
        }
        public String getSummaryId() {
            return this.summaryId;
        }

        public ListJobStatusResponseBodyJobsListSummary setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListJobStatusResponseBodyJobsListSummary setConversationDetailId(String conversationDetailId) {
            this.conversationDetailId = conversationDetailId;
            return this;
        }
        public String getConversationDetailId() {
            return this.conversationDetailId;
        }

    }

    public static class ListJobStatusResponseBodyJobsListExtras extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListJobStatusResponseBodyJobsListExtras build(java.util.Map<String, ?> map) throws Exception {
            ListJobStatusResponseBodyJobsListExtras self = new ListJobStatusResponseBodyJobsListExtras();
            return TeaModel.build(map, self);
        }

        public ListJobStatusResponseBodyJobsListExtras setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListJobStatusResponseBodyJobsListExtras setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListJobStatusResponseBodyJobsListTasksContact extends TeaModel {
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

        public static ListJobStatusResponseBodyJobsListTasksContact build(java.util.Map<String, ?> map) throws Exception {
            ListJobStatusResponseBodyJobsListTasksContact self = new ListJobStatusResponseBodyJobsListTasksContact();
            return TeaModel.build(map, self);
        }

        public ListJobStatusResponseBodyJobsListTasksContact setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public ListJobStatusResponseBodyJobsListTasksContact setContactId(String contactId) {
            this.contactId = contactId;
            return this;
        }
        public String getContactId() {
            return this.contactId;
        }

        public ListJobStatusResponseBodyJobsListTasksContact setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListJobStatusResponseBodyJobsListTasksContact setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListJobStatusResponseBodyJobsListTasksContact setHonorific(String honorific) {
            this.honorific = honorific;
            return this;
        }
        public String getHonorific() {
            return this.honorific;
        }

        public ListJobStatusResponseBodyJobsListTasksContact setContactName(String contactName) {
            this.contactName = contactName;
            return this;
        }
        public String getContactName() {
            return this.contactName;
        }

        public ListJobStatusResponseBodyJobsListTasksContact setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public ListJobStatusResponseBodyJobsListTasksContact setReferenceId(String referenceId) {
            this.referenceId = referenceId;
            return this;
        }
        public String getReferenceId() {
            return this.referenceId;
        }

    }

    public static class ListJobStatusResponseBodyJobsListTasks extends TeaModel {
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
        public ListJobStatusResponseBodyJobsListTasksContact contact;

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

        public static ListJobStatusResponseBodyJobsListTasks build(java.util.Map<String, ?> map) throws Exception {
            ListJobStatusResponseBodyJobsListTasks self = new ListJobStatusResponseBodyJobsListTasks();
            return TeaModel.build(map, self);
        }

        public ListJobStatusResponseBodyJobsListTasks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListJobStatusResponseBodyJobsListTasks setPlanedTime(Long planedTime) {
            this.planedTime = planedTime;
            return this;
        }
        public Long getPlanedTime() {
            return this.planedTime;
        }

        public ListJobStatusResponseBodyJobsListTasks setChatbotId(String chatbotId) {
            this.chatbotId = chatbotId;
            return this;
        }
        public String getChatbotId() {
            return this.chatbotId;
        }

        public ListJobStatusResponseBodyJobsListTasks setActualTime(Long actualTime) {
            this.actualTime = actualTime;
            return this;
        }
        public Long getActualTime() {
            return this.actualTime;
        }

        public ListJobStatusResponseBodyJobsListTasks setCalledNumber(String calledNumber) {
            this.calledNumber = calledNumber;
            return this;
        }
        public String getCalledNumber() {
            return this.calledNumber;
        }

        public ListJobStatusResponseBodyJobsListTasks setScenarioId(String scenarioId) {
            this.scenarioId = scenarioId;
            return this;
        }
        public String getScenarioId() {
            return this.scenarioId;
        }

        public ListJobStatusResponseBodyJobsListTasks setContact(ListJobStatusResponseBodyJobsListTasksContact contact) {
            this.contact = contact;
            return this;
        }
        public ListJobStatusResponseBodyJobsListTasksContact getContact() {
            return this.contact;
        }

        public ListJobStatusResponseBodyJobsListTasks setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListJobStatusResponseBodyJobsListTasks setCallId(String callId) {
            this.callId = callId;
            return this;
        }
        public String getCallId() {
            return this.callId;
        }

        public ListJobStatusResponseBodyJobsListTasks setCallingNumber(String callingNumber) {
            this.callingNumber = callingNumber;
            return this;
        }
        public String getCallingNumber() {
            return this.callingNumber;
        }

        public ListJobStatusResponseBodyJobsListTasks setBrief(String brief) {
            this.brief = brief;
            return this;
        }
        public String getBrief() {
            return this.brief;
        }

        public ListJobStatusResponseBodyJobsListTasks setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public ListJobStatusResponseBodyJobsListTasks setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

    public static class ListJobStatusResponseBodyJobsList extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("CallingNumbers")
        public java.util.List<String> callingNumbers;

        @NameInMap("Contacts")
        public java.util.List<ListJobStatusResponseBodyJobsListContacts> contacts;

        @NameInMap("Summary")
        public java.util.List<ListJobStatusResponseBodyJobsListSummary> summary;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("FailureReason")
        public String failureReason;

        @NameInMap("Extras")
        public java.util.List<ListJobStatusResponseBodyJobsListExtras> extras;

        @NameInMap("ReferenceId")
        public String referenceId;

        @NameInMap("ScenarioId")
        public String scenarioId;

        @NameInMap("Tasks")
        public java.util.List<ListJobStatusResponseBodyJobsListTasks> tasks;

        @NameInMap("StrategyId")
        public String strategyId;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("JobId")
        public String jobId;

        public static ListJobStatusResponseBodyJobsList build(java.util.Map<String, ?> map) throws Exception {
            ListJobStatusResponseBodyJobsList self = new ListJobStatusResponseBodyJobsList();
            return TeaModel.build(map, self);
        }

        public ListJobStatusResponseBodyJobsList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListJobStatusResponseBodyJobsList setCallingNumbers(java.util.List<String> callingNumbers) {
            this.callingNumbers = callingNumbers;
            return this;
        }
        public java.util.List<String> getCallingNumbers() {
            return this.callingNumbers;
        }

        public ListJobStatusResponseBodyJobsList setContacts(java.util.List<ListJobStatusResponseBodyJobsListContacts> contacts) {
            this.contacts = contacts;
            return this;
        }
        public java.util.List<ListJobStatusResponseBodyJobsListContacts> getContacts() {
            return this.contacts;
        }

        public ListJobStatusResponseBodyJobsList setSummary(java.util.List<ListJobStatusResponseBodyJobsListSummary> summary) {
            this.summary = summary;
            return this;
        }
        public java.util.List<ListJobStatusResponseBodyJobsListSummary> getSummary() {
            return this.summary;
        }

        public ListJobStatusResponseBodyJobsList setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public ListJobStatusResponseBodyJobsList setFailureReason(String failureReason) {
            this.failureReason = failureReason;
            return this;
        }
        public String getFailureReason() {
            return this.failureReason;
        }

        public ListJobStatusResponseBodyJobsList setExtras(java.util.List<ListJobStatusResponseBodyJobsListExtras> extras) {
            this.extras = extras;
            return this;
        }
        public java.util.List<ListJobStatusResponseBodyJobsListExtras> getExtras() {
            return this.extras;
        }

        public ListJobStatusResponseBodyJobsList setReferenceId(String referenceId) {
            this.referenceId = referenceId;
            return this;
        }
        public String getReferenceId() {
            return this.referenceId;
        }

        public ListJobStatusResponseBodyJobsList setScenarioId(String scenarioId) {
            this.scenarioId = scenarioId;
            return this;
        }
        public String getScenarioId() {
            return this.scenarioId;
        }

        public ListJobStatusResponseBodyJobsList setTasks(java.util.List<ListJobStatusResponseBodyJobsListTasks> tasks) {
            this.tasks = tasks;
            return this;
        }
        public java.util.List<ListJobStatusResponseBodyJobsListTasks> getTasks() {
            return this.tasks;
        }

        public ListJobStatusResponseBodyJobsList setStrategyId(String strategyId) {
            this.strategyId = strategyId;
            return this;
        }
        public String getStrategyId() {
            return this.strategyId;
        }

        public ListJobStatusResponseBodyJobsList setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ListJobStatusResponseBodyJobsList setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

    }

    public static class ListJobStatusResponseBodyJobs extends TeaModel {
        @NameInMap("List")
        public java.util.List<ListJobStatusResponseBodyJobsList> list;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListJobStatusResponseBodyJobs build(java.util.Map<String, ?> map) throws Exception {
            ListJobStatusResponseBodyJobs self = new ListJobStatusResponseBodyJobs();
            return TeaModel.build(map, self);
        }

        public ListJobStatusResponseBodyJobs setList(java.util.List<ListJobStatusResponseBodyJobsList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListJobStatusResponseBodyJobsList> getList() {
            return this.list;
        }

        public ListJobStatusResponseBodyJobs setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListJobStatusResponseBodyJobs setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListJobStatusResponseBodyJobs setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
