// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ReplaceSystemDiskRequest extends TeaModel {
    @NameInMap("SystemDisk")
    public ReplaceSystemDiskRequestSystemDisk systemDisk;

    /**
     * <p>The system architecture. Valid values:</p>
     * <br>
     * <p>*   i386</p>
     * <p>*   x86\_64</p>
     */
    @NameInMap("Architecture")
    public String architecture;

    /**
     * <p>This parameter is unavailable for public use.</p>
     */
    @NameInMap("Arn")
    public java.util.List<ReplaceSystemDiskRequestArn> arn;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but make sure that the token is unique among the requests. The **ClientToken** value can only contain ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the disk.</p>
     * <br>
     * <p>If the `ImageId` parameter is not specified, this parameter is required.</p>
     * <br>
     * <p>If the DiskId parameter is specified, the `Platform` and `Architecture` parameters are required. The specified values of `Platform` and `Architecture` must be consistent with those of `Platform` and `Architecture` of the instance.</p>
     * <br>
     * <p>> This feature is in invitational preview. To use this feature, [submit a ticket](https://workorder-intl.console.aliyun.com/console.htm).</p>
     */
    @NameInMap("DiskId")
    public String diskId;

    /**
     * <p>> This parameter is unavailable for public use.</p>
     */
    @NameInMap("EncryptAlgorithm")
    public String encryptAlgorithm;

    /**
     * <p>Specifies whether to encrypt the disk. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("Encrypted")
    public Boolean encrypted;

    /**
     * <p>The ID of the image.</p>
     * <br>
     * <p>If the `DiskId` parameter is not specified, this parameter is required.</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the Key Management Service (KMS) key to use for the system disk.</p>
     */
    @NameInMap("KMSKeyId")
    public String KMSKeyId;

    /**
     * <p>The name of the key pair.</p>
     * <br>
     * <p>> This parameter is applicable only to Linux instances. You can bind an SSH key pair to the instance as a logon credential. After the SSH key pair is bound, the username and password-based logon method is disabled for the instance.</p>
     */
    @NameInMap("KeyPairName")
    public String keyPairName;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Specifies whether to reset the password for the instance. The password must be 8 to 30 characters in length and must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. Special characters include:</p>
     * <br>
     * <p>    ()`~!@#$%^&*-_+=|{}[]:;\"<>,.?/</p>
     * <br>
     * <p>The password of a Windows instance cannot start with a forward slash (/).</p>
     * <br>
     * <p>This parameter is empty by default, which indicates that the current password remains unchanged.</p>
     * <br>
     * <p>> If the `Password` parameter is specified, we recommend that you send requests over HTTPS to prevent password leaks.</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>Specifies whether to use the preset password of the image.</p>
     * <br>
     * <p>Default value: false.</p>
     * <br>
     * <p>> If the PasswordInherit parameter is specified, you must leave the Password parameter empty and make sure that the selected image has a preset password.</p>
     */
    @NameInMap("PasswordInherit")
    public Boolean passwordInherit;

    /**
     * <p>The operating system distribution. Valid values:</p>
     * <br>
     * <p>*   CentOS</p>
     * <p>*   Ubuntu</p>
     */
    @NameInMap("Platform")
    public String platform;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Specifies whether to use Security Center Basic after the system disk is replaced. Valid values:</p>
     * <br>
     * <p>*   Active: uses Security Center Basic after the system disk is replaced. This value is applicable to only public images.</p>
     * <p>*   Deactive: does not use Security Center Basic after the system disk is replaced. This value is applicable to all images.</p>
     * <br>
     * <p>Default value: Deactive.</p>
     */
    @NameInMap("SecurityEnhancementStrategy")
    public String securityEnhancementStrategy;

    /**
     * <p>Specifies whether to use the system configurations for virtual machines provided by Alibaba Cloud (Windows: NTP and KMS. Linux: NTP and YUM).</p>
     * <br>
     * <p>> This parameter takes effect only when you attach a system disk whose device name is /dev/xvda.</p>
     */
    @NameInMap("UseAdditionalService")
    public Boolean useAdditionalService;

    public static ReplaceSystemDiskRequest build(java.util.Map<String, ?> map) throws Exception {
        ReplaceSystemDiskRequest self = new ReplaceSystemDiskRequest();
        return TeaModel.build(map, self);
    }

    public ReplaceSystemDiskRequest setSystemDisk(ReplaceSystemDiskRequestSystemDisk systemDisk) {
        this.systemDisk = systemDisk;
        return this;
    }
    public ReplaceSystemDiskRequestSystemDisk getSystemDisk() {
        return this.systemDisk;
    }

    public ReplaceSystemDiskRequest setArchitecture(String architecture) {
        this.architecture = architecture;
        return this;
    }
    public String getArchitecture() {
        return this.architecture;
    }

    public ReplaceSystemDiskRequest setArn(java.util.List<ReplaceSystemDiskRequestArn> arn) {
        this.arn = arn;
        return this;
    }
    public java.util.List<ReplaceSystemDiskRequestArn> getArn() {
        return this.arn;
    }

    public ReplaceSystemDiskRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ReplaceSystemDiskRequest setDiskId(String diskId) {
        this.diskId = diskId;
        return this;
    }
    public String getDiskId() {
        return this.diskId;
    }

    public ReplaceSystemDiskRequest setEncryptAlgorithm(String encryptAlgorithm) {
        this.encryptAlgorithm = encryptAlgorithm;
        return this;
    }
    public String getEncryptAlgorithm() {
        return this.encryptAlgorithm;
    }

    public ReplaceSystemDiskRequest setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
        return this;
    }
    public Boolean getEncrypted() {
        return this.encrypted;
    }

    public ReplaceSystemDiskRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public ReplaceSystemDiskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ReplaceSystemDiskRequest setKMSKeyId(String KMSKeyId) {
        this.KMSKeyId = KMSKeyId;
        return this;
    }
    public String getKMSKeyId() {
        return this.KMSKeyId;
    }

    public ReplaceSystemDiskRequest setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
    }

    public ReplaceSystemDiskRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ReplaceSystemDiskRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ReplaceSystemDiskRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public ReplaceSystemDiskRequest setPasswordInherit(Boolean passwordInherit) {
        this.passwordInherit = passwordInherit;
        return this;
    }
    public Boolean getPasswordInherit() {
        return this.passwordInherit;
    }

    public ReplaceSystemDiskRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public ReplaceSystemDiskRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ReplaceSystemDiskRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ReplaceSystemDiskRequest setSecurityEnhancementStrategy(String securityEnhancementStrategy) {
        this.securityEnhancementStrategy = securityEnhancementStrategy;
        return this;
    }
    public String getSecurityEnhancementStrategy() {
        return this.securityEnhancementStrategy;
    }

    public ReplaceSystemDiskRequest setUseAdditionalService(Boolean useAdditionalService) {
        this.useAdditionalService = useAdditionalService;
        return this;
    }
    public Boolean getUseAdditionalService() {
        return this.useAdditionalService;
    }

    public static class ReplaceSystemDiskRequestSystemDisk extends TeaModel {
        /**
         * <p>The capacity of the new system disk. Unit: GiB. Valid values: Max{20, Size of the image specified by ImageId} to 500.</p>
         * <br>
         * <p>Default value: Max{40, Size of the image specified by ImageId}.</p>
         * <br>
         * <p>> If the capacity of the new system disk exceeds `Max{20, Capacity of the original system disk}`, you are charged for the excess capacity.</p>
         */
        @NameInMap("Size")
        public Integer size;

        public static ReplaceSystemDiskRequestSystemDisk build(java.util.Map<String, ?> map) throws Exception {
            ReplaceSystemDiskRequestSystemDisk self = new ReplaceSystemDiskRequestSystemDisk();
            return TeaModel.build(map, self);
        }

        public ReplaceSystemDiskRequestSystemDisk setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

    }

    public static class ReplaceSystemDiskRequestArn extends TeaModel {
        /**
         * <p>> This parameter is unavailable for public use.</p>
         */
        @NameInMap("AssumeRoleFor")
        public Long assumeRoleFor;

        /**
         * <p>> This parameter is unavailable for public use.</p>
         */
        @NameInMap("RoleType")
        public String roleType;

        /**
         * <p>> This parameter is unavailable for public use.</p>
         */
        @NameInMap("Rolearn")
        public String rolearn;

        public static ReplaceSystemDiskRequestArn build(java.util.Map<String, ?> map) throws Exception {
            ReplaceSystemDiskRequestArn self = new ReplaceSystemDiskRequestArn();
            return TeaModel.build(map, self);
        }

        public ReplaceSystemDiskRequestArn setAssumeRoleFor(Long assumeRoleFor) {
            this.assumeRoleFor = assumeRoleFor;
            return this;
        }
        public Long getAssumeRoleFor() {
            return this.assumeRoleFor;
        }

        public ReplaceSystemDiskRequestArn setRoleType(String roleType) {
            this.roleType = roleType;
            return this;
        }
        public String getRoleType() {
            return this.roleType;
        }

        public ReplaceSystemDiskRequestArn setRolearn(String rolearn) {
            this.rolearn = rolearn;
            return this;
        }
        public String getRolearn() {
            return this.rolearn;
        }

    }

}
