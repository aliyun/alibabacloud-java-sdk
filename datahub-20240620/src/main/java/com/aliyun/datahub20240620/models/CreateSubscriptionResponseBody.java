// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datahub20240620.models;

import com.aliyun.tea.*;

public class CreateSubscriptionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2025092710234722c53d0b08e811d8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1764123368886L0S9H</p>
     */
    @NameInMap("SubscriptionId")
    public String subscriptionId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public String success;

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

    public CreateSubscriptionResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
