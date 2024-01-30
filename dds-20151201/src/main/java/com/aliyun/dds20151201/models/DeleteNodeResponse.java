// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DeleteNodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteNodeResponseBody body;

    public static DeleteNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteNodeResponse self = new DeleteNodeResponse();
        return TeaModel.build(map, self);
    }

    public DeleteNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteNodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteNodeResponse setBody(DeleteNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteNodeResponseBody getBody() {
        return this.body;
    }

}
