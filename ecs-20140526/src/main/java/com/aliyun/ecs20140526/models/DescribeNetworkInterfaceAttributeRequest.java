// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeNetworkInterfaceAttributeRequest extends TeaModel {
    /**
     * <p>The attribute of the ENI. Valid value:</p>
     * <br>
     * <p>attachment: attachment information about the ENI</p>
     * <br>
     * <p>>  This parameter is in invitational preview and is not publicly available.</p>
     */
    @NameInMap("Attribute")
    public String attribute;

    /**
     * <p>The ID of the ENI.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("NetworkInterfaceId")
    public String networkInterfaceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the ENI. You can call the [DescribeRegions](https://help.aliyun.com/document_detail/25609.html) operation to query the most recent region list.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>>  This parameter is unavailable.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeNetworkInterfaceAttributeRequestTag> tag;

    public static DescribeNetworkInterfaceAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkInterfaceAttributeRequest self = new DescribeNetworkInterfaceAttributeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkInterfaceAttributeRequest setAttribute(String attribute) {
        this.attribute = attribute;
        return this;
    }
    public String getAttribute() {
        return this.attribute;
    }

    public DescribeNetworkInterfaceAttributeRequest setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }
    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    public DescribeNetworkInterfaceAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeNetworkInterfaceAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeNetworkInterfaceAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeNetworkInterfaceAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeNetworkInterfaceAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeNetworkInterfaceAttributeRequest setTag(java.util.List<DescribeNetworkInterfaceAttributeRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeNetworkInterfaceAttributeRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeNetworkInterfaceAttributeRequestTag extends TeaModel {
        /**
         * <p>>  This parameter is unavailable.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>>  This parameter is unavailable.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeNetworkInterfaceAttributeRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfaceAttributeRequestTag self = new DescribeNetworkInterfaceAttributeRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfaceAttributeRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeNetworkInterfaceAttributeRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
