// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mssp20161228.models;

import com.aliyun.tea.*;

public class DisposeWorkTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisposeWorkTaskResponseBody body;

    public static DisposeWorkTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DisposeWorkTaskResponse self = new DisposeWorkTaskResponse();
        return TeaModel.build(map, self);
    }

    public DisposeWorkTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisposeWorkTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisposeWorkTaskResponse setBody(DisposeWorkTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DisposeWorkTaskResponseBody getBody() {
        return this.body;
    }

}
