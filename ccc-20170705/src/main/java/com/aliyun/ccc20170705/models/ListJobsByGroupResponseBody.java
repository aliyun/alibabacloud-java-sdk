// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListJobsByGroupResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Jobs")
    public ListJobsByGroupResponseBodyJobs jobs;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static ListJobsByGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListJobsByGroupResponseBody self = new ListJobsByGroupResponseBody();
        return TeaModel.build(map, self);
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

    public ListJobsByGroupResponseBody setJobs(ListJobsByGroupResponseBodyJobs jobs) {
        this.jobs = jobs;
        return this;
    }
    public ListJobsByGroupResponseBodyJobs getJobs() {
        return this.jobs;
    }

    public ListJobsByGroupResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListJobsByGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListJobsByGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListJobsByGroupResponseBodyJobsListSummary extends TeaModel {
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

        public static ListJobsByGroupResponseBodyJobsListSummary build(java.util.Map<String, ?> map) throws Exception {
            ListJobsByGroupResponseBodyJobsListSummary self = new ListJobsByGroupResponseBodyJobsListSummary();
            return TeaModel.build(map, self);
        }

        public ListJobsByGroupResponseBodyJobsListSummary setSummaryName(String summaryName) {
            this.summaryName = summaryName;
            return this;
        }
        public String getSummaryName() {
            return this.summaryName;
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

        public ListJobsByGroupResponseBodyJobsListSummary setSummaryId(String summaryId) {
            this.summaryId = summaryId;
            return this;
        }
        public String getSummaryId() {
            return this.summaryId;
        }

        public ListJobsByGroupResponseBodyJobsListSummary setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListJobsByGroupResponseBodyJobsListSummary setConversationDetailId(String conversationDetailId) {
            this.conversationDetailId = conversationDetailId;
            return this;
        }
        public String getConversationDetailId() {
            return this.conversationDetailId;
        }

    }

    public static class ListJobsByGroupResponseBodyJobsListContacts extends TeaModel {
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

        public static ListJobsByGroupResponseBodyJobsListContacts build(java.util.Map<String, ?> map) throws Exception {
            ListJobsByGroupResponseBodyJobsListContacts self = new ListJobsByGroupResponseBodyJobsListContacts();
            return TeaModel.build(map, self);
        }

        public ListJobsByGroupResponseBodyJobsListContacts setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public ListJobsByGroupResponseBodyJobsListContacts setContactId(String contactId) {
            this.contactId = contactId;
            return this;
        }
        public String getContactId() {
            return this.contactId;
        }

        public ListJobsByGroupResponseBodyJobsListContacts setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListJobsByGroupResponseBodyJobsListContacts setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListJobsByGroupResponseBodyJobsListContacts setHonorific(String honorific) {
            this.honorific = honorific;
            return this;
        }
        public String getHonorific() {
            return this.honorific;
        }

        public ListJobsByGroupResponseBodyJobsListContacts setContactName(String contactName) {
            this.contactName = contactName;
            return this;
        }
        public String getContactName() {
            return this.contactName;
        }

        public ListJobsByGroupResponseBodyJobsListContacts setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public ListJobsByGroupResponseBodyJobsListContacts setReferenceId(String referenceId) {
            this.referenceId = referenceId;
            return this;
        }
        public String getReferenceId() {
            return this.referenceId;
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

    public static class ListJobsByGroupResponseBodyJobsList extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("CallingNumbers")
        public java.util.List<String> callingNumbers;

        @NameInMap("Summary")
        public java.util.List<ListJobsByGroupResponseBodyJobsListSummary> summary;

        @NameInMap("Contacts")
        public java.util.List<ListJobsByGroupResponseBodyJobsListContacts> contacts;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("FailureReason")
        public String failureReason;

        @NameInMap("SystemPriority")
        public Integer systemPriority;

        @NameInMap("Extras")
        public java.util.List<ListJobsByGroupResponseBodyJobsListExtras> extras;

        @NameInMap("ReferenceId")
        public String referenceId;

        @NameInMap("ScenarioId")
        public String scenarioId;

        @NameInMap("StrategyId")
        public String strategyId;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("JobId")
        public String jobId;

        public static ListJobsByGroupResponseBodyJobsList build(java.util.Map<String, ?> map) throws Exception {
            ListJobsByGroupResponseBodyJobsList self = new ListJobsByGroupResponseBodyJobsList();
            return TeaModel.build(map, self);
        }

        public ListJobsByGroupResponseBodyJobsList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListJobsByGroupResponseBodyJobsList setCallingNumbers(java.util.List<String> callingNumbers) {
            this.callingNumbers = callingNumbers;
            return this;
        }
        public java.util.List<String> getCallingNumbers() {
            return this.callingNumbers;
        }

        public ListJobsByGroupResponseBodyJobsList setSummary(java.util.List<ListJobsByGroupResponseBodyJobsListSummary> summary) {
            this.summary = summary;
            return this;
        }
        public java.util.List<ListJobsByGroupResponseBodyJobsListSummary> getSummary() {
            return this.summary;
        }

        public ListJobsByGroupResponseBodyJobsList setContacts(java.util.List<ListJobsByGroupResponseBodyJobsListContacts> contacts) {
            this.contacts = contacts;
            return this;
        }
        public java.util.List<ListJobsByGroupResponseBodyJobsListContacts> getContacts() {
            return this.contacts;
        }

        public ListJobsByGroupResponseBodyJobsList setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public ListJobsByGroupResponseBodyJobsList setFailureReason(String failureReason) {
            this.failureReason = failureReason;
            return this;
        }
        public String getFailureReason() {
            return this.failureReason;
        }

        public ListJobsByGroupResponseBodyJobsList setSystemPriority(Integer systemPriority) {
            this.systemPriority = systemPriority;
            return this;
        }
        public Integer getSystemPriority() {
            return this.systemPriority;
        }

        public ListJobsByGroupResponseBodyJobsList setExtras(java.util.List<ListJobsByGroupResponseBodyJobsListExtras> extras) {
            this.extras = extras;
            return this;
        }
        public java.util.List<ListJobsByGroupResponseBodyJobsListExtras> getExtras() {
            return this.extras;
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

        public ListJobsByGroupResponseBodyJobsList setStrategyId(String strategyId) {
            this.strategyId = strategyId;
            return this;
        }
        public String getStrategyId() {
            return this.strategyId;
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
