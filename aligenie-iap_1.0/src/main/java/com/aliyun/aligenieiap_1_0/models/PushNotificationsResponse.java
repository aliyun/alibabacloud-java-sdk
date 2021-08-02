// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class PushNotificationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PushNotificationsResponseBody body;

    public static PushNotificationsResponse build(java.util.Map<String, ?> map) throws Exception {
        PushNotificationsResponse self = new PushNotificationsResponse();
        return TeaModel.build(map, self);
    }

    public PushNotificationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PushNotificationsResponse setBody(PushNotificationsResponseBody body) {
        this.body = body;
        return this;
    }
    public PushNotificationsResponseBody getBody() {
        return this.body;
    }

}
