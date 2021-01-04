// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeAutoSnapshotTasksRequest extends TeaModel {
    @NameInMap("FileSystemIds")
    public String fileSystemIds;

    @NameInMap("AutoSnapshotPolicyIds")
    public String autoSnapshotPolicyIds;

    @NameInMap("FileSystemType")
    public String fileSystemType;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    public static DescribeAutoSnapshotTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutoSnapshotTasksRequest self = new DescribeAutoSnapshotTasksRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAutoSnapshotTasksRequest setFileSystemIds(String fileSystemIds) {
        this.fileSystemIds = fileSystemIds;
        return this;
    }
    public String getFileSystemIds() {
        return this.fileSystemIds;
    }

    public DescribeAutoSnapshotTasksRequest setAutoSnapshotPolicyIds(String autoSnapshotPolicyIds) {
        this.autoSnapshotPolicyIds = autoSnapshotPolicyIds;
        return this;
    }
    public String getAutoSnapshotPolicyIds() {
        return this.autoSnapshotPolicyIds;
    }

    public DescribeAutoSnapshotTasksRequest setFileSystemType(String fileSystemType) {
        this.fileSystemType = fileSystemType;
        return this;
    }
    public String getFileSystemType() {
        return this.fileSystemType;
    }

    public DescribeAutoSnapshotTasksRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAutoSnapshotTasksRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

}
