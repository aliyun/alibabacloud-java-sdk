// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DeletePortResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeletePortResponseBody body;

    public static DeletePortResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePortResponse self = new DeletePortResponse();
        return TeaModel.build(map, self);
    }

    public DeletePortResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePortResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePortResponse setBody(DeletePortResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePortResponseBody getBody() {
        return this.body;
    }

}
