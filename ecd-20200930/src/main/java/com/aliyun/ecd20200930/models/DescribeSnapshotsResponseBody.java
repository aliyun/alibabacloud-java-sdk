// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeSnapshotsResponseBody extends TeaModel {
    /**
     * <p>If the NextToken parameter is empty, no next page exists.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Details of the queried snapshots.</p>
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
         * <p>The point in time at which the snapshot was created. The time follows the [ISO 8601](~~25696~~) standard in the `yyyy-mm-ddthh:mm:ssz` format. The time is displayed in UTC.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The user who creates the snapshot.</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>The time when the snapshot was deleted. The time follows the [ISO 8601](~~25696~~) standard in the `yyyy-mm-ddthh:mm:ssz` format. The time is displayed in UTC.</p>
         */
        @NameInMap("DeletionTime")
        public String deletionTime;

        /**
         * <p>The description of the snapshot.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the cloud computer to which the snapshot belongs.</p>
         */
        @NameInMap("DesktopId")
        public String desktopId;

        /**
         * <p>The name of the cloud computer.</p>
         */
        @NameInMap("DesktopName")
        public String desktopName;

        /**
         * <p>The status of the cloud computer.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   Stopped</p>
         * <p>*   Starting</p>
         * <p>*   Rebuilding</p>
         * <p>*   Running</p>
         * <p>*   Stopping</p>
         * <p>*   Expired</p>
         * <p>*   Deleted</p>
         * <p>*   Pending</p>
         */
        @NameInMap("DesktopStatus")
        public String desktopStatus;

        /**
         * <p>The progress of creating the snapshot. Unit: %.</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The protocol type.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   HDX: High-definition Experience (HDX) protocol</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   ASP: in-house Adaptive Streaming Protocol (ASP)</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("ProtocolType")
        public String protocolType;

        /**
         * <p>The remaining time that is required to complete the snapshot creation. Unit: seconds.</p>
         * <br>
         * <p>>  When the `Status` value is `PROGRESSING`, the `RemainTime` value is `-1`. A value of -1 indicates that the system is calculating the remaining time.</p>
         */
        @NameInMap("RemainTime")
        public Integer remainTime;

        /**
         * <p>The snapshot ID.</p>
         */
        @NameInMap("SnapshotId")
        public String snapshotId;

        /**
         * <p>The name of the snapshot.</p>
         */
        @NameInMap("SnapshotName")
        public String snapshotName;

        /**
         * <p>The type of the snapshot.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   AUTO: automatic snapshot</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   USER: manual snapshot</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("SnapshotType")
        public String snapshotType;

        /**
         * <p>The capacity of the source disk. Unit: GiB.</p>
         */
        @NameInMap("SourceDiskSize")
        public String sourceDiskSize;

        /**
         * <p>The type of the source disk.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   SYSTEM: system disk</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   DATA: data disk</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("SourceDiskType")
        public String sourceDiskType;

        /**
         * <p>The status of the snapshot.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   PROGRESSING: The snapshot is being created.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   FAILED: The snapshot fails to be created.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   ACCOMPLISHED: The snapshot is created.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Indicates whether disk encryption is enabled.</p>
         */
        @NameInMap("VolumeEncryptionEnabled")
        public Boolean volumeEncryptionEnabled;

        /**
         * <p>The ID of the Key Management Service (KMS) key that is used when disk encryption is enabled. You can call the [ListKeys](~~28951~~) operation to query the list of KMS keys.</p>
         */
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
