// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDiskMonitorDataResponseBody extends TeaModel {
    /**
     * <p>The monitoring data of the disk.</p>
     */
    @NameInMap("MonitorData")
    public DescribeDiskMonitorDataResponseBodyMonitorData monitorData;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of monitoring data entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
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
        /**
         * <p>The read bandwidth of the disk. Unit: byte/s.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("BPSRead")
        public Integer BPSRead;

        /**
         * <p>The total read and write bandwidth of the disk. Unit: byte/s.</p>
         * 
         * <strong>example:</strong>
         * <p>204</p>
         */
        @NameInMap("BPSTotal")
        public Integer BPSTotal;

        /**
         * <p>The write bandwidth of the disk. Unit: byte/s.</p>
         * 
         * <strong>example:</strong>
         * <p>204</p>
         */
        @NameInMap("BPSWrite")
        public Integer BPSWrite;

        /**
         * <p>The ID of the disk.</p>
         * 
         * <strong>example:</strong>
         * <p>d-bp1bq5g3dxxo1x4o****</p>
         */
        @NameInMap("DiskId")
        public String diskId;

        /**
         * <p>The number of read I/O operations per second on the disk.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IOPSRead")
        public Integer IOPSRead;

        /**
         * <p>The total number of read and write I/O operations per second on the disk.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IOPSTotal")
        public Integer IOPSTotal;

        /**
         * <p>The number of write I/O operations per second on the disk.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IOPSWrite")
        public Integer IOPSWrite;

        /**
         * <p>The read latency of the disk. Unit: microseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("LatencyRead")
        public Integer latencyRead;

        /**
         * <p>The write latency of the disk. Unit: microseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("LatencyWrite")
        public Integer latencyWrite;

        /**
         * <p>The timestamp of the monitoring data. The time follows the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2014-07-23T12:07:00Z</p>
         */
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
