// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSnapshotLinksResponseBody extends TeaModel {
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
     * <p>The details about the snapshot chains.</p>
     */
    @NameInMap("SnapshotLinks")
    public DescribeSnapshotLinksResponseBodySnapshotLinks snapshotLinks;

    /**
     * <p>The total number of entries returned.</p>
     */
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
        /**
         * <p>The type of the snapshot.</p>
         * <br>
         * <p>> This parameter will be removed in the future. We recommend that you configure `InstantAccess` to ensure compatibility.</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The instance ID.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the instance.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>Indicates whether the instant access feature is enabled. Valid values:</p>
         * <br>
         * <p>*   true: The instant access feature is enabled. This feature can be enabled only for enhanced SSDs (ESSDs).</p>
         * <p>*   false: The instant access feature is disabled. The snapshot is a normal snapshot for which the instant access feature is disabled.</p>
         */
        @NameInMap("InstantAccess")
        public Boolean instantAccess;

        /**
         * <p>The ID of the region where the source disk of the snapshot chain is located.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The snapshot chain IDs.</p>
         */
        @NameInMap("SnapshotLinkId")
        public String snapshotLinkId;

        /**
         * <p>The source disk ID. This parameter is retained even if the source disk is deleted.</p>
         */
        @NameInMap("SourceDiskId")
        public String sourceDiskId;

        /**
         * <p>The name of the source disk.</p>
         */
        @NameInMap("SourceDiskName")
        public String sourceDiskName;

        /**
         * <p>The size of the source disk. Unit: GiB.</p>
         */
        @NameInMap("SourceDiskSize")
        public Integer sourceDiskSize;

        /**
         * <p>The type of the source disk. Valid values:</p>
         * <br>
         * <p>*   system: system disk</p>
         * <p>*   data: data disk</p>
         */
        @NameInMap("SourceDiskType")
        public String sourceDiskType;

        /**
         * <p>The total number of snapshots.</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        /**
         * <p>The total size of all snapshots in the snapshot chain. Unit: bytes.</p>
         */
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
