// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20180703.models;

import com.aliyun.tea.*;

public class SetZeroCreditShutdownStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SetZeroCreditShutdownStatusResponseBody body;

    public static SetZeroCreditShutdownStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        SetZeroCreditShutdownStatusResponse self = new SetZeroCreditShutdownStatusResponse();
        return TeaModel.build(map, self);
    }

    public SetZeroCreditShutdownStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetZeroCreditShutdownStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetZeroCreditShutdownStatusResponse setBody(SetZeroCreditShutdownStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public SetZeroCreditShutdownStatusResponseBody getBody() {
        return this.body;
    }

}
