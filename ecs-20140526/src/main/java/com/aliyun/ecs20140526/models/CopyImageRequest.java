// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CopyImageRequest extends TeaModel {
    /**
     * <p>The description of the image copy. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("DestinationDescription")
    public String destinationDescription;

    /**
     * <p>The name of the new image. The name must be 2 to 128 characters in length. The name must start with a letter and cannot contain `http://` or `https://`. The name cannot start with `acs:` or `aliyun`. The name can contain letters, digits, periods (.), colons (:), underscores (\_), and hyphens (-).</p>
     */
    @NameInMap("DestinationImageName")
    public String destinationImageName;

    /**
     * <p>The ID of the destination region to which the source custom image is copied.</p>
     */
    @NameInMap("DestinationRegionId")
    public String destinationRegionId;

    /**
     * <p>> This parameter is unavailable.</p>
     */
    @NameInMap("EncryptAlgorithm")
    public String encryptAlgorithm;

    /**
     * <p>Specifies whether to encrypt the new image.</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("Encrypted")
    public Boolean encrypted;

    /**
     * <p>The ID of the source custom image.</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The ID of the key used to encrypt the image copy.</p>
     */
    @NameInMap("KMSKeyId")
    public String KMSKeyId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the source custom image. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which to assign the new image. If you do not specify this parameter, the new image is assigned to the default resource group.</p>
     * <br>
     * <p>>  If you call the CopyImage operation as a Resource Access Management (RAM) user who does not have the permissions to manage the default resource group and do not specify `ResourceGroupId`, the `Forbidden: User not authorized to operate on the specified resource` error message is returned. You must specify the ID of a resource group that the RAM user has the permissions to manage or grant the RAM user the permissions to manage the default resource group before you call the CopyImage operation again.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CopyImageRequestTag> tag;

    public static CopyImageRequest build(java.util.Map<String, ?> map) throws Exception {
        CopyImageRequest self = new CopyImageRequest();
        return TeaModel.build(map, self);
    }

    public CopyImageRequest setDestinationDescription(String destinationDescription) {
        this.destinationDescription = destinationDescription;
        return this;
    }
    public String getDestinationDescription() {
        return this.destinationDescription;
    }

    public CopyImageRequest setDestinationImageName(String destinationImageName) {
        this.destinationImageName = destinationImageName;
        return this;
    }
    public String getDestinationImageName() {
        return this.destinationImageName;
    }

    public CopyImageRequest setDestinationRegionId(String destinationRegionId) {
        this.destinationRegionId = destinationRegionId;
        return this;
    }
    public String getDestinationRegionId() {
        return this.destinationRegionId;
    }

    public CopyImageRequest setEncryptAlgorithm(String encryptAlgorithm) {
        this.encryptAlgorithm = encryptAlgorithm;
        return this;
    }
    public String getEncryptAlgorithm() {
        return this.encryptAlgorithm;
    }

    public CopyImageRequest setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
        return this;
    }
    public Boolean getEncrypted() {
        return this.encrypted;
    }

    public CopyImageRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public CopyImageRequest setKMSKeyId(String KMSKeyId) {
        this.KMSKeyId = KMSKeyId;
        return this;
    }
    public String getKMSKeyId() {
        return this.KMSKeyId;
    }

    public CopyImageRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CopyImageRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CopyImageRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CopyImageRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CopyImageRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CopyImageRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CopyImageRequest setTag(java.util.List<CopyImageRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CopyImageRequestTag> getTag() {
        return this.tag;
    }

    public static class CopyImageRequestTag extends TeaModel {
        /**
         * <p>The key of tag N of the image copy. Valid values of N: 1 to 20. The tag key cannot be an empty string. The tag key can be up to 128 characters in length and cannot contain `http://` or `https://`. The tag key cannot start with `aliyun` or `acs:`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N of the image copy. Valid values of N: 1 to 20. The tag value can be an empty string. The tag value can be up to 128 characters in length and cannot start with `acs:`. It cannot contain `http://` or `https://`.</p>
         */
        @NameInMap("Value")
        public String value;

        public static CopyImageRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CopyImageRequestTag self = new CopyImageRequestTag();
            return TeaModel.build(map, self);
        }

        public CopyImageRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CopyImageRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
