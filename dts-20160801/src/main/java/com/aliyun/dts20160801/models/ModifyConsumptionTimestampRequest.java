// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20160801.models;

import com.aliyun.tea.*;

public class ModifyConsumptionTimestampRequest extends TeaModel {
    @NameInMap("ConsumptionTimestamp")
    public String consumptionTimestamp;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("SubscriptionInstanceId")
    public String subscriptionInstanceId;

    public static ModifyConsumptionTimestampRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyConsumptionTimestampRequest self = new ModifyConsumptionTimestampRequest();
        return TeaModel.build(map, self);
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

    public ModifyConsumptionTimestampRequest setSubscriptionInstanceId(String subscriptionInstanceId) {
        this.subscriptionInstanceId = subscriptionInstanceId;
        return this;
    }
    public String getSubscriptionInstanceId() {
        return this.subscriptionInstanceId;
    }

}
