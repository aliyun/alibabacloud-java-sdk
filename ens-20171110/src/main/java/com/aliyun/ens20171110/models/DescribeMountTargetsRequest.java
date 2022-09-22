// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeMountTargetsRequest extends TeaModel {
    @NameInMap("EnsRegionId")
    public String ensRegionId;

    @NameInMap("FileSystemId")
    public String fileSystemId;

    @NameInMap("MountTargetName")
    public String mountTargetName;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeMountTargetsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMountTargetsRequest self = new DescribeMountTargetsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMountTargetsRequest setEnsRegionId(String ensRegionId) {
        this.ensRegionId = ensRegionId;
        return this;
    }
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    public DescribeMountTargetsRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public DescribeMountTargetsRequest setMountTargetName(String mountTargetName) {
        this.mountTargetName = mountTargetName;
        return this;
    }
    public String getMountTargetName() {
        return this.mountTargetName;
    }

    public DescribeMountTargetsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeMountTargetsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
