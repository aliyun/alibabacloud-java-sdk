// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AttachDiskRequest extends TeaModel {
    /**
     * <p>Specifies whether to attach the disk as a system disk. Valid values:</p>
     * <ul>
     * <li><p>true: Attach as a system disk.</p>
     * </li>
     * <li><p>false: Do not attach as a system disk.</p>
     * </li>
     * </ul>
     * <p>Default value: false.</p>
     * <blockquote>
     * <p>If <code>Bootable</code> is set to <code>true</code>, the target ECS instance must have no system disk attached.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Bootable")
    public Boolean bootable;

    /**
     * <p>Specifies whether to release the disk when the instance is released. Valid values:</p>
     * <ul>
     * <li>true: The disk is released with the instance.</li>
     * <li>false: The disk is not released with the instance. The disk is retained as a pay-as-you-go data disk.</li>
     * </ul>
     * <p>Default value: false.</p>
     * <p>Note the following when setting this parameter:</p>
     * <ul>
     * <li><p>If <code>DeleteWithInstance</code> is set to <code>false</code> and the ECS instance is under security control (that is, <code>OperationLocks</code> contains <code>&quot;LockReason&quot; : &quot;security&quot;</code>), this attribute is ignored when the ECS instance is released, and the disk is released along with the instance.</p>
     * </li>
     * <li><p>If the disk to attach is an elastic ephemeral disk, you must set <code>DeleteWithInstance</code> to <code>true</code>.</p>
     * </li>
     * <li><p>This parameter is not supported for disks with the multi-attach feature enabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DeleteWithInstance")
    public Boolean deleteWithInstance;

    /**
     * <p>The device name of the disk.</p>
     * <blockquote>
     * <p>This parameter is being deprecated. To improve compatibility, use other parameters to identify the disk.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>testDeviceName</p>
     */
    @NameInMap("Device")
    public String device;

    /**
     * <p>The ID of the disk to attach. The disk (<code>DiskId</code>) and the instance (<code>InstanceId</code>) must be in the same zone.</p>
     * <blockquote>
     * <p>Both data disks and system disks are supported. For the relevant constraints, see the operation description above.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d-bp1j4l5axzdy6ftk****</p>
     */
    @NameInMap("DiskId")
    public String diskId;

    /**
     * <p>Specifies whether the request is a forced attach request. Valid values:</p>
     * <ul>
     * <li>true: Yes.</li>
     * <li>false: No.</li>
     * </ul>
     * <p>Default value: false.</p>
     * <blockquote>
     * <p>Currently, only the ESSD regional disk type (cloud_regional_disk_auto) supports setting this field to true.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Force")
    public Boolean force;

    /**
     * <p>The ID of the ECS instance to which you want to attach the disk.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp1dq5lozx5f4pmd****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the SSH key pair to bind to a Linux ECS instance when attaching a system disk.</p>
     * <ul>
     * <li><p>Windows Server instances: SSH key pairs are not supported. Even if this parameter is specified, only the <code>Password</code> configuration takes effect.</p>
     * </li>
     * <li><p>Linux instances: Password-based logon is disabled after the key pair is bound.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>KeyPairTestName</p>
     */
    @NameInMap("KeyPairName")
    public String keyPairName;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The password for the instance when attaching a system disk. This parameter applies only to the administrator and root usernames. The password must be 8 to 30 characters in length and must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. The following special characters are supported:</p>
     * <pre><code>()`~!@#$%^&amp;*-_+=|{}[]:;\\&quot;&lt;&gt;,.?/
     * </code></pre>
     * <p>For Windows instances, the password cannot start with a forward slash (/).</p>
     * <blockquote>
     * <p>If you specify the <code>Password</code> parameter, use HTTPS to send the request to prevent password leakage.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>EcsV587!</p>
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
