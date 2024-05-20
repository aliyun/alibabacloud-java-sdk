// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class BatchCheckSessionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchCheckSessionResponseBody body;

    public static BatchCheckSessionResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchCheckSessionResponse self = new BatchCheckSessionResponse();
        return TeaModel.build(map, self);
    }

    public BatchCheckSessionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchCheckSessionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchCheckSessionResponse setBody(BatchCheckSessionResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchCheckSessionResponseBody getBody() {
        return this.body;
    }

}
