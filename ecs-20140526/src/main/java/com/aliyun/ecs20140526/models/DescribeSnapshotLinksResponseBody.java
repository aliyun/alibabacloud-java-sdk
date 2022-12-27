// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSnapshotLinksResponseBody extends TeaModel {
    // The page number of the returned page.
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // The number of entries returned per page.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Details about the snapshot chains.
    @NameInMap("SnapshotLinks")
    public DescribeSnapshotLinksResponseBodySnapshotLinks snapshotLinks;

    // The total number of snapshot chains.
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeSnapshotLinksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSnapshotLinksResponseBody self = new DescribeSnapshotLinksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSnapshotLinksResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSnapshotLinksResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSnapshotLinksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSnapshotLinksResponseBody setSnapshotLinks(DescribeSnapshotLinksResponseBodySnapshotLinks snapshotLinks) {
        this.snapshotLinks = snapshotLinks;
        return this;
    }
    public DescribeSnapshotLinksResponseBodySnapshotLinks getSnapshotLinks() {
        return this.snapshotLinks;
    }

    public DescribeSnapshotLinksResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeSnapshotLinksResponseBodySnapshotLinksSnapshotLink extends TeaModel {
        // The type of the snapshot.
        // 
        // >  This parameter will be removed in the future. We recommend that you use the `InstantAccess` parameter to ensure future compatibility.
        @NameInMap("Category")
        public String category;

        // The ID of the instance.
        @NameInMap("InstanceId")
        public String instanceId;

        // The name of the instance.
        @NameInMap("InstanceName")
        public String instanceName;

        // Indicates whether the instant access feature was enabled. Valid values:
        // 
        // *   true: The instant access feature was enabled. This feature can be enabled only for enhanced SSDs (ESSDs).
        // *   false: The instant access feature was disabled. The snapshot is a normal snapshot for which the instant access feature was disabled.
        @NameInMap("InstantAccess")
        public Boolean instantAccess;

        // The ID of the region where the source disk of the snapshot chain is located.
        @NameInMap("RegionId")
        public String regionId;

        // The ID of the snapshot chain.
        @NameInMap("SnapshotLinkId")
        public String snapshotLinkId;

        // The ID of the source disk. This parameter is retained even if the source disk is deleted.
        @NameInMap("SourceDiskId")
        public String sourceDiskId;

        // The name of the source disk.
        @NameInMap("SourceDiskName")
        public String sourceDiskName;

        // The size of the source disk. Unit: GiB.
        @NameInMap("SourceDiskSize")
        public Integer sourceDiskSize;

        // The type of the source disk. Valid values:
        // 
        // *   system: system disk
        // *   data: data disk
        @NameInMap("SourceDiskType")
        public String sourceDiskType;

        // The total number of snapshots.
        @NameInMap("TotalCount")
        public Integer totalCount;

        // The total size of all snapshots in the snapshot chain. Unit: bytes.
        @NameInMap("TotalSize")
        public Long totalSize;

        public static DescribeSnapshotLinksResponseBodySnapshotLinksSnapshotLink build(java.util.Map<String, ?> map) throws Exception {
            DescribeSnapshotLinksResponseBodySnapshotLinksSnapshotLink self = new DescribeSnapshotLinksResponseBodySnapshotLinksSnapshotLink();
            return TeaModel.build(map, self);
        }

        public DescribeSnapshotLinksResponseBodySnapshotLinksSnapshotLink setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeSnapshotLinksResponseBodySnapshotLinksSnapshotLink setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeSnapshotLinksResponseBodySnapshotLinksSnapshotLink setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeSnapshotLinksResponseBodySnapshotLinksSnapshotLink setInstantAccess(Boolean instantAccess) {
            this.instantAccess = instantAccess;
            return this;
        }
        public Boolean getInstantAccess() {
            return this.instantAccess;
        }

        public DescribeSnapshotLinksResponseBodySnapshotLinksSnapshotLink setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeSnapshotLinksResponseBodySnapshotLinksSnapshotLink setSnapshotLinkId(String snapshotLinkId) {
            this.snapshotLinkId = snapshotLinkId;
            return this;
        }
        public String getSnapshotLinkId() {
            return this.snapshotLinkId;
        }

        public DescribeSnapshotLinksResponseBodySnapshotLinksSnapshotLink setSourceDiskId(String sourceDiskId) {
            this.sourceDiskId = sourceDiskId;
            return this;
        }
        public String getSourceDiskId() {
            return this.sourceDiskId;
        }

        public DescribeSnapshotLinksResponseBodySnapshotLinksSnapshotLink setSourceDiskName(String sourceDiskName) {
            this.sourceDiskName = sourceDiskName;
            return this;
        }
        public String getSourceDiskName() {
            return this.sourceDiskName;
        }

        public DescribeSnapshotLinksResponseBodySnapshotLinksSnapshotLink setSourceDiskSize(Integer sourceDiskSize) {
            this.sourceDiskSize = sourceDiskSize;
            return this;
        }
        public Integer getSourceDiskSize() {
            return this.sourceDiskSize;
        }

        public DescribeSnapshotLinksResponseBodySnapshotLinksSnapshotLink setSourceDiskType(String sourceDiskType) {
            this.sourceDiskType = sourceDiskType;
            return this;
        }
        public String getSourceDiskType() {
            return this.sourceDiskType;
        }

        public DescribeSnapshotLinksResponseBodySnapshotLinksSnapshotLink setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public DescribeSnapshotLinksResponseBodySnapshotLinksSnapshotLink setTotalSize(Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Long getTotalSize() {
            return this.totalSize;
        }

    }

    public static class DescribeSnapshotLinksResponseBodySnapshotLinks extends TeaModel {
        @NameInMap("SnapshotLink")
        public java.util.List<DescribeSnapshotLinksResponseBodySnapshotLinksSnapshotLink> snapshotLink;

        public static DescribeSnapshotLinksResponseBodySnapshotLinks build(java.util.Map<String, ?> map) throws Exception {
            DescribeSnapshotLinksResponseBodySnapshotLinks self = new DescribeSnapshotLinksResponseBodySnapshotLinks();
            return TeaModel.build(map, self);
        }

        public DescribeSnapshotLinksResponseBodySnapshotLinks setSnapshotLink(java.util.List<DescribeSnapshotLinksResponseBodySnapshotLinksSnapshotLink> snapshotLink) {
            this.snapshotLink = snapshotLink;
            return this;
        }
        public java.util.List<DescribeSnapshotLinksResponseBodySnapshotLinksSnapshotLink> getSnapshotLink() {
            return this.snapshotLink;
        }

    }

}
