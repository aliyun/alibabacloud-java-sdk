// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class BindResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BindResponseBody body;

    public static BindResponse build(java.util.Map<String, ?> map) throws Exception {
        BindResponse self = new BindResponse();
        return TeaModel.build(map, self);
    }

    public BindResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BindResponse setBody(BindResponseBody body) {
        this.body = body;
        return this;
    }
    public BindResponseBody getBody() {
        return this.body;
    }

}
