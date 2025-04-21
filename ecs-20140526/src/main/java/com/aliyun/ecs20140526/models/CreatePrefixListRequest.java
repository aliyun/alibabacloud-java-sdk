// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreatePrefixListRequest extends TeaModel {
    /**
     * <p>The IP address family. Valid values:</p>
     * <ul>
     * <li>IPv4</li>
     * <li>IPv6</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>IPv4</p>
     */
    @NameInMap("AddressFamily")
    public String addressFamily;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The <code>token</code> can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>0c593ea1-3bea-11e9-b96b-88e9fe637760</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the prefix list. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>This is description.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The details of entries in the prefix list.</p>
     */
    @NameInMap("Entry")
    public java.util.List<CreatePrefixListRequestEntry> entry;

    /**
     * <p>The maximum number of entries that the prefix list can contain. Valid values: 1 to 200.</p>
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
     * <p>The name of the prefix list. The name must be 2 to 128 characters in length, and can contain letters, digits, colons (:), underscores (_), periods (.), and hyphens (-). It must start with a letter and cannot start with <code>http://</code>, <code>https://</code>, <code>com.aliyun</code>, or <code>com.alibabacloud</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PrefixListNameSample</p>
     */
    @NameInMap("PrefixListName")
    public String prefixListName;

    /**
     * <p>The ID of the region in which to create the prefix list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-chengdu</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Tag")
    public java.util.List<CreatePrefixListRequestTag> tag;

    public static CreatePrefixListRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePrefixListRequest self = new CreatePrefixListRequest();
        return TeaModel.build(map, self);
    }

    public CreatePrefixListRequest setAddressFamily(String addressFamily) {
        this.addressFamily = addressFamily;
        return this;
    }
    public String getAddressFamily() {
        return this.addressFamily;
    }

    public CreatePrefixListRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreatePrefixListRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreatePrefixListRequest setEntry(java.util.List<CreatePrefixListRequestEntry> entry) {
        this.entry = entry;
        return this;
    }
    public java.util.List<CreatePrefixListRequestEntry> getEntry() {
        return this.entry;
    }

    public CreatePrefixListRequest setMaxEntries(Integer maxEntries) {
        this.maxEntries = maxEntries;
        return this;
    }
    public Integer getMaxEntries() {
        return this.maxEntries;
    }

    public CreatePrefixListRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreatePrefixListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreatePrefixListRequest setPrefixListName(String prefixListName) {
        this.prefixListName = prefixListName;
        return this;
    }
    public String getPrefixListName() {
        return this.prefixListName;
    }

    public CreatePrefixListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreatePrefixListRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreatePrefixListRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreatePrefixListRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreatePrefixListRequest setTag(java.util.List<CreatePrefixListRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreatePrefixListRequestTag> getTag() {
        return this.tag;
    }

    public static class CreatePrefixListRequestEntry extends TeaModel {
        /**
         * <p>The CIDR block in entry N. Valid values of N: 0 to 200. Take note of the following items:</p>
         * <ul>
         * <li>The total number of entries cannot exceed the <code>MaxEntries</code> value.</li>
         * <li>CIDR block types are determined by the IP address family. You cannot combine IPv4 and IPv6 CIDR blocks in a single prefix list.</li>
         * <li>CIDR blocks must be unique across all entries in a prefix list. For example, you cannot specify 192.168.1.0/24 twice in the entries of the prefix list.</li>
         * <li>IP addresses are supported. The system converts IP addresses into CIDR blocks. For example, if you specify 192.168.1.100, the system converts it into the 192.168.1.100/32 CIDR block.</li>
         * <li>If an IPv6 CIDR block is used, the system converts it into the zero compression format and changes uppercase letters into lowercase ones. For example, if you specify 2001:0DB8:0000:0000:0000:0000:0000:0000/32, the system converts it into 2001:db8::/32.</li>
         * </ul>
         * <p>For more information about CIDR blocks, see the <a href="https://help.aliyun.com/document_detail/40637.html#title-gu4-uzk-12r">What is CIDR?</a> section in the &quot;Network FAQ&quot; topic.</p>
         * <p>This parameter is empty by default.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.1.0/24</p>
         */
        @NameInMap("Cidr")
        public String cidr;

        /**
         * <p>The description in entry N. The description must be 2 to 32 characters in length and cannot start with <code>http://</code> or <code>https://</code>. Valid values of N: 0 to 200.</p>
         * 
         * <strong>example:</strong>
         * <p>Description Sample 01</p>
         */
        @NameInMap("Description")
        public String description;

        public static CreatePrefixListRequestEntry build(java.util.Map<String, ?> map) throws Exception {
            CreatePrefixListRequestEntry self = new CreatePrefixListRequestEntry();
            return TeaModel.build(map, self);
        }

        public CreatePrefixListRequestEntry setCidr(String cidr) {
            this.cidr = cidr;
            return this;
        }
        public String getCidr() {
            return this.cidr;
        }

        public CreatePrefixListRequestEntry setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class CreatePrefixListRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreatePrefixListRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreatePrefixListRequestTag self = new CreatePrefixListRequestTag();
            return TeaModel.build(map, self);
        }

        public CreatePrefixListRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreatePrefixListRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
