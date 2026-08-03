// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ModifyMountTargetRequest extends TeaModel {
    /**
     * <p>The permission group attached to the mount target.</p>
     * 
     * <strong>example:</strong>
     * <p>classic-test</p>
     */
    @NameInMap("AccessGroupName")
    public String accessGroupName;

    /**
     * <p>Specifies whether the VPC mount target supports access only through access points. This parameter applies only to CPFS for Lingjun file systems.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AccessPointAccessOnly")
    public Boolean accessPointAccessOnly;

    /**
     * <p>The IPv4/IPv6 dual-stack mount target.</p>
     * <blockquote>
     * <p>Currently, only Extreme NAS in regions in the Chinese mainland supports IPv6.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>174494b666-x****.dualstack.cn-hangzhou.nas.aliyuncs.com</p>
     */
    @NameInMap("DualStackMountTargetDomain")
    public String dualStackMountTargetDomain;

    /**
     * <p>The file system ID.</p>
     * <ul>
     * <li>General-purpose NAS: <code>31a8e4****</code>.</li>
     * <li>Extreme NAS: Must start with <code>extreme-</code>, such as <code>extreme-0015****</code>.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1ca404****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The IPv4 mount target.</p>
     * 
     * <strong>example:</strong>
     * <p>1ca404a666-w****.cn-hangzhou.nas.aliyuncs.com</p>
     */
    @NameInMap("MountTargetDomain")
    public String mountTargetDomain;

    /**
     * <p>The mount target status.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Active: active</li>
     * <li>Inactive: inactive</li>
     * </ul>
     * <blockquote>
     * <p>Only General-purpose NAS supports changing the mount target status.</p>
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
