// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeAutoProvisioningGroupHistoryResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("AutoProvisioningGroupHistories")
    public DescribeAutoProvisioningGroupHistoryResponseBodyAutoProvisioningGroupHistories autoProvisioningGroupHistories;

    public static DescribeAutoProvisioningGroupHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutoProvisioningGroupHistoryResponseBody self = new DescribeAutoProvisioningGroupHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAutoProvisioningGroupHistoryResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
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

    public DescribeAutoProvisioningGroupHistoryResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAutoProvisioningGroupHistoryResponseBody setAutoProvisioningGroupHistories(DescribeAutoProvisioningGroupHistoryResponseBodyAutoProvisioningGroupHistories autoProvisioningGroupHistories) {
        this.autoProvisioningGroupHistories = autoProvisioningGroupHistories;
        return this;
    }
    public DescribeAutoProvisioningGroupHistoryResponseBodyAutoProvisioningGroupHistories getAutoProvisioningGroupHistories() {
        return this.autoProvisioningGroupHistories;
    }

    public static class DescribeAutoProvisioningGroupHistoryResponseBodyAutoProvisioningGroupHistoriesAutoProvisioningGroupHistoryActivityDetailsActivityDetail extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Detail")
        public String detail;

        public static DescribeAutoProvisioningGroupHistoryResponseBodyAutoProvisioningGroupHistoriesAutoProvisioningGroupHistoryActivityDetailsActivityDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoProvisioningGroupHistoryResponseBodyAutoProvisioningGroupHistoriesAutoProvisioningGroupHistoryActivityDetailsActivityDetail self = new DescribeAutoProvisioningGroupHistoryResponseBodyAutoProvisioningGroupHistoriesAutoProvisioningGroupHistoryActivityDetailsActivityDetail();
            return TeaModel.build(map, self);
        }

        public DescribeAutoProvisioningGroupHistoryResponseBodyAutoProvisioningGroupHistoriesAutoProvisioningGroupHistoryActivityDetailsActivityDetail setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeAutoProvisioningGroupHistoryResponseBodyAutoProvisioningGroupHistoriesAutoProvisioningGroupHistoryActivityDetailsActivityDetail setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
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
        @NameInMap("Status")
        public String status;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("ActivityDetails")
        public DescribeAutoProvisioningGroupHistoryResponseBodyAutoProvisioningGroupHistoriesAutoProvisioningGroupHistoryActivityDetails activityDetails;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("LastEventTime")
        public String lastEventTime;

        public static DescribeAutoProvisioningGroupHistoryResponseBodyAutoProvisioningGroupHistoriesAutoProvisioningGroupHistory build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoProvisioningGroupHistoryResponseBodyAutoProvisioningGroupHistoriesAutoProvisioningGroupHistory self = new DescribeAutoProvisioningGroupHistoryResponseBodyAutoProvisioningGroupHistoriesAutoProvisioningGroupHistory();
            return TeaModel.build(map, self);
        }

        public DescribeAutoProvisioningGroupHistoryResponseBodyAutoProvisioningGroupHistoriesAutoProvisioningGroupHistory setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeAutoProvisioningGroupHistoryResponseBodyAutoProvisioningGroupHistoriesAutoProvisioningGroupHistory setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeAutoProvisioningGroupHistoryResponseBodyAutoProvisioningGroupHistoriesAutoProvisioningGroupHistory setActivityDetails(DescribeAutoProvisioningGroupHistoryResponseBodyAutoProvisioningGroupHistoriesAutoProvisioningGroupHistoryActivityDetails activityDetails) {
            this.activityDetails = activityDetails;
            return this;
        }
        public DescribeAutoProvisioningGroupHistoryResponseBodyAutoProvisioningGroupHistoriesAutoProvisioningGroupHistoryActivityDetails getActivityDetails() {
            return this.activityDetails;
        }

        public DescribeAutoProvisioningGroupHistoryResponseBodyAutoProvisioningGroupHistoriesAutoProvisioningGroupHistory setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribeAutoProvisioningGroupHistoryResponseBodyAutoProvisioningGroupHistoriesAutoProvisioningGroupHistory setLastEventTime(String lastEventTime) {
            this.lastEventTime = lastEventTime;
            return this;
        }
        public String getLastEventTime() {
            return this.lastEventTime;
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
