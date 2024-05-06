// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class CreateSubscriptionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SubscriptionId")
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
