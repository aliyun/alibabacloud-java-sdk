// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetSubscriptionResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>111111-222-333-1111-33333</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("subscription")
    public SubscriptionForView subscription;

    public static GetSubscriptionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSubscriptionResponseBody self = new GetSubscriptionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSubscriptionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSubscriptionResponseBody setSubscription(SubscriptionForView subscription) {
        this.subscription = subscription;
        return this;
    }
    public SubscriptionForView getSubscription() {
        return this.subscription;
    }

}
