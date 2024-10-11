// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteKvResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteKvResponseBody body;

    public static DeleteKvResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteKvResponse self = new DeleteKvResponse();
        return TeaModel.build(map, self);
    }

    public DeleteKvResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteKvResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteKvResponse setBody(DeleteKvResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteKvResponseBody getBody() {
        return this.body;
    }

}
