// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class BatchUpdateTablesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchUpdateTablesResponseBody body;

    public static BatchUpdateTablesResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchUpdateTablesResponse self = new BatchUpdateTablesResponse();
        return TeaModel.build(map, self);
    }

    public BatchUpdateTablesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchUpdateTablesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchUpdateTablesResponse setBody(BatchUpdateTablesResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchUpdateTablesResponseBody getBody() {
        return this.body;
    }

}
