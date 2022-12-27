// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSnapshotMonitorDataResponseBody extends TeaModel {
    // The collection of monitoring data of snapshot sizes.
    @NameInMap("MonitorData")
    public DescribeSnapshotMonitorDataResponseBodyMonitorData monitorData;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeSnapshotMonitorDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSnapshotMonitorDataResponseBody self = new DescribeSnapshotMonitorDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSnapshotMonitorDataResponseBody setMonitorData(DescribeSnapshotMonitorDataResponseBodyMonitorData monitorData) {
        this.monitorData = monitorData;
        return this;
    }
    public DescribeSnapshotMonitorDataResponseBodyMonitorData getMonitorData() {
        return this.monitorData;
    }

    public DescribeSnapshotMonitorDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeSnapshotMonitorDataResponseBodyMonitorDataDataPoint extends TeaModel {
        // The total size of the snapshots. Unit: bytes.
        @NameInMap("Size")
        public Long size;

        // The timestamp that corresponds to a snapshot size.
        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeSnapshotMonitorDataResponseBodyMonitorDataDataPoint build(java.util.Map<String, ?> map) throws Exception {
            DescribeSnapshotMonitorDataResponseBodyMonitorDataDataPoint self = new DescribeSnapshotMonitorDataResponseBodyMonitorDataDataPoint();
            return TeaModel.build(map, self);
        }

        public DescribeSnapshotMonitorDataResponseBodyMonitorDataDataPoint setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public DescribeSnapshotMonitorDataResponseBodyMonitorDataDataPoint setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class DescribeSnapshotMonitorDataResponseBodyMonitorData extends TeaModel {
        @NameInMap("DataPoint")
        public java.util.List<DescribeSnapshotMonitorDataResponseBodyMonitorDataDataPoint> dataPoint;

        public static DescribeSnapshotMonitorDataResponseBodyMonitorData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSnapshotMonitorDataResponseBodyMonitorData self = new DescribeSnapshotMonitorDataResponseBodyMonitorData();
            return TeaModel.build(map, self);
        }

        public DescribeSnapshotMonitorDataResponseBodyMonitorData setDataPoint(java.util.List<DescribeSnapshotMonitorDataResponseBodyMonitorDataDataPoint> dataPoint) {
            this.dataPoint = dataPoint;
            return this;
        }
        public java.util.List<DescribeSnapshotMonitorDataResponseBodyMonitorDataDataPoint> getDataPoint() {
            return this.dataPoint;
        }

    }

}
