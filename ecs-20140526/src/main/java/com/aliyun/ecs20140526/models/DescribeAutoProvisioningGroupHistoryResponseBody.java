// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeAutoProvisioningGroupHistoryResponseBody extends TeaModel {
    // An array consisting of AutoProvisioningGroupHistory data.
    @NameInMap("AutoProvisioningGroupHistories")
    public DescribeAutoProvisioningGroupHistoryResponseBodyAutoProvisioningGroupHistories autoProvisioningGroupHistories;

    // The page number of the returned page.
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // The number of entries returned per page.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The number of queried scheduling tasks in the auto provisioning group.
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
        // The execution details of instance creation performed by the single scheduling task.
        @NameInMap("Detail")
        public String detail;

        // The execution status of instance creation performed by the single scheduling task. Valid values:
        // 
        // *   Successful: Instances are created.
        // *   Failed: Instances failed to be created.
        // *   InProgress: Instances are being created.
        // *   Warning: Partial instances are created.
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
        // An array consisting of ActivityDetail data.
        @NameInMap("ActivityDetails")
        public DescribeAutoProvisioningGroupHistoryResponseBodyAutoProvisioningGroupHistoriesAutoProvisioningGroupHistoryActivityDetails activityDetails;

        @NameInMap("LastEventTime")
        public String lastEventTime;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public String status;

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
