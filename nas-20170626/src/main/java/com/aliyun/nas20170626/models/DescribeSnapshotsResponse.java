// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeSnapshotsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("Snapshots")
    @Validation(required = true)
    public DescribeSnapshotsResponseSnapshots snapshots;

    public static DescribeSnapshotsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSnapshotsResponse self = new DescribeSnapshotsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSnapshotsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSnapshotsResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeSnapshotsResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSnapshotsResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSnapshotsResponse setSnapshots(DescribeSnapshotsResponseSnapshots snapshots) {
        this.snapshots = snapshots;
        return this;
    }
    public DescribeSnapshotsResponseSnapshots getSnapshots() {
        return this.snapshots;
    }

    public static class DescribeSnapshotsResponseSnapshotsSnapshot extends TeaModel {
        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("Progress")
        @Validation(required = true)
        public String progress;

        @NameInMap("RemainTime")
        @Validation(required = true)
        public Integer remainTime;

        @NameInMap("RetentionDays")
        @Validation(required = true)
        public Integer retentionDays;

        @NameInMap("SnapshotId")
        @Validation(required = true)
        public String snapshotId;

        @NameInMap("SnapshotName")
        @Validation(required = true)
        public String snapshotName;

        @NameInMap("SourceFileSystemId")
        @Validation(required = true)
        public String sourceFileSystemId;

        @NameInMap("SourceFileSystemSize")
        @Validation(required = true)
        public Long sourceFileSystemSize;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("EncryptType")
        @Validation(required = true)
        public Integer encryptType;

        @NameInMap("SourceFileSystemVersion")
        @Validation(required = true)
        public String sourceFileSystemVersion;

        public static DescribeSnapshotsResponseSnapshotsSnapshot build(java.util.Map<String, ?> map) throws Exception {
            DescribeSnapshotsResponseSnapshotsSnapshot self = new DescribeSnapshotsResponseSnapshotsSnapshot();
            return TeaModel.build(map, self);
        }

        public DescribeSnapshotsResponseSnapshotsSnapshot setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeSnapshotsResponseSnapshotsSnapshot setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeSnapshotsResponseSnapshotsSnapshot setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeSnapshotsResponseSnapshotsSnapshot setRemainTime(Integer remainTime) {
            this.remainTime = remainTime;
            return this;
        }
        public Integer getRemainTime() {
            return this.remainTime;
        }

        public DescribeSnapshotsResponseSnapshotsSnapshot setRetentionDays(Integer retentionDays) {
            this.retentionDays = retentionDays;
            return this;
        }
        public Integer getRetentionDays() {
            return this.retentionDays;
        }

        public DescribeSnapshotsResponseSnapshotsSnapshot setSnapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public String getSnapshotId() {
            return this.snapshotId;
        }

        public DescribeSnapshotsResponseSnapshotsSnapshot setSnapshotName(String snapshotName) {
            this.snapshotName = snapshotName;
            return this;
        }
        public String getSnapshotName() {
            return this.snapshotName;
        }

        public DescribeSnapshotsResponseSnapshotsSnapshot setSourceFileSystemId(String sourceFileSystemId) {
            this.sourceFileSystemId = sourceFileSystemId;
            return this;
        }
        public String getSourceFileSystemId() {
            return this.sourceFileSystemId;
        }

        public DescribeSnapshotsResponseSnapshotsSnapshot setSourceFileSystemSize(Long sourceFileSystemSize) {
            this.sourceFileSystemSize = sourceFileSystemSize;
            return this;
        }
        public Long getSourceFileSystemSize() {
            return this.sourceFileSystemSize;
        }

        public DescribeSnapshotsResponseSnapshotsSnapshot setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeSnapshotsResponseSnapshotsSnapshot setEncryptType(Integer encryptType) {
            this.encryptType = encryptType;
            return this;
        }
        public Integer getEncryptType() {
            return this.encryptType;
        }

        public DescribeSnapshotsResponseSnapshotsSnapshot setSourceFileSystemVersion(String sourceFileSystemVersion) {
            this.sourceFileSystemVersion = sourceFileSystemVersion;
            return this;
        }
        public String getSourceFileSystemVersion() {
            return this.sourceFileSystemVersion;
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

        public DescribeSnapshotsResponseSnapshots setSnapshot(java.util.List<DescribeSnapshotsResponseSnapshotsSnapshot> snapshot) {
            this.snapshot = snapshot;
            return this;
        }
        public java.util.List<DescribeSnapshotsResponseSnapshotsSnapshot> getSnapshot() {
            return this.snapshot;
        }

    }

}
