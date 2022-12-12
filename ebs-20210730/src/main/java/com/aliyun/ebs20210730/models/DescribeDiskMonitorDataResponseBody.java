// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeDiskMonitorDataResponseBody extends TeaModel {
    @NameInMap("MonitorData")
    public java.util.List<DescribeDiskMonitorDataResponseBodyMonitorData> monitorData;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeDiskMonitorDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiskMonitorDataResponseBody self = new DescribeDiskMonitorDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDiskMonitorDataResponseBody setMonitorData(java.util.List<DescribeDiskMonitorDataResponseBodyMonitorData> monitorData) {
        this.monitorData = monitorData;
        return this;
    }
    public java.util.List<DescribeDiskMonitorDataResponseBodyMonitorData> getMonitorData() {
        return this.monitorData;
    }

    public DescribeDiskMonitorDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDiskMonitorDataResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDiskMonitorDataResponseBodyMonitorData extends TeaModel {
        @NameInMap("BPSPercent")
        public Long BPSPercent;

        @NameInMap("BurstIOCount")
        public Long burstIOCount;

        @NameInMap("DiskId")
        public String diskId;

        @NameInMap("IOPSPercent")
        public Long IOPSPercent;

        @NameInMap("ReadBPS")
        public Long readBPS;

        @NameInMap("ReadIOPS")
        public Long readIOPS;

        @NameInMap("Timestamp")
        public String timestamp;

        @NameInMap("WriteBPS")
        public Long writeBPS;

        @NameInMap("WriteIOPS")
        public Long writeIOPS;

        public static DescribeDiskMonitorDataResponseBodyMonitorData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDiskMonitorDataResponseBodyMonitorData self = new DescribeDiskMonitorDataResponseBodyMonitorData();
            return TeaModel.build(map, self);
        }

        public DescribeDiskMonitorDataResponseBodyMonitorData setBPSPercent(Long BPSPercent) {
            this.BPSPercent = BPSPercent;
            return this;
        }
        public Long getBPSPercent() {
            return this.BPSPercent;
        }

        public DescribeDiskMonitorDataResponseBodyMonitorData setBurstIOCount(Long burstIOCount) {
            this.burstIOCount = burstIOCount;
            return this;
        }
        public Long getBurstIOCount() {
            return this.burstIOCount;
        }

        public DescribeDiskMonitorDataResponseBodyMonitorData setDiskId(String diskId) {
            this.diskId = diskId;
            return this;
        }
        public String getDiskId() {
            return this.diskId;
        }

        public DescribeDiskMonitorDataResponseBodyMonitorData setIOPSPercent(Long IOPSPercent) {
            this.IOPSPercent = IOPSPercent;
            return this;
        }
        public Long getIOPSPercent() {
            return this.IOPSPercent;
        }

        public DescribeDiskMonitorDataResponseBodyMonitorData setReadBPS(Long readBPS) {
            this.readBPS = readBPS;
            return this;
        }
        public Long getReadBPS() {
            return this.readBPS;
        }

        public DescribeDiskMonitorDataResponseBodyMonitorData setReadIOPS(Long readIOPS) {
            this.readIOPS = readIOPS;
            return this;
        }
        public Long getReadIOPS() {
            return this.readIOPS;
        }

        public DescribeDiskMonitorDataResponseBodyMonitorData setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

        public DescribeDiskMonitorDataResponseBodyMonitorData setWriteBPS(Long writeBPS) {
            this.writeBPS = writeBPS;
            return this;
        }
        public Long getWriteBPS() {
            return this.writeBPS;
        }

        public DescribeDiskMonitorDataResponseBodyMonitorData setWriteIOPS(Long writeIOPS) {
            this.writeIOPS = writeIOPS;
            return this;
        }
        public Long getWriteIOPS() {
            return this.writeIOPS;
        }

    }

}
