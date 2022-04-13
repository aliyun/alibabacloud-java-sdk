// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreatePrefixListRequest extends TeaModel {
    @NameInMap("AddressFamily")
    public String addressFamily;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Description")
    public String description;

    @NameInMap("Entry")
    public java.util.List<CreatePrefixListRequestEntry> entry;

    @NameInMap("MaxEntries")
    public Integer maxEntries;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PrefixListName")
    public String prefixListName;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

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

    public static class CreatePrefixListRequestEntry extends TeaModel {
        @NameInMap("Cidr")
        public String cidr;

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

}
