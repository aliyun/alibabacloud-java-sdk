// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeMountTargetsRequest extends TeaModel {
    @NameInMap("FileSystemId")
    public String fileSystemId;

    @NameInMap("MountTargetDomain")
    public String mountTargetDomain;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("DualStackMountTargetDomain")
    public String dualStackMountTargetDomain;

    public static DescribeMountTargetsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMountTargetsRequest self = new DescribeMountTargetsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMountTargetsRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public DescribeMountTargetsRequest setMountTargetDomain(String mountTargetDomain) {
        this.mountTargetDomain = mountTargetDomain;
        return this;
    }
    public String getMountTargetDomain() {
        return this.mountTargetDomain;
    }

    public DescribeMountTargetsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeMountTargetsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeMountTargetsRequest setDualStackMountTargetDomain(String dualStackMountTargetDomain) {
        this.dualStackMountTargetDomain = dualStackMountTargetDomain;
        return this;
    }
    public String getDualStackMountTargetDomain() {
        return this.dualStackMountTargetDomain;
    }

}
