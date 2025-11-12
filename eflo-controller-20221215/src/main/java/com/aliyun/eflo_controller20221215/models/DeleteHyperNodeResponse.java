// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class DeleteHyperNodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteHyperNodeResponseBody body;

    public static DeleteHyperNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteHyperNodeResponse self = new DeleteHyperNodeResponse();
        return TeaModel.build(map, self);
    }

    public DeleteHyperNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteHyperNodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteHyperNodeResponse setBody(DeleteHyperNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteHyperNodeResponseBody getBody() {
        return this.body;
    }

}
