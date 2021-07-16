// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class DeleteSubscriptionRequest extends TeaModel {
    @NameInMap("subscriptionId")
    public Long subscriptionId;

    public static DeleteSubscriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSubscriptionRequest self = new DeleteSubscriptionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSubscriptionRequest setSubscriptionId(Long subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }
    public Long getSubscriptionId() {
        return this.subscriptionId;
    }

}
