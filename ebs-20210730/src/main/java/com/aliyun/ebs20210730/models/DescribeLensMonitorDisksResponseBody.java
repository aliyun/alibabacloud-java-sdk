// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeLensMonitorDisksResponseBody extends TeaModel {
    /**
     * <p>The list of cloud disk information.</p>
     */
    @NameInMap("DiskInfos")
    public java.util.List<DescribeLensMonitorDisksResponseBodyDiskInfos> diskInfos;

    /**
     * <p>The pagination token. Set this parameter to the NextToken value returned in the previous API call.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID. A request ID is returned regardless of whether the API call succeeds.</p>
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
     * <p>6</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeLensMonitorDisksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLensMonitorDisksResponseBody self = new DescribeLensMonitorDisksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLensMonitorDisksResponseBody setDiskInfos(java.util.List<DescribeLensMonitorDisksResponseBodyDiskInfos> diskInfos) {
        this.diskInfos = diskInfos;
        return this;
    }
    public java.util.List<DescribeLensMonitorDisksResponseBodyDiskInfos> getDiskInfos() {
        return this.diskInfos;
    }

    public DescribeLensMonitorDisksResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeLensMonitorDisksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLensMonitorDisksResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeLensMonitorDisksResponseBodyDiskInfosTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>tag1</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeLensMonitorDisksResponseBodyDiskInfosTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeLensMonitorDisksResponseBodyDiskInfosTags self = new DescribeLensMonitorDisksResponseBodyDiskInfosTags();
            return TeaModel.build(map, self);
        }

        public DescribeLensMonitorDisksResponseBodyDiskInfosTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeLensMonitorDisksResponseBodyDiskInfosTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeLensMonitorDisksResponseBodyDiskInfos extends TeaModel {
        /**
         * <p>The maximum data throughput for read/write (I/O) operations per second. Unit: MB/s.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("Bps")
        public Integer bps;

        /**
         * <p>Indicates whether burst (performance bursting) is enabled. Valid values:</p>
         * <ul>
         * <li>true: Enabled.</li>
         * <li>false: Disabled.</li>
         * </ul>
         * <p>This parameter is supported only when DiskCategory is set to cloud_auto. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL cloud disk</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("BurstingEnabled")
        public Boolean burstingEnabled;

        /**
         * <p>The cloud disk type. Valid values:</p>
         * <ul>
         * <li>cloud: basic cloud disk.</li>
         * <li>cloud_efficiency: ultra cloud disk.</li>
         * <li>cloud_ssd: standard SSD.</li>
         * <li>cloud_essd: Enterprise SSD (ESSD).</li>
         * <li>cloud_auto: ESSD AutoPL cloud disk.</li>
         * <li>cloud_essd_entry: ESSD Entry disk.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cloud_essd</p>
         */
        @NameInMap("DiskCategory")
        public String diskCategory;

        /**
         * <p>The cloud disk ID.</p>
         * 
         * <strong>example:</strong>
         * <p>d-cd401****</p>
         */
        @NameInMap("DiskId")
        public String diskId;

        /**
         * <p>The cloud disk name.</p>
         * 
         * <strong>example:</strong>
         * <p>disk-28c6b****</p>
         */
        @NameInMap("DiskName")
        public String diskName;

        /**
         * <p>The cloud disk status. Valid values:</p>
         * <ul>
         * <li>Available: in use.</li>
         * <li>Deleted: deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("DiskStatus")
        public String diskStatus;

        /**
         * <p>The cloud disk type. Valid values:</p>
         * <ul>
         * <li>system: system cloud disk.</li>
         * <li>data: data cloud disk.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>system</p>
         */
        @NameInMap("DiskType")
        public String diskType;

        /**
         * <p>The maximum number of read/write (I/O) operations per second. Unit: operations/s.</p>
         * 
         * <strong>example:</strong>
         * <p>4000</p>
         */
        @NameInMap("Iops")
        public Integer iops;

        /**
         * <p>The collection of event tags for the cloud disk. Event tags display events that occurred on the cloud disk within the last 24 hours, with a delay of up to 1 hour compared to the actual events.</p>
         */
        @NameInMap("LensTags")
        public java.util.List<String> lensTags;

        /**
         * <p>The performance level (PL) of the ESSD cloud disk. Valid values:</p>
         * <ul>
         * <li>PL0: maximum random read/write IOPS of 10,000 per standard SSD.</li>
         * <li>PL1: maximum random read/write IOPS of 50,000 per standard SSD.</li>
         * <li>PL2: maximum random read/write IOPS of 100,000 per standard SSD.</li>
         * <li>PL3: maximum random read/write IOPS of 1,000,000 per standard SSD.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PL0</p>
         */
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        /**
         * <p>The provisioned read/write IOPS of the ESSD AutoPL cloud disk. Valid values: 0 to min{50,000, 1,000 × Capacity - Baseline performance}.</p>
         * <p>Baseline performance = min{1,800 + 50 × Capacity, 50,000}.</p>
         * <p>This parameter is supported only when DiskCategory is set to cloud_auto. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL cloud disk</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>4000</p>
         */
        @NameInMap("ProvisionedIops")
        public Integer provisionedIops;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>Indicates whether the cloud disk is a shared cloud disk.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SharingEnabled")
        public String sharingEnabled;

        /**
         * <p>The cloud disk size. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>64</p>
         */
        @NameInMap("Size")
        public Integer size;

        /**
         * <p>The collection of tags for the cloud disk.</p>
         */
        @NameInMap("Tags")
        public java.util.List<DescribeLensMonitorDisksResponseBodyDiskInfosTags> tags;

        /**
         * <p>The zone ID of the cloud disk.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-j</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeLensMonitorDisksResponseBodyDiskInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeLensMonitorDisksResponseBodyDiskInfos self = new DescribeLensMonitorDisksResponseBodyDiskInfos();
            return TeaModel.build(map, self);
        }

        public DescribeLensMonitorDisksResponseBodyDiskInfos setBps(Integer bps) {
            this.bps = bps;
            return this;
        }
        public Integer getBps() {
            return this.bps;
        }

        public DescribeLensMonitorDisksResponseBodyDiskInfos setBurstingEnabled(Boolean burstingEnabled) {
            this.burstingEnabled = burstingEnabled;
            return this;
        }
        public Boolean getBurstingEnabled() {
            return this.burstingEnabled;
        }

        public DescribeLensMonitorDisksResponseBodyDiskInfos setDiskCategory(String diskCategory) {
            this.diskCategory = diskCategory;
            return this;
        }
        public String getDiskCategory() {
            return this.diskCategory;
        }

        public DescribeLensMonitorDisksResponseBodyDiskInfos setDiskId(String diskId) {
            this.diskId = diskId;
            return this;
        }
        public String getDiskId() {
            return this.diskId;
        }

        public DescribeLensMonitorDisksResponseBodyDiskInfos setDiskName(String diskName) {
            this.diskName = diskName;
            return this;
        }
        public String getDiskName() {
            return this.diskName;
        }

        public DescribeLensMonitorDisksResponseBodyDiskInfos setDiskStatus(String diskStatus) {
            this.diskStatus = diskStatus;
            return this;
        }
        public String getDiskStatus() {
            return this.diskStatus;
        }

        public DescribeLensMonitorDisksResponseBodyDiskInfos setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

        public DescribeLensMonitorDisksResponseBodyDiskInfos setIops(Integer iops) {
            this.iops = iops;
            return this;
        }
        public Integer getIops() {
            return this.iops;
        }

        public DescribeLensMonitorDisksResponseBodyDiskInfos setLensTags(java.util.List<String> lensTags) {
            this.lensTags = lensTags;
            return this;
        }
        public java.util.List<String> getLensTags() {
            return this.lensTags;
        }

        public DescribeLensMonitorDisksResponseBodyDiskInfos setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public DescribeLensMonitorDisksResponseBodyDiskInfos setProvisionedIops(Integer provisionedIops) {
            this.provisionedIops = provisionedIops;
            return this;
        }
        public Integer getProvisionedIops() {
            return this.provisionedIops;
        }

        public DescribeLensMonitorDisksResponseBodyDiskInfos setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeLensMonitorDisksResponseBodyDiskInfos setSharingEnabled(String sharingEnabled) {
            this.sharingEnabled = sharingEnabled;
            return this;
        }
        public String getSharingEnabled() {
            return this.sharingEnabled;
        }

        public DescribeLensMonitorDisksResponseBodyDiskInfos setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public DescribeLensMonitorDisksResponseBodyDiskInfos setTags(java.util.List<DescribeLensMonitorDisksResponseBodyDiskInfosTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeLensMonitorDisksResponseBodyDiskInfosTags> getTags() {
            return this.tags;
        }

        public DescribeLensMonitorDisksResponseBodyDiskInfos setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
