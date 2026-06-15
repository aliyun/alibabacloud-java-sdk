// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeMountTargetsRequest extends TeaModel {
    /**
     * <p>The dual-stack (IPv4 and IPv6) domain name of the mount target.</p>
     * <blockquote>
     * <p>Currently, only Extreme NAS file systems in Chinese mainland regions support IPv6.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1ca404****-x****.dualstack.cn-hangzhou.nas.aliyuncs.com</p>
     */
    @NameInMap("DualStackMountTargetDomain")
    public String dualStackMountTargetDomain;

    /**
     * <p>The ID of the file system.</p>
     * <ul>
     * <li><p>general-purpose NAS: 31a8e4\<em>\</em>\<em>\</em>.</p>
     * </li>
     * <li><p>Extreme NAS: The ID must start with <code>extreme-</code>. Example: extreme-0015\<em>\</em>\<em>\</em>.</p>
     * </li>
     * <li><p>CPFS: The ID must start with <code>cpfs-</code>. Example: cpfs-125487\<em>\</em>\<em>\</em>.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1ca404****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The domain name of the mount target.</p>
     * 
     * <strong>example:</strong>
     * <p>1ca404****-x****.cn-hangzhou.nas.aliyuncs.com</p>
     */
    @NameInMap("MountTargetDomain")
    public String mountTargetDomain;

    /**
     * <p>The page number to return.</p>
     * <p>The value must be 1 or greater. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of mount targets to return per page.</p>
     * <p>Valid values: 1 to 100.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
