// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DeleteClientResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteClientResponseBody body;

    public static DeleteClientResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteClientResponse self = new DeleteClientResponse();
        return TeaModel.build(map, self);
    }

    public DeleteClientResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteClientResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteClientResponse setBody(DeleteClientResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteClientResponseBody getBody() {
        return this.body;
    }

}
