// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyPrefixListRequest extends TeaModel {
    /**
     * <p>The entries to be added to the prefix list.</p>
     */
    @NameInMap("AddEntry")
    public java.util.List<ModifyPrefixListRequestAddEntry> addEntry;

    /**
     * <p>The description of the prefix list. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>This is description.</p>
     */
    @NameInMap("Description")
    public String description;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the prefix list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pl-x1j1k5ykzqlixdcy****</p>
     */
    @NameInMap("PrefixListId")
    public String prefixListId;

    /**
     * <p>The name of the prefix list. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with <code>http://</code>, <code>https://</code>, <code>com.aliyun</code>, or <code>com.alibabacloud</code>. The name can contain letters, digits, colons (:), underscores (_), periods (.), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>PrefixListNameSample</p>
     */
    @NameInMap("PrefixListName")
    public String prefixListName;

    /**
     * <p>The region ID of the prefix list. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-chengdu</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The entries to be deleted from the prefix list.</p>
     */
    @NameInMap("RemoveEntry")
    public java.util.List<ModifyPrefixListRequestRemoveEntry> removeEntry;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifyPrefixListRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPrefixListRequest self = new ModifyPrefixListRequest();
        return TeaModel.build(map, self);
    }

    public ModifyPrefixListRequest setAddEntry(java.util.List<ModifyPrefixListRequestAddEntry> addEntry) {
        this.addEntry = addEntry;
        return this;
    }
    public java.util.List<ModifyPrefixListRequestAddEntry> getAddEntry() {
        return this.addEntry;
    }

    public ModifyPrefixListRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyPrefixListRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyPrefixListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyPrefixListRequest setPrefixListId(String prefixListId) {
        this.prefixListId = prefixListId;
        return this;
    }
    public String getPrefixListId() {
        return this.prefixListId;
    }

    public ModifyPrefixListRequest setPrefixListName(String prefixListName) {
        this.prefixListName = prefixListName;
        return this;
    }
    public String getPrefixListName() {
        return this.prefixListName;
    }

    public ModifyPrefixListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyPrefixListRequest setRemoveEntry(java.util.List<ModifyPrefixListRequestRemoveEntry> removeEntry) {
        this.removeEntry = removeEntry;
        return this;
    }
    public java.util.List<ModifyPrefixListRequestRemoveEntry> getRemoveEntry() {
        return this.removeEntry;
    }

    public ModifyPrefixListRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyPrefixListRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static class ModifyPrefixListRequestAddEntry extends TeaModel {
        /**
         * <p>The CIDR block in entry N to be added to the prefix list. Valid values of N: 0 to 200.</p>
         * <p>Take note of the following items when you add the entries:</p>
         * <ul>
         * <li>The total number of entries in the prefix list cannot exceed the maximum number of entries you specified for the prefix list. You can call the <a href="https://help.aliyun.com/document_detail/205872.html">DescribePrefixListAttributes</a> operation to query the maximum number of entries that the prefix list can contain.</li>
         * <li>You cannot specify duplicate CIDR blocks.</li>
         * <li>The CIDR blocks cannot be the same as the <code>RemoveEntry.N.Cidr</code> values.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.2.0/24</p>
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

        public static ModifyPrefixListRequestAddEntry build(java.util.Map<String, ?> map) throws Exception {
            ModifyPrefixListRequestAddEntry self = new ModifyPrefixListRequestAddEntry();
            return TeaModel.build(map, self);
        }

        public ModifyPrefixListRequestAddEntry setCidr(String cidr) {
            this.cidr = cidr;
            return this;
        }
        public String getCidr() {
            return this.cidr;
        }

        public ModifyPrefixListRequestAddEntry setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class ModifyPrefixListRequestRemoveEntry extends TeaModel {
        /**
         * <p>The CIDR block in entry N to be deleted from the prefix list. Valid values of N: 0 to 200.</p>
         * <p>Take note of the following items when you delete the entries:</p>
         * <ul>
         * <li>You cannot specify duplicate CIDR blocks.</li>
         * <li>The CIDR blocks cannot be the same as the <code>AddEntry.N.Cidr</code> values.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.1.0/24</p>
         */
        @NameInMap("Cidr")
        public String cidr;

        public static ModifyPrefixListRequestRemoveEntry build(java.util.Map<String, ?> map) throws Exception {
            ModifyPrefixListRequestRemoveEntry self = new ModifyPrefixListRequestRemoveEntry();
            return TeaModel.build(map, self);
        }

        public ModifyPrefixListRequestRemoveEntry setCidr(String cidr) {
            this.cidr = cidr;
            return this;
        }
        public String getCidr() {
            return this.cidr;
        }

    }

}
