// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class DeleteStaticAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteStaticAccountResponseBody body;

    public static DeleteStaticAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteStaticAccountResponse self = new DeleteStaticAccountResponse();
        return TeaModel.build(map, self);
    }

    public DeleteStaticAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteStaticAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteStaticAccountResponse setBody(DeleteStaticAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteStaticAccountResponseBody getBody() {
        return this.body;
    }

}
