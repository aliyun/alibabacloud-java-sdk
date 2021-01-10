// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class CreateMqttRootTopicResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateMqttRootTopicResponseBody body;

    public static CreateMqttRootTopicResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMqttRootTopicResponse self = new CreateMqttRootTopicResponse();
        return TeaModel.build(map, self);
    }

    public CreateMqttRootTopicResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMqttRootTopicResponse setBody(CreateMqttRootTopicResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMqttRootTopicResponseBody getBody() {
        return this.body;
    }

}
