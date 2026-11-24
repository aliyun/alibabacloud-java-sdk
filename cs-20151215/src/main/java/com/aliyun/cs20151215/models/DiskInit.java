// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DiskInit extends TeaModel {
    /**
     * <p>The name of the disk, which uniquely identifies a disk in the node pool.</p>
     * <ul>
     * <li>If local_disk is set to false, the value must match a disk_name in scaling_group.data_disks.</li>
     * <li>If local_disk is set to true, the value must be different from any disk_name in scaling_group.data_disks.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>disk0</p>
     */
    @NameInMap("disk_name")
    public String diskName;

    /**
     * <p>The configuration for the local disk. If this parameter is set to true:</p>
     * <ul>
     * <li>If the disk cannot be matched by using the ECS DiskName and symbolic links, the local disk is matched.</li>
     * <li>If the disk is detected as uninitialized during boot, it is reinitialized.</li>
     * <li>Both mount_target and mkfs_type must be specified or left empty at the same time.</li>
     * <li>If this parameter is used in combination with mount_for_runtime and the local disk is reinitialized, the node must be removed from and then re-imported to the node pool.</li>
     * </ul>
     */
    @NameInMap("local_disk")
    public Boolean localDisk;

    /**
     * <p>The type of the file system for automatic formatting. If this parameter is left empty, the disk is not formatted.</p>
     * 
     * <strong>example:</strong>
     * <p>ext4</p>
     */
    @NameInMap("mkfs_type")
    public String mkfsType;

    /**
     * <p>The disk used to store container runtime data.</p>
     */
    @NameInMap("mount_for_runtime")
    public Boolean mountForRuntime;

    /**
     * <p>The mount directory. If this parameter is left empty, the disk is not mounted.</p>
     * 
     * <strong>example:</strong>
     * <p>/mnt/disk0</p>
     */
    @NameInMap("mount_target")
    public String mountTarget;

    public static DiskInit build(java.util.Map<String, ?> map) throws Exception {
        DiskInit self = new DiskInit();
        return TeaModel.build(map, self);
    }

    public DiskInit setDiskName(String diskName) {
        this.diskName = diskName;
        return this;
    }
    public String getDiskName() {
        return this.diskName;
    }

    public DiskInit setLocalDisk(Boolean localDisk) {
        this.localDisk = localDisk;
        return this;
    }
    public Boolean getLocalDisk() {
        return this.localDisk;
    }

    public DiskInit setMkfsType(String mkfsType) {
        this.mkfsType = mkfsType;
        return this;
    }
    public String getMkfsType() {
        return this.mkfsType;
    }

    public DiskInit setMountForRuntime(Boolean mountForRuntime) {
        this.mountForRuntime = mountForRuntime;
        return this;
    }
    public Boolean getMountForRuntime() {
        return this.mountForRuntime;
    }

    public DiskInit setMountTarget(String mountTarget) {
        this.mountTarget = mountTarget;
        return this;
    }
    public String getMountTarget() {
        return this.mountTarget;
    }

}
