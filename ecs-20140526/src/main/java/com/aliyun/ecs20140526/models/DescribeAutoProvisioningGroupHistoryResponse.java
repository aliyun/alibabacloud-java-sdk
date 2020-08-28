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

    }

    public static class DescribeAutoProvisioningGroupHistoryResponseAutoProvisioningGroupHistoriesAutoProvisioningGroupHistoryActivityDetails extends TeaModel {
        @NameInMap("ActivityDetail")
        @Validation(required = true)
        public java.util.List<DescribeAutoProvisioningGroupHistoryResponseAutoProvisioningGroupHistoriesAutoProvisioningGroupHistoryActivityDetailsActivityDetail> activityDetail;

        public static DescribeAutoProvisioningGroupHistoryResponseAutoProvisioningGroupHistoriesAutoProvisioningGroupHistoryActivityDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoProvisioningGroupHistoryResponseAutoProvisioningGroupHistoriesAutoProvisioningGroupHistoryActivityDetails self = new DescribeAutoProvisioningGroupHistoryResponseAutoProvisioningGroupHistoriesAutoProvisioningGroupHistoryActivityDetails();
            return TeaModel.build(map, self);
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

    }

    public static class DescribeAutoProvisioningGroupHistoryResponseAutoProvisioningGroupHistories extends TeaModel {
        @NameInMap("AutoProvisioningGroupHistory")
        @Validation(required = true)
        public java.util.List<DescribeAutoProvisioningGroupHistoryResponseAutoProvisioningGroupHistoriesAutoProvisioningGroupHistory> autoProvisioningGroupHistory;

        public static DescribeAutoProvisioningGroupHistoryResponseAutoProvisioningGroupHistories build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoProvisioningGroupHistoryResponseAutoProvisioningGroupHistories self = new DescribeAutoProvisioningGroupHistoryResponseAutoProvisioningGroupHistories();
            return TeaModel.build(map, self);
        }

    }

}
