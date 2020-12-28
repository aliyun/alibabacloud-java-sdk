// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSnapshotMonitorDataResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("MonitorData")
    public java.util.List<DescribeSnapshotMonitorDataResponseBodyMonitorData> monitorData;

    public static DescribeSnapshotMonitorDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSnapshotMonitorDataResponseBody self = new DescribeSnapshotMonitorDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSnapshotMonitorDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSnapshotMonitorDataResponseBody setMonitorData(java.util.List<DescribeSnapshotMonitorDataResponseBodyMonitorData> monitorData) {
        this.monitorData = monitorData;
        return this;
    }
    public java.util.List<DescribeSnapshotMonitorDataResponseBodyMonitorData> getMonitorData() {
        return this.monitorData;
    }

    public static class DescribeSnapshotMonitorDataResponseBodyMonitorData extends TeaModel {
        @NameInMap("Size")
        public Long size;

        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeSnapshotMonitorDataResponseBodyMonitorData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSnapshotMonitorDataResponseBodyMonitorData self = new DescribeSnapshotMonitorDataResponseBodyMonitorData();
            return TeaModel.build(map, self);
        }

        public DescribeSnapshotMonitorDataResponseBodyMonitorData setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public DescribeSnapshotMonitorDataResponseBodyMonitorData setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

}
