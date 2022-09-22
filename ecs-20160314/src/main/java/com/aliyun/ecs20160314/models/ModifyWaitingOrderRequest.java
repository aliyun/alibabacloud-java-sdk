// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class ModifyWaitingOrderRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("InstanceAmount")
    public Long instanceAmount;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Tag")
    public java.util.List<Tag> tag;

    @NameInMap("WaitingOrderId")
    public String waitingOrderId;

    public static ModifyWaitingOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyWaitingOrderRequest self = new ModifyWaitingOrderRequest();
        return TeaModel.build(map, self);
    }

    public ModifyWaitingOrderRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyWaitingOrderRequest setInstanceAmount(Long instanceAmount) {
        this.instanceAmount = instanceAmount;
        return this;
    }
    public Long getInstanceAmount() {
        return this.instanceAmount;
    }

    public ModifyWaitingOrderRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyWaitingOrderRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyWaitingOrderRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ModifyWaitingOrderRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyWaitingOrderRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyWaitingOrderRequest setTag(java.util.List<Tag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    public ModifyWaitingOrderRequest setWaitingOrderId(String waitingOrderId) {
        this.waitingOrderId = waitingOrderId;
        return this;
    }
    public String getWaitingOrderId() {
        return this.waitingOrderId;
    }

    public static class Tag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static Tag build(java.util.Map<String, ?> map) throws Exception {
            Tag self = new Tag();
            return TeaModel.build(map, self);
        }

        public Tag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public Tag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
