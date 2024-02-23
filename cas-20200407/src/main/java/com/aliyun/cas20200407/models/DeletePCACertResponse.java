// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class DeletePCACertResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeletePCACertResponseBody body;

    public static DeletePCACertResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePCACertResponse self = new DeletePCACertResponse();
        return TeaModel.build(map, self);
    }

    public DeletePCACertResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePCACertResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePCACertResponse setBody(DeletePCACertResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePCACertResponseBody getBody() {
        return this.body;
    }

}
