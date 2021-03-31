// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSnapshotMonitorDataResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("MonitorData")
    @Validation(required = true)
    public DescribeSnapshotMonitorDataResponseMonitorData monitorData;

    public static DescribeSnapshotMonitorDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSnapshotMonitorDataResponse self = new DescribeSnapshotMonitorDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSnapshotMonitorDataResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSnapshotMonitorDataResponse setMonitorData(DescribeSnapshotMonitorDataResponseMonitorData monitorData) {
        this.monitorData = monitorData;
        return this;
    }
    public DescribeSnapshotMonitorDataResponseMonitorData getMonitorData() {
        return this.monitorData;
    }

    public static class DescribeSnapshotMonitorDataResponseMonitorDataDataPoint extends TeaModel {
        @NameInMap("TimeStamp")
        @Validation(required = true)
        public String timeStamp;

        @NameInMap("Size")
        @Validation(required = true)
        public Long size;

        public static DescribeSnapshotMonitorDataResponseMonitorDataDataPoint build(java.util.Map<String, ?> map) throws Exception {
            DescribeSnapshotMonitorDataResponseMonitorDataDataPoint self = new DescribeSnapshotMonitorDataResponseMonitorDataDataPoint();
            return TeaModel.build(map, self);
        }

        public DescribeSnapshotMonitorDataResponseMonitorDataDataPoint setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeSnapshotMonitorDataResponseMonitorDataDataPoint setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

    }

    public static class DescribeSnapshotMonitorDataResponseMonitorData extends TeaModel {
        @NameInMap("DataPoint")
        @Validation(required = true)
        public java.util.List<DescribeSnapshotMonitorDataResponseMonitorDataDataPoint> dataPoint;

        public static DescribeSnapshotMonitorDataResponseMonitorData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSnapshotMonitorDataResponseMonitorData self = new DescribeSnapshotMonitorDataResponseMonitorData();
            return TeaModel.build(map, self);
        }

        public DescribeSnapshotMonitorDataResponseMonitorData setDataPoint(java.util.List<DescribeSnapshotMonitorDataResponseMonitorDataDataPoint> dataPoint) {
            this.dataPoint = dataPoint;
            return this;
        }
        public java.util.List<DescribeSnapshotMonitorDataResponseMonitorDataDataPoint> getDataPoint() {
            return this.dataPoint;
        }

    }

}
