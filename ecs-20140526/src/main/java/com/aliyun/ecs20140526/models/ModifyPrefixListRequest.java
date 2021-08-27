// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyPrefixListRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("AddEntry")
    public java.util.List<ModifyPrefixListRequestAddEntry> addEntry;

    @NameInMap("RemoveEntry")
    public java.util.List<ModifyPrefixListRequestRemoveEntry> removeEntry;

    @NameInMap("PrefixListId")
    public String prefixListId;

    @NameInMap("PrefixListName")
    public String prefixListName;

    @NameInMap("Description")
    public String description;

    public static ModifyPrefixListRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPrefixListRequest self = new ModifyPrefixListRequest();
        return TeaModel.build(map, self);
    }

    public ModifyPrefixListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
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

    public ModifyPrefixListRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyPrefixListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyPrefixListRequest setAddEntry(java.util.List<ModifyPrefixListRequestAddEntry> addEntry) {
        this.addEntry = addEntry;
        return this;
    }
    public java.util.List<ModifyPrefixListRequestAddEntry> getAddEntry() {
        return this.addEntry;
    }

    public ModifyPrefixListRequest setRemoveEntry(java.util.List<ModifyPrefixListRequestRemoveEntry> removeEntry) {
        this.removeEntry = removeEntry;
        return this;
    }
    public java.util.List<ModifyPrefixListRequestRemoveEntry> getRemoveEntry() {
        return this.removeEntry;
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

    public ModifyPrefixListRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public static class ModifyPrefixListRequestAddEntry extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Cidr")
        public String cidr;

        public static ModifyPrefixListRequestAddEntry build(java.util.Map<String, ?> map) throws Exception {
            ModifyPrefixListRequestAddEntry self = new ModifyPrefixListRequestAddEntry();
            return TeaModel.build(map, self);
        }

        public ModifyPrefixListRequestAddEntry setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ModifyPrefixListRequestAddEntry setCidr(String cidr) {
            this.cidr = cidr;
            return this;
        }
        public String getCidr() {
            return this.cidr;
        }

    }

    public static class ModifyPrefixListRequestRemoveEntry extends TeaModel {
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
