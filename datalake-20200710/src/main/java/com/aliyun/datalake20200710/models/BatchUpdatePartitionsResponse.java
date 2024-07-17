// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class BatchUpdatePartitionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchUpdatePartitionsResponseBody body;

    public static BatchUpdatePartitionsResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchUpdatePartitionsResponse self = new BatchUpdatePartitionsResponse();
        return TeaModel.build(map, self);
    }

    public BatchUpdatePartitionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchUpdatePartitionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchUpdatePartitionsResponse setBody(BatchUpdatePartitionsResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchUpdatePartitionsResponseBody getBody() {
        return this.body;
    }

}
