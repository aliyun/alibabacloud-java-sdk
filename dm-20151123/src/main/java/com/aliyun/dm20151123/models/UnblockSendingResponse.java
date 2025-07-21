// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class UnblockSendingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnblockSendingResponseBody body;

    public static UnblockSendingResponse build(java.util.Map<String, ?> map) throws Exception {
        UnblockSendingResponse self = new UnblockSendingResponse();
        return TeaModel.build(map, self);
    }

    public UnblockSendingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnblockSendingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnblockSendingResponse setBody(UnblockSendingResponseBody body) {
        this.body = body;
        return this;
    }
    public UnblockSendingResponseBody getBody() {
        return this.body;
    }

}
