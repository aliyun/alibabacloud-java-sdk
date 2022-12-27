// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ReInitDiskRequest extends TeaModel {
    // Specifies whether to automatically start the instance after the disk is re-initialized.
    // 
    // Default value: false.
    @NameInMap("AutoStartInstance")
    public Boolean autoStartInstance;

    // The ID of the disk.
    @NameInMap("DiskId")
    public String diskId;

    // The name of the key pair.
    // 
    // >  The parameter is applicable only to Linux instances. You can bind an SSH key pair to an instance as the logon credential when you re-initialize its system disk. After the SSH key pair is bound, the username and password logon method is disabled for the instance.
    @NameInMap("KeyPairName")
    public String keyPairName;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    // RAM用户的虚拟账号ID。
    @NameInMap("OwnerId")
    public Long ownerId;

    // Specifies whether to reset the password of the instance when you re-initialize its system disk. The password must be 8 to 30 characters in length. It must include at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. Special characters include
    // 
    // ```
    // 
    // ( ) ` ~ ! @ # $ % ^ & * - _ + = | { } [ ] : ; \" < > , . ? /
    //                                 
    // ```
    // 
    // For a Windows instance, the password cannot start with a forward slash (/).
    // 
    // >  If the `Password` parameter is specified, we recommend that you send requests over HTTPS to secure your password.
    @NameInMap("Password")
    public String password;

    // 资源主账号的账号名称。
    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    // 资源主账号的ID，亦即UID。
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    // Specifies whether to use Security Center for free after the system disk is re-initialized. Valid values:
    // 
    // *   Active: Security Center is used for free after the system disk is replaced. This value is applicable only to public images.
    // *   Deactive: Security Center is not used for free after the system disk is replaced. This value is applicable to all images.
    // 
    // Default value: Deactive.
    @NameInMap("SecurityEnhancementStrategy")
    public String securityEnhancementStrategy;

    public static ReInitDiskRequest build(java.util.Map<String, ?> map) throws Exception {
        ReInitDiskRequest self = new ReInitDiskRequest();
        return TeaModel.build(map, self);
    }

    public ReInitDiskRequest setAutoStartInstance(Boolean autoStartInstance) {
        this.autoStartInstance = autoStartInstance;
        return this;
    }
    public Boolean getAutoStartInstance() {
        return this.autoStartInstance;
    }

    public ReInitDiskRequest setDiskId(String diskId) {
        this.diskId = diskId;
        return this;
    }
    public String getDiskId() {
        return this.diskId;
    }

    public ReInitDiskRequest setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
    }

    public ReInitDiskRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ReInitDiskRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ReInitDiskRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public ReInitDiskRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ReInitDiskRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ReInitDiskRequest setSecurityEnhancementStrategy(String securityEnhancementStrategy) {
        this.securityEnhancementStrategy = securityEnhancementStrategy;
        return this;
    }
    public String getSecurityEnhancementStrategy() {
        return this.securityEnhancementStrategy;
    }

}
