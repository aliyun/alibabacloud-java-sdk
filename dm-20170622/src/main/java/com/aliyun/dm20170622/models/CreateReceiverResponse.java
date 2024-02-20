// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20170622.models;

import com.aliyun.tea.*;

public class CreateReceiverResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public CreateReceiverResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateReceiverResponse setBody(CreateReceiverResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateReceiverResponseBody getBody() {
        return this.body;
    }

}
