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

    }

    public static class DescribeSnapshotMonitorDataResponseMonitorData extends TeaModel {
        @NameInMap("DataPoint")
        @Validation(required = true)
        public java.util.List<DescribeSnapshotMonitorDataResponseMonitorDataDataPoint> dataPoint;

        public static DescribeSnapshotMonitorDataResponseMonitorData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSnapshotMonitorDataResponseMonitorData self = new DescribeSnapshotMonitorDataResponseMonitorData();
            return TeaModel.build(map, self);
        }

    }

}
