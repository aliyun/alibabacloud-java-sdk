// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AttachDiskRequest extends TeaModel {
    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("DiskId")
    @Validation(required = true)
    public String diskId;

    @NameInMap("Device")
    public String device;

    @NameInMap("DeleteWithInstance")
    public Boolean deleteWithInstance;

    @NameInMap("Bootable")
    public Boolean bootable;

    @NameInMap("Password")
    public String password;

    @NameInMap("KeyPairName")
    public String keyPairName;

    public static AttachDiskRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachDiskRequest self = new AttachDiskRequest();
        return TeaModel.build(map, self);
    }

    public AttachDiskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AttachDiskRequest setDiskId(String diskId) {
        this.diskId = diskId;
        return this;
    }
    public String getDiskId() {
        return this.diskId;
    }

    public AttachDiskRequest setDevice(String device) {
        this.device = device;
        return this;
    }
    public String getDevice() {
        return this.device;
    }

    public AttachDiskRequest setDeleteWithInstance(Boolean deleteWithInstance) {
        this.deleteWithInstance = deleteWithInstance;
        return this;
    }
    public Boolean getDeleteWithInstance() {
        return this.deleteWithInstance;
    }

    public AttachDiskRequest setBootable(Boolean bootable) {
        this.bootable = bootable;
        return this;
    }
    public Boolean getBootable() {
        return this.bootable;
    }

    public AttachDiskRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public AttachDiskRequest setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
    }

}
