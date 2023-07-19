// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class StartSubscriptionInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the Alibaba Cloud account. You do not need to specify this parameter because this parameter will be removed in the future.</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the change tracking instance. You can call the DescribeSubscriptionInstances operation to query the instance ID.</p>
     */
    @NameInMap("SubscriptionInstanceId")
    public String subscriptionInstanceId;

    public static StartSubscriptionInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        StartSubscriptionInstanceRequest self = new StartSubscriptionInstanceRequest();
        return TeaModel.build(map, self);
    }

    public StartSubscriptionInstanceRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public StartSubscriptionInstanceRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public StartSubscriptionInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public StartSubscriptionInstanceRequest setSubscriptionInstanceId(String subscriptionInstanceId) {
        this.subscriptionInstanceId = subscriptionInstanceId;
        return this;
    }
    public String getSubscriptionInstanceId() {
        return this.subscriptionInstanceId;
    }

}
