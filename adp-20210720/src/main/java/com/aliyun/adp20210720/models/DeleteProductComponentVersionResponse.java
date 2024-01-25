// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class DeleteProductComponentVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteProductComponentVersionResponseBody body;

    public static DeleteProductComponentVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteProductComponentVersionResponse self = new DeleteProductComponentVersionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteProductComponentVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteProductComponentVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteProductComponentVersionResponse setBody(DeleteProductComponentVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteProductComponentVersionResponseBody getBody() {
        return this.body;
    }

}
