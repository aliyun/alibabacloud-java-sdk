// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateKeyPairRequest extends TeaModel {
    /**
     * <p>The name of the key pair. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with `http://` or `https://`. It can contain letters, digits, colons (:), underscores (_), and hyphens (-).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("KeyPairName")
    public String keyPairName;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region in which to create the key pair. You can call the [DescribeRegions](https://help.aliyun.com/document_detail/25609.html) operation to query the most recent region list.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the enterprise resource group to which the SSH key pair belongs.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateKeyPairRequestTag> tag;

    public static CreateKeyPairRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateKeyPairRequest self = new CreateKeyPairRequest();
        return TeaModel.build(map, self);
    }

    public CreateKeyPairRequest setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
    }

    public CreateKeyPairRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateKeyPairRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateKeyPairRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateKeyPairRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateKeyPairRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateKeyPairRequest setTag(java.util.List<CreateKeyPairRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateKeyPairRequestTag> getTag() {
        return this.tag;
    }

    public static class CreateKeyPairRequestTag extends TeaModel {
        /**
         * <p>The key of tag N to be bound to the key pair. Valid values of N: 1 to 20. The tag key cannot be an empty string. The tag key can be up to 128 characters in length and cannot contain `http://` or `https://`. It cannot start with `aliyun` or `acs:`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N of the key pair. Valid values of N: 1 to 20. The tag value can be an empty string. The tag value can be up to 128 characters in length and cannot contain http:// or https://. It cannot start with acs:.</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateKeyPairRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateKeyPairRequestTag self = new CreateKeyPairRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateKeyPairRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateKeyPairRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
