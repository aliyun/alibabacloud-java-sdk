// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class CreateConsumerGroupRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SubscriptionInstanceId")
    public String subscriptionInstanceId;

    @NameInMap("ConsumerGroupName")
    public String consumerGroupName;

    @NameInMap("ConsumerGroupUserName")
    public String consumerGroupUserName;

    @NameInMap("ConsumerGroupPassword")
    public String consumerGroupPassword;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("AccountId")
    public String accountId;

    public static CreateConsumerGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateConsumerGroupRequest self = new CreateConsumerGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateConsumerGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateConsumerGroupRequest setSubscriptionInstanceId(String subscriptionInstanceId) {
        this.subscriptionInstanceId = subscriptionInstanceId;
        return this;
    }
    public String getSubscriptionInstanceId() {
        return this.subscriptionInstanceId;
    }

    public CreateConsumerGroupRequest setConsumerGroupName(String consumerGroupName) {
        this.consumerGroupName = consumerGroupName;
        return this;
    }
    public String getConsumerGroupName() {
        return this.consumerGroupName;
    }

    public CreateConsumerGroupRequest setConsumerGroupUserName(String consumerGroupUserName) {
        this.consumerGroupUserName = consumerGroupUserName;
        return this;
    }
    public String getConsumerGroupUserName() {
        return this.consumerGroupUserName;
    }

    public CreateConsumerGroupRequest setConsumerGroupPassword(String consumerGroupPassword) {
        this.consumerGroupPassword = consumerGroupPassword;
        return this;
    }
    public String getConsumerGroupPassword() {
        return this.consumerGroupPassword;
    }

    public CreateConsumerGroupRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public CreateConsumerGroupRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

}
