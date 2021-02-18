// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeSubscriptionInstanceAlertRequest extends TeaModel {
    @NameInMap("SubscriptionInstanceId")
    public String subscriptionInstanceId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("AccountId")
    public String accountId;

    public static DescribeSubscriptionInstanceAlertRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSubscriptionInstanceAlertRequest self = new DescribeSubscriptionInstanceAlertRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSubscriptionInstanceAlertRequest setSubscriptionInstanceId(String subscriptionInstanceId) {
        this.subscriptionInstanceId = subscriptionInstanceId;
        return this;
    }
    public String getSubscriptionInstanceId() {
        return this.subscriptionInstanceId;
    }

    public DescribeSubscriptionInstanceAlertRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DescribeSubscriptionInstanceAlertRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public DescribeSubscriptionInstanceAlertRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

}
