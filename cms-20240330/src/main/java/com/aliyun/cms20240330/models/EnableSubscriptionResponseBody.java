// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class EnableSubscriptionResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>264C3E89-XXXX-XXXX-XXXX-CE9C2196C7DC</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The subscription ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123123123123</p>
     */
    @NameInMap("subscriptionId")
    public String subscriptionId;

    public static EnableSubscriptionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableSubscriptionResponseBody self = new EnableSubscriptionResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableSubscriptionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EnableSubscriptionResponseBody setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

}
