// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSnapshotsResponseBody extends TeaModel {
    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The page number.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details about the snapshots.</p>
     */
    @NameInMap("Snapshots")
    public DescribeSnapshotsResponseBodySnapshots snapshots;

    /**
     * <p>The total number of snapshots returned.</p>
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
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value of the snapshot.</p>
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
         * <p>The type of the snapshot.</p>
         * <br>
         * <p>>  This parameter will be deprecated in the future. We recommend that you use `InstantAccess` to ensure future compatibility.</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The time when the snapshot was created. The time follows the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description of the snapshot.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Indicates whether the snapshot was encrypted.</p>
         */
        @NameInMap("Encrypted")
        public Boolean encrypted;

        /**
         * <p>Indicates whether the instant access feature is enabled. Valid values:</p>
         * <br>
         * <p>*   true. This feature can be enabled only for enhanced SSDs (ESSDs).</p>
         * <p>*   false. The snapshot is a normal snapshot for which the instant access feature is disabled.</p>
         */
        @NameInMap("InstantAccess")
        public Boolean instantAccess;

        /**
         * <p>The validity period of the instant access feature. The instant access feature is automatically disabled when the specified period expires.</p>
         * <br>
         * <p>By default, the value of this parameter is the same as the value of the `RetentionDays` parameter.</p>
         */
        @NameInMap("InstantAccessRetentionDays")
        public Integer instantAccessRetentionDays;

        /**
         * <p>The ID of the KMS key used for the data disk.</p>
         */
        @NameInMap("KMSKeyId")
        public String KMSKeyId;

        /**
         * <p>The time when the snapshot was last changed. The time follows the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         */
        @NameInMap("LastModifiedTime")
        public String lastModifiedTime;

        /**
         * <p>The product number inherited from Alibaba Cloud Marketplace.</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <p>The progress of the snapshot creation task in percentage.</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The remaining time that is required to create the snapshot. Unit: seconds.</p>
         */
        @NameInMap("RemainTime")
        public Integer remainTime;

        /**
         * <p>The resource group ID.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The retention period of the automatic snapshot. Unit: day.</p>
         */
        @NameInMap("RetentionDays")
        public Integer retentionDays;

        /**
         * <p>The snapshot ID.</p>
         */
        @NameInMap("SnapshotId")
        public String snapshotId;

        /**
         * <p>The display name of the snapshot. This parameter is returned only if a snapshot display name was specified when the snapshot was created.</p>
         */
        @NameInMap("SnapshotName")
        public String snapshotName;

        /**
         * <p>The serial number of the snapshot.</p>
         */
        @NameInMap("SnapshotSN")
        public String snapshotSN;

        /**
         * <p>The type of the snapshot. Valid values:</p>
         * <br>
         * <p>*   auto or timer: automatic snapshot</p>
         * <p>*   user: manual snapshot</p>
         * <p>*   all: all snapshot types</p>
         */
        @NameInMap("SnapshotType")
        public String snapshotType;

        /**
         * <p>The source disk ID. This parameter is retained even after the source disk is released.</p>
         */
        @NameInMap("SourceDiskId")
        public String sourceDiskId;

        /**
         * <p>The capacity of the source disk. Unit: GiB.</p>
         */
        @NameInMap("SourceDiskSize")
        public String sourceDiskSize;

        /**
         * <p>The type of the source disk. Valid values:</p>
         * <br>
         * <p>*   system</p>
         * <p>*   data</p>
         */
        @NameInMap("SourceDiskType")
        public String sourceDiskType;

        /**
         * <p>The region ID of the source snapshot.</p>
         */
        @NameInMap("SourceRegionId")
        public String sourceRegionId;

        /**
         * <p>The source snapshot ID.</p>
         */
        @NameInMap("SourceSnapshotId")
        public String sourceSnapshotId;

        /**
         * <p>The type of the source disk.</p>
         * <br>
         * <p>> This parameter will be deprecated in the future. We recommend that you use other parameters to ensure future compatibility.</p>
         */
        @NameInMap("SourceStorageType")
        public String sourceStorageType;

        /**
         * <p>The status of the snapshot. Valid values:</p>
         * <br>
         * <p>*   progressing</p>
         * <p>*   accomplished</p>
         * <p>*   failed</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tags.</p>
         */
        @NameInMap("Tags")
        public DescribeSnapshotsResponseBodySnapshotsSnapshotTags tags;

        /**
         * <p>Indicates whether the snapshot has been used to create custom images or disks. Valid values:</p>
         * <br>
         * <p>*   image</p>
         * <p>*   disk</p>
         * <p>*   image_disk</p>
         * <p>*   none</p>
         */
        @NameInMap("Usage")
        public String usage;

        public static DescribeSnapshotsResponseBodySnapshotsSnapshot build(java.util.Map<String, ?> map) throws Exception {
            DescribeSnapshotsResponseBodySnapshotsSnapshot self = new DescribeSnapshotsResponseBodySnapshotsSnapshot();
            return TeaModel.build(map, self);
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
