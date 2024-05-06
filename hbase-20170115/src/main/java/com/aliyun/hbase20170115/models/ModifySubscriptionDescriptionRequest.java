// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class ModifySubscriptionDescriptionRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SubscriptionDescription")
    public String subscriptionDescription;

    @NameInMap("SubscriptionId")
    public String subscriptionId;

    public static ModifySubscriptionDescriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySubscriptionDescriptionRequest self = new ModifySubscriptionDescriptionRequest();
        return TeaModel.build(map, self);
    }

    public ModifySubscriptionDescriptionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifySubscriptionDescriptionRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifySubscriptionDescriptionRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifySubscriptionDescriptionRequest setSubscriptionDescription(String subscriptionDescription) {
        this.subscriptionDescription = subscriptionDescription;
        return this;
    }
    public String getSubscriptionDescription() {
        return this.subscriptionDescription;
    }

    public ModifySubscriptionDescriptionRequest setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

}
