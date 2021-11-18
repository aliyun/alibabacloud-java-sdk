// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListJobsByGroupResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Jobs")
    public ListJobsByGroupResponseBodyJobs jobs;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListJobsByGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListJobsByGroupResponseBody self = new ListJobsByGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ListJobsByGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListJobsByGroupResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListJobsByGroupResponseBody setJobs(ListJobsByGroupResponseBodyJobs jobs) {
        this.jobs = jobs;
        return this;
    }
    public ListJobsByGroupResponseBodyJobs getJobs() {
        return this.jobs;
    }

    public ListJobsByGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListJobsByGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListJobsByGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListJobsByGroupResponseBodyJobsListContacts extends TeaModel {
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

        public static ListJobsByGroupResponseBodyJobsListContacts build(java.util.Map<String, ?> map) throws Exception {
            ListJobsByGroupResponseBodyJobsListContacts self = new ListJobsByGroupResponseBodyJobsListContacts();
            return TeaModel.build(map, self);
        }

        public ListJobsByGroupResponseBodyJobsListContacts setContactId(String contactId) {
            this.contactId = contactId;
            return this;
        }
        public String getContactId() {
            return this.contactId;
        }

        public ListJobsByGroupResponseBodyJobsListContacts setContactName(String contactName) {
            this.contactName = contactName;
            return this;
        }
        public String getContactName() {
            return this.contactName;
        }

        public ListJobsByGroupResponseBodyJobsListContacts setHonorific(String honorific) {
            this.honorific = honorific;
            return this;
        }
        public String getHonorific() {
            return this.honorific;
        }

        public ListJobsByGroupResponseBodyJobsListContacts setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListJobsByGroupResponseBodyJobsListContacts setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public ListJobsByGroupResponseBodyJobsListContacts setReferenceId(String referenceId) {
            this.referenceId = referenceId;
            return this;
        }
        public String getReferenceId() {
            return this.referenceId;
        }

        public ListJobsByGroupResponseBodyJobsListContacts setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public ListJobsByGroupResponseBodyJobsListContacts setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

    public static class ListJobsByGroupResponseBodyJobsListExtras extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListJobsByGroupResponseBodyJobsListExtras build(java.util.Map<String, ?> map) throws Exception {
            ListJobsByGroupResponseBodyJobsListExtras self = new ListJobsByGroupResponseBodyJobsListExtras();
            return TeaModel.build(map, self);
        }

        public ListJobsByGroupResponseBodyJobsListExtras setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListJobsByGroupResponseBodyJobsListExtras setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListJobsByGroupResponseBodyJobsListSummary extends TeaModel {
        @NameInMap("Category")
        public String category;

        @NameInMap("Content")
        public String content;

        @NameInMap("ConversationDetailId")
        public String conversationDetailId;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("SummaryId")
        public String summaryId;

        @NameInMap("SummaryName")
        public String summaryName;

        @NameInMap("TaskId")
        public String taskId;

        public static ListJobsByGroupResponseBodyJobsListSummary build(java.util.Map<String, ?> map) throws Exception {
            ListJobsByGroupResponseBodyJobsListSummary self = new ListJobsByGroupResponseBodyJobsListSummary();
            return TeaModel.build(map, self);
        }

        public ListJobsByGroupResponseBodyJobsListSummary setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ListJobsByGroupResponseBodyJobsListSummary setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListJobsByGroupResponseBodyJobsListSummary setConversationDetailId(String conversationDetailId) {
            this.conversationDetailId = conversationDetailId;
            return this;
        }
        public String getConversationDetailId() {
            return this.conversationDetailId;
        }

        public ListJobsByGroupResponseBodyJobsListSummary setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ListJobsByGroupResponseBodyJobsListSummary setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListJobsByGroupResponseBodyJobsListSummary setSummaryId(String summaryId) {
            this.summaryId = summaryId;
            return this;
        }
        public String getSummaryId() {
            return this.summaryId;
        }

        public ListJobsByGroupResponseBodyJobsListSummary setSummaryName(String summaryName) {
            this.summaryName = summaryName;
            return this;
        }
        public String getSummaryName() {
            return this.summaryName;
        }

        public ListJobsByGroupResponseBodyJobsListSummary setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

    public static class ListJobsByGroupResponseBodyJobsList extends TeaModel {
        @NameInMap("CallingNumbers")
        public java.util.List<String> callingNumbers;

        @NameInMap("Contacts")
        public java.util.List<ListJobsByGroupResponseBodyJobsListContacts> contacts;

        @NameInMap("Extras")
        public java.util.List<ListJobsByGroupResponseBodyJobsListExtras> extras;

        @NameInMap("FailureReason")
        public String failureReason;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("ReferenceId")
        public String referenceId;

        @NameInMap("ScenarioId")
        public String scenarioId;

        @NameInMap("Status")
        public String status;

        @NameInMap("StrategyId")
        public String strategyId;

        @NameInMap("Summary")
        public java.util.List<ListJobsByGroupResponseBodyJobsListSummary> summary;

        @NameInMap("SystemPriority")
        public Integer systemPriority;

        public static ListJobsByGroupResponseBodyJobsList build(java.util.Map<String, ?> map) throws Exception {
            ListJobsByGroupResponseBodyJobsList self = new ListJobsByGroupResponseBodyJobsList();
            return TeaModel.build(map, self);
        }

        public ListJobsByGroupResponseBodyJobsList setCallingNumbers(java.util.List<String> callingNumbers) {
            this.callingNumbers = callingNumbers;
            return this;
        }
        public java.util.List<String> getCallingNumbers() {
            return this.callingNumbers;
        }

        public ListJobsByGroupResponseBodyJobsList setContacts(java.util.List<ListJobsByGroupResponseBodyJobsListContacts> contacts) {
            this.contacts = contacts;
            return this;
        }
        public java.util.List<ListJobsByGroupResponseBodyJobsListContacts> getContacts() {
            return this.contacts;
        }

        public ListJobsByGroupResponseBodyJobsList setExtras(java.util.List<ListJobsByGroupResponseBodyJobsListExtras> extras) {
            this.extras = extras;
            return this;
        }
        public java.util.List<ListJobsByGroupResponseBodyJobsListExtras> getExtras() {
            return this.extras;
        }

        public ListJobsByGroupResponseBodyJobsList setFailureReason(String failureReason) {
            this.failureReason = failureReason;
            return this;
        }
        public String getFailureReason() {
            return this.failureReason;
        }

        public ListJobsByGroupResponseBodyJobsList setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ListJobsByGroupResponseBodyJobsList setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListJobsByGroupResponseBodyJobsList setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public ListJobsByGroupResponseBodyJobsList setReferenceId(String referenceId) {
            this.referenceId = referenceId;
            return this;
        }
        public String getReferenceId() {
            return this.referenceId;
        }

        public ListJobsByGroupResponseBodyJobsList setScenarioId(String scenarioId) {
            this.scenarioId = scenarioId;
            return this;
        }
        public String getScenarioId() {
            return this.scenarioId;
        }

        public ListJobsByGroupResponseBodyJobsList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListJobsByGroupResponseBodyJobsList setStrategyId(String strategyId) {
            this.strategyId = strategyId;
            return this;
        }
        public String getStrategyId() {
            return this.strategyId;
        }

        public ListJobsByGroupResponseBodyJobsList setSummary(java.util.List<ListJobsByGroupResponseBodyJobsListSummary> summary) {
            this.summary = summary;
            return this;
        }
        public java.util.List<ListJobsByGroupResponseBodyJobsListSummary> getSummary() {
            return this.summary;
        }

        public ListJobsByGroupResponseBodyJobsList setSystemPriority(Integer systemPriority) {
            this.systemPriority = systemPriority;
            return this;
        }
        public Integer getSystemPriority() {
            return this.systemPriority;
        }

    }

    public static class ListJobsByGroupResponseBodyJobs extends TeaModel {
        @NameInMap("List")
        public java.util.List<ListJobsByGroupResponseBodyJobsList> list;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListJobsByGroupResponseBodyJobs build(java.util.Map<String, ?> map) throws Exception {
            ListJobsByGroupResponseBodyJobs self = new ListJobsByGroupResponseBodyJobs();
            return TeaModel.build(map, self);
        }

        public ListJobsByGroupResponseBodyJobs setList(java.util.List<ListJobsByGroupResponseBodyJobsList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListJobsByGroupResponseBodyJobsList> getList() {
            return this.list;
        }

        public ListJobsByGroupResponseBodyJobs setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListJobsByGroupResponseBodyJobs setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListJobsByGroupResponseBodyJobs setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
