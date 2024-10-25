// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeDiskIopsListResponseBody extends TeaModel {
    /**
     * <p>The IOPS monitoring data of the cloud disk.</p>
     */
    @NameInMap("DiskIopsList")
    public java.util.List<DescribeDiskIopsListResponseBodyDiskIopsList> diskIopsList;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>A7814CAB-DB4E-140A-9D6F-7C8210C1DAC3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDiskIopsListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiskIopsListResponseBody self = new DescribeDiskIopsListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDiskIopsListResponseBody setDiskIopsList(java.util.List<DescribeDiskIopsListResponseBodyDiskIopsList> diskIopsList) {
        this.diskIopsList = diskIopsList;
        return this;
    }
    public java.util.List<DescribeDiskIopsListResponseBodyDiskIopsList> getDiskIopsList() {
        return this.diskIopsList;
    }

    public DescribeDiskIopsListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDiskIopsListResponseBodyDiskIopsList extends TeaModel {
        /**
         * <p>The business time . The time is displayed in the yyyy-MM-dd HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-12-14 00:00:00</p>
         */
        @NameInMap("BizTime")
        public String bizTime;

        /**
         * <p>The ID of the disk.</p>
         * 
         * <strong>example:</strong>
         * <p>d-5tzm9wnhzlhjzcbtxo465****</p>
         */
        @NameInMap("DiskId")
        public String diskId;

        /**
         * <p>The read throughput. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>10054</p>
         */
        @NameInMap("ReadBytes")
        public Long readBytes;

        /**
         * <p>The read latency. Unit: ms.</p>
         * 
         * <strong>example:</strong>
         * <p>15646532</p>
         */
        @NameInMap("ReadLatency")
        public Long readLatency;

        /**
         * <p>The read IOPS.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("ReadOps")
        public Long readOps;

        /**
         * <p>The ID of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-3</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The write throughput. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("WriteBytes")
        public Long writeBytes;

        /**
         * <p>The write latency. Unit: microseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("WriteLatency")
        public Long writeLatency;

        /**
         * <p>The write IOPS.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("WriteOps")
        public Long writeOps;

        public static DescribeDiskIopsListResponseBodyDiskIopsList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDiskIopsListResponseBodyDiskIopsList self = new DescribeDiskIopsListResponseBodyDiskIopsList();
            return TeaModel.build(map, self);
        }

        public DescribeDiskIopsListResponseBodyDiskIopsList setBizTime(String bizTime) {
            this.bizTime = bizTime;
            return this;
        }
        public String getBizTime() {
            return this.bizTime;
        }

        public DescribeDiskIopsListResponseBodyDiskIopsList setDiskId(String diskId) {
            this.diskId = diskId;
            return this;
        }
        public String getDiskId() {
            return this.diskId;
        }

        public DescribeDiskIopsListResponseBodyDiskIopsList setReadBytes(Long readBytes) {
            this.readBytes = readBytes;
            return this;
        }
        public Long getReadBytes() {
            return this.readBytes;
        }

        public DescribeDiskIopsListResponseBodyDiskIopsList setReadLatency(Long readLatency) {
            this.readLatency = readLatency;
            return this;
        }
        public Long getReadLatency() {
            return this.readLatency;
        }

        public DescribeDiskIopsListResponseBodyDiskIopsList setReadOps(Long readOps) {
            this.readOps = readOps;
            return this;
        }
        public Long getReadOps() {
            return this.readOps;
        }

        public DescribeDiskIopsListResponseBodyDiskIopsList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDiskIopsListResponseBodyDiskIopsList setWriteBytes(Long writeBytes) {
            this.writeBytes = writeBytes;
            return this;
        }
        public Long getWriteBytes() {
            return this.writeBytes;
        }

        public DescribeDiskIopsListResponseBodyDiskIopsList setWriteLatency(Long writeLatency) {
            this.writeLatency = writeLatency;
            return this;
        }
        public Long getWriteLatency() {
            return this.writeLatency;
        }

        public DescribeDiskIopsListResponseBodyDiskIopsList setWriteOps(Long writeOps) {
            this.writeOps = writeOps;
            return this;
        }
        public Long getWriteOps() {
            return this.writeOps;
        }

    }

}
