// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class DeleteProductRefResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteProductRefResponseBody body;

    public static DeleteProductRefResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteProductRefResponse self = new DeleteProductRefResponse();
        return TeaModel.build(map, self);
    }

    public DeleteProductRefResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteProductRefResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteProductRefResponse setBody(DeleteProductRefResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteProductRefResponseBody getBody() {
        return this.body;
    }

}
