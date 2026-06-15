// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ModifyMountTargetRequest extends TeaModel {
    /**
     * <p>The name of the access group that is associated with the mount target.</p>
     * 
     * <strong>example:</strong>
     * <p>classic-test</p>
     */
    @NameInMap("AccessGroupName")
    public String accessGroupName;

    @NameInMap("AccessPointAccessOnly")
    public Boolean accessPointAccessOnly;

    /**
     * <p>The domain name of the dual-stack mount target.</p>
     * <blockquote>
     * <p>The IPv6 feature is available only for Extreme NAS file systems in the Chinese mainland.</p>
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
     * <li><p>For a General-purpose NAS file system, the ID is similar to <code>31a8e4****</code>.</p>
     * </li>
     * <li><p>For an Extreme NAS file system, the ID must start with <code>extreme-</code>, for example, <code>extreme-0015****</code>.</p>
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
     * <p>The domain name of the IPv4 mount target.</p>
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
     * <li><p>Active: The mount target is available.</p>
     * </li>
     * <li><p>Inactive: The mount target is unavailable.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>You can change the status of a mount target only if the mount target is attached to a General-purpose NAS file system.</p>
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

    public ModifyMountTargetRequest setAccessPointAccessOnly(Boolean accessPointAccessOnly) {
        this.accessPointAccessOnly = accessPointAccessOnly;
        return this;
    }
    public Boolean getAccessPointAccessOnly() {
        return this.accessPointAccessOnly;
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
