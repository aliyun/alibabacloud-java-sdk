// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class DeleteProductVersionConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteProductVersionConfigResponseBody body;

    public static DeleteProductVersionConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteProductVersionConfigResponse self = new DeleteProductVersionConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteProductVersionConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteProductVersionConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteProductVersionConfigResponse setBody(DeleteProductVersionConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteProductVersionConfigResponseBody getBody() {
        return this.body;
    }

}
