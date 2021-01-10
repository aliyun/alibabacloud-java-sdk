// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class PublishMqttMessageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PublishMqttMessageResponseBody body;

    public static PublishMqttMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        PublishMqttMessageResponse self = new PublishMqttMessageResponse();
        return TeaModel.build(map, self);
    }

    public PublishMqttMessageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PublishMqttMessageResponse setBody(PublishMqttMessageResponseBody body) {
        this.body = body;
        return this;
    }
    public PublishMqttMessageResponseBody getBody() {
        return this.body;
    }

}
