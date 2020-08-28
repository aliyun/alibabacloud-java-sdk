// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSnapshotLinksResponse extends TeaModel {
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

    @NameInMap("SnapshotLinks")
    @Validation(required = true)
    public DescribeSnapshotLinksResponseSnapshotLinks snapshotLinks;

    public static DescribeSnapshotLinksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSnapshotLinksResponse self = new DescribeSnapshotLinksResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeSnapshotLinksResponseSnapshotLinksSnapshotLink extends TeaModel {
        @NameInMap("SnapshotLinkId")
        @Validation(required = true)
        public String snapshotLinkId;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("InstanceName")
        @Validation(required = true)
        public String instanceName;

        @NameInMap("SourceDiskId")
        @Validation(required = true)
        public String sourceDiskId;

        @NameInMap("SourceDiskName")
        @Validation(required = true)
        public String sourceDiskName;

        @NameInMap("SourceDiskSize")
        @Validation(required = true)
        public Integer sourceDiskSize;

        @NameInMap("SourceDiskType")
        @Validation(required = true)
        public String sourceDiskType;

        @NameInMap("Category")
        @Validation(required = true)
        public String category;

        @NameInMap("TotalSize")
        @Validation(required = true)
        public Long totalSize;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Integer totalCount;

        public static DescribeSnapshotLinksResponseSnapshotLinksSnapshotLink build(java.util.Map<String, ?> map) throws Exception {
            DescribeSnapshotLinksResponseSnapshotLinksSnapshotLink self = new DescribeSnapshotLinksResponseSnapshotLinksSnapshotLink();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeSnapshotLinksResponseSnapshotLinks extends TeaModel {
        @NameInMap("SnapshotLink")
        @Validation(required = true)
        public java.util.List<DescribeSnapshotLinksResponseSnapshotLinksSnapshotLink> snapshotLink;

        public static DescribeSnapshotLinksResponseSnapshotLinks build(java.util.Map<String, ?> map) throws Exception {
            DescribeSnapshotLinksResponseSnapshotLinks self = new DescribeSnapshotLinksResponseSnapshotLinks();
            return TeaModel.build(map, self);
        }

    }

}
