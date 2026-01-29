// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DiskInit extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>disk0</p>
     */
    @NameInMap("disk_name")
    public String diskName;

    @NameInMap("local_disk")
    public Boolean localDisk;

    /**
     * <strong>example:</strong>
     * <p>ext4</p>
     */
    @NameInMap("mkfs_type")
    public String mkfsType;

    @NameInMap("mount_for_runtime")
    public Boolean mountForRuntime;

    /**
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
