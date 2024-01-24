// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ModifyMountTargetRequest extends TeaModel {
    /**
     * <p>The name of the permission group that is attached to the mount target.</p>
     */
    @NameInMap("AccessGroupName")
    public String accessGroupName;

    /**
     * <p>The dual-stack (IPv4 and IPv6) domain name of the mount target.</p>
     * <br>
     * <p>>  Only Extreme NAS file systems that reside in the Chinese mainland support IPv6.</p>
     */
    @NameInMap("DualStackMountTargetDomain")
    public String dualStackMountTargetDomain;

    /**
     * <p>The ID of the file system.</p>
     * <br>
     * <p>*   Sample ID of a General-purpose NAS file system: `31a8e4****`.</p>
     * <p>*   The IDs of Extreme NAS file systems must start with `extreme-`, for example, `extreme-0015****`.</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The IPv4 domain name of the mount target.</p>
     */
    @NameInMap("MountTargetDomain")
    public String mountTargetDomain;

    /**
     * <p>The status of the mount target.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   Active: The mount target is available.</p>
     * <p>*   Inactive: The mount target is unavailable.</p>
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
