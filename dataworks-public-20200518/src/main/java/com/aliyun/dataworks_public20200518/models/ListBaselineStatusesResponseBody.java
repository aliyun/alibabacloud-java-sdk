// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListBaselineStatusesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Data")
    public ListBaselineStatusesResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Success")
    public Boolean success;

    public static ListBaselineStatusesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBaselineStatusesResponseBody self = new ListBaselineStatusesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBaselineStatusesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListBaselineStatusesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListBaselineStatusesResponseBody setData(ListBaselineStatusesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListBaselineStatusesResponseBodyData getData() {
        return this.data;
    }

    public ListBaselineStatusesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListBaselineStatusesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListBaselineStatusesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListBaselineStatusesResponseBodyDataBaselineStatuses extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("FinishTime")
        public Long finishTime;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("EndCast")
        public Long endCast;

        @NameInMap("InGroupId")
        public Integer inGroupId;

        @NameInMap("BaselineId")
        public Long baselineId;

        @NameInMap("BaselineName")
        public String baselineName;

        @NameInMap("Bizdate")
        public Long bizdate;

        @NameInMap("FinishStatus")
        public String finishStatus;

        @NameInMap("Buffer")
        public Long buffer;

        @NameInMap("SlaTime")
        public Long slaTime;

        @NameInMap("ExpTime")
        public Long expTime;

        public static ListBaselineStatusesResponseBodyDataBaselineStatuses build(java.util.Map<String, ?> map) throws Exception {
            ListBaselineStatusesResponseBodyDataBaselineStatuses self = new ListBaselineStatusesResponseBodyDataBaselineStatuses();
            return TeaModel.build(map, self);
        }

        public ListBaselineStatusesResponseBodyDataBaselineStatuses setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListBaselineStatusesResponseBodyDataBaselineStatuses setFinishTime(Long finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public Long getFinishTime() {
            return this.finishTime;
        }

        public ListBaselineStatusesResponseBodyDataBaselineStatuses setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListBaselineStatusesResponseBodyDataBaselineStatuses setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListBaselineStatusesResponseBodyDataBaselineStatuses setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public ListBaselineStatusesResponseBodyDataBaselineStatuses setEndCast(Long endCast) {
            this.endCast = endCast;
            return this;
        }
        public Long getEndCast() {
            return this.endCast;
        }

        public ListBaselineStatusesResponseBodyDataBaselineStatuses setInGroupId(Integer inGroupId) {
            this.inGroupId = inGroupId;
            return this;
        }
        public Integer getInGroupId() {
            return this.inGroupId;
        }

        public ListBaselineStatusesResponseBodyDataBaselineStatuses setBaselineId(Long baselineId) {
            this.baselineId = baselineId;
            return this;
        }
        public Long getBaselineId() {
            return this.baselineId;
        }

        public ListBaselineStatusesResponseBodyDataBaselineStatuses setBaselineName(String baselineName) {
            this.baselineName = baselineName;
            return this;
        }
        public String getBaselineName() {
            return this.baselineName;
        }

        public ListBaselineStatusesResponseBodyDataBaselineStatuses setBizdate(Long bizdate) {
            this.bizdate = bizdate;
            return this;
        }
        public Long getBizdate() {
            return this.bizdate;
        }

        public ListBaselineStatusesResponseBodyDataBaselineStatuses setFinishStatus(String finishStatus) {
            this.finishStatus = finishStatus;
            return this;
        }
        public String getFinishStatus() {
            return this.finishStatus;
        }

        public ListBaselineStatusesResponseBodyDataBaselineStatuses setBuffer(Long buffer) {
            this.buffer = buffer;
            return this;
        }
        public Long getBuffer() {
            return this.buffer;
        }

        public ListBaselineStatusesResponseBodyDataBaselineStatuses setSlaTime(Long slaTime) {
            this.slaTime = slaTime;
            return this;
        }
        public Long getSlaTime() {
            return this.slaTime;
        }

        public ListBaselineStatusesResponseBodyDataBaselineStatuses setExpTime(Long expTime) {
            this.expTime = expTime;
            return this;
        }
        public Long getExpTime() {
            return this.expTime;
        }

    }

    public static class ListBaselineStatusesResponseBodyData extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("BaselineStatuses")
        public java.util.List<ListBaselineStatusesResponseBodyDataBaselineStatuses> baselineStatuses;

        public static ListBaselineStatusesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListBaselineStatusesResponseBodyData self = new ListBaselineStatusesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListBaselineStatusesResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListBaselineStatusesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListBaselineStatusesResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListBaselineStatusesResponseBodyData setBaselineStatuses(java.util.List<ListBaselineStatusesResponseBodyDataBaselineStatuses> baselineStatuses) {
            this.baselineStatuses = baselineStatuses;
            return this;
        }
        public java.util.List<ListBaselineStatusesResponseBodyDataBaselineStatuses> getBaselineStatuses() {
            return this.baselineStatuses;
        }

    }

}
