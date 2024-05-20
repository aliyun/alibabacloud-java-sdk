// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class CancelReserveTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelReserveTaskResponseBody body;

    public static CancelReserveTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelReserveTaskResponse self = new CancelReserveTaskResponse();
        return TeaModel.build(map, self);
    }

    public CancelReserveTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelReserveTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelReserveTaskResponse setBody(CancelReserveTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelReserveTaskResponseBody getBody() {
        return this.body;
    }

}
