// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class CreateReceiverResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateReceiverResponseBody body;

    public static CreateReceiverResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateReceiverResponse self = new CreateReceiverResponse();
        return TeaModel.build(map, self);
    }

    public CreateReceiverResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateReceiverResponse setBody(CreateReceiverResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateReceiverResponseBody getBody() {
        return this.body;
    }

}
