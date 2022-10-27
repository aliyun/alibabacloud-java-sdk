// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ReplaceSystemDiskRequest extends TeaModel {
    @NameInMap("SystemDisk")
    public ReplaceSystemDiskRequestSystemDisk systemDisk;

    @NameInMap("Architecture")
    public String architecture;

    @NameInMap("Arn")
    public java.util.List<ReplaceSystemDiskRequestArn> arn;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DiskId")
    public String diskId;

    @NameInMap("EncryptAlgorithm")
    public String encryptAlgorithm;

    @NameInMap("Encrypted")
    public Boolean encrypted;

    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("KMSKeyId")
    public String KMSKeyId;

    @NameInMap("KeyPairName")
    public String keyPairName;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Password")
    public String password;

    @NameInMap("PasswordInherit")
    public Boolean passwordInherit;

    @NameInMap("Platform")
    public String platform;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecurityEnhancementStrategy")
    public String securityEnhancementStrategy;

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
        @NameInMap("AssumeRoleFor")
        public Long assumeRoleFor;

        @NameInMap("RoleType")
        public String roleType;

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
