// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CopyImageRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the image copy. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a description example.</p>
     */
    @NameInMap("DestinationDescription")
    public String destinationDescription;

    /**
     * <p>The name of the new image. The name must be 2 to 128 characters in length. The name must start with a letter and cannot contain <code>http://</code> or <code>https://</code>. The name cannot start with <code>acs:</code> or <code>aliyun</code>. The name can contain letters, digits, periods (.), colons (:), underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>YourImageName</p>
     */
    @NameInMap("DestinationImageName")
    public String destinationImageName;

    /**
     * <p>The ID of the destination region to which the source custom image is copied.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("DestinationRegionId")
    public String destinationRegionId;

    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <blockquote>
     * <p>This parameter is unavailable.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>hide</p>
     */
    @NameInMap("EncryptAlgorithm")
    public String encryptAlgorithm;

    /**
     * <p>Specifies whether to encrypt the new image.</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Encrypted")
    public Boolean encrypted;

    /**
     * <p>The ID of the source custom image.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>m-bp1h46wfpjsjastc****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The ID of the key used to encrypt the image copy.</p>
     * 
     * <strong>example:</strong>
     * <p>e522b26d-abf6-4e0d-b5da-04b7******3c</p>
     */
    @NameInMap("KMSKeyId")
    public String KMSKeyId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the source custom image. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which to assign the new image. If you do not specify this parameter, the new image is assigned to the default resource group.</p>
     * <blockquote>
     * <p> If you call the CopyImage operation as a Resource Access Management (RAM) user who does not have the permissions to manage the default resource group and do not specify <code>ResourceGroupId</code>, the <code>Forbidden: User not authorized to operate on the specified resource</code> error message is returned. You must specify the ID of a resource group that the RAM user has the permissions to manage or grant the RAM user the permissions to manage the default resource group before you call the CopyImage operation again.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rg-bp67acfmxazb4p****</p>
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

    public CopyImageRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
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

    public CopyImageRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
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
         * <p>The key of tag N of the image copy. Valid values of N: 1 to 20. The tag key cannot be an empty string. The tag key can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>. The tag key cannot start with <code>aliyun</code> or <code>acs:</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N of the image copy. Valid values of N: 1 to 20. The tag value can be an empty string. The tag value can be up to 128 characters in length and cannot start with <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
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
