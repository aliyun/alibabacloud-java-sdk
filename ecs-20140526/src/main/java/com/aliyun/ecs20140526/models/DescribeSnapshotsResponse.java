// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSnapshotsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("Snapshots")
    @Validation(required = true)
    public DescribeSnapshotsResponseSnapshots snapshots;

    public static DescribeSnapshotsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSnapshotsResponse self = new DescribeSnapshotsResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeSnapshotsResponseSnapshotsSnapshotTagsTag extends TeaModel {
        @NameInMap("TagKey")
        @Validation(required = true)
        public String tagKey;

        @NameInMap("TagValue")
        @Validation(required = true)
        public String tagValue;

        public static DescribeSnapshotsResponseSnapshotsSnapshotTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeSnapshotsResponseSnapshotsSnapshotTagsTag self = new DescribeSnapshotsResponseSnapshotsSnapshotTagsTag();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeSnapshotsResponseSnapshotsSnapshotTags extends TeaModel {
        @NameInMap("Tag")
        @Validation(required = true)
        public java.util.List<DescribeSnapshotsResponseSnapshotsSnapshotTagsTag> tag;

        public static DescribeSnapshotsResponseSnapshotsSnapshotTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeSnapshotsResponseSnapshotsSnapshotTags self = new DescribeSnapshotsResponseSnapshotsSnapshotTags();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeSnapshotsResponseSnapshotsSnapshot extends TeaModel {
        @NameInMap("SnapshotId")
        @Validation(required = true)
        public String snapshotId;

        @NameInMap("SnapshotSN")
        @Validation(required = true)
        public String snapshotSN;

        @NameInMap("SnapshotName")
        @Validation(required = true)
        public String snapshotName;

        @NameInMap("Progress")
        @Validation(required = true)
        public String progress;

        @NameInMap("ProductCode")
        @Validation(required = true)
        public String productCode;

        @NameInMap("SourceDiskId")
        @Validation(required = true)
        public String sourceDiskId;

        @NameInMap("SourceDiskType")
        @Validation(required = true)
        public String sourceDiskType;

        @NameInMap("RetentionDays")
        @Validation(required = true)
        public Integer retentionDays;

        @NameInMap("Encrypted")
        @Validation(required = true)
        public Boolean encrypted;

        @NameInMap("SourceDiskSize")
        @Validation(required = true)
        public String sourceDiskSize;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("LastModifiedTime")
        @Validation(required = true)
        public String lastModifiedTime;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("Usage")
        @Validation(required = true)
        public String usage;

        @NameInMap("SourceStorageType")
        @Validation(required = true)
        public String sourceStorageType;

        @NameInMap("RemainTime")
        @Validation(required = true)
        public Integer remainTime;

        @NameInMap("ResourceGroupId")
        @Validation(required = true)
        public String resourceGroupId;

        @NameInMap("KMSKeyId")
        @Validation(required = true)
        public String KMSKeyId;

        @NameInMap("Category")
        @Validation(required = true)
        public String category;

        @NameInMap("SnapshotType")
        @Validation(required = true)
        public String snapshotType;

        @NameInMap("Tags")
        @Validation(required = true)
        public DescribeSnapshotsResponseSnapshotsSnapshotTags tags;

        public static DescribeSnapshotsResponseSnapshotsSnapshot build(java.util.Map<String, ?> map) throws Exception {
            DescribeSnapshotsResponseSnapshotsSnapshot self = new DescribeSnapshotsResponseSnapshotsSnapshot();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeSnapshotsResponseSnapshots extends TeaModel {
        @NameInMap("Snapshot")
        @Validation(required = true)
        public java.util.List<DescribeSnapshotsResponseSnapshotsSnapshot> snapshot;

        public static DescribeSnapshotsResponseSnapshots build(java.util.Map<String, ?> map) throws Exception {
            DescribeSnapshotsResponseSnapshots self = new DescribeSnapshotsResponseSnapshots();
            return TeaModel.build(map, self);
        }

    }

}
