// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreatePortRangeListRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The <strong>token</strong> can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the port list. The description must be 2 to 256 characters in length and cannot start with http:// or https://.</p>
     * 
     * <strong>example:</strong>
     * <p>Description information of PortRangeList</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The port list entries.</p>
     */
    @NameInMap("Entry")
    public java.util.List<CreatePortRangeListRequestEntry> entry;

    /**
     * <p>The maximum number of entries in the port list. The value cannot be changed after you create the port list. Valid values: 1 to 2000.</p>
     * <blockquote>
     * <p> When you reference a port list in a resource, such as a security group, the maximum number of entries (instead of the actual number of entries) in the port list counts against the rule quota for the resource. Set a proper value for MaxEntries.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxEntries")
    public Integer maxEntries;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The name of the port list. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with http://, https://, com.aliyun, or com.alibabacloud. The name can contain letters, digits, colons (:), underscores (_), periods (.), and hyphens (-).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PortRangeListNameSample</p>
     */
    @NameInMap("PortRangeListName")
    public String portRangeListName;

    /**
     * <p>The region ID of the port list. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the port list belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aek3b6jzp66****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The tags to add to the port list. You can add 0 to 20 tags to the port list.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreatePortRangeListRequestTag> tag;

    public static CreatePortRangeListRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePortRangeListRequest self = new CreatePortRangeListRequest();
        return TeaModel.build(map, self);
    }

    public CreatePortRangeListRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreatePortRangeListRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreatePortRangeListRequest setEntry(java.util.List<CreatePortRangeListRequestEntry> entry) {
        this.entry = entry;
        return this;
    }
    public java.util.List<CreatePortRangeListRequestEntry> getEntry() {
        return this.entry;
    }

    public CreatePortRangeListRequest setMaxEntries(Integer maxEntries) {
        this.maxEntries = maxEntries;
        return this;
    }
    public Integer getMaxEntries() {
        return this.maxEntries;
    }

    public CreatePortRangeListRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreatePortRangeListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreatePortRangeListRequest setPortRangeListName(String portRangeListName) {
        this.portRangeListName = portRangeListName;
        return this;
    }
    public String getPortRangeListName() {
        return this.portRangeListName;
    }

    public CreatePortRangeListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreatePortRangeListRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreatePortRangeListRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreatePortRangeListRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreatePortRangeListRequest setTag(java.util.List<CreatePortRangeListRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreatePortRangeListRequestTag> getTag() {
        return this.tag;
    }

    public static class CreatePortRangeListRequestEntry extends TeaModel {
        /**
         * <p>The description of port range N. The description must be 2 to 32 characters in length and cannot start with http:// or https://. Valid values of N: 0 to 200.</p>
         * 
         * <strong>example:</strong>
         * <p>Description information of Entry</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Port range N. Valid values of N: 0 to 200.</p>
         * <ul>
         * <li>The total number of entries cannot exceed the <code>MaxEntries</code> value.</li>
         * <li><code>PortRange</code> in multiple entries cannot be duplicated.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>80/80</p>
         */
        @NameInMap("PortRange")
        public String portRange;

        public static CreatePortRangeListRequestEntry build(java.util.Map<String, ?> map) throws Exception {
            CreatePortRangeListRequestEntry self = new CreatePortRangeListRequestEntry();
            return TeaModel.build(map, self);
        }

        public CreatePortRangeListRequestEntry setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreatePortRangeListRequestEntry setPortRange(String portRange) {
            this.portRange = portRange;
            return this;
        }
        public String getPortRange() {
            return this.portRange;
        }

    }

    public static class CreatePortRangeListRequestTag extends TeaModel {
        /**
         * <p>The key of tag N to add to the port list.</p>
         * <p>The tag key cannot be empty or an empty string. The tag key can be up to 128 characters in length and cannot contain http:// or https://. The tag key cannot start with acs: or aliyun.</p>
         * 
         * <strong>example:</strong>
         * <p>key for PortRangeList</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N to add to the port list.</p>
         * <p>The tag value cannot be empty but can be an empty string. The tag value can be up to 128 characters in length and cannot contain http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>value for PortRangeList</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreatePortRangeListRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreatePortRangeListRequestTag self = new CreatePortRangeListRequestTag();
            return TeaModel.build(map, self);
        }

        public CreatePortRangeListRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreatePortRangeListRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
