// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateImageComponentRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotency of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The **token** can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The type of the image component. Only image build components are supported. Set the value to Build.</p>
     * <br>
     * <p>Default value: Build.</p>
     */
    @NameInMap("ComponentType")
    public String componentType;

    /**
     * <p>The content of the image component. The content consists of up to 127 commands.</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The description. The description must be 2 to 256 characters in length and cannot start with [http:// or https://](http://https://。).</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The component name. The name must be 2 to 128 characters in length. The name must start with a letter but cannot start with http:// or https://.[ ](http://https://。、、、（:）、（\_）、（.）（-）。)The name can contain letters, digits, colons (:), underscores (\_), periods (.), and hyphens (-).</p>
     * <br>
     * <p>> If you do not configure `Name`, the return value of `ImageComponentId` is used.</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The operating system type supported by the image component. Only Linux is supported. Set the value to Linux.</p>
     * <br>
     * <p>Default value: Linux.</p>
     */
    @NameInMap("SystemType")
    public String systemType;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateImageComponentRequestTag> tag;

    public static CreateImageComponentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateImageComponentRequest self = new CreateImageComponentRequest();
        return TeaModel.build(map, self);
    }

    public CreateImageComponentRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateImageComponentRequest setComponentType(String componentType) {
        this.componentType = componentType;
        return this;
    }
    public String getComponentType() {
        return this.componentType;
    }

    public CreateImageComponentRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreateImageComponentRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateImageComponentRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateImageComponentRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateImageComponentRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateImageComponentRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateImageComponentRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateImageComponentRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateImageComponentRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateImageComponentRequest setSystemType(String systemType) {
        this.systemType = systemType;
        return this;
    }
    public String getSystemType() {
        return this.systemType;
    }

    public CreateImageComponentRequest setTag(java.util.List<CreateImageComponentRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateImageComponentRequestTag> getTag() {
        return this.tag;
    }

    public static class CreateImageComponentRequestTag extends TeaModel {
        /**
         * <p>The key of tag N. Valid values of N: 1 to 20. The tag key cannot be an empty string. The tag key can be up to 128 characters in length and cannot contain [http:// or https://](http://https://。). The tag key cannot start with acs: or aliyun.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N. Valid values of N: 1 to 20. The tag value can be an empty string. The tag value can be up to 128 characters in length and cannot contain [http:// or https://](http://https://。). The tag value cannot start with acs:.</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateImageComponentRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateImageComponentRequestTag self = new CreateImageComponentRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateImageComponentRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateImageComponentRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
