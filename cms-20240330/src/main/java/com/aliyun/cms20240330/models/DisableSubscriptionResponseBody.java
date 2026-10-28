// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DisableSubscriptionResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0CEC5375-C554-562B-A65F-******</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The ID of the subscription.</p>
     * 
     * <strong>example:</strong>
     * <p>123123123123</p>
     */
    @NameInMap("subscriptionId")
    public String subscriptionId;

    public static DisableSubscriptionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableSubscriptionResponseBody self = new DisableSubscriptionResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableSubscriptionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DisableSubscriptionResponseBody setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

}
