// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class DeleteProductInstanceConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteProductInstanceConfigResponseBody body;

    public static DeleteProductInstanceConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteProductInstanceConfigResponse self = new DeleteProductInstanceConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteProductInstanceConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteProductInstanceConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteProductInstanceConfigResponse setBody(DeleteProductInstanceConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteProductInstanceConfigResponseBody getBody() {
        return this.body;
    }

}
