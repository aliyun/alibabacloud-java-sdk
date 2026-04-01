// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeSnapshotsResponseBody extends TeaModel {
    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
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
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Snapshots")
    public DescribeSnapshotsResponseBodySnapshots snapshots;

    /**
     * <p>The total number of snapshots returned.</p>
     * 
     * <strong>example:</strong>
     * <p>36</p>
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
        @NameInMap("CompletedTime")
        public String completedTime;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("EncryptType")
        public Integer encryptType;

        @NameInMap("FileSystemType")
        public String fileSystemType;

        @NameInMap("Progress")
        public String progress;

        @NameInMap("RemainTime")
        public Integer remainTime;

        @NameInMap("RetentionDays")
        public Integer retentionDays;

        @NameInMap("SnapshotId")
        public String snapshotId;

        @NameInMap("SnapshotName")
        public String snapshotName;

        @NameInMap("SnapshotType")
        public String snapshotType;

        @NameInMap("SourceFileSystemId")
        public String sourceFileSystemId;

        @NameInMap("SourceFileSystemSize")
        public Long sourceFileSystemSize;

        @NameInMap("SourceFileSystemVersion")
        public String sourceFileSystemVersion;

        @NameInMap("Status")
        public String status;

        public static DescribeSnapshotsResponseBodySnapshotsSnapshot build(java.util.Map<String, ?> map) throws Exception {
            DescribeSnapshotsResponseBodySnapshotsSnapshot self = new DescribeSnapshotsResponseBodySnapshotsSnapshot();
            return TeaModel.build(map, self);
        }

        public DescribeSnapshotsResponseBodySnapshotsSnapshot setCompletedTime(String completedTime) {
            this.completedTime = completedTime;
            return this;
        }
        public String getCompletedTime() {
            return this.completedTime;
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
