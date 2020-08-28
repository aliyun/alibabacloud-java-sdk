// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSnapshotsRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("DiskId")
    public String diskId;

    @NameInMap("SnapshotLinkId")
    public String snapshotLinkId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("SnapshotIds")
    public String snapshotIds;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SnapshotName")
    public String snapshotName;

    @NameInMap("Status")
    public String status;

    @NameInMap("SnapshotType")
    public String snapshotType;

    @NameInMap("Filter")
    @Validation(required = true)
    public java.util.List<DescribeSnapshotsRequestFilter> filter;

    @NameInMap("Usage")
    public String usage;

    @NameInMap("SourceDiskType")
    public String sourceDiskType;

    @NameInMap("Tag")
    public java.util.List<DescribeSnapshotsRequestTag> tag;

    @NameInMap("Encrypted")
    public Boolean encrypted;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("KMSKeyId")
    public String KMSKeyId;

    @NameInMap("Category")
    public String category;

    public static DescribeSnapshotsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSnapshotsRequest self = new DescribeSnapshotsRequest();
        return TeaModel.build(map, self);
    }

    public static class DescribeSnapshotsRequestFilter extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeSnapshotsRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            DescribeSnapshotsRequestFilter self = new DescribeSnapshotsRequestFilter();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeSnapshotsRequestTag extends TeaModel {
        @NameInMap("value")
        @Validation(required = true)
        public String value;

        @NameInMap("key")
        @Validation(required = true)
        public String key;

        public static DescribeSnapshotsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeSnapshotsRequestTag self = new DescribeSnapshotsRequestTag();
            return TeaModel.build(map, self);
        }

    }

}
