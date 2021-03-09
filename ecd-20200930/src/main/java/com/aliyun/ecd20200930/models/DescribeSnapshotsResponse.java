// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeSnapshotsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("NextToken")
    @Validation(required = true)
    public String nextToken;

    @NameInMap("Snapshots")
    @Validation(required = true)
    public java.util.List<DescribeSnapshotsResponseSnapshots> snapshots;

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

    public DescribeSnapshotsResponse setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeSnapshotsResponse setSnapshots(java.util.List<DescribeSnapshotsResponseSnapshots> snapshots) {
        this.snapshots = snapshots;
        return this;
    }
    public java.util.List<DescribeSnapshotsResponseSnapshots> getSnapshots() {
        return this.snapshots;
    }

    public static class DescribeSnapshotsResponseSnapshots extends TeaModel {
        @NameInMap("SnapshotId")
        @Validation(required = true)
        public String snapshotId;

        @NameInMap("DesktopId")
        @Validation(required = true)
        public String desktopId;

        @NameInMap("SnapshotName")
        @Validation(required = true)
        public String snapshotName;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("SnapshotType")
        @Validation(required = true)
        public String snapshotType;

        @NameInMap("SourceDiskSize")
        @Validation(required = true)
        public String sourceDiskSize;

        @NameInMap("SourceDiskType")
        @Validation(required = true)
        public String sourceDiskType;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("Progress")
        @Validation(required = true)
        public String progress;

        @NameInMap("RemainTime")
        @Validation(required = true)
        public Integer remainTime;

        public static DescribeSnapshotsResponseSnapshots build(java.util.Map<String, ?> map) throws Exception {
            DescribeSnapshotsResponseSnapshots self = new DescribeSnapshotsResponseSnapshots();
            return TeaModel.build(map, self);
        }

        public DescribeSnapshotsResponseSnapshots setSnapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public String getSnapshotId() {
            return this.snapshotId;
        }

        public DescribeSnapshotsResponseSnapshots setDesktopId(String desktopId) {
            this.desktopId = desktopId;
            return this;
        }
        public String getDesktopId() {
            return this.desktopId;
        }

        public DescribeSnapshotsResponseSnapshots setSnapshotName(String snapshotName) {
            this.snapshotName = snapshotName;
            return this;
        }
        public String getSnapshotName() {
            return this.snapshotName;
        }

        public DescribeSnapshotsResponseSnapshots setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeSnapshotsResponseSnapshots setSnapshotType(String snapshotType) {
            this.snapshotType = snapshotType;
            return this;
        }
        public String getSnapshotType() {
            return this.snapshotType;
        }

        public DescribeSnapshotsResponseSnapshots setSourceDiskSize(String sourceDiskSize) {
            this.sourceDiskSize = sourceDiskSize;
            return this;
        }
        public String getSourceDiskSize() {
            return this.sourceDiskSize;
        }

        public DescribeSnapshotsResponseSnapshots setSourceDiskType(String sourceDiskType) {
            this.sourceDiskType = sourceDiskType;
            return this;
        }
        public String getSourceDiskType() {
            return this.sourceDiskType;
        }

        public DescribeSnapshotsResponseSnapshots setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeSnapshotsResponseSnapshots setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeSnapshotsResponseSnapshots setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeSnapshotsResponseSnapshots setRemainTime(Integer remainTime) {
            this.remainTime = remainTime;
            return this;
        }
        public Integer getRemainTime() {
            return this.remainTime;
        }

    }

}
