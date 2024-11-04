// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSnapshotsResponseBody extends TeaModel {
    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Details about the snapshots.</p>
     */
    @NameInMap("Snapshots")
    public DescribeSnapshotsResponseBodySnapshots snapshots;

    /**
     * <p>The total number of snapshots returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeSnapshotsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSnapshotsResponseBody self = new DescribeSnapshotsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSnapshotsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeSnapshotsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSnapshotsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSnapshotsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSnapshotsResponseBody setSnapshots(DescribeSnapshotsResponseBodySnapshots snapshots) {
        this.snapshots = snapshots;
        return this;
    }
    public DescribeSnapshotsResponseBodySnapshots getSnapshots() {
        return this.snapshots;
    }

    public DescribeSnapshotsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeSnapshotsResponseBodySnapshotsSnapshotTagsTag extends TeaModel {
        /**
         * <p>The tag key of the snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value of the snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeSnapshotsResponseBodySnapshotsSnapshotTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeSnapshotsResponseBodySnapshotsSnapshotTagsTag self = new DescribeSnapshotsResponseBodySnapshotsSnapshotTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeSnapshotsResponseBodySnapshotsSnapshotTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeSnapshotsResponseBodySnapshotsSnapshotTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeSnapshotsResponseBodySnapshotsSnapshotTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeSnapshotsResponseBodySnapshotsSnapshotTagsTag> tag;

        public static DescribeSnapshotsResponseBodySnapshotsSnapshotTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeSnapshotsResponseBodySnapshotsSnapshotTags self = new DescribeSnapshotsResponseBodySnapshotsSnapshotTags();
            return TeaModel.build(map, self);
        }

        public DescribeSnapshotsResponseBodySnapshotsSnapshotTags setTag(java.util.List<DescribeSnapshotsResponseBodySnapshotsSnapshotTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeSnapshotsResponseBodySnapshotsSnapshotTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeSnapshotsResponseBodySnapshotsSnapshot extends TeaModel {
        /**
         * <p>Indicates whether the snapshot can be shared and be used to create or roll back a cloud disk. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Available")
        public Boolean available;

        /**
         * <p>The category of the snapshot.</p>
         * <blockquote>
         * <p> This parameter will be removed in the future. We recommend that you use <code>InstantAccess</code> to ensure future compatibility.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>standard</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The time when the snapshot was created. The time follows the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-08-20T14:52:28Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description of the snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>testDescription</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Indicates whether the snapshot is encrypted.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Encrypted")
        public Boolean encrypted;

        /**
         * <p>Indicates whether the instant access feature is enabled. Valid values:</p>
         * <ul>
         * <li>true: The instant access feature is enabled. By default, the instant access feature is enabled for Enterprise SSDs (ESSDs) and ESSD Entry disks.</li>
         * <li>false: The instant access feature is disabled. The snapshot is a standard snapshot for which the instant access feature is disabled.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is no longer used. The standard snapshots of ESSDs are upgraded to support the instant access feature by default. No additional configurations are required to enable the feature and you are not charged for the feature. For more information, see <a href="https://help.aliyun.com/document_detail/193667.html">Use the instant access feature</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("InstantAccess")
        public Boolean instantAccess;

        /**
         * <p>Indicates the validity period of the instant access feature. When the specified period expires, the instant access feature is automatically disabled.</p>
         * <p>By default, the value of this parameter is the same as the value of <code>RetentionDays</code>.</p>
         * <blockquote>
         * <p> This parameter is no longer used. The standard snapshots of ESSDs are upgraded to support the instant access feature by default. No additional configurations are required to enable the feature and you are not charged for the feature. For more information, see <a href="https://help.aliyun.com/document_detail/193667.html">Use the instant access feature</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("InstantAccessRetentionDays")
        public Integer instantAccessRetentionDays;

        /**
         * <p>The ID of the KMS key used for the data disk.</p>
         * 
         * <strong>example:</strong>
         * <p>0e478b7a-4262-4802-b8cb-00d3fb40****</p>
         */
        @NameInMap("KMSKeyId")
        public String KMSKeyId;

        /**
         * <p>The time when the snapshot was last modified. The time follows the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-08-25T14:18:09Z</p>
         */
        @NameInMap("LastModifiedTime")
        public String lastModifiedTime;

        /**
         * <p>The product code of the Alibaba Cloud Marketplace image.</p>
         * 
         * <strong>example:</strong>
         * <p>jxsc000****</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <p>The progress of the snapshot creation task. Unit: percent (%).</p>
         * 
         * <strong>example:</strong>
         * <p>100%</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The region ID of the snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The amount of remaining time required to create the snapshot. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>38</p>
         */
        @NameInMap("RemainTime")
        public Integer remainTime;

        /**
         * <p>The ID of the resource group to which the snapshot belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-bp67acfmxazb4p****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The retention period of the automatic snapshot. Unit: days.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("RetentionDays")
        public Integer retentionDays;

        /**
         * <p>The ID of the snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>s-bp67acfmxazb4p****</p>
         */
        @NameInMap("SnapshotId")
        public String snapshotId;

        /**
         * <p>The ID of the snapshot chain that is associated with the snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>sl-bp1grgphbcc9brb5****</p>
         */
        @NameInMap("SnapshotLinkId")
        public String snapshotLinkId;

        /**
         * <p>The name of the snapshot. This parameter is returned only if a snapshot name was specified when the snapshot was created.</p>
         * 
         * <strong>example:</strong>
         * <p>testSnapshotName</p>
         */
        @NameInMap("SnapshotName")
        public String snapshotName;

        /**
         * <p>The serial number of the snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>64472-116742336-61976****</p>
         */
        @NameInMap("SnapshotSN")
        public String snapshotSN;

        /**
         * <p>The type of the snapshot. Valid values:</p>
         * <ul>
         * <li>auto or timer: automatic snapshot</li>
         * <li>user: manual snapshot</li>
         * <li>all: all snapshot types</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>all</p>
         */
        @NameInMap("SnapshotType")
        public String snapshotType;

        /**
         * <p>The ID of the source disk. This parameter is retained even after the source disk is released.</p>
         * 
         * <strong>example:</strong>
         * <p>d-bp67acfmxazb4ph****</p>
         */
        @NameInMap("SourceDiskId")
        public String sourceDiskId;

        /**
         * <p>The capacity of the source disk. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("SourceDiskSize")
        public String sourceDiskSize;

        /**
         * <p>The type of the source disk. Valid values:</p>
         * <ul>
         * <li>system</li>
         * <li>data</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>system</p>
         */
        @NameInMap("SourceDiskType")
        public String sourceDiskType;

        /**
         * <p>The region ID of the source snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("SourceRegionId")
        public String sourceRegionId;

        /**
         * <p>The ID of the source snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>s-bp67acfmxazb4p****</p>
         */
        @NameInMap("SourceSnapshotId")
        public String sourceSnapshotId;

        /**
         * <p>The category of the source disk.</p>
         * <blockquote>
         * <p> This parameter will be removed in the future. We recommend that you use other parameters to ensure future compatibility.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>disk</p>
         */
        @NameInMap("SourceStorageType")
        public String sourceStorageType;

        /**
         * <p>The status of the snapshot. Valid values:</p>
         * <ul>
         * <li>progressing</li>
         * <li>accomplished</li>
         * <li>failed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>accomplished</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tags of the snapshot.</p>
         */
        @NameInMap("Tags")
        public DescribeSnapshotsResponseBodySnapshotsSnapshotTags tags;

        /**
         * <p>Indicates whether the snapshot was used to create images or disks. Valid values:</p>
         * <ul>
         * <li>image</li>
         * <li>disk</li>
         * <li>image_disk</li>
         * <li>none</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>image</p>
         */
        @NameInMap("Usage")
        public String usage;

        public static DescribeSnapshotsResponseBodySnapshotsSnapshot build(java.util.Map<String, ?> map) throws Exception {
            DescribeSnapshotsResponseBodySnapshotsSnapshot self = new DescribeSnapshotsResponseBodySnapshotsSnapshot();
            return TeaModel.build(map, self);
        }

        public DescribeSnapshotsResponseBodySnapshotsSnapshot setAvailable(Boolean available) {
            this.available = available;
            return this;
        }
        public Boolean getAvailable() {
            return this.available;
        }

        public DescribeSnapshotsResponseBodySnapshotsSnapshot setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeSnapshotsResponseBodySnapshotsSnapshot setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeSnapshotsResponseBodySnapshotsSnapshot setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeSnapshotsResponseBodySnapshotsSnapshot setEncrypted(Boolean encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public Boolean getEncrypted() {
            return this.encrypted;
        }

        public DescribeSnapshotsResponseBodySnapshotsSnapshot setInstantAccess(Boolean instantAccess) {
            this.instantAccess = instantAccess;
            return this;
        }
        public Boolean getInstantAccess() {
            return this.instantAccess;
        }

        public DescribeSnapshotsResponseBodySnapshotsSnapshot setInstantAccessRetentionDays(Integer instantAccessRetentionDays) {
            this.instantAccessRetentionDays = instantAccessRetentionDays;
            return this;
        }
        public Integer getInstantAccessRetentionDays() {
            return this.instantAccessRetentionDays;
        }

        public DescribeSnapshotsResponseBodySnapshotsSnapshot setKMSKeyId(String KMSKeyId) {
            this.KMSKeyId = KMSKeyId;
            return this;
        }
        public String getKMSKeyId() {
            return this.KMSKeyId;
        }

        public DescribeSnapshotsResponseBodySnapshotsSnapshot setLastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }
        public String getLastModifiedTime() {
            return this.lastModifiedTime;
        }

        public DescribeSnapshotsResponseBodySnapshotsSnapshot setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public DescribeSnapshotsResponseBodySnapshotsSnapshot setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeSnapshotsResponseBodySnapshotsSnapshot setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeSnapshotsResponseBodySnapshotsSnapshot setRemainTime(Integer remainTime) {
            this.remainTime = remainTime;
            return this;
        }
        public Integer getRemainTime() {
            return this.remainTime;
        }

        public DescribeSnapshotsResponseBodySnapshotsSnapshot setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeSnapshotsResponseBodySnapshotsSnapshot setRetentionDays(Integer retentionDays) {
            this.retentionDays = retentionDays;
            return this;
        }
        public Integer getRetentionDays() {
            return this.retentionDays;
        }

        public DescribeSnapshotsResponseBodySnapshotsSnapshot setSnapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public String getSnapshotId() {
            return this.snapshotId;
        }

        public DescribeSnapshotsResponseBodySnapshotsSnapshot setSnapshotLinkId(String snapshotLinkId) {
            this.snapshotLinkId = snapshotLinkId;
            return this;
        }
        public String getSnapshotLinkId() {
            return this.snapshotLinkId;
        }

        public DescribeSnapshotsResponseBodySnapshotsSnapshot setSnapshotName(String snapshotName) {
            this.snapshotName = snapshotName;
            return this;
        }
        public String getSnapshotName() {
            return this.snapshotName;
        }

        public DescribeSnapshotsResponseBodySnapshotsSnapshot setSnapshotSN(String snapshotSN) {
            this.snapshotSN = snapshotSN;
            return this;
        }
        public String getSnapshotSN() {
            return this.snapshotSN;
        }

        public DescribeSnapshotsResponseBodySnapshotsSnapshot setSnapshotType(String snapshotType) {
            this.snapshotType = snapshotType;
            return this;
        }
        public String getSnapshotType() {
            return this.snapshotType;
        }

        public DescribeSnapshotsResponseBodySnapshotsSnapshot setSourceDiskId(String sourceDiskId) {
            this.sourceDiskId = sourceDiskId;
            return this;
        }
        public String getSourceDiskId() {
            return this.sourceDiskId;
        }

        public DescribeSnapshotsResponseBodySnapshotsSnapshot setSourceDiskSize(String sourceDiskSize) {
            this.sourceDiskSize = sourceDiskSize;
            return this;
        }
        public String getSourceDiskSize() {
            return this.sourceDiskSize;
        }

        public DescribeSnapshotsResponseBodySnapshotsSnapshot setSourceDiskType(String sourceDiskType) {
            this.sourceDiskType = sourceDiskType;
            return this;
        }
        public String getSourceDiskType() {
            return this.sourceDiskType;
        }

        public DescribeSnapshotsResponseBodySnapshotsSnapshot setSourceRegionId(String sourceRegionId) {
            this.sourceRegionId = sourceRegionId;
            return this;
        }
        public String getSourceRegionId() {
            return this.sourceRegionId;
        }

        public DescribeSnapshotsResponseBodySnapshotsSnapshot setSourceSnapshotId(String sourceSnapshotId) {
            this.sourceSnapshotId = sourceSnapshotId;
            return this;
        }
        public String getSourceSnapshotId() {
            return this.sourceSnapshotId;
        }

        public DescribeSnapshotsResponseBodySnapshotsSnapshot setSourceStorageType(String sourceStorageType) {
            this.sourceStorageType = sourceStorageType;
            return this;
        }
        public String getSourceStorageType() {
            return this.sourceStorageType;
        }

        public DescribeSnapshotsResponseBodySnapshotsSnapshot setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeSnapshotsResponseBodySnapshotsSnapshot setTags(DescribeSnapshotsResponseBodySnapshotsSnapshotTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeSnapshotsResponseBodySnapshotsSnapshotTags getTags() {
            return this.tags;
        }

        public DescribeSnapshotsResponseBodySnapshotsSnapshot setUsage(String usage) {
            this.usage = usage;
            return this;
        }
        public String getUsage() {
            return this.usage;
        }

    }

    public static class DescribeSnapshotsResponseBodySnapshots extends TeaModel {
        @NameInMap("Snapshot")
        public java.util.List<DescribeSnapshotsResponseBodySnapshotsSnapshot> snapshot;

        public static DescribeSnapshotsResponseBodySnapshots build(java.util.Map<String, ?> map) throws Exception {
            DescribeSnapshotsResponseBodySnapshots self = new DescribeSnapshotsResponseBodySnapshots();
            return TeaModel.build(map, self);
        }

        public DescribeSnapshotsResponseBodySnapshots setSnapshot(java.util.List<DescribeSnapshotsResponseBodySnapshotsSnapshot> snapshot) {
            this.snapshot = snapshot;
            return this;
        }
        public java.util.List<DescribeSnapshotsResponseBodySnapshotsSnapshot> getSnapshot() {
            return this.snapshot;
        }

    }

}
