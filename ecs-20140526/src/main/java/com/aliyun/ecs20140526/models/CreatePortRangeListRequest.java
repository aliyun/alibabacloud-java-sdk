// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreatePortRangeListRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>Description information of PortRangeList</p>
     */
    @NameInMap("Description")
    public String description;

    @NameInMap("Entry")
    public java.util.List<CreatePortRangeListRequestEntry> entry;

    /**
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PortRangeListNameSample</p>
     */
    @NameInMap("PortRangeListName")
    public String portRangeListName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>rg-aek3b6jzp66****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

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
         * <strong>example:</strong>
         * <p>Description information of Entry</p>
         */
        @NameInMap("Description")
        public String description;

        /**
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
         * <strong>example:</strong>
         * <p>key for PortRangeList</p>
         */
        @NameInMap("Key")
        public String key;

        /**
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
