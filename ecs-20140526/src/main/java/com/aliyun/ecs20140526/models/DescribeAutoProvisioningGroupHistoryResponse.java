// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeAutoProvisioningGroupHistoryResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("AutoProvisioningGroupHistories")
    @Validation(required = true)
    public DescribeAutoProvisioningGroupHistoryResponseAutoProvisioningGroupHistories autoProvisioningGroupHistories;

    public static DescribeAutoProvisioningGroupHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutoProvisioningGroupHistoryResponse self = new DescribeAutoProvisioningGroupHistoryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAutoProvisioningGroupHistoryResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAutoProvisioningGroupHistoryResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeAutoProvisioningGroupHistoryResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAutoProvisioningGroupHistoryResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAutoProvisioningGroupHistoryResponse setAutoProvisioningGroupHistories(DescribeAutoProvisioningGroupHistoryResponseAutoProvisioningGroupHistories autoProvisioningGroupHistories) {
        this.autoProvisioningGroupHistories = autoProvisioningGroupHistories;
        return this;
    }
    public DescribeAutoProvisioningGroupHistoryResponseAutoProvisioningGroupHistories getAutoProvisioningGroupHistories() {
        return this.autoProvisioningGroupHistories;
    }

    public static class DescribeAutoProvisioningGroupHistoryResponseAutoProvisioningGroupHistoriesAutoProvisioningGroupHistoryActivityDetailsActivityDetail extends TeaModel {
        @NameInMap("Detail")
        @Validation(required = true)
        public String detail;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        public static DescribeAutoProvisioningGroupHistoryResponseAutoProvisioningGroupHistoriesAutoProvisioningGroupHistoryActivityDetailsActivityDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoProvisioningGroupHistoryResponseAutoProvisioningGroupHistoriesAutoProvisioningGroupHistoryActivityDetailsActivityDetail self = new DescribeAutoProvisioningGroupHistoryResponseAutoProvisioningGroupHistoriesAutoProvisioningGroupHistoryActivityDetailsActivityDetail();
            return TeaModel.build(map, self);
        }

        public DescribeAutoProvisioningGroupHistoryResponseAutoProvisioningGroupHistoriesAutoProvisioningGroupHistoryActivityDetailsActivityDetail setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public DescribeAutoProvisioningGroupHistoryResponseAutoProvisioningGroupHistoriesAutoProvisioningGroupHistoryActivityDetailsActivityDetail setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeAutoProvisioningGroupHistoryResponseAutoProvisioningGroupHistoriesAutoProvisioningGroupHistoryActivityDetails extends TeaModel {
        @NameInMap("ActivityDetail")
        @Validation(required = true)
        public java.util.List<DescribeAutoProvisioningGroupHistoryResponseAutoProvisioningGroupHistoriesAutoProvisioningGroupHistoryActivityDetailsActivityDetail> activityDetail;

        public static DescribeAutoProvisioningGroupHistoryResponseAutoProvisioningGroupHistoriesAutoProvisioningGroupHistoryActivityDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoProvisioningGroupHistoryResponseAutoProvisioningGroupHistoriesAutoProvisioningGroupHistoryActivityDetails self = new DescribeAutoProvisioningGroupHistoryResponseAutoProvisioningGroupHistoriesAutoProvisioningGroupHistoryActivityDetails();
            return TeaModel.build(map, self);
        }

        public DescribeAutoProvisioningGroupHistoryResponseAutoProvisioningGroupHistoriesAutoProvisioningGroupHistoryActivityDetails setActivityDetail(java.util.List<DescribeAutoProvisioningGroupHistoryResponseAutoProvisioningGroupHistoriesAutoProvisioningGroupHistoryActivityDetailsActivityDetail> activityDetail) {
            this.activityDetail = activityDetail;
            return this;
        }
        public java.util.List<DescribeAutoProvisioningGroupHistoryResponseAutoProvisioningGroupHistoriesAutoProvisioningGroupHistoryActivityDetailsActivityDetail> getActivityDetail() {
            return this.activityDetail;
        }

    }

    public static class DescribeAutoProvisioningGroupHistoryResponseAutoProvisioningGroupHistoriesAutoProvisioningGroupHistory extends TeaModel {
        @NameInMap("TaskId")
        @Validation(required = true)
        public String taskId;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("LastEventTime")
        @Validation(required = true)
        public String lastEventTime;

        @NameInMap("StartTime")
        @Validation(required = true)
        public String startTime;

        @NameInMap("ActivityDetails")
        @Validation(required = true)
        public DescribeAutoProvisioningGroupHistoryResponseAutoProvisioningGroupHistoriesAutoProvisioningGroupHistoryActivityDetails activityDetails;

        public static DescribeAutoProvisioningGroupHistoryResponseAutoProvisioningGroupHistoriesAutoProvisioningGroupHistory build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoProvisioningGroupHistoryResponseAutoProvisioningGroupHistoriesAutoProvisioningGroupHistory self = new DescribeAutoProvisioningGroupHistoryResponseAutoProvisioningGroupHistoriesAutoProvisioningGroupHistory();
            return TeaModel.build(map, self);
        }

        public DescribeAutoProvisioningGroupHistoryResponseAutoProvisioningGroupHistoriesAutoProvisioningGroupHistory setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribeAutoProvisioningGroupHistoryResponseAutoProvisioningGroupHistoriesAutoProvisioningGroupHistory setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeAutoProvisioningGroupHistoryResponseAutoProvisioningGroupHistoriesAutoProvisioningGroupHistory setLastEventTime(String lastEventTime) {
            this.lastEventTime = lastEventTime;
            return this;
        }
        public String getLastEventTime() {
            return this.lastEventTime;
        }

        public DescribeAutoProvisioningGroupHistoryResponseAutoProvisioningGroupHistoriesAutoProvisioningGroupHistory setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeAutoProvisioningGroupHistoryResponseAutoProvisioningGroupHistoriesAutoProvisioningGroupHistory setActivityDetails(DescribeAutoProvisioningGroupHistoryResponseAutoProvisioningGroupHistoriesAutoProvisioningGroupHistoryActivityDetails activityDetails) {
            this.activityDetails = activityDetails;
            return this;
        }
        public DescribeAutoProvisioningGroupHistoryResponseAutoProvisioningGroupHistoriesAutoProvisioningGroupHistoryActivityDetails getActivityDetails() {
            return this.activityDetails;
        }

    }

    public static class DescribeAutoProvisioningGroupHistoryResponseAutoProvisioningGroupHistories extends TeaModel {
        @NameInMap("AutoProvisioningGroupHistory")
        @Validation(required = true)
        public java.util.List<DescribeAutoProvisioningGroupHistoryResponseAutoProvisioningGroupHistoriesAutoProvisioningGroupHistory> autoProvisioningGroupHistory;

        public static DescribeAutoProvisioningGroupHistoryResponseAutoProvisioningGroupHistories build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoProvisioningGroupHistoryResponseAutoProvisioningGroupHistories self = new DescribeAutoProvisioningGroupHistoryResponseAutoProvisioningGroupHistories();
            return TeaModel.build(map, self);
        }

        public DescribeAutoProvisioningGroupHistoryResponseAutoProvisioningGroupHistories setAutoProvisioningGroupHistory(java.util.List<DescribeAutoProvisioningGroupHistoryResponseAutoProvisioningGroupHistoriesAutoProvisioningGroupHistory> autoProvisioningGroupHistory) {
            this.autoProvisioningGroupHistory = autoProvisioningGroupHistory;
            return this;
        }
        public java.util.List<DescribeAutoProvisioningGroupHistoryResponseAutoProvisioningGroupHistoriesAutoProvisioningGroupHistory> getAutoProvisioningGroupHistory() {
            return this.autoProvisioningGroupHistory;
        }

    }

}
