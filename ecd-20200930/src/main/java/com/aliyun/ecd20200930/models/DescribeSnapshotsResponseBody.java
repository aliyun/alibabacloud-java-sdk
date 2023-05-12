// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeSnapshotsResponseBody extends TeaModel {
    /**
     * <p>Details of the snapshots.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Details of the snapshot.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The time when the snapshot was created. The time follows the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
     */
    @NameInMap("Snapshots")
    public java.util.List<DescribeSnapshotsResponseBodySnapshots> snapshots;

    public static DescribeSnapshotsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSnapshotsResponseBody self = new DescribeSnapshotsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSnapshotsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
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

    public static class DescribeSnapshotsResponseBodySnapshots extends TeaModel {
        /**
         * <p>The type of snapshot. Valid values:</p>
         * <br>
         * <p>*   AUTO: auto snapshot</p>
         * <p>*   USER: manual snapshot</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>Indicates whether disk encryption is enabled.</p>
         */
        @NameInMap("Creator")
        public String creator;

        @NameInMap("DeletionTime")
        public String deletionTime;

        /**
         * <p>The remaining time required to create the snapshot. Unit: seconds.</p>
         * <br>
         * <p>> If the value of the `Status` parameter is `PROGRESSING` and the value of the `RemainTime` parameter is `-1`, the system is calculating the remaining time required to create the snapshot.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The state of the cloud desktop. Valid values:</p>
         * <br>
         * <p>*   Pending: The cloud desktop is pending.</p>
         * <p>*   Starting: The cloud desktop is being started.</p>
         * <p>*   Running: The cloud desktop is running.</p>
         * <p>*   Stopping: The cloud desktop is being stopped.</p>
         * <p>*   Rebuilding: The cloud desktop is being recreated.</p>
         * <p>*   Stopped: The cloud desktop is stopped.</p>
         * <p>*   Expired: The cloud desktop expired.</p>
         * <p>*   Deleted: The cloud desktop is deleted.</p>
         */
        @NameInMap("DesktopId")
        public String desktopId;

        /**
         * <p>The user that creates the snapshot.</p>
         */
        @NameInMap("DesktopName")
        public String desktopName;

        /**
         * <p>The type of the protocol. Valid values:</p>
         * <br>
         * <p>*   ASP</p>
         * <p>*   HDX</p>
         */
        @NameInMap("DesktopStatus")
        public String desktopStatus;

        /**
         * <p>The ID of the snapshot.</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The ID of the Key Management Service (KMS) key that is used when disk encryption is enabled. You can call the [ListKeys](~~28951~~) operation to obtain a list of KMS keys.</p>
         */
        @NameInMap("ProtocolType")
        public String protocolType;

        /**
         * <p>The type of the source disk. Valid values:</p>
         * <br>
         * <p>*   SYSTEM: system disk</p>
         * <p>*   DATA: data disk</p>
         */
        @NameInMap("RemainTime")
        public Integer remainTime;

        /**
         * <p>The size of the source disk. Unit: GiB.</p>
         */
        @NameInMap("SnapshotId")
        public String snapshotId;

        /**
         * <p>The description of the snapshot.</p>
         */
        @NameInMap("SnapshotName")
        public String snapshotName;

        /**
         * <p>The progress of the snapshot creation. Unit: percentage (%).</p>
         */
        @NameInMap("SnapshotType")
        public String snapshotType;

        /**
         * <p>The ID of the cloud desktop to which the snapshot belongs.</p>
         */
        @NameInMap("SourceDiskSize")
        public String sourceDiskSize;

        /**
         * <p>The name of the cloud desktop.</p>
         */
        @NameInMap("SourceDiskType")
        public String sourceDiskType;

        /**
         * <p>The name of the snapshot.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time when the snapshot was deleted. The time follows the [ISO 8601](~~25696~~) standard in the yyyy-mm-ddthh:mm:ssz format. The time is displayed in UTC.</p>
         */
        @NameInMap("VolumeEncryptionEnabled")
        public Boolean volumeEncryptionEnabled;

        @NameInMap("VolumeEncryptionKey")
        public String volumeEncryptionKey;

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

        public DescribeSnapshotsResponseBodySnapshots setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public DescribeSnapshotsResponseBodySnapshots setDeletionTime(String deletionTime) {
            this.deletionTime = deletionTime;
            return this;
        }
        public String getDeletionTime() {
            return this.deletionTime;
        }

        public DescribeSnapshotsResponseBodySnapshots setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeSnapshotsResponseBodySnapshots setDesktopId(String desktopId) {
            this.desktopId = desktopId;
            return this;
        }
        public String getDesktopId() {
            return this.desktopId;
        }

        public DescribeSnapshotsResponseBodySnapshots setDesktopName(String desktopName) {
            this.desktopName = desktopName;
            return this;
        }
        public String getDesktopName() {
            return this.desktopName;
        }

        public DescribeSnapshotsResponseBodySnapshots setDesktopStatus(String desktopStatus) {
            this.desktopStatus = desktopStatus;
            return this;
        }
        public String getDesktopStatus() {
            return this.desktopStatus;
        }

        public DescribeSnapshotsResponseBodySnapshots setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeSnapshotsResponseBodySnapshots setProtocolType(String protocolType) {
            this.protocolType = protocolType;
            return this;
        }
        public String getProtocolType() {
            return this.protocolType;
        }

        public DescribeSnapshotsResponseBodySnapshots setRemainTime(Integer remainTime) {
            this.remainTime = remainTime;
            return this;
        }
        public Integer getRemainTime() {
            return this.remainTime;
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

        public DescribeSnapshotsResponseBodySnapshots setSnapshotType(String snapshotType) {
            this.snapshotType = snapshotType;
            return this;
        }
        public String getSnapshotType() {
            return this.snapshotType;
        }

        public DescribeSnapshotsResponseBodySnapshots setSourceDiskSize(String sourceDiskSize) {
            this.sourceDiskSize = sourceDiskSize;
            return this;
        }
        public String getSourceDiskSize() {
            return this.sourceDiskSize;
        }

        public DescribeSnapshotsResponseBodySnapshots setSourceDiskType(String sourceDiskType) {
            this.sourceDiskType = sourceDiskType;
            return this;
        }
        public String getSourceDiskType() {
            return this.sourceDiskType;
        }

        public DescribeSnapshotsResponseBodySnapshots setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeSnapshotsResponseBodySnapshots setVolumeEncryptionEnabled(Boolean volumeEncryptionEnabled) {
            this.volumeEncryptionEnabled = volumeEncryptionEnabled;
            return this;
        }
        public Boolean getVolumeEncryptionEnabled() {
            return this.volumeEncryptionEnabled;
        }

        public DescribeSnapshotsResponseBodySnapshots setVolumeEncryptionKey(String volumeEncryptionKey) {
            this.volumeEncryptionKey = volumeEncryptionKey;
            return this;
        }
        public String getVolumeEncryptionKey() {
            return this.volumeEncryptionKey;
        }

    }

}
