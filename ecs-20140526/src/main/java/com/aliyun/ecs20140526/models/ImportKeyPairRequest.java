// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ImportKeyPairRequest extends TeaModel {
    /**
     * <p>The name of the key pair. The name must be unique. The name must be 2 to 128 characters in length and must start with a letter or Chinese character. It cannot start with http:// or https://. The name can contain characters that are categorized as letter in Unicode, including letters, Chinese characters, and digits. The name can contain colons (:), underscores (_), periods (.), or hyphens (-).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testKeyPairName</p>
     */
    @NameInMap("KeyPairName")
    public String keyPairName;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The public key of the key pair.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ABC1234567</p>
     */
    @NameInMap("PublicKeyBody")
    public String publicKeyBody;

    /**
     * <p>The region ID. You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the enterprise resource group to which the SSH key pair belongs.</p>
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
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<ImportKeyPairRequestTag> tag;

    public static ImportKeyPairRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportKeyPairRequest self = new ImportKeyPairRequest();
        return TeaModel.build(map, self);
    }

    public ImportKeyPairRequest setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
    }

    public ImportKeyPairRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ImportKeyPairRequest setPublicKeyBody(String publicKeyBody) {
        this.publicKeyBody = publicKeyBody;
        return this;
    }
    public String getPublicKeyBody() {
        return this.publicKeyBody;
    }

    public ImportKeyPairRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ImportKeyPairRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
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

    public ImportKeyPairRequest setTag(java.util.List<ImportKeyPairRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ImportKeyPairRequestTag> getTag() {
        return this.tag;
    }

    public static class ImportKeyPairRequestTag extends TeaModel {
        /**
         * <p>The key of tag N of the key pair. Valid values of N: 1 to 20. The tag key cannot be an empty string. The tag key can be up to 128 characters in length. It cannot start with aliyun or acs: and cannot contain http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N of the key pair. Valid values of N: 1 to 20. The tag value can be an empty string. The tag value can be up to 128 characters in length. It cannot contain http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
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
