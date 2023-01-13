// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeAutoProvisioningGroupHistoryResponseBody extends TeaModel {
    /**
     * <p>An array consisting of AutoProvisioningGroupHistory data.</p>
     */
    @NameInMap("AutoProvisioningGroupHistories")
    public DescribeAutoProvisioningGroupHistoryResponseBodyAutoProvisioningGroupHistories autoProvisioningGroupHistories;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of queried scheduling tasks in the auto provisioning group.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeAutoProvisioningGroupHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutoProvisioningGroupHistoryResponseBody self = new DescribeAutoProvisioningGroupHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAutoProvisioningGroupHistoryResponseBody setAutoProvisioningGroupHistories(DescribeAutoProvisioningGroupHistoryResponseBodyAutoProvisioningGroupHistories autoProvisioningGroupHistories) {
        this.autoProvisioningGroupHistories = autoProvisioningGroupHistories;
        return this;
    }
    public DescribeAutoProvisioningGroupHistoryResponseBodyAutoProvisioningGroupHistories getAutoProvisioningGroupHistories() {
        return this.autoProvisioningGroupHistories;
    }

    public DescribeAutoProvisioningGroupHistoryResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAutoProvisioningGroupHistoryResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAutoProvisioningGroupHistoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAutoProvisioningGroupHistoryResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeAutoProvisioningGroupHistoryResponseBodyAutoProvisioningGroupHistoriesAutoProvisioningGroupHistoryActivityDetailsActivityDetail extends TeaModel {
        /**
         * <p>The execution details of instance creation performed by the single scheduling task.</p>
         */
        @NameInMap("Detail")
        public String detail;

        /**
         * <p>The execution status of instance creation performed by the single scheduling task. Valid values:</p>
         * <br>
         * <p>*   Successful: Instances are created.</p>
         * <p>*   Failed: Instances failed to be created.</p>
         * <p>*   InProgress: Instances are being created.</p>
         * <p>*   Warning: Some instances are created.</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeAutoProvisioningGroupHistoryResponseBodyAutoProvisioningGroupHistoriesAutoProvisioningGroupHistoryActivityDetailsActivityDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoProvisioningGroupHistoryResponseBodyAutoProvisioningGroupHistoriesAutoProvisioningGroupHistoryActivityDetailsActivityDetail self = new DescribeAutoProvisioningGroupHistoryResponseBodyAutoProvisioningGroupHistoriesAutoProvisioningGroupHistoryActivityDetailsActivityDetail();
            return TeaModel.build(map, self);
        }

        public DescribeAutoProvisioningGroupHistoryResponseBodyAutoProvisioningGroupHistoriesAutoProvisioningGroupHistoryActivityDetailsActivityDetail setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public DescribeAutoProvisioningGroupHistoryResponseBodyAutoProvisioningGroupHistoriesAutoProvisioningGroupHistoryActivityDetailsActivityDetail setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeAutoProvisioningGroupHistoryResponseBodyAutoProvisioningGroupHistoriesAutoProvisioningGroupHistoryActivityDetails extends TeaModel {
        @NameInMap("ActivityDetail")
        public java.util.List<DescribeAutoProvisioningGroupHistoryResponseBodyAutoProvisioningGroupHistoriesAutoProvisioningGroupHistoryActivityDetailsActivityDetail> activityDetail;

        public static DescribeAutoProvisioningGroupHistoryResponseBodyAutoProvisioningGroupHistoriesAutoProvisioningGroupHistoryActivityDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoProvisioningGroupHistoryResponseBodyAutoProvisioningGroupHistoriesAutoProvisioningGroupHistoryActivityDetails self = new DescribeAutoProvisioningGroupHistoryResponseBodyAutoProvisioningGroupHistoriesAutoProvisioningGroupHistoryActivityDetails();
            return TeaModel.build(map, self);
        }

        public DescribeAutoProvisioningGroupHistoryResponseBodyAutoProvisioningGroupHistoriesAutoProvisioningGroupHistoryActivityDetails setActivityDetail(java.util.List<DescribeAutoProvisioningGroupHistoryResponseBodyAutoProvisioningGroupHistoriesAutoProvisioningGroupHistoryActivityDetailsActivityDetail> activityDetail) {
            this.activityDetail = activityDetail;
            return this;
        }
        public java.util.List<DescribeAutoProvisioningGroupHistoryResponseBodyAutoProvisioningGroupHistoriesAutoProvisioningGroupHistoryActivityDetailsActivityDetail> getActivityDetail() {
            return this.activityDetail;
        }

    }

    public static class DescribeAutoProvisioningGroupHistoryResponseBodyAutoProvisioningGroupHistoriesAutoProvisioningGroupHistory extends TeaModel {
        /**
         * <p>An array consisting of ActivityDetail data.</p>
         */
        @NameInMap("ActivityDetails")
        public DescribeAutoProvisioningGroupHistoryResponseBodyAutoProvisioningGroupHistoriesAutoProvisioningGroupHistoryActivityDetails activityDetails;

        /**
         * <p>The execution time of the last instance creation performed by the single scheduling task.</p>
         */
        @NameInMap("LastEventTime")
        public String lastEventTime;

        /**
         * <p>The start time of executing the single scheduling task.</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The execution status of the single scheduling task. Valid values:</p>
         * <br>
         * <p>*   prepare: The scheduling task is being executed.</p>
         * <p>*   success: The scheduling task is executed.</p>
         * <p>*   failed: The scheduling task failed to be executed.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the scheduling task.</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static DescribeAutoProvisioningGroupHistoryResponseBodyAutoProvisioningGroupHistoriesAutoProvisioningGroupHistory build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoProvisioningGroupHistoryResponseBodyAutoProvisioningGroupHistoriesAutoProvisioningGroupHistory self = new DescribeAutoProvisioningGroupHistoryResponseBodyAutoProvisioningGroupHistoriesAutoProvisioningGroupHistory();
            return TeaModel.build(map, self);
        }

        public DescribeAutoProvisioningGroupHistoryResponseBodyAutoProvisioningGroupHistoriesAutoProvisioningGroupHistory setActivityDetails(DescribeAutoProvisioningGroupHistoryResponseBodyAutoProvisioningGroupHistoriesAutoProvisioningGroupHistoryActivityDetails activityDetails) {
            this.activityDetails = activityDetails;
            return this;
        }
        public DescribeAutoProvisioningGroupHistoryResponseBodyAutoProvisioningGroupHistoriesAutoProvisioningGroupHistoryActivityDetails getActivityDetails() {
            return this.activityDetails;
        }

        public DescribeAutoProvisioningGroupHistoryResponseBodyAutoProvisioningGroupHistoriesAutoProvisioningGroupHistory setLastEventTime(String lastEventTime) {
            this.lastEventTime = lastEventTime;
            return this;
        }
        public String getLastEventTime() {
            return this.lastEventTime;
        }

        public DescribeAutoProvisioningGroupHistoryResponseBodyAutoProvisioningGroupHistoriesAutoProvisioningGroupHistory setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeAutoProvisioningGroupHistoryResponseBodyAutoProvisioningGroupHistoriesAutoProvisioningGroupHistory setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeAutoProvisioningGroupHistoryResponseBodyAutoProvisioningGroupHistoriesAutoProvisioningGroupHistory setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

    public static class DescribeAutoProvisioningGroupHistoryResponseBodyAutoProvisioningGroupHistories extends TeaModel {
        @NameInMap("AutoProvisioningGroupHistory")
        public java.util.List<DescribeAutoProvisioningGroupHistoryResponseBodyAutoProvisioningGroupHistoriesAutoProvisioningGroupHistory> autoProvisioningGroupHistory;

        public static DescribeAutoProvisioningGroupHistoryResponseBodyAutoProvisioningGroupHistories build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoProvisioningGroupHistoryResponseBodyAutoProvisioningGroupHistories self = new DescribeAutoProvisioningGroupHistoryResponseBodyAutoProvisioningGroupHistories();
            return TeaModel.build(map, self);
        }

        public DescribeAutoProvisioningGroupHistoryResponseBodyAutoProvisioningGroupHistories setAutoProvisioningGroupHistory(java.util.List<DescribeAutoProvisioningGroupHistoryResponseBodyAutoProvisioningGroupHistoriesAutoProvisioningGroupHistory> autoProvisioningGroupHistory) {
            this.autoProvisioningGroupHistory = autoProvisioningGroupHistory;
            return this;
        }
        public java.util.List<DescribeAutoProvisioningGroupHistoryResponseBodyAutoProvisioningGroupHistoriesAutoProvisioningGroupHistory> getAutoProvisioningGroupHistory() {
            return this.autoProvisioningGroupHistory;
        }

    }

}
