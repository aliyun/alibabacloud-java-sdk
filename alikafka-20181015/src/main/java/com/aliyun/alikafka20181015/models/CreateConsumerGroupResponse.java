// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20181015.models;

import com.aliyun.tea.*;

public class CreateConsumerGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateConsumerGroupResponseBody body;

    public static CreateConsumerGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateConsumerGroupResponse self = new CreateConsumerGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateConsumerGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateConsumerGroupResponse setBody(CreateConsumerGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateConsumerGroupResponseBody getBody() {
        return this.body;
    }

}
