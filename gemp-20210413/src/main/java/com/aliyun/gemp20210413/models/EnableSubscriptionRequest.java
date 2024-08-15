// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class EnableSubscriptionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("subscriptionId")
    public Long subscriptionId;

    public static EnableSubscriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableSubscriptionRequest self = new EnableSubscriptionRequest();
        return TeaModel.build(map, self);
    }

    public EnableSubscriptionRequest setSubscriptionId(Long subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }
    public Long getSubscriptionId() {
        return this.subscriptionId;
    }

}
