// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteVersionResponseBody body;

    public static DeleteVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVersionResponse self = new DeleteVersionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteVersionResponse setBody(DeleteVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVersionResponseBody getBody() {
        return this.body;
    }

}
