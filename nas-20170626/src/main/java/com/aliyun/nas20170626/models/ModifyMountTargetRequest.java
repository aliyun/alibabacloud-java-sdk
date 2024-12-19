// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ModifyMountTargetRequest extends TeaModel {
    /**
     * <p>The name of the permission group that is attached to the mount target.</p>
     * 
     * <strong>example:</strong>
     * <p>classic-test</p>
     */
    @NameInMap("AccessGroupName")
    public String accessGroupName;

    /**
     * <p>The dual-stack (IPv4 and IPv6) domain name of the mount target.</p>
     * <blockquote>
     * <p> Only Extreme NAS file systems that reside in the Chinese mainland support IPv6.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>174494b666-x****.dualstack.cn-hangzhou.nas.aliyuncs.com</p>
     */
    @NameInMap("DualStackMountTargetDomain")
    public String dualStackMountTargetDomain;

    /**
     * <p>The ID of the file system.</p>
     * <ul>
     * <li>Sample ID of a General-purpose NAS file system: <code>31a8e4****</code>.</li>
     * <li>The IDs of Extreme NAS file systems must start with <code>extreme-</code>, for example, <code>extreme-0015****</code>.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1ca404****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The IPv4 domain name of the mount target.</p>
     * 
     * <strong>example:</strong>
     * <p>1ca404a666-w****.cn-hangzhou.nas.aliyuncs.com</p>
     */
    @NameInMap("MountTargetDomain")
    public String mountTargetDomain;

    /**
     * <p>The status of the mount target.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Active: The mount target is available.</li>
     * <li>Inactive: The mount target is unavailable.</li>
     * </ul>
     * <blockquote>
     * <p> Only General-purpose File Storage NAS (NAS) file systems support changing the mount target status.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Inactive</p>
     */
    @NameInMap("Status")
    public String status;

    public static ModifyMountTargetRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyMountTargetRequest self = new ModifyMountTargetRequest();
        return TeaModel.build(map, self);
    }

    public ModifyMountTargetRequest setAccessGroupName(String accessGroupName) {
        this.accessGroupName = accessGroupName;
        return this;
    }
    public String getAccessGroupName() {
        return this.accessGroupName;
    }

    public ModifyMountTargetRequest setDualStackMountTargetDomain(String dualStackMountTargetDomain) {
        this.dualStackMountTargetDomain = dualStackMountTargetDomain;
        return this;
    }
    public String getDualStackMountTargetDomain() {
        return this.dualStackMountTargetDomain;
    }

    public ModifyMountTargetRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public ModifyMountTargetRequest setMountTargetDomain(String mountTargetDomain) {
        this.mountTargetDomain = mountTargetDomain;
        return this;
    }
    public String getMountTargetDomain() {
        return this.mountTargetDomain;
    }

    public ModifyMountTargetRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
