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
     * <blockquote>
     * <p> This parameter will be removed in the future. We recommend that you use NextToken and MaxResults for a paged query.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <blockquote>
     * <p> This parameter will be removed in the future. We recommend that you use NextToken and MaxResults for a paged query.</p>
     * </blockquote>
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

    @NameInMap("Snapshots")
    public DescribeSnapshotsResponseBodySnapshots snapshots;

    /**
     * <p>The total number of snapshots.</p>
     * <blockquote>
     * <p>When using the <code>MaxResults</code> and <code>NextToken</code> parameters for a paginated query, the returned <code>TotalCount</code> parameter value is invalid.</p>
     * </blockquote>
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
        @NameInMap("TagKey")
        public String tagKey;

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
        @NameInMap("Available")
        public Boolean available;

        @NameInMap("Category")
        public String category;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("Encrypted")
        public Boolean encrypted;

        /**
         * <strong>example:</strong>
         * <p>65535</p>
         */
        @NameInMap("FullSnapshotSizeInBytes")
        public Long fullSnapshotSizeInBytes;

        @NameInMap("InstantAccess")
        public Boolean instantAccess;

        @NameInMap("InstantAccessRetentionDays")
        public Integer instantAccessRetentionDays;

        @NameInMap("KMSKeyId")
        public String KMSKeyId;

        @NameInMap("LastModifiedTime")
        public String lastModifiedTime;

        @NameInMap("ProductCode")
        public String productCode;

        @NameInMap("Progress")
        public String progress;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RemainTime")
        public Integer remainTime;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("RetentionDays")
        public Integer retentionDays;

        @NameInMap("SnapshotId")
        public String snapshotId;

        @NameInMap("SnapshotLinkId")
        public String snapshotLinkId;

        @NameInMap("SnapshotName")
        public String snapshotName;

        @NameInMap("SnapshotSN")
        public String snapshotSN;

        @NameInMap("SnapshotType")
        public String snapshotType;

        @NameInMap("SourceDiskId")
        public String sourceDiskId;

        @NameInMap("SourceDiskSize")
        public String sourceDiskSize;

        @NameInMap("SourceDiskType")
        public String sourceDiskType;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("SourceRegionId")
        public String sourceRegionId;

        /**
         * <strong>example:</strong>
         * <p>s-bp67acfmxazb4p****</p>
         */
        @NameInMap("SourceSnapshotId")
        public String sourceSnapshotId;

        @NameInMap("SourceStorageType")
        public String sourceStorageType;

        @NameInMap("Status")
        public String status;

        @NameInMap("Tags")
        public DescribeSnapshotsResponseBodySnapshotsSnapshotTags tags;

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

        public DescribeSnapshotsResponseBodySnapshotsSnapshot setFullSnapshotSizeInBytes(Long fullSnapshotSizeInBytes) {
            this.fullSnapshotSizeInBytes = fullSnapshotSizeInBytes;
            return this;
        }
        public Long getFullSnapshotSizeInBytes() {
            return this.fullSnapshotSizeInBytes;
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
