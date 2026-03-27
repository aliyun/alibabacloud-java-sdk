// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpdateSubscriptionResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>0CEC5375-C554-562B-A65F-******</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>123123123123</p>
     */
    @NameInMap("subscriptionId")
    public String subscriptionId;

    public static UpdateSubscriptionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSubscriptionResponseBody self = new UpdateSubscriptionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSubscriptionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateSubscriptionResponseBody setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

}
