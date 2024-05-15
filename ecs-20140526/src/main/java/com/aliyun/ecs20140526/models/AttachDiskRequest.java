// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AttachDiskRequest extends TeaModel {
    /**
     * <p>Specifies whether to attach the disk as a system disk.</p>
     * <br>
     * <p>Default value: false.</p>
     * <br>
     * <p>> If you set `Bootable` to true, the instance must be in the No System Disk state.</p>
     */
    @NameInMap("Bootable")
    public Boolean bootable;

    /**
     * <p>Specifies whether to release the disk when the instance is released. Valid values:</p>
     * <br>
     * <p>*   true: releases the disk when the instance is released.</p>
     * <p>*   false: does not release the data disk when the instance is released. The disk is retained as a pay-as-you-go data disk.</p>
     * <br>
     * <p>Default value: false.</p>
     * <br>
     * <p>When you specify this parameter, take note of the following items:</p>
     * <br>
     * <p>*   If `OperationLocks` in the DescribeInstances response contains `"LockReason" : "security"` for the instance to which the disk is attached, the instance is locked for security reasons. Regardless of whether you set `DeleteWithInstance` to `false`, the DeleteWithInstance parameter is ignored, and the disk is released when the instance is released.</p>
     * <p>*   You cannot specify this parameter for disks for which the multi-attach feature is enabled.</p>
     */
    @NameInMap("DeleteWithInstance")
    public Boolean deleteWithInstance;

    /**
     * <p>The device name of the disk.</p>
     * <br>
     * <p>> This parameter will be removed in the future. We recommend that you use other parameters to ensure compatibility.</p>
     */
    @NameInMap("Device")
    public String device;

    /**
     * <p>The ID of the disk. The disk specified by the `DiskId` parameter and the instance specified by the `InstanceId` parameter must reside in the same zone.</p>
     * <br>
     * <p>> For more information about the limits on attaching a data disk and a system disk, see the "Usage notes" section of this topic.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DiskId")
    public String diskId;

    @NameInMap("Force")
    public Boolean force;

    /**
     * <p>The ID of the instance to which you want to attach the disk.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the SSH key pair that you bind to the Linux instance when you attach the system disk.</p>
     * <br>
     * <p>*   Windows instances do not support logons based on SSH key pairs. The `Password` parameter takes effect even if the KeyPairName parameter is specified.</p>
     * <p>*   For Linux instances, the username and password-based logon method is disabled by default.</p>
     */
    @NameInMap("KeyPairName")
    public String keyPairName;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The password that is set when you attach the system disk. The password is applicable only to the administrator and root users. The password must be 8 to 30 characters in length and must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. The following special characters are supported:</p>
     * <br>
     * <p>    ()`~!@#$%^&*-_+=|{}[]:;\\"<>,.?/</p>
     * <br>
     * <p>For Windows instances, passwords cannot start with a forward slash (/).</p>
     * <br>
     * <p>> If `Password` is configured, we recommend that you send requests over HTTPS to prevent password leaks.</p>
     */
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

    public AttachDiskRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
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
