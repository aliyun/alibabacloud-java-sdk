// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteZnodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteZnodeResponseBody body;

    public static DeleteZnodeResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteZnodeResponse self = new DeleteZnodeResponse();
        return TeaModel.build(map, self);
    }

    public DeleteZnodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteZnodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteZnodeResponse setBody(DeleteZnodeResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteZnodeResponseBody getBody() {
        return this.body;
    }

}
