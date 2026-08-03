// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeAutoSnapshotTasksRequest extends TeaModel {
    /**
     * <p>The IDs of the automatic snapshot policies.</p>
     * <p>You can specify up to 100 automatic snapshot policy IDs. To query tasks of multiple automatic snapshot policies, separate the policy IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>sp-extreme-233e6****,sp-extreme-233e6****, sp-extreme-233e6****</p>
     */
    @NameInMap("AutoSnapshotPolicyIds")
    public String autoSnapshotPolicyIds;

    /**
     * <p>The IDs of the file systems.</p>
     * <p>You can specify up to 100 file system IDs in a single request. To query snapshots of multiple file systems, separate the file system IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>extreme-233e6****,extreme -23vbp****,extreme -23vas****</p>
     */
    @NameInMap("FileSystemIds")
    public String fileSystemIds;

    /**
     * <p>The type of the file system.</p>
     * <p>Valid values: extreme (Extreme NAS file system)</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>extreme</p>
     */
    @NameInMap("FileSystemType")
    public String fileSystemType;

    /**
     * <p>The number of snapshot tasks on each page.</p>
     * <p>Valid values: 1 to 100.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The page number of the automatic snapshot task list.</p>
     * <p>Start value (default value): 1</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeAutoSnapshotTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutoSnapshotTasksRequest self = new DescribeAutoSnapshotTasksRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAutoSnapshotTasksRequest setAutoSnapshotPolicyIds(String autoSnapshotPolicyIds) {
        this.autoSnapshotPolicyIds = autoSnapshotPolicyIds;
        return this;
    }
    public String getAutoSnapshotPolicyIds() {
        return this.autoSnapshotPolicyIds;
    }

    public DescribeAutoSnapshotTasksRequest setFileSystemIds(String fileSystemIds) {
        this.fileSystemIds = fileSystemIds;
        return this;
    }
    public String getFileSystemIds() {
        return this.fileSystemIds;
    }

    public DescribeAutoSnapshotTasksRequest setFileSystemType(String fileSystemType) {
        this.fileSystemType = fileSystemType;
        return this;
    }
    public String getFileSystemType() {
        return this.fileSystemType;
    }

    public DescribeAutoSnapshotTasksRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAutoSnapshotTasksRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
