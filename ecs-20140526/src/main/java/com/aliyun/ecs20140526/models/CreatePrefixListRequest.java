// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreatePrefixListRequest extends TeaModel {
    /**
     * <p>The address family of the prefix list. Valid values:</p>
     * <ul>
     * <li>IPv4.</li>
     * <li>IPv6.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>IPv4</p>
     */
    @NameInMap("AddressFamily")
    public String addressFamily;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">Ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>0c593ea1-3bea-11e9-b96b-88e9fe637760</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the prefix list. The description must be 2 to 256 characters in length, and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>This is description.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The prefix list entry information.</p>
     */
    @NameInMap("Entry")
    public java.util.List<CreatePrefixListRequestEntry> entry;

    /**
     * <p>The maximum number of entries supported by the prefix list. Valid values: 1 to 200.</p>
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
     * <p>The name of the prefix list. The name must be 2 to 128 characters in length, and must start with a letter or a Chinese character. It cannot start with <code>http://</code>, <code>https://</code>, <code>com.aliyun</code>, or <code>com.alibabacloud</code>. It can contain Chinese characters, letters, digits, colons (:), underscores (_), periods (.), and hyphens (-).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PrefixListNameSample</p>
     */
    @NameInMap("PrefixListName")
    public String prefixListName;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-chengdu</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the prefix list belongs.</p>
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
         * <p>The Classless Inter-Domain Routing of the prefix list entry. Valid values of N: 0 to 200. Precautions:</p>
         * <ul>
         * <li>The number of entries in the prefix list cannot exceed the maximum number of entries (<code>MaxEntries</code>).</li>
         * <li>The type of the Classless Inter-Domain Routing in an entry is determined by the address family. A prefix list cannot contain both IPv4 and IPv6 Classless Inter-Domain Routing.</li>
         * <li>Classless Inter-Domain Routing in multiple entries cannot be duplicate. For example, you cannot specify two Settings such as 192.168.1.0/24.</li>
         * <li>You can specify a single IP address in the Settings, and the system automatically transforms it into a Classless Inter-Domain Routing. For example, if you specify 192.168.1.100 in the Settings, the system automatically transforms it into 192.168.1.100/32.</li>
         * <li>If you use an IPv6 Classless Inter-Domain Routing, the system automatically transforms it into a zero-compressed format and transforms letters to lowercase. For example, if you specify 2001:0DB8:0000:0000:0000:0000:0000:0000/32 in the Settings, the system automatically transforms it into 2001:db8::/32.</li>
         * </ul>
         * <p>For more information about Classless Inter-Domain Routing, see <a href="~~185311#598efe6ef1v00~~">What is CIDR</a>.</p>
         * <p>Default value: empty.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.1.0/24</p>
         */
        @NameInMap("Cidr")
        public String cidr;

        /**
         * <p>The description of the prefix list entry. The description must be 2 to 32 characters in length, and cannot start with <code>http://</code> or <code>https://</code>. Valid values of N: 0 to 200.</p>
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
        /**
         * <p>The tag key of the prefix list. Valid values of N: 1 to 20. If you specify this parameter, it cannot be an empty string. The tag key can be up to 128 characters in length, and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the prefix list. Valid values of N: 1 to 20. This parameter can be an empty string.</p>
         * <p>The tag value can be up to 128 characters in length, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
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
