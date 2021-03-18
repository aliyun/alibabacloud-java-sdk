// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDiskMonitorDataResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("MonitorData")
    public DescribeDiskMonitorDataResponseBodyMonitorData monitorData;

    public static DescribeDiskMonitorDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiskMonitorDataResponseBody self = new DescribeDiskMonitorDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDiskMonitorDataResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeDiskMonitorDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDiskMonitorDataResponseBody setMonitorData(DescribeDiskMonitorDataResponseBodyMonitorData monitorData) {
        this.monitorData = monitorData;
        return this;
    }
    public DescribeDiskMonitorDataResponseBodyMonitorData getMonitorData() {
        return this.monitorData;
    }

    public static class DescribeDiskMonitorDataResponseBodyMonitorDataDiskMonitorData extends TeaModel {
        @NameInMap("BPSRead")
        public Integer BPSRead;

        @NameInMap("IOPSRead")
        public Integer IOPSRead;

        @NameInMap("LatencyRead")
        public Integer latencyRead;

        @NameInMap("BPSTotal")
        public Integer BPSTotal;

        @NameInMap("IOPSTotal")
        public Integer IOPSTotal;

        @NameInMap("TimeStamp")
        public String timeStamp;

        @NameInMap("LatencyWrite")
        public Integer latencyWrite;

        @NameInMap("IOPSWrite")
        public Integer IOPSWrite;

        @NameInMap("DiskId")
        public String diskId;

        @NameInMap("BPSWrite")
        public Integer BPSWrite;

        public static DescribeDiskMonitorDataResponseBodyMonitorDataDiskMonitorData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDiskMonitorDataResponseBodyMonitorDataDiskMonitorData self = new DescribeDiskMonitorDataResponseBodyMonitorDataDiskMonitorData();
            return TeaModel.build(map, self);
        }

        public DescribeDiskMonitorDataResponseBodyMonitorDataDiskMonitorData setBPSRead(Integer BPSRead) {
            this.BPSRead = BPSRead;
            return this;
        }
        public Integer getBPSRead() {
            return this.BPSRead;
        }

        public DescribeDiskMonitorDataResponseBodyMonitorDataDiskMonitorData setIOPSRead(Integer IOPSRead) {
            this.IOPSRead = IOPSRead;
            return this;
        }
        public Integer getIOPSRead() {
            return this.IOPSRead;
        }

        public DescribeDiskMonitorDataResponseBodyMonitorDataDiskMonitorData setLatencyRead(Integer latencyRead) {
            this.latencyRead = latencyRead;
            return this;
        }
        public Integer getLatencyRead() {
            return this.latencyRead;
        }

        public DescribeDiskMonitorDataResponseBodyMonitorDataDiskMonitorData setBPSTotal(Integer BPSTotal) {
            this.BPSTotal = BPSTotal;
            return this;
        }
        public Integer getBPSTotal() {
            return this.BPSTotal;
        }

        public DescribeDiskMonitorDataResponseBodyMonitorDataDiskMonitorData setIOPSTotal(Integer IOPSTotal) {
            this.IOPSTotal = IOPSTotal;
            return this;
        }
        public Integer getIOPSTotal() {
            return this.IOPSTotal;
        }

        public DescribeDiskMonitorDataResponseBodyMonitorDataDiskMonitorData setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeDiskMonitorDataResponseBodyMonitorDataDiskMonitorData setLatencyWrite(Integer latencyWrite) {
            this.latencyWrite = latencyWrite;
            return this;
        }
        public Integer getLatencyWrite() {
            return this.latencyWrite;
        }

        public DescribeDiskMonitorDataResponseBodyMonitorDataDiskMonitorData setIOPSWrite(Integer IOPSWrite) {
            this.IOPSWrite = IOPSWrite;
            return this;
        }
        public Integer getIOPSWrite() {
            return this.IOPSWrite;
        }

        public DescribeDiskMonitorDataResponseBodyMonitorDataDiskMonitorData setDiskId(String diskId) {
            this.diskId = diskId;
            return this;
        }
        public String getDiskId() {
            return this.diskId;
        }

        public DescribeDiskMonitorDataResponseBodyMonitorDataDiskMonitorData setBPSWrite(Integer BPSWrite) {
            this.BPSWrite = BPSWrite;
            return this;
        }
        public Integer getBPSWrite() {
            return this.BPSWrite;
        }

    }

    public static class DescribeDiskMonitorDataResponseBodyMonitorData extends TeaModel {
        @NameInMap("DiskMonitorData")
        public java.util.List<DescribeDiskMonitorDataResponseBodyMonitorDataDiskMonitorData> diskMonitorData;

        public static DescribeDiskMonitorDataResponseBodyMonitorData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDiskMonitorDataResponseBodyMonitorData self = new DescribeDiskMonitorDataResponseBodyMonitorData();
            return TeaModel.build(map, self);
        }

        public DescribeDiskMonitorDataResponseBodyMonitorData setDiskMonitorData(java.util.List<DescribeDiskMonitorDataResponseBodyMonitorDataDiskMonitorData> diskMonitorData) {
            this.diskMonitorData = diskMonitorData;
            return this;
        }
        public java.util.List<DescribeDiskMonitorDataResponseBodyMonitorDataDiskMonitorData> getDiskMonitorData() {
            return this.diskMonitorData;
        }

    }

}
