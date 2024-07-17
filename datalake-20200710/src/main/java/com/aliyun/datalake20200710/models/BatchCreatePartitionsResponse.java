// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class BatchCreatePartitionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchCreatePartitionsResponseBody body;

    public static BatchCreatePartitionsResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchCreatePartitionsResponse self = new BatchCreatePartitionsResponse();
        return TeaModel.build(map, self);
    }

    public BatchCreatePartitionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchCreatePartitionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchCreatePartitionsResponse setBody(BatchCreatePartitionsResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchCreatePartitionsResponseBody getBody() {
        return this.body;
    }

}
