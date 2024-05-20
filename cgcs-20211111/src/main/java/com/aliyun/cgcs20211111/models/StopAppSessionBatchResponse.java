// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class StopAppSessionBatchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopAppSessionBatchResponseBody body;

    public static StopAppSessionBatchResponse build(java.util.Map<String, ?> map) throws Exception {
        StopAppSessionBatchResponse self = new StopAppSessionBatchResponse();
        return TeaModel.build(map, self);
    }

    public StopAppSessionBatchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopAppSessionBatchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopAppSessionBatchResponse setBody(StopAppSessionBatchResponseBody body) {
        this.body = body;
        return this;
    }
    public StopAppSessionBatchResponseBody getBody() {
        return this.body;
    }

}
