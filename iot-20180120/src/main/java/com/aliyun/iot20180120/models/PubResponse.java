// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class PubResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PubResponseBody body;

    public static PubResponse build(java.util.Map<String, ?> map) throws Exception {
        PubResponse self = new PubResponse();
        return TeaModel.build(map, self);
    }

    public PubResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PubResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PubResponse setBody(PubResponseBody body) {
        this.body = body;
        return this;
    }
    public PubResponseBody getBody() {
        return this.body;
    }

}
