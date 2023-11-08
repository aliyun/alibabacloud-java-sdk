// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class DeleteBindingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteBindingResponseBody body;

    public static DeleteBindingResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBindingResponse self = new DeleteBindingResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBindingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteBindingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteBindingResponse setBody(DeleteBindingResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteBindingResponseBody getBody() {
        return this.body;
    }

}
