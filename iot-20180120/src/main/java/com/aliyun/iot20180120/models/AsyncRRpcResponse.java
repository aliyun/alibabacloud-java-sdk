// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class AsyncRRpcResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AsyncRRpcResponseBody body;

    public static AsyncRRpcResponse build(java.util.Map<String, ?> map) throws Exception {
        AsyncRRpcResponse self = new AsyncRRpcResponse();
        return TeaModel.build(map, self);
    }

    public AsyncRRpcResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AsyncRRpcResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AsyncRRpcResponse setBody(AsyncRRpcResponseBody body) {
        this.body = body;
        return this;
    }
    public AsyncRRpcResponseBody getBody() {
        return this.body;
    }

}
