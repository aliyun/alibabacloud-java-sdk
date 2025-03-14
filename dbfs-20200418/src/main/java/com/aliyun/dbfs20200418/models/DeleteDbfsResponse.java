// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class DeleteDbfsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDbfsResponseBody body;

    public static DeleteDbfsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDbfsResponse self = new DeleteDbfsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDbfsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDbfsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDbfsResponse setBody(DeleteDbfsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDbfsResponseBody getBody() {
        return this.body;
    }

}
