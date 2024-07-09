// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeSnapshotsResponseBody extends TeaModel {
    /**
     * <p>If the NextToken parameter is empty, no next page exists.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6nmB7qrRFJ8vmttjxPL****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>51592A88-0F2C-55E6-AD2C-2AD9C10D****</p>
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
         * <p>The point in time at which the snapshot was created. The time follows the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the <code>yyyy-mm-ddthh:mm:ssz</code> format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-20T14:52:28Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The user who creates the snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>Administrator</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>The time when the snapshot was deleted. The time follows the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the <code>yyyy-mm-ddthh:mm:ssz</code> format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-20T14:52:28Z</p>
         */
        @NameInMap("DeletionTime")
        public String deletionTime;

        /**
         * <p>The description of the snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>testDescription</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the cloud computer to which the snapshot belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd-g03l3tlm8djoj****</p>
         */
        @NameInMap("DesktopId")
        public String desktopId;

        /**
         * <p>The name of the cloud computer.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("DesktopName")
        public String desktopName;

        /**
         * <p>The status of the cloud computer.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Stopped</li>
         * <li>Starting</li>
         * <li>Rebuilding</li>
         * <li>Running</li>
         * <li>Stopping</li>
         * <li>Expired</li>
         * <li>Deleted</li>
         * <li>Pending</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("DesktopStatus")
        public String desktopStatus;

        /**
         * <p>The progress of creating the snapshot. Unit: %.</p>
         * 
         * <strong>example:</strong>
         * <p>100%</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The protocol type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>HDX: High-definition Experience (HDX) protocol</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>ASP: in-house Adaptive Streaming Protocol (ASP)</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ASP</p>
         */
        @NameInMap("ProtocolType")
        public String protocolType;

        /**
         * <p>The remaining time that is required to complete the snapshot creation. Unit: seconds.</p>
         * <blockquote>
         * <p> When the <code>Status</code> value is <code>PROGRESSING</code>, the <code>RemainTime</code> value is <code>-1</code>. A value of -1 indicates that the system is calculating the remaining time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("RemainTime")
        public Integer remainTime;

        /**
         * <p>The snapshot ID.</p>
         * 
         * <strong>example:</strong>
         * <p>s-2zeipxmnhej803x7****</p>
         */
        @NameInMap("SnapshotId")
        public String snapshotId;

        /**
         * <p>The name of the snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>testSnapshotName</p>
         */
        @NameInMap("SnapshotName")
        public String snapshotName;

        /**
         * <p>The type of the snapshot.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>AUTO: automatic snapshot</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>USER: manual snapshot</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>USER</p>
         */
        @NameInMap("SnapshotType")
        public String snapshotType;

        /**
         * <p>The capacity of the source disk. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>150</p>
         */
        @NameInMap("SourceDiskSize")
        public String sourceDiskSize;

        /**
         * <p>The type of the source disk.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>SYSTEM: system disk</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>DATA: data disk</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SYSTEM</p>
         */
        @NameInMap("SourceDiskType")
        public String sourceDiskType;

        /**
         * <p>The status of the snapshot.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>PROGRESSING: The snapshot is being created.</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>FAILED: The snapshot fails to be created.</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>ACCOMPLISHED: The snapshot is created.</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ACCOMPLISHED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Indicates whether disk encryption is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("VolumeEncryptionEnabled")
        public Boolean volumeEncryptionEnabled;

        /**
         * <p>The ID of the Key Management Service (KMS) key that is used when disk encryption is enabled. You can call the <a href="https://help.aliyun.com/document_detail/28951.html">ListKeys</a> operation to query the list of KMS keys.</p>
         * 
         * <strong>example:</strong>
         * <p>08c33a6f-4e0a-4a1b-a3fa-7ddfa1d4****</p>
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
