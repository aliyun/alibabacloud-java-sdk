// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ModifyConsumerGroupPasswordRequest extends TeaModel {
    @NameInMap("AccountId")
    public String accountId;

    @NameInMap("ConsumerGroupID")
    public String consumerGroupID;

    @NameInMap("ConsumerGroupName")
    public String consumerGroupName;

    @NameInMap("ConsumerGroupPassword")
    public String consumerGroupPassword;

    @NameInMap("ConsumerGroupUserName")
    public String consumerGroupUserName;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SubscriptionInstanceId")
    public String subscriptionInstanceId;

    @NameInMap("consumerGroupNewPassword")
    public String consumerGroupNewPassword;

    public static ModifyConsumerGroupPasswordRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyConsumerGroupPasswordRequest self = new ModifyConsumerGroupPasswordRequest();
        return TeaModel.build(map, self);
    }

    public ModifyConsumerGroupPasswordRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public ModifyConsumerGroupPasswordRequest setConsumerGroupID(String consumerGroupID) {
        this.consumerGroupID = consumerGroupID;
        return this;
    }
    public String getConsumerGroupID() {
        return this.consumerGroupID;
    }

    public ModifyConsumerGroupPasswordRequest setConsumerGroupName(String consumerGroupName) {
        this.consumerGroupName = consumerGroupName;
        return this;
    }
    public String getConsumerGroupName() {
        return this.consumerGroupName;
    }

    public ModifyConsumerGroupPasswordRequest setConsumerGroupPassword(String consumerGroupPassword) {
        this.consumerGroupPassword = consumerGroupPassword;
        return this;
    }
    public String getConsumerGroupPassword() {
        return this.consumerGroupPassword;
    }

    public ModifyConsumerGroupPasswordRequest setConsumerGroupUserName(String consumerGroupUserName) {
        this.consumerGroupUserName = consumerGroupUserName;
        return this;
    }
    public String getConsumerGroupUserName() {
        return this.consumerGroupUserName;
    }

    public ModifyConsumerGroupPasswordRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public ModifyConsumerGroupPasswordRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyConsumerGroupPasswordRequest setSubscriptionInstanceId(String subscriptionInstanceId) {
        this.subscriptionInstanceId = subscriptionInstanceId;
        return this;
    }
    public String getSubscriptionInstanceId() {
        return this.subscriptionInstanceId;
    }

    public ModifyConsumerGroupPasswordRequest setConsumerGroupNewPassword(String consumerGroupNewPassword) {
        this.consumerGroupNewPassword = consumerGroupNewPassword;
        return this;
    }
    public String getConsumerGroupNewPassword() {
        return this.consumerGroupNewPassword;
    }

}
