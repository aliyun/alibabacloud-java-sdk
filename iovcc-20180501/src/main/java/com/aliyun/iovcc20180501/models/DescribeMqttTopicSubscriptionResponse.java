// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DescribeMqttTopicSubscriptionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeMqttTopicSubscriptionResponseBody body;

    public static DescribeMqttTopicSubscriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMqttTopicSubscriptionResponse self = new DescribeMqttTopicSubscriptionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMqttTopicSubscriptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMqttTopicSubscriptionResponse setBody(DescribeMqttTopicSubscriptionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMqttTopicSubscriptionResponseBody getBody() {
        return this.body;
    }

}
