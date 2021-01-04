// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeAutoSnapshotPoliciesRequest extends TeaModel {
    @NameInMap("AutoSnapshotPolicyId")
    public String autoSnapshotPolicyId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("FileSystemType")
    public String fileSystemType;

    public static DescribeAutoSnapshotPoliciesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutoSnapshotPoliciesRequest self = new DescribeAutoSnapshotPoliciesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAutoSnapshotPoliciesRequest setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
        this.autoSnapshotPolicyId = autoSnapshotPolicyId;
        return this;
    }
    public String getAutoSnapshotPolicyId() {
        return this.autoSnapshotPolicyId;
    }

    public DescribeAutoSnapshotPoliciesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAutoSnapshotPoliciesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAutoSnapshotPoliciesRequest setFileSystemType(String fileSystemType) {
        this.fileSystemType = fileSystemType;
        return this;
    }
    public String getFileSystemType() {
        return this.fileSystemType;
    }

}
