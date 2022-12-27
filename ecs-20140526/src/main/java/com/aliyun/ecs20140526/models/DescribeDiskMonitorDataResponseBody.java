// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDiskMonitorDataResponseBody extends TeaModel {
    // Details about the disk monitoring data.
    @NameInMap("MonitorData")
    public DescribeDiskMonitorDataResponseBodyMonitorData monitorData;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The total number of returned monitoring data entries.
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeDiskMonitorDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiskMonitorDataResponseBody self = new DescribeDiskMonitorDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDiskMonitorDataResponseBody setMonitorData(DescribeDiskMonitorDataResponseBodyMonitorData monitorData) {
        this.monitorData = monitorData;
        return this;
    }
    public DescribeDiskMonitorDataResponseBodyMonitorData getMonitorData() {
        return this.monitorData;
    }

    public DescribeDiskMonitorDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDiskMonitorDataResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDiskMonitorDataResponseBodyMonitorDataDiskMonitorData extends TeaModel {
        // The read bandwidth of the system disk. Unit: Byte/s.
        @NameInMap("BPSRead")
        public Integer BPSRead;

        // The total read and write bandwidth of the system disk. Unit: Byte/s.
        @NameInMap("BPSTotal")
        public Integer BPSTotal;

        // The write bandwidth of the system disk. Unit: Byte/s.
        @NameInMap("BPSWrite")
        public Integer BPSWrite;

        // The ID of the disk.
        @NameInMap("DiskId")
        public String diskId;

        // The number of read I/O operations per second on the system disk.
        @NameInMap("IOPSRead")
        public Integer IOPSRead;

        // The total number of read and write I/O operations per second on the system disk.
        @NameInMap("IOPSTotal")
        public Integer IOPSTotal;

        // The number of write I/O operations per second on the system disk.
        @NameInMap("IOPSWrite")
        public Integer IOPSWrite;

        // The read latency of the disk. Unit: μs.
        @NameInMap("LatencyRead")
        public Integer latencyRead;

        // The write latency of the disk. Unit: μs.
        @NameInMap("LatencyWrite")
        public Integer latencyWrite;

        // The timestamp of monitoring data query. The time follows the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
        @NameInMap("TimeStamp")
        public String timeStamp;

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

        public DescribeDiskMonitorDataResponseBodyMonitorDataDiskMonitorData setBPSTotal(Integer BPSTotal) {
            this.BPSTotal = BPSTotal;
            return this;
        }
        public Integer getBPSTotal() {
            return this.BPSTotal;
        }

        public DescribeDiskMonitorDataResponseBodyMonitorDataDiskMonitorData setBPSWrite(Integer BPSWrite) {
            this.BPSWrite = BPSWrite;
            return this;
        }
        public Integer getBPSWrite() {
            return this.BPSWrite;
        }

        public DescribeDiskMonitorDataResponseBodyMonitorDataDiskMonitorData setDiskId(String diskId) {
            this.diskId = diskId;
            return this;
        }
        public String getDiskId() {
            return this.diskId;
        }

        public DescribeDiskMonitorDataResponseBodyMonitorDataDiskMonitorData setIOPSRead(Integer IOPSRead) {
            this.IOPSRead = IOPSRead;
            return this;
        }
        public Integer getIOPSRead() {
            return this.IOPSRead;
        }

        public DescribeDiskMonitorDataResponseBodyMonitorDataDiskMonitorData setIOPSTotal(Integer IOPSTotal) {
            this.IOPSTotal = IOPSTotal;
            return this;
        }
        public Integer getIOPSTotal() {
            return this.IOPSTotal;
        }

        public DescribeDiskMonitorDataResponseBodyMonitorDataDiskMonitorData setIOPSWrite(Integer IOPSWrite) {
            this.IOPSWrite = IOPSWrite;
            return this;
        }
        public Integer getIOPSWrite() {
            return this.IOPSWrite;
        }

        public DescribeDiskMonitorDataResponseBodyMonitorDataDiskMonitorData setLatencyRead(Integer latencyRead) {
            this.latencyRead = latencyRead;
            return this;
        }
        public Integer getLatencyRead() {
            return this.latencyRead;
        }

        public DescribeDiskMonitorDataResponseBodyMonitorDataDiskMonitorData setLatencyWrite(Integer latencyWrite) {
            this.latencyWrite = latencyWrite;
            return this;
        }
        public Integer getLatencyWrite() {
            return this.latencyWrite;
        }

        public DescribeDiskMonitorDataResponseBodyMonitorDataDiskMonitorData setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
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
