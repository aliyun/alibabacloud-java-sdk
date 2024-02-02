// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchPubResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchPubResponseBody body;

    public static BatchPubResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchPubResponse self = new BatchPubResponse();
        return TeaModel.build(map, self);
    }

    public BatchPubResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchPubResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchPubResponse setBody(BatchPubResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchPubResponseBody getBody() {
        return this.body;
    }

}
