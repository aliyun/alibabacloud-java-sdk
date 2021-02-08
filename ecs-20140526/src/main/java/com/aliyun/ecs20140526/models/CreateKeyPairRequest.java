// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateKeyPairRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("KeyPairName")
    @Validation(required = true)
    public String keyPairName;

    @NameInMap("Tag")
    public java.util.List<CreateKeyPairRequestTag> tag;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static CreateKeyPairRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateKeyPairRequest self = new CreateKeyPairRequest();
        return TeaModel.build(map, self);
    }

    public CreateKeyPairRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
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

    public CreateKeyPairRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateKeyPairRequest setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
    }

    public CreateKeyPairRequest setTag(java.util.List<CreateKeyPairRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateKeyPairRequestTag> getTag() {
        return this.tag;
    }

    public CreateKeyPairRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static class CreateKeyPairRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

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
