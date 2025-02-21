// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeLensMonitorDisksResponseBody extends TeaModel {
    /**
     * <p>The information about the disks.</p>
     */
    @NameInMap("DiskInfos")
    public java.util.List<DescribeLensMonitorDisksResponseBodyDiskInfos> diskInfos;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

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
         * <p>The BPS.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("Bps")
        public Integer bps;

        /**
         * <p>Indicates whether the performance burst feature is enabled. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <p>This parameter is available only if you set <code>DiskCategory</code> to <code>cloud_auto</code>. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disks</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("BurstingEnabled")
        public Boolean burstingEnabled;

        /**
         * <p>The type of the disk. Valid values:</p>
         * <ul>
         * <li>cloud</li>
         * <li>cloud_efficiency</li>
         * <li>cloud_ssd</li>
         * <li>cloud_essd</li>
         * <li>cloud_auto</li>
         * <li>cloud_essd_entry</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cloud_essd</p>
         */
        @NameInMap("DiskCategory")
        public String diskCategory;

        /**
         * <p>The ID of the disk.</p>
         * 
         * <strong>example:</strong>
         * <p>d-cd401****</p>
         */
        @NameInMap("DiskId")
        public String diskId;

        /**
         * <p>The name of the disk.</p>
         * 
         * <strong>example:</strong>
         * <p>disk-28c6b****</p>
         */
        @NameInMap("DiskName")
        public String diskName;

        /**
         * <p>The disk status. Valid values:</p>
         * <ul>
         * <li>Available</li>
         * <li>Deleted</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("DiskStatus")
        public String diskStatus;

        /**
         * <p>The disk type. Valid values:</p>
         * <ul>
         * <li>system: system disk</li>
         * <li>data: data disk</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>system</p>
         */
        @NameInMap("DiskType")
        public String diskType;

        /**
         * <p>The IOPS.</p>
         * 
         * <strong>example:</strong>
         * <p>4000</p>
         */
        @NameInMap("Iops")
        public Integer iops;

        /**
         * <p>Event tags of the disk.</p>
         */
        @NameInMap("LensTags")
        public java.util.List<String> lensTags;

        /**
         * <p>The new performance level of the ESSD. Valid values:</p>
         * <ul>
         * <li>PL0: An ESSD can deliver up to 10,000 random read/write IOPS.</li>
         * <li>PL1: An ESSD can deliver up to 50,000 random read/write IOPS.</li>
         * <li>PL2: An ESSD can deliver up to 100,000 random read/write IOPS.</li>
         * <li>PL3: An ESSD delivers up to 1,000,000 random read/write IOPS.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PL0</p>
         */
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        /**
         * <p>The provisioned read/write IOPS of the ESSD AutoPL disk to use as the system disk. Valid values: 0 to min{50,000, 1,000 × Capacity - Baseline IOPS}.</p>
         * <p>Baseline performance = min{1,800 + 50 × Capacity, 50,000}</p>
         * <p>This parameter is available only if you set <code>DiskCategory</code> to <code>cloud_auto</code>. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disks</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>4000</p>
         */
        @NameInMap("ProvisionedIops")
        public Integer provisionedIops;

        /**
         * <p>The region ID of the disk.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The size of the disk. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>64</p>
         */
        @NameInMap("Size")
        public Integer size;

        /**
         * <p>Tags of the disk.</p>
         */
        @NameInMap("Tags")
        public java.util.List<DescribeLensMonitorDisksResponseBodyDiskInfosTags> tags;

        /**
         * <p>The ID of the zone.</p>
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
