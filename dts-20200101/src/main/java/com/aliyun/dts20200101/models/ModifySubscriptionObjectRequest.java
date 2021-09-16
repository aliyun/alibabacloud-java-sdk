// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ModifySubscriptionObjectRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SubscriptionInstanceId")
    public String subscriptionInstanceId;

    @NameInMap("SubscriptionObject")
    public String subscriptionObject;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("AccountId")
    public String accountId;

    public static ModifySubscriptionObjectRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySubscriptionObjectRequest self = new ModifySubscriptionObjectRequest();
        return TeaModel.build(map, self);
    }

    public ModifySubscriptionObjectRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifySubscriptionObjectRequest setSubscriptionInstanceId(String subscriptionInstanceId) {
        this.subscriptionInstanceId = subscriptionInstanceId;
        return this;
    }
    public String getSubscriptionInstanceId() {
        return this.subscriptionInstanceId;
    }

    public ModifySubscriptionObjectRequest setSubscriptionObject(String subscriptionObject) {
        this.subscriptionObject = subscriptionObject;
        return this;
    }
    public String getSubscriptionObject() {
        return this.subscriptionObject;
    }

    public ModifySubscriptionObjectRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public ModifySubscriptionObjectRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

}
