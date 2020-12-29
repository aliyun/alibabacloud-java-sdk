// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSnapshotsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Snapshots")
    public DescribeSnapshotsResponseBodySnapshots snapshots;

    public static DescribeSnapshotsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSnapshotsResponseBody self = new DescribeSnapshotsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSnapshotsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeSnapshotsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
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

    public DescribeSnapshotsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSnapshotsResponseBody setSnapshots(DescribeSnapshotsResponseBodySnapshots snapshots) {
        this.snapshots = snapshots;
        return this;
    }
    public DescribeSnapshotsResponseBodySnapshots getSnapshots() {
        return this.snapshots;
    }

    public static class DescribeSnapshotsResponseBodySnapshotsSnapshotTagsTag extends TeaModel {
        @NameInMap("TagValue")
        public String tagValue;

        @NameInMap("TagKey")
        public String tagKey;

        public static DescribeSnapshotsResponseBodySnapshotsSnapshotTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeSnapshotsResponseBodySnapshotsSnapshotTagsTag self = new DescribeSnapshotsResponseBodySnapshotsSnapshotTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeSnapshotsResponseBodySnapshotsSnapshotTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

        public DescribeSnapshotsResponseBodySnapshotsSnapshotTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
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
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("InstantAccess")
        public Boolean instantAccess;

        @NameInMap("RetentionDays")
        public Integer retentionDays;

        @NameInMap("SourceDiskSize")
        public String sourceDiskSize;

        @NameInMap("Tags")
        public DescribeSnapshotsResponseBodySnapshotsSnapshotTags tags;

        @NameInMap("LastModifiedTime")
        public String lastModifiedTime;

        @NameInMap("Encrypted")
        public Boolean encrypted;

        @NameInMap("SourceDiskId")
        public String sourceDiskId;

        @NameInMap("Description")
        public String description;

        @NameInMap("InstantAccessRetentionDays")
        public Integer instantAccessRetentionDays;

        @NameInMap("KMSKeyId")
        public String KMSKeyId;

        @NameInMap("Progress")
        public String progress;

        @NameInMap("RemainTime")
        public Integer remainTime;

        @NameInMap("SourceDiskType")
        public String sourceDiskType;

        @NameInMap("SourceStorageType")
        public String sourceStorageType;

        @NameInMap("Usage")
        public String usage;

        @NameInMap("SnapshotType")
        public String snapshotType;

        @NameInMap("SnapshotName")
        public String snapshotName;

        @NameInMap("SnapshotId")
        public String snapshotId;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("Category")
        public String category;

        @NameInMap("SnapshotSN")
        public String snapshotSN;

        @NameInMap("ProductCode")
        public String productCode;

        public static DescribeSnapshotsResponseBodySnapshotsSnapshot build(java.util.Map<String, ?> map) throws Exception {
            DescribeSnapshotsResponseBodySnapshotsSnapshot self = new DescribeSnapshotsResponseBodySnapshotsSnapshot();
            return TeaModel.build(map, self);
        }

        public DescribeSnapshotsResponseBodySnapshotsSnapshot setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeSnapshotsResponseBodySnapshotsSnapshot setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeSnapshotsResponseBodySnapshotsSnapshot setInstantAccess(Boolean instantAccess) {
            this.instantAccess = instantAccess;
            return this;
        }
        public Boolean getInstantAccess() {
            return this.instantAccess;
        }

        public DescribeSnapshotsResponseBodySnapshotsSnapshot setRetentionDays(Integer retentionDays) {
            this.retentionDays = retentionDays;
            return this;
        }
        public Integer getRetentionDays() {
            return this.retentionDays;
        }

        public DescribeSnapshotsResponseBodySnapshotsSnapshot setSourceDiskSize(String sourceDiskSize) {
            this.sourceDiskSize = sourceDiskSize;
            return this;
        }
        public String getSourceDiskSize() {
            return this.sourceDiskSize;
        }

        public DescribeSnapshotsResponseBodySnapshotsSnapshot setTags(DescribeSnapshotsResponseBodySnapshotsSnapshotTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeSnapshotsResponseBodySnapshotsSnapshotTags getTags() {
            return this.tags;
        }

        public DescribeSnapshotsResponseBodySnapshotsSnapshot setLastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }
        public String getLastModifiedTime() {
            return this.lastModifiedTime;
        }

        public DescribeSnapshotsResponseBodySnapshotsSnapshot setEncrypted(Boolean encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public Boolean getEncrypted() {
            return this.encrypted;
        }

        public DescribeSnapshotsResponseBodySnapshotsSnapshot setSourceDiskId(String sourceDiskId) {
            this.sourceDiskId = sourceDiskId;
            return this;
        }
        public String getSourceDiskId() {
            return this.sourceDiskId;
        }

        public DescribeSnapshotsResponseBodySnapshotsSnapshot setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
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

        public DescribeSnapshotsResponseBodySnapshotsSnapshot setSourceDiskType(String sourceDiskType) {
            this.sourceDiskType = sourceDiskType;
            return this;
        }
        public String getSourceDiskType() {
            return this.sourceDiskType;
        }

        public DescribeSnapshotsResponseBodySnapshotsSnapshot setSourceStorageType(String sourceStorageType) {
            this.sourceStorageType = sourceStorageType;
            return this;
        }
        public String getSourceStorageType() {
            return this.sourceStorageType;
        }

        public DescribeSnapshotsResponseBodySnapshotsSnapshot setUsage(String usage) {
            this.usage = usage;
            return this;
        }
        public String getUsage() {
            return this.usage;
        }

        public DescribeSnapshotsResponseBodySnapshotsSnapshot setSnapshotType(String snapshotType) {
            this.snapshotType = snapshotType;
            return this;
        }
        public String getSnapshotType() {
            return this.snapshotType;
        }

        public DescribeSnapshotsResponseBodySnapshotsSnapshot setSnapshotName(String snapshotName) {
            this.snapshotName = snapshotName;
            return this;
        }
        public String getSnapshotName() {
            return this.snapshotName;
        }

        public DescribeSnapshotsResponseBodySnapshotsSnapshot setSnapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public String getSnapshotId() {
            return this.snapshotId;
        }

        public DescribeSnapshotsResponseBodySnapshotsSnapshot setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeSnapshotsResponseBodySnapshotsSnapshot setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeSnapshotsResponseBodySnapshotsSnapshot setSnapshotSN(String snapshotSN) {
            this.snapshotSN = snapshotSN;
            return this;
        }
        public String getSnapshotSN() {
            return this.snapshotSN;
        }

        public DescribeSnapshotsResponseBodySnapshotsSnapshot setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
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
