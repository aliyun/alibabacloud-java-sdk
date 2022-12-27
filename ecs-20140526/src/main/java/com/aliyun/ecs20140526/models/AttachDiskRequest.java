// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AttachDiskRequest extends TeaModel {
    // Specifies whether to attach the disk as a system disk.
    // 
    // Default value: false.
    // 
    // >  If the `Bootable` parameter is set to true, the instance must be in the No System Disk state.
    @NameInMap("Bootable")
    public Boolean bootable;

    // Specifies whether to release the disk together with the instance. Valid values:
    // 
    // *   true: The disk is released together with the instance.
    // *   false: The disk is not released together with the instance. It is retained as a pay-as-you-go data disk.
    // 
    // Default value: false.
    // 
    // When you specify this parameter, take note of the following items:
    // 
    // *   If `OperationLocks` for an instance contains `"LockReason" : "security"`, the instance is locked for security reasons. Even if `DeleteWithInstance` of attached disks is set to `false`, the DeleteWithInstance parameter is ignored and disks are released together with the instance.
    // *   This parameter is unavailable for disks for which the multi-attach feature is enabled.
    @NameInMap("DeleteWithInstance")
    public Boolean deleteWithInstance;

    // The name of the disk.
    // 
    // >  This parameter will be removed in the future. We recommend that you use other parameters to ensure future compatibility.
    @NameInMap("Device")
    public String device;

    // The ID of the disk to be attached. The disk specified by the `DiskId` parameter and the instance specified by the `InstanceId` parameter must reside in the same zone.
    // 
    // >  For more information about the limits on attaching a data disk and a system disk, see the "Description" section.
    @NameInMap("DiskId")
    public String diskId;

    // The ID of the instance to which to attach the disk.
    @NameInMap("InstanceId")
    public String instanceId;

    // The name of the SSH key pair that you bind to the Linux instance when you attach the system disk.
    // 
    // *   Windows instances do not support logons based on SSH key pairs. The `Password` parameter takes effect even if the KeyPairName parameter is specified.
    // *   For Linux instances, the password-based logon method is disabled by default.
    @NameInMap("KeyPairName")
    public String keyPairName;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The password set when you attach the system disk. The password is applicable only to the administrator and root users. The password must be 8 to 30 characters in length. It must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. The following special characters can be used:
    // 
    // ```
    // 
    // ()`~!@#$%^&*-_+=|{}[]:;\"<>,.?/ 
    //                      
    // ```
    // 
    // For Windows instances, the password cannot start with a forward slash (/).
    // 
    // >  If the `Password` parameter is specified, we recommend that you send requests over HTTPS to avoid password leaks.
    @NameInMap("Password")
    public String password;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static AttachDiskRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachDiskRequest self = new AttachDiskRequest();
        return TeaModel.build(map, self);
    }

    public AttachDiskRequest setBootable(Boolean bootable) {
        this.bootable = bootable;
        return this;
    }
    public Boolean getBootable() {
        return this.bootable;
    }

    public AttachDiskRequest setDeleteWithInstance(Boolean deleteWithInstance) {
        this.deleteWithInstance = deleteWithInstance;
        return this;
    }
    public Boolean getDeleteWithInstance() {
        return this.deleteWithInstance;
    }

    public AttachDiskRequest setDevice(String device) {
        this.device = device;
        return this;
    }
    public String getDevice() {
        return this.device;
    }

    public AttachDiskRequest setDiskId(String diskId) {
        this.diskId = diskId;
        return this;
    }
    public String getDiskId() {
        return this.diskId;
    }

    public AttachDiskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AttachDiskRequest setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
    }

    public AttachDiskRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public AttachDiskRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AttachDiskRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public AttachDiskRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AttachDiskRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
