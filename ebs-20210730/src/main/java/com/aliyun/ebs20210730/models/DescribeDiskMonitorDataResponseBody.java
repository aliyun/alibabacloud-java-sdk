// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeDiskMonitorDataResponseBody extends TeaModel {
    /**
     * <p>The near real-time monitoring data of the disk.</p>
     */
    @NameInMap("MonitorData")
    public java.util.List<DescribeDiskMonitorDataResponseBodyMonitorData> monitorData;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
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
        /**
         * <p>The percentage of BPS.</p>
         * 
         * <strong>example:</strong>
         * <p>80(%)</p>
         */
        @NameInMap("BPSPercent")
        public Long BPSPercent;

        /**
         * <p>The number of burst I/O operations.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("BurstIOCount")
        public Long burstIOCount;

        /**
         * <p>The ID of the disk.</p>
         * 
         * <strong>example:</strong>
         * <p>d-bp1bq5g3dxxo1x4o****</p>
         */
        @NameInMap("DiskId")
        public String diskId;

        /**
         * <p>The percentage of IOPS.</p>
         * 
         * <strong>example:</strong>
         * <p>80(%)</p>
         */
        @NameInMap("IOPSPercent")
        public Long IOPSPercent;

        /**
         * <p>The read bandwidth of the disk. Unit: MByte/s.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ReadBPS")
        public Long readBPS;

        /**
         * <p>Read IO block size. Unit: Bytes</p>
         * 
         * <strong>example:</strong>
         * <p>4096</p>
         */
        @NameInMap("ReadBlockSize")
        public Long readBlockSize;

        /**
         * <p>The maximum number of read IOPS.</p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("ReadIOPS")
        public Long readIOPS;

        /**
         * <p>Read IO latency. Unit:  microsecond</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ReadLatency")
        public Long readLatency;

        /**
         * <p>The timestamp that is used to query the near real-time monitoring data of the disk. The time follows the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-06-01T08:00:00Z</p>
         */
        @NameInMap("Timestamp")
        public String timestamp;

        /**
         * <p>The write bandwidth of the disk. Unit: MByte/s.</p>
         * 
         * <strong>example:</strong>
         * <p>204</p>
         */
        @NameInMap("WriteBPS")
        public Long writeBPS;

        /**
         * <p>Write IO block size. Unit: Bytes</p>
         * 
         * <strong>example:</strong>
         * <p>4096</p>
         */
        @NameInMap("WriteBlockSize")
        public Long writeBlockSize;

        /**
         * <p>The maximum number of write IOPS.</p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("WriteIOPS")
        public Long writeIOPS;

        /**
         * <p>Write IO latency. Unit: microsecond</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("WriteLatency")
        public Long writeLatency;

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

        public DescribeDiskMonitorDataResponseBodyMonitorData setReadBlockSize(Long readBlockSize) {
            this.readBlockSize = readBlockSize;
            return this;
        }
        public Long getReadBlockSize() {
            return this.readBlockSize;
        }

        public DescribeDiskMonitorDataResponseBodyMonitorData setReadIOPS(Long readIOPS) {
            this.readIOPS = readIOPS;
            return this;
        }
        public Long getReadIOPS() {
            return this.readIOPS;
        }

        public DescribeDiskMonitorDataResponseBodyMonitorData setReadLatency(Long readLatency) {
            this.readLatency = readLatency;
            return this;
        }
        public Long getReadLatency() {
            return this.readLatency;
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

        public DescribeDiskMonitorDataResponseBodyMonitorData setWriteBlockSize(Long writeBlockSize) {
            this.writeBlockSize = writeBlockSize;
            return this;
        }
        public Long getWriteBlockSize() {
            return this.writeBlockSize;
        }

        public DescribeDiskMonitorDataResponseBodyMonitorData setWriteIOPS(Long writeIOPS) {
            this.writeIOPS = writeIOPS;
            return this;
        }
        public Long getWriteIOPS() {
            return this.writeIOPS;
        }

        public DescribeDiskMonitorDataResponseBodyMonitorData setWriteLatency(Long writeLatency) {
            this.writeLatency = writeLatency;
            return this;
        }
        public Long getWriteLatency() {
            return this.writeLatency;
        }

    }

}
