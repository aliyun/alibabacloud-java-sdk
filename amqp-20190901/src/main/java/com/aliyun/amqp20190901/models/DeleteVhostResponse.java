// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class DeleteVhostResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteVhostResponseBody body;

    public static DeleteVhostResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVhostResponse self = new DeleteVhostResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVhostResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteVhostResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteVhostResponse setBody(DeleteVhostResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVhostResponseBody getBody() {
        return this.body;
    }

}
