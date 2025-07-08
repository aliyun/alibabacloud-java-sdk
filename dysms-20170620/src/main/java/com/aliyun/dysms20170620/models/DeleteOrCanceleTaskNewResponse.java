// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class DeleteOrCanceleTaskNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteOrCanceleTaskNewResponseBody body;

    public static DeleteOrCanceleTaskNewResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteOrCanceleTaskNewResponse self = new DeleteOrCanceleTaskNewResponse();
        return TeaModel.build(map, self);
    }

    public DeleteOrCanceleTaskNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteOrCanceleTaskNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteOrCanceleTaskNewResponse setBody(DeleteOrCanceleTaskNewResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteOrCanceleTaskNewResponseBody getBody() {
        return this.body;
    }

}
