// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DeleteConsumerGroupRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SubscriptionInstanceId")
    public String subscriptionInstanceId;

    @NameInMap("ConsumerGroupID")
    public String consumerGroupID;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("AccountId")
    public String accountId;

    public static DeleteConsumerGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteConsumerGroupRequest self = new DeleteConsumerGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteConsumerGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteConsumerGroupRequest setSubscriptionInstanceId(String subscriptionInstanceId) {
        this.subscriptionInstanceId = subscriptionInstanceId;
        return this;
    }
    public String getSubscriptionInstanceId() {
        return this.subscriptionInstanceId;
    }

    public DeleteConsumerGroupRequest setConsumerGroupID(String consumerGroupID) {
        this.consumerGroupID = consumerGroupID;
        return this;
    }
    public String getConsumerGroupID() {
        return this.consumerGroupID;
    }

    public DeleteConsumerGroupRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public DeleteConsumerGroupRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

}
