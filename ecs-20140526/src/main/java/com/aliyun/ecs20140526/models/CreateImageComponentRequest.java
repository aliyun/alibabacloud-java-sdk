// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateImageComponentRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotency of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The <strong>token</strong> can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The type of the image component. Only image building components and image test components are supported.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Build</li>
     * <li>Test</li>
     * </ul>
     * <p>Default value: Build.</p>
     * <blockquote>
     * <p> Image building components can be used only in image building templates. Image test components can be used only in image test templates.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Build</p>
     */
    @NameInMap("ComponentType")
    public String componentType;

    /**
     * <p>The version number of the image component, which is used together with the name of the image component. The version number is in the \<major>.\<minor>.\<patch> format. Set \<major>, \<minor>, and \<patch> to non-negative integers.</p>
     * <p>Default value: (x + 1).0.0, in which x is the maximum major version number of the image component.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("ComponentVersion")
    public String componentVersion;

    /**
     * <p>The content of the image component. The content consists of up to 127 commands.</p>
     * 
     * <strong>example:</strong>
     * <p>RUN yum update -y</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The description. The description must be 2 to 256 characters in length and cannot start with <a href="http://https://%E3%80%82">http:// or https://</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>This is description.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the image component. The name must be 2 to 128 characters in length. The name must start with a letter and cannot start with http:// or https://. The name can contain letters, digits, colons (:), underscores (_), periods (.), and hyphens (-).</p>
     * <blockquote>
     * <p> If you do not specify <code>Name</code>, the return value of <code>ImageComponentId</code> is used.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>testComponent</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
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
     * <p>The type of the operating system supported by the image component.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Linux</li>
     * <li>Windows</li>
     * </ul>
     * <p>Default value: Linux.</p>
     * 
     * <strong>example:</strong>
     * <p>Linux</p>
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

    public CreateImageComponentRequest setComponentVersion(String componentVersion) {
        this.componentVersion = componentVersion;
        return this;
    }
    public String getComponentVersion() {
        return this.componentVersion;
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
         * <p>The key of tag N. Valid values of N: 1 to 20. The tag key cannot be an empty string. The tag key can be up to 128 characters in length and cannot contain <a href="http://https://%E3%80%82">http:// or https://</a>. The tag key cannot start with acs: or aliyun.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N. Valid values of N: 1 to 20. The tag value can be an empty string. The tag value can be up to 128 characters in length and cannot contain <a href="http://https://%E3%80%82">http:// or https://</a>. The tag value cannot start with acs:.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
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
