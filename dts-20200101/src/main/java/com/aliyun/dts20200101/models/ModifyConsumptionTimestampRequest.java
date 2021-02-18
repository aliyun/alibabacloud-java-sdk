// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ModifyConsumptionTimestampRequest extends TeaModel {
    @NameInMap("SubscriptionInstanceId")
    public String subscriptionInstanceId;

    @NameInMap("ConsumptionTimestamp")
    public String consumptionTimestamp;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("AccountId")
    public String accountId;

    public static ModifyConsumptionTimestampRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyConsumptionTimestampRequest self = new ModifyConsumptionTimestampRequest();
        return TeaModel.build(map, self);
    }

    public ModifyConsumptionTimestampRequest setSubscriptionInstanceId(String subscriptionInstanceId) {
        this.subscriptionInstanceId = subscriptionInstanceId;
        return this;
    }
    public String getSubscriptionInstanceId() {
        return this.subscriptionInstanceId;
    }

    public ModifyConsumptionTimestampRequest setConsumptionTimestamp(String consumptionTimestamp) {
        this.consumptionTimestamp = consumptionTimestamp;
        return this;
    }
    public String getConsumptionTimestamp() {
        return this.consumptionTimestamp;
    }

    public ModifyConsumptionTimestampRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public ModifyConsumptionTimestampRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

}
