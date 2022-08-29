// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class ListOnlineServicesResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public ListOnlineServicesResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListOnlineServicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOnlineServicesResponseBody self = new ListOnlineServicesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOnlineServicesResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ListOnlineServicesResponseBody setData(ListOnlineServicesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListOnlineServicesResponseBodyData getData() {
        return this.data;
    }

    public ListOnlineServicesResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListOnlineServicesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListOnlineServicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOnlineServicesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListOnlineServicesResponseBodyDataContent extends TeaModel {
        @NameInMap("ApprovalStatus")
        public String approvalStatus;

        @NameInMap("CreatorId")
        public Long creatorId;

        @NameInMap("CreatorName")
        public String creatorName;

        @NameInMap("DeleteStatus")
        public Integer deleteStatus;

        @NameInMap("EndDate")
        public String endDate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("InstanceId")
        public Long instanceId;

        @NameInMap("JobId")
        public Long jobId;

        @NameInMap("JobName")
        public String jobName;

        @NameInMap("JobType")
        public Integer jobType;

        @NameInMap("JobTypeName")
        public String jobTypeName;

        @NameInMap("OnlineServiceStatus")
        public Integer onlineServiceStatus;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("RunStatus")
        public Integer runStatus;

        @NameInMap("StartDate")
        public String startDate;

        @NameInMap("UpdateStatus")
        public Integer updateStatus;

        public static ListOnlineServicesResponseBodyDataContent build(java.util.Map<String, ?> map) throws Exception {
            ListOnlineServicesResponseBodyDataContent self = new ListOnlineServicesResponseBodyDataContent();
            return TeaModel.build(map, self);
        }

        public ListOnlineServicesResponseBodyDataContent setApprovalStatus(String approvalStatus) {
            this.approvalStatus = approvalStatus;
            return this;
        }
        public String getApprovalStatus() {
            return this.approvalStatus;
        }

        public ListOnlineServicesResponseBodyDataContent setCreatorId(Long creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public Long getCreatorId() {
            return this.creatorId;
        }

        public ListOnlineServicesResponseBodyDataContent setCreatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }
        public String getCreatorName() {
            return this.creatorName;
        }

        public ListOnlineServicesResponseBodyDataContent setDeleteStatus(Integer deleteStatus) {
            this.deleteStatus = deleteStatus;
            return this;
        }
        public Integer getDeleteStatus() {
            return this.deleteStatus;
        }

        public ListOnlineServicesResponseBodyDataContent setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public ListOnlineServicesResponseBodyDataContent setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListOnlineServicesResponseBodyDataContent setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public ListOnlineServicesResponseBodyDataContent setJobId(Long jobId) {
            this.jobId = jobId;
            return this;
        }
        public Long getJobId() {
            return this.jobId;
        }

        public ListOnlineServicesResponseBodyDataContent setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public ListOnlineServicesResponseBodyDataContent setJobType(Integer jobType) {
            this.jobType = jobType;
            return this;
        }
        public Integer getJobType() {
            return this.jobType;
        }

        public ListOnlineServicesResponseBodyDataContent setJobTypeName(String jobTypeName) {
            this.jobTypeName = jobTypeName;
            return this;
        }
        public String getJobTypeName() {
            return this.jobTypeName;
        }

        public ListOnlineServicesResponseBodyDataContent setOnlineServiceStatus(Integer onlineServiceStatus) {
            this.onlineServiceStatus = onlineServiceStatus;
            return this;
        }
        public Integer getOnlineServiceStatus() {
            return this.onlineServiceStatus;
        }

        public ListOnlineServicesResponseBodyDataContent setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListOnlineServicesResponseBodyDataContent setRunStatus(Integer runStatus) {
            this.runStatus = runStatus;
            return this;
        }
        public Integer getRunStatus() {
            return this.runStatus;
        }

        public ListOnlineServicesResponseBodyDataContent setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public ListOnlineServicesResponseBodyDataContent setUpdateStatus(Integer updateStatus) {
            this.updateStatus = updateStatus;
            return this;
        }
        public Integer getUpdateStatus() {
            return this.updateStatus;
        }

    }

    public static class ListOnlineServicesResponseBodyData extends TeaModel {
        @NameInMap("Content")
        public java.util.List<ListOnlineServicesResponseBodyDataContent> content;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListOnlineServicesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListOnlineServicesResponseBodyData self = new ListOnlineServicesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListOnlineServicesResponseBodyData setContent(java.util.List<ListOnlineServicesResponseBodyDataContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<ListOnlineServicesResponseBodyDataContent> getContent() {
            return this.content;
        }

        public ListOnlineServicesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListOnlineServicesResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
