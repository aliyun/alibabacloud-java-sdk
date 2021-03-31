// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDiskMonitorDataResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("MonitorData")
    @Validation(required = true)
    public DescribeDiskMonitorDataResponseMonitorData monitorData;

    public static DescribeDiskMonitorDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiskMonitorDataResponse self = new DescribeDiskMonitorDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDiskMonitorDataResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDiskMonitorDataResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeDiskMonitorDataResponse setMonitorData(DescribeDiskMonitorDataResponseMonitorData monitorData) {
        this.monitorData = monitorData;
        return this;
    }
    public DescribeDiskMonitorDataResponseMonitorData getMonitorData() {
        return this.monitorData;
    }

    public static class DescribeDiskMonitorDataResponseMonitorDataDiskMonitorData extends TeaModel {
        @NameInMap("DiskId")
        @Validation(required = true)
        public String diskId;

        @NameInMap("IOPSRead")
        @Validation(required = true)
        public Integer IOPSRead;

        @NameInMap("IOPSWrite")
        @Validation(required = true)
        public Integer IOPSWrite;

        @NameInMap("IOPSTotal")
        @Validation(required = true)
        public Integer IOPSTotal;

        @NameInMap("BPSRead")
        @Validation(required = true)
        public Integer BPSRead;

        @NameInMap("BPSWrite")
        @Validation(required = true)
        public Integer BPSWrite;

        @NameInMap("BPSTotal")
        @Validation(required = true)
        public Integer BPSTotal;

        @NameInMap("LatencyRead")
        @Validation(required = true)
        public Integer latencyRead;

        @NameInMap("LatencyWrite")
        @Validation(required = true)
        public Integer latencyWrite;

        @NameInMap("TimeStamp")
        @Validation(required = true)
        public String timeStamp;

        public static DescribeDiskMonitorDataResponseMonitorDataDiskMonitorData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDiskMonitorDataResponseMonitorDataDiskMonitorData self = new DescribeDiskMonitorDataResponseMonitorDataDiskMonitorData();
            return TeaModel.build(map, self);
        }

        public DescribeDiskMonitorDataResponseMonitorDataDiskMonitorData setDiskId(String diskId) {
            this.diskId = diskId;
            return this;
        }
        public String getDiskId() {
            return this.diskId;
        }

        public DescribeDiskMonitorDataResponseMonitorDataDiskMonitorData setIOPSRead(Integer IOPSRead) {
            this.IOPSRead = IOPSRead;
            return this;
        }
        public Integer getIOPSRead() {
            return this.IOPSRead;
        }

        public DescribeDiskMonitorDataResponseMonitorDataDiskMonitorData setIOPSWrite(Integer IOPSWrite) {
            this.IOPSWrite = IOPSWrite;
            return this;
        }
        public Integer getIOPSWrite() {
            return this.IOPSWrite;
        }

        public DescribeDiskMonitorDataResponseMonitorDataDiskMonitorData setIOPSTotal(Integer IOPSTotal) {
            this.IOPSTotal = IOPSTotal;
            return this;
        }
        public Integer getIOPSTotal() {
            return this.IOPSTotal;
        }

        public DescribeDiskMonitorDataResponseMonitorDataDiskMonitorData setBPSRead(Integer BPSRead) {
            this.BPSRead = BPSRead;
            return this;
        }
        public Integer getBPSRead() {
            return this.BPSRead;
        }

        public DescribeDiskMonitorDataResponseMonitorDataDiskMonitorData setBPSWrite(Integer BPSWrite) {
            this.BPSWrite = BPSWrite;
            return this;
        }
        public Integer getBPSWrite() {
            return this.BPSWrite;
        }

        public DescribeDiskMonitorDataResponseMonitorDataDiskMonitorData setBPSTotal(Integer BPSTotal) {
            this.BPSTotal = BPSTotal;
            return this;
        }
        public Integer getBPSTotal() {
            return this.BPSTotal;
        }

        public DescribeDiskMonitorDataResponseMonitorDataDiskMonitorData setLatencyRead(Integer latencyRead) {
            this.latencyRead = latencyRead;
            return this;
        }
        public Integer getLatencyRead() {
            return this.latencyRead;
        }

        public DescribeDiskMonitorDataResponseMonitorDataDiskMonitorData setLatencyWrite(Integer latencyWrite) {
            this.latencyWrite = latencyWrite;
            return this;
        }
        public Integer getLatencyWrite() {
            return this.latencyWrite;
        }

        public DescribeDiskMonitorDataResponseMonitorDataDiskMonitorData setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class DescribeDiskMonitorDataResponseMonitorData extends TeaModel {
        @NameInMap("DiskMonitorData")
        @Validation(required = true)
        public java.util.List<DescribeDiskMonitorDataResponseMonitorDataDiskMonitorData> diskMonitorData;

        public static DescribeDiskMonitorDataResponseMonitorData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDiskMonitorDataResponseMonitorData self = new DescribeDiskMonitorDataResponseMonitorData();
            return TeaModel.build(map, self);
        }

        public DescribeDiskMonitorDataResponseMonitorData setDiskMonitorData(java.util.List<DescribeDiskMonitorDataResponseMonitorDataDiskMonitorData> diskMonitorData) {
            this.diskMonitorData = diskMonitorData;
            return this;
        }
        public java.util.List<DescribeDiskMonitorDataResponseMonitorDataDiskMonitorData> getDiskMonitorData() {
            return this.diskMonitorData;
        }

    }

}
