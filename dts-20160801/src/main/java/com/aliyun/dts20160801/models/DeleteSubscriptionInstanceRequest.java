// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20160801.models;

import com.aliyun.tea.*;

public class DeleteSubscriptionInstanceRequest extends TeaModel {
    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("SubscriptionInstanceId")
    public String subscriptionInstanceId;

    public static DeleteSubscriptionInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSubscriptionInstanceRequest self = new DeleteSubscriptionInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSubscriptionInstanceRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public DeleteSubscriptionInstanceRequest setSubscriptionInstanceId(String subscriptionInstanceId) {
        this.subscriptionInstanceId = subscriptionInstanceId;
        return this;
    }
    public String getSubscriptionInstanceId() {
        return this.subscriptionInstanceId;
    }

}
