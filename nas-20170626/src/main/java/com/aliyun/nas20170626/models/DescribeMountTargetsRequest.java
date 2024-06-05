// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeMountTargetsRequest extends TeaModel {
    /**
     * <p>The dual-stack (IPv4 and IPv6) domain name of the mount target.</p>
     * <br>
     * <p>> Only Extreme NAS file systems that reside in the Chinese mainland support IPv6.</p>
     */
    @NameInMap("DualStackMountTargetDomain")
    public String dualStackMountTargetDomain;

    /**
     * <p>The ID of the file system.</p>
     * <br>
     * <p>*   Sample ID of a General-purpose NAS file system: 31a8e4\\*\\*\\*\\*.</p>
     * <p>*   The IDs of Extreme NAS file systems must start with `extreme-`, for example, extreme-0015\\*\\*\\*\\*.</p>
     * <p>*   The IDs of Cloud Parallel File Storage (CPFS) file systems must start with `cpfs-`, for example, cpfs-125487\\*\\*\\*\\*.</p>
     * <br>
     * <p>> CPFS file systems are available only on the China site (aliyun.com).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The domain name of the mount target.</p>
     */
    @NameInMap("MountTargetDomain")
    public String mountTargetDomain;

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

    public static DescribeMountTargetsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMountTargetsRequest self = new DescribeMountTargetsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMountTargetsRequest setDualStackMountTargetDomain(String dualStackMountTargetDomain) {
        this.dualStackMountTargetDomain = dualStackMountTargetDomain;
        return this;
    }
    public String getDualStackMountTargetDomain() {
        return this.dualStackMountTargetDomain;
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
