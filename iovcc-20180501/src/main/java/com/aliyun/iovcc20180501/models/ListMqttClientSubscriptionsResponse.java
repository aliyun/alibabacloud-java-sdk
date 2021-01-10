// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListMqttClientSubscriptionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListMqttClientSubscriptionsResponseBody body;

    public static ListMqttClientSubscriptionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMqttClientSubscriptionsResponse self = new ListMqttClientSubscriptionsResponse();
        return TeaModel.build(map, self);
    }

    public ListMqttClientSubscriptionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMqttClientSubscriptionsResponse setBody(ListMqttClientSubscriptionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMqttClientSubscriptionsResponseBody getBody() {
        return this.body;
    }

}
