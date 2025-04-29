// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyPortRangeListRequest extends TeaModel {
    /**
     * <p>The entries that you want to add or modify for the port list.</p>
     */
    @NameInMap("AddEntry")
    public java.util.List<ModifyPortRangeListRequestAddEntry> addEntry;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the port list. The description must be 2 to 256 characters in length and cannot start with http:// or https://.</p>
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
     * <p>The ID of the port list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>prl-2ze9743****</p>
     */
    @NameInMap("PortRangeListId")
    public String portRangeListId;

    /**
     * <p>The name of the port list. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with http://, https://, com.aliyun, or com.alibabacloud. The name can contain letters, digits, colons (:), underscores (_), periods (.), and hyphens (-).</p>
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
     * <p>The entries that you want to remove from the port list.</p>
     */
    @NameInMap("RemoveEntry")
    public java.util.List<ModifyPortRangeListRequestRemoveEntry> removeEntry;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifyPortRangeListRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPortRangeListRequest self = new ModifyPortRangeListRequest();
        return TeaModel.build(map, self);
    }

    public ModifyPortRangeListRequest setAddEntry(java.util.List<ModifyPortRangeListRequestAddEntry> addEntry) {
        this.addEntry = addEntry;
        return this;
    }
    public java.util.List<ModifyPortRangeListRequestAddEntry> getAddEntry() {
        return this.addEntry;
    }

    public ModifyPortRangeListRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyPortRangeListRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyPortRangeListRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyPortRangeListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyPortRangeListRequest setPortRangeListId(String portRangeListId) {
        this.portRangeListId = portRangeListId;
        return this;
    }
    public String getPortRangeListId() {
        return this.portRangeListId;
    }

    public ModifyPortRangeListRequest setPortRangeListName(String portRangeListName) {
        this.portRangeListName = portRangeListName;
        return this;
    }
    public String getPortRangeListName() {
        return this.portRangeListName;
    }

    public ModifyPortRangeListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyPortRangeListRequest setRemoveEntry(java.util.List<ModifyPortRangeListRequestRemoveEntry> removeEntry) {
        this.removeEntry = removeEntry;
        return this;
    }
    public java.util.List<ModifyPortRangeListRequestRemoveEntry> getRemoveEntry() {
        return this.removeEntry;
    }

    public ModifyPortRangeListRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyPortRangeListRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static class ModifyPortRangeListRequestAddEntry extends TeaModel {
        /**
         * <p>The description of the port range in entry N. The description must be 2 to 32 characters in length and cannot start with http:// or https://. Valid values of N: 0 to 200.</p>
         * 
         * <strong>example:</strong>
         * <p>This is description.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The port range in entry N. Valid values of N: 0 to 200. Take note of the following limits:</p>
         * <ul>
         * <li>The total number of entries in the port list cannot exceed the <code>MaxEntries</code> value.</li>
         * <li><code>PortRange</code> in different entries cannot be duplicated.</li>
         * <li>The value of this parameter cannot be the same as the value of <code>RemoveEntry.N.PortRange</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>80/80</p>
         */
        @NameInMap("PortRange")
        public String portRange;

        public static ModifyPortRangeListRequestAddEntry build(java.util.Map<String, ?> map) throws Exception {
            ModifyPortRangeListRequestAddEntry self = new ModifyPortRangeListRequestAddEntry();
            return TeaModel.build(map, self);
        }

        public ModifyPortRangeListRequestAddEntry setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ModifyPortRangeListRequestAddEntry setPortRange(String portRange) {
            this.portRange = portRange;
            return this;
        }
        public String getPortRange() {
            return this.portRange;
        }

    }

    public static class ModifyPortRangeListRequestRemoveEntry extends TeaModel {
        /**
         * <p>The port range in entry N. Valid values of N: 0 to 200. Take note of the following limits:</p>
         * <ul>
         * <li><code>PortRange</code> in different entries cannot be duplicated.</li>
         * <li>The value of this parameter cannot be the same as the value of <code>AddEntry.N.PortRange</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>80/80</p>
         */
        @NameInMap("PortRange")
        public String portRange;

        public static ModifyPortRangeListRequestRemoveEntry build(java.util.Map<String, ?> map) throws Exception {
            ModifyPortRangeListRequestRemoveEntry self = new ModifyPortRangeListRequestRemoveEntry();
            return TeaModel.build(map, self);
        }

        public ModifyPortRangeListRequestRemoveEntry setPortRange(String portRange) {
            this.portRange = portRange;
            return this;
        }
        public String getPortRange() {
            return this.portRange;
        }

    }

}
