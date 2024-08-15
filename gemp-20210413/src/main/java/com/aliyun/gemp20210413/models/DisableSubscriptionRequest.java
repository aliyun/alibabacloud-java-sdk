// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class DisableSubscriptionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>89</p>
     */
    @NameInMap("subscriptionId")
    public Long subscriptionId;

    public static DisableSubscriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableSubscriptionRequest self = new DisableSubscriptionRequest();
        return TeaModel.build(map, self);
    }

    public DisableSubscriptionRequest setSubscriptionId(Long subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }
    public Long getSubscriptionId() {
        return this.subscriptionId;
    }

}
