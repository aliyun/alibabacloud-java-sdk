// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListBaselineStatusesResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public ListBaselineStatusesResponseBodyData data;

    /**
     * <p>The error code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Invalid.Tenant.ConnectionNotExists</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>The specified parameters are invalid.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The ID of the request. You can use the ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>0000-ABCD-EFG****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListBaselineStatusesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBaselineStatusesResponseBody self = new ListBaselineStatusesResponseBody();
        return TeaModel.build(map, self);
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

    public ListBaselineStatusesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListBaselineStatusesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListBaselineStatusesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListBaselineStatusesResponseBodyDataBaselineStatuses extends TeaModel {
        /**
         * <p>The baseline ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("BaselineId")
        public Long baselineId;

        /**
         * <p>The name of the baseline.</p>
         * 
         * <strong>example:</strong>
         * <p>Baseline name</p>
         */
        @NameInMap("BaselineName")
        public String baselineName;

        /**
         * <p>The type of the baseline, including DAILY and HOURLY. Separate multiple types with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>DAILY,HOURLY</p>
         */
        @NameInMap("BaselineType")
        public String baselineType;

        /**
         * <p>The data timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1553443200000</p>
         */
        @NameInMap("Bizdate")
        public Long bizdate;

        /**
         * <p>The margin of the baseline instance. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1800</p>
         */
        @NameInMap("Buffer")
        public Long buffer;

        /**
         * <p>The timestamp of the predicted time when the baseline instance finished running.</p>
         * 
         * <strong>example:</strong>
         * <p>1553531400000</p>
         */
        @NameInMap("EndCast")
        public Long endCast;

        /**
         * <p>The timestamp of the alerting time of the baseline instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1553531400000</p>
         */
        @NameInMap("ExpTime")
        public Long expTime;

        /**
         * <p>The status of the baseline instance. Valid values: UNFINISH and FINISH.</p>
         * 
         * <strong>example:</strong>
         * <p>UNFINISH</p>
         */
        @NameInMap("FinishStatus")
        public String finishStatus;

        /**
         * <p>The timestamp of the actual time when the baseline instance finished running. This parameter is returned if the value of the FinishStatus parameter is FINISH.</p>
         * 
         * <strong>example:</strong>
         * <p>1553531400000</p>
         */
        @NameInMap("FinishTime")
        public Long finishTime;

        /**
         * <p>The ID of the cycle of the baseline instance. Valid values of the ID of an hour-level cycle: [1,24]. The ID of a day-level cycle is 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("InGroupId")
        public Integer inGroupId;

        /**
         * <p>The ID of the Alibaba Cloud account used by the baseline owner. Multiple IDs are separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>9527952795****</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The priority of the baseline. Valid values: {1,3,5,7,8}.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The ID of the workspace to which the baseline belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The timestamp of the actual time when the baseline instance finished running.</p>
         * 
         * <strong>example:</strong>
         * <p>1553531400000</p>
         */
        @NameInMap("SlaTime")
        public Long slaTime;

        /**
         * <p>The status of the baseline. Valid values: ERROR, SAFE, DANGEROUS, and OVER. The value ERROR indicates that no nodes are associated with the baseline, or all nodes associated with the baseline are suspended. The value SAFE indicates that nodes are run before the alert duration begins. The value DANGEROUS indicates that nodes are still running after the alert duration ends but the committed completion time does not arrive. The value OVER indicates that nodes are still running after the committed completion time.</p>
         * 
         * <strong>example:</strong>
         * <p>SAFE</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListBaselineStatusesResponseBodyDataBaselineStatuses build(java.util.Map<String, ?> map) throws Exception {
            ListBaselineStatusesResponseBodyDataBaselineStatuses self = new ListBaselineStatusesResponseBodyDataBaselineStatuses();
            return TeaModel.build(map, self);
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

        public ListBaselineStatusesResponseBodyDataBaselineStatuses setBaselineType(String baselineType) {
            this.baselineType = baselineType;
            return this;
        }
        public String getBaselineType() {
            return this.baselineType;
        }

        public ListBaselineStatusesResponseBodyDataBaselineStatuses setBizdate(Long bizdate) {
            this.bizdate = bizdate;
            return this;
        }
        public Long getBizdate() {
            return this.bizdate;
        }

        public ListBaselineStatusesResponseBodyDataBaselineStatuses setBuffer(Long buffer) {
            this.buffer = buffer;
            return this;
        }
        public Long getBuffer() {
            return this.buffer;
        }

        public ListBaselineStatusesResponseBodyDataBaselineStatuses setEndCast(Long endCast) {
            this.endCast = endCast;
            return this;
        }
        public Long getEndCast() {
            return this.endCast;
        }

        public ListBaselineStatusesResponseBodyDataBaselineStatuses setExpTime(Long expTime) {
            this.expTime = expTime;
            return this;
        }
        public Long getExpTime() {
            return this.expTime;
        }

        public ListBaselineStatusesResponseBodyDataBaselineStatuses setFinishStatus(String finishStatus) {
            this.finishStatus = finishStatus;
            return this;
        }
        public String getFinishStatus() {
            return this.finishStatus;
        }

        public ListBaselineStatusesResponseBodyDataBaselineStatuses setFinishTime(Long finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public Long getFinishTime() {
            return this.finishTime;
        }

        public ListBaselineStatusesResponseBodyDataBaselineStatuses setInGroupId(Integer inGroupId) {
            this.inGroupId = inGroupId;
            return this;
        }
        public Integer getInGroupId() {
            return this.inGroupId;
        }

        public ListBaselineStatusesResponseBodyDataBaselineStatuses setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListBaselineStatusesResponseBodyDataBaselineStatuses setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public ListBaselineStatusesResponseBodyDataBaselineStatuses setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListBaselineStatusesResponseBodyDataBaselineStatuses setSlaTime(Long slaTime) {
            this.slaTime = slaTime;
            return this;
        }
        public Long getSlaTime() {
            return this.slaTime;
        }

        public ListBaselineStatusesResponseBodyDataBaselineStatuses setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListBaselineStatusesResponseBodyData extends TeaModel {
        /**
         * <p>The list of baseline instances.</p>
         */
        @NameInMap("BaselineStatuses")
        public java.util.List<ListBaselineStatusesResponseBodyDataBaselineStatuses> baselineStatuses;

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of baseline instances.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListBaselineStatusesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListBaselineStatusesResponseBodyData self = new ListBaselineStatusesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListBaselineStatusesResponseBodyData setBaselineStatuses(java.util.List<ListBaselineStatusesResponseBodyDataBaselineStatuses> baselineStatuses) {
            this.baselineStatuses = baselineStatuses;
            return this;
        }
        public java.util.List<ListBaselineStatusesResponseBodyDataBaselineStatuses> getBaselineStatuses() {
            return this.baselineStatuses;
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

    }

}
