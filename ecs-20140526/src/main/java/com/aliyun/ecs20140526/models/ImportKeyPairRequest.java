// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ImportKeyPairRequest extends TeaModel {
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

    @NameInMap("PublicKeyBody")
    @Validation(required = true)
    public String publicKeyBody;

    @NameInMap("Tag")
    public java.util.List<ImportKeyPairRequestTag> tag;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static ImportKeyPairRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportKeyPairRequest self = new ImportKeyPairRequest();
        return TeaModel.build(map, self);
    }

    public ImportKeyPairRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ImportKeyPairRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ImportKeyPairRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ImportKeyPairRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ImportKeyPairRequest setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
    }

    public ImportKeyPairRequest setPublicKeyBody(String publicKeyBody) {
        this.publicKeyBody = publicKeyBody;
        return this;
    }
    public String getPublicKeyBody() {
        return this.publicKeyBody;
    }

    public ImportKeyPairRequest setTag(java.util.List<ImportKeyPairRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ImportKeyPairRequestTag> getTag() {
        return this.tag;
    }

    public ImportKeyPairRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static class ImportKeyPairRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ImportKeyPairRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ImportKeyPairRequestTag self = new ImportKeyPairRequestTag();
            return TeaModel.build(map, self);
        }

        public ImportKeyPairRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ImportKeyPairRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
