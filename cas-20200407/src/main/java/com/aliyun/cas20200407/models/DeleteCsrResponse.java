// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class DeleteCsrResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCsrResponseBody body;

    public static DeleteCsrResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCsrResponse self = new DeleteCsrResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCsrResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCsrResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCsrResponse setBody(DeleteCsrResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCsrResponseBody getBody() {
        return this.body;
    }

}
