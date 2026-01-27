// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class DescribeSnapshotsResponseBody extends TeaModel {
    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results.If NextToken is empty, no next page exists.</p>
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
     * <p>The snapshots.</p>
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
         * <p>The time when the snapshot was created. The time follows the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-20T14:52:28Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The snapshot description.</p>
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
         * <p>The progress of creating the cloud computer.</p>
         * 
         * <strong>example:</strong>
         * <p>100%</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The remaining time required to complete snapshot creation. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("RemainTime")
        public Integer remainTime;

        /**
         * <p>The ID of the restore point.</p>
         * 
         * <strong>example:</strong>
         * <p>rp-btgmaa20wkcju****</p>
         */
        @NameInMap("RestorePointId")
        public String restorePointId;

        /**
         * <p>The name of the restore point.</p>
         * 
         * <strong>example:</strong>
         * <p>Data Disk Backup</p>
         */
        @NameInMap("RestorePointName")
        public String restorePointName;

        /**
         * <p>The snapshot ID.</p>
         * 
         * <strong>example:</strong>
         * <p>s-2zeipxmnhej803x7****</p>
         */
        @NameInMap("SnapshotId")
        public String snapshotId;

        /**
         * <p>The snapshot name.</p>
         * 
         * <strong>example:</strong>
         * <p>testSnapshotName</p>
         */
        @NameInMap("SnapshotName")
        public String snapshotName;

        /**
         * <p>The snapshot type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>AUTO: an automatic snapshot.</li>
         * <li>USER: a manual snapshot.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>USER</p>
         */
        @NameInMap("SnapshotType")
        public String snapshotType;

        /**
         * <p>The size of the source disk. Unit: GiB.</p>
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
         * <li>SYSTEM: a system disk.</li>
         * <li>DATA: a data disk.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SYSTEM</p>
         */
        @NameInMap("SourceDiskType")
        public String sourceDiskType;

        /**
         * <p>The snapshot status.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>PROGRESSING: The snapshot is being created.</li>
         * <li>FAILED: The snapshot failed to be created.</li>
         * <li>ACCOMPLISHED: The snapshot is created.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ACCOMPLISHED</p>
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

        public DescribeSnapshotsResponseBodySnapshots setDesktopId(String desktopId) {
            this.desktopId = desktopId;
            return this;
        }
        public String getDesktopId() {
            return this.desktopId;
        }

        public DescribeSnapshotsResponseBodySnapshots setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeSnapshotsResponseBodySnapshots setRemainTime(Integer remainTime) {
            this.remainTime = remainTime;
            return this;
        }
        public Integer getRemainTime() {
            return this.remainTime;
        }

        public DescribeSnapshotsResponseBodySnapshots setRestorePointId(String restorePointId) {
            this.restorePointId = restorePointId;
            return this;
        }
        public String getRestorePointId() {
            return this.restorePointId;
        }

        public DescribeSnapshotsResponseBodySnapshots setRestorePointName(String restorePointName) {
            this.restorePointName = restorePointName;
            return this;
        }
        public String getRestorePointName() {
            return this.restorePointName;
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

    }

}
