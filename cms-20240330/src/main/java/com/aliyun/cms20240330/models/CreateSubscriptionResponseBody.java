// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateSubscriptionResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
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

    public static CreateSubscriptionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSubscriptionResponseBody self = new CreateSubscriptionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSubscriptionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSubscriptionResponseBody setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

}
