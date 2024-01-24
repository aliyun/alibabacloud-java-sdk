// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeSnapshotsRequest extends TeaModel {
    /**
     * <p>The ID of the file system.</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The type of the file system.</p>
     * <br>
     * <p>Valid value: extreme, which indicates Extreme NAS file systems.</p>
     */
    @NameInMap("FileSystemType")
    public String fileSystemType;

    /**
     * <p>The page number.</p>
     * <br>
     * <p>Pages start from page 1. Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * <br>
     * <p>Valid values: 1 to 100.</p>
     * <br>
     * <p>Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The snapshot IDs.</p>
     * <br>
     * <p>You can specify a maximum of 100 snapshot IDs. You must separate snapshot IDs with commas (,).</p>
     */
    @NameInMap("SnapshotIds")
    public String snapshotIds;

    /**
     * <p>The snapshot name.</p>
     */
    @NameInMap("SnapshotName")
    public String snapshotName;

    /**
     * <p>The type of the snapshot.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   auto: auto snapshot</p>
     * <p>*   user: manual snapshot</p>
     * <p>*   all (default): all snapshot types</p>
     */
    @NameInMap("SnapshotType")
    public String snapshotType;

    /**
     * <p>The status of the snapshot.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   progressing: The snapshot is being created.</p>
     * <p>*   accomplished: The snapshot is created.</p>
     * <p>*   failed: The snapshot fails to be created.</p>
     * <p>*   all (default): all snapshot states.</p>
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
