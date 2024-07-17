// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class BatchDeleteTablesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchDeleteTablesResponseBody body;

    public static BatchDeleteTablesResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteTablesResponse self = new BatchDeleteTablesResponse();
        return TeaModel.build(map, self);
    }

    public BatchDeleteTablesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchDeleteTablesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchDeleteTablesResponse setBody(BatchDeleteTablesResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchDeleteTablesResponseBody getBody() {
        return this.body;
    }

}
