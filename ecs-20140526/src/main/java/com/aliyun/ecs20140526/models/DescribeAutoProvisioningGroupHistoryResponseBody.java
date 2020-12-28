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
    public java.util.List<DescribeAutoProvisioningGroupHistoryResponseBodyAutoProvisioningGroupHistories> autoProvisioningGroupHistories;

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

    public DescribeAutoProvisioningGroupHistoryResponseBody setAutoProvisioningGroupHistories(java.util.List<DescribeAutoProvisioningGroupHistoryResponseBodyAutoProvisioningGroupHistories> autoProvisioningGroupHistories) {
        this.autoProvisioningGroupHistories = autoProvisioningGroupHistories;
        return this;
    }
    public java.util.List<DescribeAutoProvisioningGroupHistoryResponseBodyAutoProvisioningGroupHistories> getAutoProvisioningGroupHistories() {
        return this.autoProvisioningGroupHistories;
    }

    public static class DescribeAutoProvisioningGroupHistoryResponseBodyAutoProvisioningGroupHistoriesActivityDetails extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Detail")
        public String detail;

        public static DescribeAutoProvisioningGroupHistoryResponseBodyAutoProvisioningGroupHistoriesActivityDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoProvisioningGroupHistoryResponseBodyAutoProvisioningGroupHistoriesActivityDetails self = new DescribeAutoProvisioningGroupHistoryResponseBodyAutoProvisioningGroupHistoriesActivityDetails();
            return TeaModel.build(map, self);
        }

        public DescribeAutoProvisioningGroupHistoryResponseBodyAutoProvisioningGroupHistoriesActivityDetails setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeAutoProvisioningGroupHistoryResponseBodyAutoProvisioningGroupHistoriesActivityDetails setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

    }

    public static class DescribeAutoProvisioningGroupHistoryResponseBodyAutoProvisioningGroupHistories extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("ActivityDetails")
        public java.util.List<DescribeAutoProvisioningGroupHistoryResponseBodyAutoProvisioningGroupHistoriesActivityDetails> activityDetails;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("LastEventTime")
        public String lastEventTime;

        public static DescribeAutoProvisioningGroupHistoryResponseBodyAutoProvisioningGroupHistories build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoProvisioningGroupHistoryResponseBodyAutoProvisioningGroupHistories self = new DescribeAutoProvisioningGroupHistoryResponseBodyAutoProvisioningGroupHistories();
            return TeaModel.build(map, self);
        }

        public DescribeAutoProvisioningGroupHistoryResponseBodyAutoProvisioningGroupHistories setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeAutoProvisioningGroupHistoryResponseBodyAutoProvisioningGroupHistories setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeAutoProvisioningGroupHistoryResponseBodyAutoProvisioningGroupHistories setActivityDetails(java.util.List<DescribeAutoProvisioningGroupHistoryResponseBodyAutoProvisioningGroupHistoriesActivityDetails> activityDetails) {
            this.activityDetails = activityDetails;
            return this;
        }
        public java.util.List<DescribeAutoProvisioningGroupHistoryResponseBodyAutoProvisioningGroupHistoriesActivityDetails> getActivityDetails() {
            return this.activityDetails;
        }

        public DescribeAutoProvisioningGroupHistoryResponseBodyAutoProvisioningGroupHistories setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribeAutoProvisioningGroupHistoryResponseBodyAutoProvisioningGroupHistories setLastEventTime(String lastEventTime) {
            this.lastEventTime = lastEventTime;
            return this;
        }
        public String getLastEventTime() {
            return this.lastEventTime;
        }

    }

}
