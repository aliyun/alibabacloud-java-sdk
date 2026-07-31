// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ReplaceSystemDiskRequest extends TeaModel {
    @NameInMap("SystemDisk")
    public ReplaceSystemDiskRequestSystemDisk systemDisk;

    /**
     * <blockquote>
     * <p>This parameter is deprecated.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>i386</p>
     */
    @NameInMap("Architecture")
    public String architecture;

    /**
     * <p>This parameter is not publicly available.</p>
     */
    @NameInMap("Arn")
    public java.util.List<ReplaceSystemDiskRequestArn> arn;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but make sure that the token is unique among different requests. The <strong>ClientToken</strong> value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <blockquote>
     * <p><strong>[Deprecated]</strong> This parameter is deprecated. To improve compatibility, use <code>ImageId</code> instead.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>d-bp67acfmxazb4ph****</p>
     */
    @NameInMap("DiskId")
    public String diskId;

    /**
     * <blockquote>
     * <p>This parameter is not publicly available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>hide</p>
     */
    @NameInMap("EncryptAlgorithm")
    public String encryptAlgorithm;

    /**
     * <p>Specifies whether to encrypt the disk. Valid values:</p>
     * <ul>
     * <li><p>true: encrypts the disk.</p>
     * </li>
     * <li><p>false: does not encrypt the disk.</p>
     * </li>
     * </ul>
     * <p>Default value: false.</p>
     * <blockquote>
     * <p>Notice: When you use a shared encrypted image to create a disk based on an encrypted snapshot, you must set the request parameter Encrypted to true to ensure that the disk uses the key of the image recipient.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Encrypted")
    public Boolean encrypted;

    /**
     * <p>The ID of the image to use to reset the system. This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>m-bp67acfmxazb4ph****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The ID of target instance.</p>
     * <blockquote>
     * <p>Before you send the request, make sure that the instance status of the target instance is <code>Stopped</code>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp67acfmxazb4ph****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The KMS key ID of the system disk.</p>
     * 
     * <strong>example:</strong>
     * <p>e522b26d-abf6-4e0d-b5da-04b7******3c</p>
     */
    @NameInMap("KMSKeyId")
    public String KMSKeyId;

    /**
     * <p>The name of the key pair. </p>
     * <blockquote>
     * <p>This parameter takes effect only for Linux instances. You can bind an SSH key pair to the ECS instance as a logon credential. After you bind an SSH key pair, the username and password logon method is disabled.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>testKeyPairName</p>
     */
    @NameInMap("KeyPairName")
    public String keyPairName;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Specifies whether to reset the username and password of the ECS instance. The password must be 8 to 30 characters in length and must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. The following special characters are supported:</p>
     * <pre><code>()`~!@#$%^&amp;*-_+=|{}[]:;\\&quot;&lt;&gt;,.?/
     * </code></pre>
     * <p>For Windows instances, the password cannot start with a forward slash (/).</p>
     * <p>Default value: The password remains unchanged.</p>
     * <blockquote>
     * <p>If you specify the <code>Password</code> parameter, send the request over HTTPS to prevent password leaks.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>EcsV587!</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>Specifies whether to use the preset password of the image.</p>
     * <p>Default value: false.</p>
     * <blockquote>
     * <p>When you use this parameter, the Password parameter must be empty. Make sure that the image you use has a preset password.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("PasswordInherit")
    public Boolean passwordInherit;

    /**
     * <blockquote>
     * <p>This parameter is deprecated.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>CentOS</p>
     */
    @NameInMap("Platform")
    public String platform;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Specifies whether to use the free Security Center service after the system disk is replaced. Valid values: </p>
     * <ul>
     * <li><p>Active: Security Center is enabled. This value is applicable only to public images.</p>
     * </li>
     * <li><p>Deactive: Security Center is not enabled. This value is applicable to all images.</p>
     * </li>
     * </ul>
     * <p>Default value: Deactive.</p>
     * 
     * <strong>example:</strong>
     * <p>Active</p>
     */
    @NameInMap("SecurityEnhancementStrategy")
    public String securityEnhancementStrategy;

    /**
     * <p>Specifies whether to use the virtual machine system configuration provided by Alibaba Cloud (Windows: NTP and KMS. Linux: NTP and YUM).</p>
     * <blockquote>
     * <p>This parameter takes effect only when the system disk is attached (the device name is /dev/xvda).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
         * <p>The capacity of the new system disk. Unit: GiB. Valid values:</p>
         * <ul>
         * <li>Basic disk: Max{20, size of the image specified by the parameter ImageId} to 500.</li>
         * <li>Enterprise SSD:<ul>
         * <li>PL0: Max{1, size of the image specified by the parameter ImageId} to 2048.</li>
         * <li>PL1: Max{20, size of the image specified by the parameter ImageId} to 2048.</li>
         * <li>PL2: Max{461, size of the image specified by the parameter ImageId} to 2048.</li>
         * <li>PL3: Max{1261, size of the image specified by the parameter ImageId} to 2048.</li>
         * </ul>
         * </li>
         * <li>ESSD AutoPL disk: Max{1, size of the image specified by the parameter ImageId} to 2048.</li>
         * <li>Standard SSD: Max{20, size of the image specified by the parameter ImageId} to 2048.</li>
         * <li>Other disk types: Max{20, size of the image specified by the parameter ImageId} to 2048.</li>
         * </ul>
         * <p>Default value: Max{40, size of the image specified by the parameter ImageId}.</p>
         * <blockquote>
         * <p>You are charged additional fees for the disk capacity that exceeds <code>Max{20, capacity of the original system disk}</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>80</p>
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
         * <blockquote>
         * <p>This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AssumeRoleFor")
        public Long assumeRoleFor;

        /**
         * <blockquote>
         * <p>This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("RoleType")
        public String roleType;

        /**
         * <blockquote>
         * <p>This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
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
