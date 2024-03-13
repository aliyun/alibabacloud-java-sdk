// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class DeleteWorkerResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteWorkerResourceResponseBody body;

    public static DeleteWorkerResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteWorkerResourceResponse self = new DeleteWorkerResourceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteWorkerResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteWorkerResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteWorkerResourceResponse setBody(DeleteWorkerResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteWorkerResourceResponseBody getBody() {
        return this.body;
    }

}
