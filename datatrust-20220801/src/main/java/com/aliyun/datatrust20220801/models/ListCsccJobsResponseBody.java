// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class ListCsccJobsResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public ListCsccJobsResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListCsccJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCsccJobsResponseBody self = new ListCsccJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCsccJobsResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ListCsccJobsResponseBody setData(ListCsccJobsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListCsccJobsResponseBodyData getData() {
        return this.data;
    }

    public ListCsccJobsResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListCsccJobsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCsccJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCsccJobsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListCsccJobsResponseBodyDataContent extends TeaModel {
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

        @NameInMap("JobId")
        public Long jobId;

        @NameInMap("JobName")
        public String jobName;

        @NameInMap("JobType")
        public Integer jobType;

        @NameInMap("JobTypeName")
        public String jobTypeName;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("RunStatus")
        public Integer runStatus;

        @NameInMap("StartDate")
        public String startDate;

        @NameInMap("UpdateStatus")
        public Integer updateStatus;

        public static ListCsccJobsResponseBodyDataContent build(java.util.Map<String, ?> map) throws Exception {
            ListCsccJobsResponseBodyDataContent self = new ListCsccJobsResponseBodyDataContent();
            return TeaModel.build(map, self);
        }

        public ListCsccJobsResponseBodyDataContent setApprovalStatus(String approvalStatus) {
            this.approvalStatus = approvalStatus;
            return this;
        }
        public String getApprovalStatus() {
            return this.approvalStatus;
        }

        public ListCsccJobsResponseBodyDataContent setCreatorId(Long creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public Long getCreatorId() {
            return this.creatorId;
        }

        public ListCsccJobsResponseBodyDataContent setCreatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }
        public String getCreatorName() {
            return this.creatorName;
        }

        public ListCsccJobsResponseBodyDataContent setDeleteStatus(Integer deleteStatus) {
            this.deleteStatus = deleteStatus;
            return this;
        }
        public Integer getDeleteStatus() {
            return this.deleteStatus;
        }

        public ListCsccJobsResponseBodyDataContent setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public ListCsccJobsResponseBodyDataContent setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListCsccJobsResponseBodyDataContent setJobId(Long jobId) {
            this.jobId = jobId;
            return this;
        }
        public Long getJobId() {
            return this.jobId;
        }

        public ListCsccJobsResponseBodyDataContent setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public ListCsccJobsResponseBodyDataContent setJobType(Integer jobType) {
            this.jobType = jobType;
            return this;
        }
        public Integer getJobType() {
            return this.jobType;
        }

        public ListCsccJobsResponseBodyDataContent setJobTypeName(String jobTypeName) {
            this.jobTypeName = jobTypeName;
            return this;
        }
        public String getJobTypeName() {
            return this.jobTypeName;
        }

        public ListCsccJobsResponseBodyDataContent setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListCsccJobsResponseBodyDataContent setRunStatus(Integer runStatus) {
            this.runStatus = runStatus;
            return this;
        }
        public Integer getRunStatus() {
            return this.runStatus;
        }

        public ListCsccJobsResponseBodyDataContent setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public ListCsccJobsResponseBodyDataContent setUpdateStatus(Integer updateStatus) {
            this.updateStatus = updateStatus;
            return this;
        }
        public Integer getUpdateStatus() {
            return this.updateStatus;
        }

    }

    public static class ListCsccJobsResponseBodyData extends TeaModel {
        @NameInMap("Content")
        public java.util.List<ListCsccJobsResponseBodyDataContent> content;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListCsccJobsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCsccJobsResponseBodyData self = new ListCsccJobsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCsccJobsResponseBodyData setContent(java.util.List<ListCsccJobsResponseBodyDataContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<ListCsccJobsResponseBodyDataContent> getContent() {
            return this.content;
        }

        public ListCsccJobsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListCsccJobsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
