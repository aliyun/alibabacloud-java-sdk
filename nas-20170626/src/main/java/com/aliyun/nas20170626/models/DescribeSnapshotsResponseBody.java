// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeSnapshotsResponseBody extends TeaModel {
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
     * <p>The details about snapshots.</p>
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

    public static class DescribeSnapshotsResponseBodySnapshotsSnapshot extends TeaModel {
        /**
         * <p>The time when the snapshot was created.</p>
         * <br>
         * <p>The time follows the [ISO 8601](https://www.iso.org/iso-8601-date-and-time-format.html) standard in UTC. The time is displayed in the `yyyy-MM-ddThh:mmZ` format.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the snapshot.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Indicates whether the snapshot is encrypted.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   0: The snapshot is not encrypted.</p>
         * <p>*   1: The snapshot is encrypted.</p>
         */
        @NameInMap("EncryptType")
        public Integer encryptType;

        @NameInMap("FileSystemType")
        public String fileSystemType;

        /**
         * <p>The progress of the snapshot creation. The value of this parameter is expressed as a percentage.</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The remaining time that is required to create the snapshot.</p>
         * <br>
         * <p>Unit: seconds.</p>
         */
        @NameInMap("RemainTime")
        public Integer remainTime;

        /**
         * <p>The retention period of the auto snapshot.</p>
         * <br>
         * <p>Unit: days.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   \\-1: Auto snapshots are permanently retained. After the number of auto snapshots exceeds the upper limit, the earliest auto snapshot is automatically deleted.</p>
         * <p>*   1 to 65536: Auto snapshots are retained for the specified days. After the retention period of auto snapshots expires, the auto snapshots are automatically deleted.</p>
         */
        @NameInMap("RetentionDays")
        public Integer retentionDays;

        /**
         * <p>The snapshot ID.</p>
         */
        @NameInMap("SnapshotId")
        public String snapshotId;

        /**
         * <p>The snapshot name.</p>
         * <br>
         * <p>If you specify a name to create a snapshot, the name of the snapshot is returned. Otherwise, no value is returned for this parameter.</p>
         */
        @NameInMap("SnapshotName")
        public String snapshotName;

        @NameInMap("SnapshotType")
        public String snapshotType;

        /**
         * <p>The ID of the source file system.</p>
         * <br>
         * <p>This parameter is retained even if the source file system of the snapshot is deleted.</p>
         */
        @NameInMap("SourceFileSystemId")
        public String sourceFileSystemId;

        /**
         * <p>The capacity of the source file system.</p>
         * <br>
         * <p>Unit: GiB.</p>
         */
        @NameInMap("SourceFileSystemSize")
        public Long sourceFileSystemSize;

        /**
         * <p>The version of the source file system.</p>
         */
        @NameInMap("SourceFileSystemVersion")
        public String sourceFileSystemVersion;

        /**
         * <p>The status of the snapshot.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   progressing: The snapshot is being created.</p>
         * <p>*   accomplished: The snapshot is created.</p>
         * <p>*   failed: The snapshot fails to be created.</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeSnapshotsResponseBodySnapshotsSnapshot build(java.util.Map<String, ?> map) throws Exception {
            DescribeSnapshotsResponseBodySnapshotsSnapshot self = new DescribeSnapshotsResponseBodySnapshotsSnapshot();
            return TeaModel.build(map, self);
        }

        public DescribeSnapshotsResponseBodySnapshotsSnapshot setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeSnapshotsResponseBodySnapshotsSnapshot setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeSnapshotsResponseBodySnapshotsSnapshot setEncryptType(Integer encryptType) {
            this.encryptType = encryptType;
            return this;
        }
        public Integer getEncryptType() {
            return this.encryptType;
        }

        public DescribeSnapshotsResponseBodySnapshotsSnapshot setFileSystemType(String fileSystemType) {
            this.fileSystemType = fileSystemType;
            return this;
        }
        public String getFileSystemType() {
            return this.fileSystemType;
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

        public DescribeSnapshotsResponseBodySnapshotsSnapshot setSnapshotType(String snapshotType) {
            this.snapshotType = snapshotType;
            return this;
        }
        public String getSnapshotType() {
            return this.snapshotType;
        }

        public DescribeSnapshotsResponseBodySnapshotsSnapshot setSourceFileSystemId(String sourceFileSystemId) {
            this.sourceFileSystemId = sourceFileSystemId;
            return this;
        }
        public String getSourceFileSystemId() {
            return this.sourceFileSystemId;
        }

        public DescribeSnapshotsResponseBodySnapshotsSnapshot setSourceFileSystemSize(Long sourceFileSystemSize) {
            this.sourceFileSystemSize = sourceFileSystemSize;
            return this;
        }
        public Long getSourceFileSystemSize() {
            return this.sourceFileSystemSize;
        }

        public DescribeSnapshotsResponseBodySnapshotsSnapshot setSourceFileSystemVersion(String sourceFileSystemVersion) {
            this.sourceFileSystemVersion = sourceFileSystemVersion;
            return this;
        }
        public String getSourceFileSystemVersion() {
            return this.sourceFileSystemVersion;
        }

        public DescribeSnapshotsResponseBodySnapshotsSnapshot setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
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
