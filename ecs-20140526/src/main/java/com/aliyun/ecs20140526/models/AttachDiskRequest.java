// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AttachDiskRequest extends TeaModel {
    /**
     * <p>Specifies whether to attach the disk as the system disk. Valid values:</p>
     * <ul>
     * <li>true: attaches the disk as the system disk.</li>
     * <li>false: does not attach the disk as the system disk.</li>
     * </ul>
     * <p>Default value: false.</p>
     * <blockquote>
     * <p> You can set <code>Bootable</code> to true only if the instance does not have a system disk.</p>
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
     * <li>true: releases the disk when the instance is released.</li>
     * <li>false: does not release the disk when the instance is released. The disk is retained as a pay-as-you-go data disk.</li>
     * </ul>
     * <p>Default value: false.</p>
     * <p>When you specify this parameter, take note of the following items:</p>
     * <ul>
     * <li>If <code>OperationLocks</code> in the DescribeInstances response contains <code>&quot;LockReason&quot; : &quot;security&quot;</code> for the instance to which the disk is attached, the instance is locked for security reasons. Regardless of whether you set <code>DeleteWithInstance</code> to <code>false</code>, the DeleteWithInstance setting is ignored, and the disk is released when the instance is released.</li>
     * <li>If you want to attach an <code>elastic ephemeral disk</code>, you must set <code>DeleteWithInstance</code> to <code>true</code>.</li>
     * <li>You cannot specify DeleteWithInstance for disks for which the multi-attach feature is enabled.</li>
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
     * <p> This parameter will be removed in the future. We recommend that you use other parameters to ensure future compatibility.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>testDeviceName</p>
     */
    @NameInMap("Device")
    public String device;

    /**
     * <p>The ID of the disk. The disk specified by <code>DiskId</code> and the instance specified by <code>InstanceId</code> must reside in the same zone.</p>
     * <blockquote>
     * <p> For more information about the limits on attaching a data disk and a system disk, see the &quot;Usage notes&quot; section of this topic.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d-bp1j4l5axzdy6ftk****</p>
     */
    @NameInMap("DiskId")
    public String diskId;

    /**
     * <p>Specifies whether to force attach the disk to the instance. Valid values:</p>
     * <ul>
     * <li>true: force attaches the disk to the instance.</li>
     * <li>false: does not force attach the disk to the instance.</li>
     * </ul>
     * <p>Default value: false.</p>
     * <blockquote>
     * <p> You can set this parameter to true only for Regional Enterprise SSDs (ESSDs) (cloud_regional_disk_auto).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Force")
    public Boolean force;

    /**
     * <p>The ID of the instance to which you want to attach the disk.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp1dq5lozx5f4pmd****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the SSH key pair that you bind to the Linux instance when you attach the system disk.</p>
     * <ul>
     * <li>Windows instances do not support logons based on SSH key pairs. The <code>Password</code> parameter takes effect even if the KeyPairName parameter is specified.</li>
     * <li>For Linux instances, the username and password-based logon method is disabled by default.</li>
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
     * <p>The password that is set when you attach the system disk. The password is applicable only to the administrator and root users. The password must be 8 to 30 characters in length and must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. The following special characters are supported:</p>
     * <pre><code>()`~!@#$%^&amp;*-_+=|{}[]:;\\&quot;&lt;&gt;,.?/
     * </code></pre>
     * <p>For Windows instances, passwords cannot start with a forward slash (/).</p>
     * <blockquote>
     * <p>If <code>Password</code> is configured, we recommend that you send requests over HTTPS to prevent password leaks.</p>
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
