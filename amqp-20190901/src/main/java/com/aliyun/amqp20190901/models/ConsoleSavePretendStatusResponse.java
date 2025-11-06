// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class ConsoleSavePretendStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConsoleSavePretendStatusResponseBody body;

    public static ConsoleSavePretendStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ConsoleSavePretendStatusResponse self = new ConsoleSavePretendStatusResponse();
        return TeaModel.build(map, self);
    }

    public ConsoleSavePretendStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConsoleSavePretendStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConsoleSavePretendStatusResponse setBody(ConsoleSavePretendStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ConsoleSavePretendStatusResponseBody getBody() {
        return this.body;
    }

}
