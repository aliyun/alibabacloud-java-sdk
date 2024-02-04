// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class SuspendBatchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SuspendBatchResponseBody body;

    public static SuspendBatchResponse build(java.util.Map<String, ?> map) throws Exception {
        SuspendBatchResponse self = new SuspendBatchResponse();
        return TeaModel.build(map, self);
    }

    public SuspendBatchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SuspendBatchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SuspendBatchResponse setBody(SuspendBatchResponseBody body) {
        this.body = body;
        return this;
    }
    public SuspendBatchResponseBody getBody() {
        return this.body;
    }

}
