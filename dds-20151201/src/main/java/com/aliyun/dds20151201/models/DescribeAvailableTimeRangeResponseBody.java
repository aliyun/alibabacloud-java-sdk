// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeAvailableTimeRangeResponseBody extends TeaModel {
    @NameInMap("TimeRange")
    public DescribeAvailableTimeRangeResponseBodyTimeRange timeRange;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAvailableTimeRangeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableTimeRangeResponseBody self = new DescribeAvailableTimeRangeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableTimeRangeResponseBody setTimeRange(DescribeAvailableTimeRangeResponseBodyTimeRange timeRange) {
        this.timeRange = timeRange;
        return this;
    }
    public DescribeAvailableTimeRangeResponseBodyTimeRange getTimeRange() {
        return this.timeRange;
    }

    public DescribeAvailableTimeRangeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAvailableTimeRangeResponseBodyTimeRangeTimeRange extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("NodeId")
        public String nodeId;

        public static DescribeAvailableTimeRangeResponseBodyTimeRangeTimeRange build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableTimeRangeResponseBodyTimeRangeTimeRange self = new DescribeAvailableTimeRangeResponseBodyTimeRangeTimeRange();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableTimeRangeResponseBodyTimeRangeTimeRange setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeAvailableTimeRangeResponseBodyTimeRangeTimeRange setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeAvailableTimeRangeResponseBodyTimeRangeTimeRange setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeAvailableTimeRangeResponseBodyTimeRangeTimeRange setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribeAvailableTimeRangeResponseBodyTimeRangeTimeRange setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

    }

    public static class DescribeAvailableTimeRangeResponseBodyTimeRange extends TeaModel {
        @NameInMap("TimeRange")
        public java.util.List<DescribeAvailableTimeRangeResponseBodyTimeRangeTimeRange> timeRange;

        public static DescribeAvailableTimeRangeResponseBodyTimeRange build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableTimeRangeResponseBodyTimeRange self = new DescribeAvailableTimeRangeResponseBodyTimeRange();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableTimeRangeResponseBodyTimeRange setTimeRange(java.util.List<DescribeAvailableTimeRangeResponseBodyTimeRangeTimeRange> timeRange) {
            this.timeRange = timeRange;
            return this;
        }
        public java.util.List<DescribeAvailableTimeRangeResponseBodyTimeRangeTimeRange> getTimeRange() {
            return this.timeRange;
        }

    }

}
