// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetJobListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Jobs")
    public GetJobListResponseBodyJobs jobs;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetJobListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetJobListResponseBody self = new GetJobListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetJobListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetJobListResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetJobListResponseBody setJobs(GetJobListResponseBodyJobs jobs) {
        this.jobs = jobs;
        return this;
    }
    public GetJobListResponseBodyJobs getJobs() {
        return this.jobs;
    }

    public GetJobListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetJobListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetJobListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetJobListResponseBodyJobsListContacts extends TeaModel {
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

        public static GetJobListResponseBodyJobsListContacts build(java.util.Map<String, ?> map) throws Exception {
            GetJobListResponseBodyJobsListContacts self = new GetJobListResponseBodyJobsListContacts();
            return TeaModel.build(map, self);
        }

        public GetJobListResponseBodyJobsListContacts setContactId(String contactId) {
            this.contactId = contactId;
            return this;
        }
        public String getContactId() {
            return this.contactId;
        }

        public GetJobListResponseBodyJobsListContacts setContactName(String contactName) {
            this.contactName = contactName;
            return this;
        }
        public String getContactName() {
            return this.contactName;
        }

        public GetJobListResponseBodyJobsListContacts setHonorific(String honorific) {
            this.honorific = honorific;
            return this;
        }
        public String getHonorific() {
            return this.honorific;
        }

        public GetJobListResponseBodyJobsListContacts setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetJobListResponseBodyJobsListContacts setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public GetJobListResponseBodyJobsListContacts setReferenceId(String referenceId) {
            this.referenceId = referenceId;
            return this;
        }
        public String getReferenceId() {
            return this.referenceId;
        }

        public GetJobListResponseBodyJobsListContacts setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public GetJobListResponseBodyJobsListContacts setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

    public static class GetJobListResponseBodyJobsListExtras extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static GetJobListResponseBodyJobsListExtras build(java.util.Map<String, ?> map) throws Exception {
            GetJobListResponseBodyJobsListExtras self = new GetJobListResponseBodyJobsListExtras();
            return TeaModel.build(map, self);
        }

        public GetJobListResponseBodyJobsListExtras setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetJobListResponseBodyJobsListExtras setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetJobListResponseBodyJobsListSummary extends TeaModel {
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

        public static GetJobListResponseBodyJobsListSummary build(java.util.Map<String, ?> map) throws Exception {
            GetJobListResponseBodyJobsListSummary self = new GetJobListResponseBodyJobsListSummary();
            return TeaModel.build(map, self);
        }

        public GetJobListResponseBodyJobsListSummary setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public GetJobListResponseBodyJobsListSummary setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetJobListResponseBodyJobsListSummary setConversationDetailId(String conversationDetailId) {
            this.conversationDetailId = conversationDetailId;
            return this;
        }
        public String getConversationDetailId() {
            return this.conversationDetailId;
        }

        public GetJobListResponseBodyJobsListSummary setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public GetJobListResponseBodyJobsListSummary setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetJobListResponseBodyJobsListSummary setSummaryId(String summaryId) {
            this.summaryId = summaryId;
            return this;
        }
        public String getSummaryId() {
            return this.summaryId;
        }

        public GetJobListResponseBodyJobsListSummary setSummaryName(String summaryName) {
            this.summaryName = summaryName;
            return this;
        }
        public String getSummaryName() {
            return this.summaryName;
        }

        public GetJobListResponseBodyJobsListSummary setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

    public static class GetJobListResponseBodyJobsList extends TeaModel {
        @NameInMap("CallingNumbers")
        public java.util.List<String> callingNumbers;

        @NameInMap("Contacts")
        public java.util.List<GetJobListResponseBodyJobsListContacts> contacts;

        @NameInMap("Extras")
        public java.util.List<GetJobListResponseBodyJobsListExtras> extras;

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
        public java.util.List<GetJobListResponseBodyJobsListSummary> summary;

        @NameInMap("SystemPriority")
        public Integer systemPriority;

        public static GetJobListResponseBodyJobsList build(java.util.Map<String, ?> map) throws Exception {
            GetJobListResponseBodyJobsList self = new GetJobListResponseBodyJobsList();
            return TeaModel.build(map, self);
        }

        public GetJobListResponseBodyJobsList setCallingNumbers(java.util.List<String> callingNumbers) {
            this.callingNumbers = callingNumbers;
            return this;
        }
        public java.util.List<String> getCallingNumbers() {
            return this.callingNumbers;
        }

        public GetJobListResponseBodyJobsList setContacts(java.util.List<GetJobListResponseBodyJobsListContacts> contacts) {
            this.contacts = contacts;
            return this;
        }
        public java.util.List<GetJobListResponseBodyJobsListContacts> getContacts() {
            return this.contacts;
        }

        public GetJobListResponseBodyJobsList setExtras(java.util.List<GetJobListResponseBodyJobsListExtras> extras) {
            this.extras = extras;
            return this;
        }
        public java.util.List<GetJobListResponseBodyJobsListExtras> getExtras() {
            return this.extras;
        }

        public GetJobListResponseBodyJobsList setFailureReason(String failureReason) {
            this.failureReason = failureReason;
            return this;
        }
        public String getFailureReason() {
            return this.failureReason;
        }

        public GetJobListResponseBodyJobsList setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public GetJobListResponseBodyJobsList setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetJobListResponseBodyJobsList setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public GetJobListResponseBodyJobsList setReferenceId(String referenceId) {
            this.referenceId = referenceId;
            return this;
        }
        public String getReferenceId() {
            return this.referenceId;
        }

        public GetJobListResponseBodyJobsList setScenarioId(String scenarioId) {
            this.scenarioId = scenarioId;
            return this;
        }
        public String getScenarioId() {
            return this.scenarioId;
        }

        public GetJobListResponseBodyJobsList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetJobListResponseBodyJobsList setStrategyId(String strategyId) {
            this.strategyId = strategyId;
            return this;
        }
        public String getStrategyId() {
            return this.strategyId;
        }

        public GetJobListResponseBodyJobsList setSummary(java.util.List<GetJobListResponseBodyJobsListSummary> summary) {
            this.summary = summary;
            return this;
        }
        public java.util.List<GetJobListResponseBodyJobsListSummary> getSummary() {
            return this.summary;
        }

        public GetJobListResponseBodyJobsList setSystemPriority(Integer systemPriority) {
            this.systemPriority = systemPriority;
            return this;
        }
        public Integer getSystemPriority() {
            return this.systemPriority;
        }

    }

    public static class GetJobListResponseBodyJobs extends TeaModel {
        @NameInMap("List")
        public java.util.List<GetJobListResponseBodyJobsList> list;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static GetJobListResponseBodyJobs build(java.util.Map<String, ?> map) throws Exception {
            GetJobListResponseBodyJobs self = new GetJobListResponseBodyJobs();
            return TeaModel.build(map, self);
        }

        public GetJobListResponseBodyJobs setList(java.util.List<GetJobListResponseBodyJobsList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<GetJobListResponseBodyJobsList> getList() {
            return this.list;
        }

        public GetJobListResponseBodyJobs setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public GetJobListResponseBodyJobs setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetJobListResponseBodyJobs setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
