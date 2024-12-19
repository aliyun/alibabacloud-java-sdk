// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeSnapshotsRequest extends TeaModel {
    /**
     * <p>The ID of the file system.</p>
     * 
     * <strong>example:</strong>
     * <p>extreme-22f****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The type of the file system.</p>
     * <p>Valid value: extreme, which indicates Extreme File Storage NAS (NAS) file systems.</p>
     * 
     * <strong>example:</strong>
     * <p>extreme</p>
     */
    @NameInMap("FileSystemType")
    public String fileSystemType;

    /**
     * <p>The page number.</p>
     * <p>Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * <p>Valid values: 1 to 100.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The snapshot IDs.</p>
     * <p>You can specify a maximum of 100 snapshot IDs. You must separate snapshot IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>s-extreme-67pxwk9aevrkr****,s-extreme-snapsho****,s-extreme-6tmsbas6ljhwh****</p>
     */
    @NameInMap("SnapshotIds")
    public String snapshotIds;

    /**
     * <p>The snapshot name.</p>
     * 
     * <strong>example:</strong>
     * <p>FinanceJoshua</p>
     */
    @NameInMap("SnapshotName")
    public String snapshotName;

    /**
     * <p>The type of the snapshot.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>auto: auto snapshot</li>
     * <li>user: manual snapshot</li>
     * <li>all (default): all snapshot types</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>all</p>
     */
    @NameInMap("SnapshotType")
    public String snapshotType;

    /**
     * <p>The status of the snapshot.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>progressing: The snapshot is being created.</li>
     * <li>accomplished: The snapshot is created.</li>
     * <li>failed: The snapshot fails to be created.</li>
     * <li>all (default): all snapshot states.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>all</p>
     */
    @NameInMap("Status")
    public String status;

    public static DescribeSnapshotsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSnapshotsRequest self = new DescribeSnapshotsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSnapshotsRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public DescribeSnapshotsRequest setFileSystemType(String fileSystemType) {
        this.fileSystemType = fileSystemType;
        return this;
    }
    public String getFileSystemType() {
        return this.fileSystemType;
    }

    public DescribeSnapshotsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSnapshotsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSnapshotsRequest setSnapshotIds(String snapshotIds) {
        this.snapshotIds = snapshotIds;
        return this;
    }
    public String getSnapshotIds() {
        return this.snapshotIds;
    }

    public DescribeSnapshotsRequest setSnapshotName(String snapshotName) {
        this.snapshotName = snapshotName;
        return this;
    }
    public String getSnapshotName() {
        return this.snapshotName;
    }

    public DescribeSnapshotsRequest setSnapshotType(String snapshotType) {
        this.snapshotType = snapshotType;
        return this;
    }
    public String getSnapshotType() {
        return this.snapshotType;
    }

    public DescribeSnapshotsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
