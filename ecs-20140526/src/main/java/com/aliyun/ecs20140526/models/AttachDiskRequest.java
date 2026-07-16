// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AttachDiskRequest extends TeaModel {
    /**
     * <p>Specifies whether to attach the disk as a system disk. Valid values:</p>
     * <ul>
     * <li><p>true: The disk is attached as a system disk.</p>
     * </li>
     * <li><p>false: The disk is not attached as a system disk.</p>
     * </li>
     * </ul>
     * <p>Default value: false.</p>
     * <blockquote>
     * <p>If you set <code>Bootable=true</code>, the destination ECS instance must have no system disk attached.</p>
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
     * <li>true: The disk is released together with the instance.</li>
     * <li>false: The disk is not released together with the instance. The disk is retained as a pay-as-you-go data disk.</li>
     * </ul>
     * <p>Default value: false.</p>
     * <p>When you set this parameter, take note of the following items:</p>
     * <ul>
     * <li><p>If you set <code>DeleteWithInstance</code> to <code>false</code> and the ECS instance is locked for security reasons, meaning that <code>OperationLocks</code> contains <code>&quot;LockReason&quot; : &quot;security&quot;</code>, this parameter is ignored when the instance is released, and the disk is released together with the instance.</p>
     * </li>
     * <li><p>If the disk to be attached is an <code>elastic ephemeral disk</code>, you must set <code>DeleteWithInstance</code> to <code>true</code>.</p>
     * </li>
     * <li><p>Disks with the multi-attach feature enabled do not support this parameter.</p>
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
     * <p>This parameter will be deprecated soon. To improve compatibility, use other parameters to identify the disk.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>testDeviceName</p>
     */
    @NameInMap("Device")
    public String device;

    /**
     * <p>The ID of the disk to be attached. The disk (<code>DiskId</code>) and the instance (<code>InstanceId</code>) must be in the same zone.</p>
     * <blockquote>
     * <p>Both data disks and system disks can be attached. For related constraints, see the operation description section above.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d-bp1j4l5axzdy6ftk****</p>
     */
    @NameInMap("DiskId")
    public String diskId;

    /**
     * <p>Specifies whether to forcefully attach the disk. Valid values:</p>
     * <ul>
     * <li>true: Forcefully attaches the disk.</li>
     * <li>false: Does not forcefully attach the disk.</li>
     * </ul>
     * <p>Default value: false.</p>
     * <blockquote>
     * <p>Currently, only regional ESSDs (cloud_regional_disk_auto) support setting this parameter to true.</p>
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
     * <p>The name of the SSH key pair that is bound to the Linux ECS instance when you attach a system disk.</p>
     * <ul>
     * <li><p>Windows Server instances: SSH key pairs are not supported. Even if this parameter is specified, only the <code>Password</code> configuration takes effect.</p>
     * </li>
     * <li><p>Linux instances: The password-based logon method is disabled by default.</p>
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
     * <p>The password that is set for the instance when you attach a system disk. The password is effective only for the administrator and root usernames and is not effective for other usernames. The password must be 8 to 30 characters in length and must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. The following special characters are supported:</p>
     * <pre><code>()`~!@#$%^&amp;*-_+=|{}[]:;\\&quot;&lt;&gt;,.?/
     * </code></pre>
     * <p>For Windows instances, the password cannot start with a forward slash (/).</p>
     * <blockquote>
     * <p>If you specify the <code>Password</code> parameter, send the request over HTTPS to prevent password leaks.</p>
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
