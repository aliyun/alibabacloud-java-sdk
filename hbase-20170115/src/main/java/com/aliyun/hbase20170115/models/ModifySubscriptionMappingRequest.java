// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class ModifySubscriptionMappingRequest extends TeaModel {
    @NameInMap("Mapping")
    public String mapping;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SubscriptionId")
    public String subscriptionId;

    public static ModifySubscriptionMappingRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySubscriptionMappingRequest self = new ModifySubscriptionMappingRequest();
        return TeaModel.build(map, self);
    }

    public ModifySubscriptionMappingRequest setMapping(String mapping) {
        this.mapping = mapping;
        return this;
    }
    public String getMapping() {
        return this.mapping;
    }

    public ModifySubscriptionMappingRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifySubscriptionMappingRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifySubscriptionMappingRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifySubscriptionMappingRequest setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

}
