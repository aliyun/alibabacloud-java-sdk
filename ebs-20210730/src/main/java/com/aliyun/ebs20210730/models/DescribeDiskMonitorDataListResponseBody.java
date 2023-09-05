// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeDiskMonitorDataListResponseBody extends TeaModel {
    /**
     * <p>The near real-time monitoring data of the disks.</p>
     */
    @NameInMap("MonitorData")
    public java.util.List<DescribeDiskMonitorDataListResponseBodyMonitorData> monitorData;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeDiskMonitorDataListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiskMonitorDataListResponseBody self = new DescribeDiskMonitorDataListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDiskMonitorDataListResponseBody setMonitorData(java.util.List<DescribeDiskMonitorDataListResponseBodyMonitorData> monitorData) {
        this.monitorData = monitorData;
        return this;
    }
    public java.util.List<DescribeDiskMonitorDataListResponseBodyMonitorData> getMonitorData() {
        return this.monitorData;
    }

    public DescribeDiskMonitorDataListResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeDiskMonitorDataListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDiskMonitorDataListResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDiskMonitorDataListResponseBodyMonitorData extends TeaModel {
        /**
         * <p>The number of burst I/O operations.</p>
         */
        @NameInMap("BurstIOCount")
        public Long burstIOCount;

        /**
         * <p>The ID of the disk.</p>
         */
        @NameInMap("DiskId")
        public String diskId;

        /**
         * <p>The beginning of the time range during which the performance of the disk bursts. The time follows the [ISO 8601](~~25696~~) standard in the `yyyy-MM-ddTHH:mm:ssZ` format. The time is displayed in UTC.</p>
         */
        @NameInMap("Timestamp")
        public String timestamp;

        public static DescribeDiskMonitorDataListResponseBodyMonitorData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDiskMonitorDataListResponseBodyMonitorData self = new DescribeDiskMonitorDataListResponseBodyMonitorData();
            return TeaModel.build(map, self);
        }

        public DescribeDiskMonitorDataListResponseBodyMonitorData setBurstIOCount(Long burstIOCount) {
            this.burstIOCount = burstIOCount;
            return this;
        }
        public Long getBurstIOCount() {
            return this.burstIOCount;
        }

        public DescribeDiskMonitorDataListResponseBodyMonitorData setDiskId(String diskId) {
            this.diskId = diskId;
            return this;
        }
        public String getDiskId() {
            return this.diskId;
        }

        public DescribeDiskMonitorDataListResponseBodyMonitorData setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

    }

}
