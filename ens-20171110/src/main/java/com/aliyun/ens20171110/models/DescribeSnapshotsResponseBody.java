// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeSnapshotsResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
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
     * <p>The information about the snapshots.</p>
     */
    @NameInMap("Snapshots")
    public java.util.List<DescribeSnapshotsResponseBodySnapshots> snapshots;

    /**
     * <p>The total number of snapshots.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeSnapshotsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSnapshotsResponseBody self = new DescribeSnapshotsResponseBody();
        return TeaModel.build(map, self);
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

    public DescribeSnapshotsResponseBody setSnapshots(java.util.List<DescribeSnapshotsResponseBodySnapshots> snapshots) {
        this.snapshots = snapshots;
        return this;
    }
    public java.util.List<DescribeSnapshotsResponseBodySnapshots> getSnapshots() {
        return this.snapshots;
    }

    public DescribeSnapshotsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeSnapshotsResponseBodySnapshots extends TeaModel {
        /**
         * <p>The creation time. The time follows the [ISO 8601](https://help.aliyun.com/document_detail/25696.html) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description of the snapshot.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the edge node.</p>
         */
        @NameInMap("EnsRegionId")
        public String ensRegionId;

        /**
         * <p>The capacity of the disk. Unit: MiB.</p>
         */
        @NameInMap("Size")
        public String size;

        /**
         * <p>The ID of the snapshot.</p>
         */
        @NameInMap("SnapshotId")
        public String snapshotId;

        /**
         * <p>The name of the snapshot. This parameter is returned only if a snapshot name was specified when the snapshot was created.</p>
         */
        @NameInMap("SnapshotName")
        public String snapshotName;

        /**
         * <p>The type of the disk. Valid value:</p>
         * <br>
         * <p>*   cloud_efficiency: ultra disk</p>
         * <p>*   cloud_ssd: all-flash disk</p>
         * <p>*   local_hdd: local HDD</p>
         * <p>*   local_ssd: local SSD</p>
         */
        @NameInMap("SourceDiskCategory")
        public String sourceDiskCategory;

        /**
         * <p>The ID of the source disk. This parameter is retained even after the source disk for which the snapshot was created is released.</p>
         */
        @NameInMap("SourceDiskId")
        public String sourceDiskId;

        /**
         * <p>The type of the disk. Valid value:</p>
         * <br>
         * <p>*   1: system disk</p>
         * <p>*   2: data disk</p>
         */
        @NameInMap("SourceDiskType")
        public String sourceDiskType;

        /**
         * <p>The ID of the source edge node.</p>
         */
        @NameInMap("SourceEnsRegionId")
        public String sourceEnsRegionId;

        /**
         * <p>The ID of the source snapshot.</p>
         */
        @NameInMap("SourceSnapshotId")
        public String sourceSnapshotId;

        /**
         * <p>The status of the snapshot. Valid value:</p>
         * <br>
         * <p>*   creating: The snapshot is being created.</p>
         * <p>*   Available: The snapshot is available.</p>
         * <p>*   deleting: The snapshot is being deleted.</p>
         * <p>*   error: An error occurred on the snapshot.</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeSnapshotsResponseBodySnapshots build(java.util.Map<String, ?> map) throws Exception {
            DescribeSnapshotsResponseBodySnapshots self = new DescribeSnapshotsResponseBodySnapshots();
            return TeaModel.build(map, self);
        }

        public DescribeSnapshotsResponseBodySnapshots setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeSnapshotsResponseBodySnapshots setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeSnapshotsResponseBodySnapshots setEnsRegionId(String ensRegionId) {
            this.ensRegionId = ensRegionId;
            return this;
        }
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        public DescribeSnapshotsResponseBodySnapshots setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public DescribeSnapshotsResponseBodySnapshots setSnapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public String getSnapshotId() {
            return this.snapshotId;
        }

        public DescribeSnapshotsResponseBodySnapshots setSnapshotName(String snapshotName) {
            this.snapshotName = snapshotName;
            return this;
        }
        public String getSnapshotName() {
            return this.snapshotName;
        }

        public DescribeSnapshotsResponseBodySnapshots setSourceDiskCategory(String sourceDiskCategory) {
            this.sourceDiskCategory = sourceDiskCategory;
            return this;
        }
        public String getSourceDiskCategory() {
            return this.sourceDiskCategory;
        }

        public DescribeSnapshotsResponseBodySnapshots setSourceDiskId(String sourceDiskId) {
            this.sourceDiskId = sourceDiskId;
            return this;
        }
        public String getSourceDiskId() {
            return this.sourceDiskId;
        }

        public DescribeSnapshotsResponseBodySnapshots setSourceDiskType(String sourceDiskType) {
            this.sourceDiskType = sourceDiskType;
            return this;
        }
        public String getSourceDiskType() {
            return this.sourceDiskType;
        }

        public DescribeSnapshotsResponseBodySnapshots setSourceEnsRegionId(String sourceEnsRegionId) {
            this.sourceEnsRegionId = sourceEnsRegionId;
            return this;
        }
        public String getSourceEnsRegionId() {
            return this.sourceEnsRegionId;
        }

        public DescribeSnapshotsResponseBodySnapshots setSourceSnapshotId(String sourceSnapshotId) {
            this.sourceSnapshotId = sourceSnapshotId;
            return this;
        }
        public String getSourceSnapshotId() {
            return this.sourceSnapshotId;
        }

        public DescribeSnapshotsResponseBodySnapshots setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
