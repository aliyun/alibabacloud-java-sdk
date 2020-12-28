// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class BatchGetTablesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchGetTablesResponseBody body;

    public static BatchGetTablesResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchGetTablesResponse self = new BatchGetTablesResponse();
        return TeaModel.build(map, self);
    }

    public BatchGetTablesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchGetTablesResponse setBody(BatchGetTablesResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchGetTablesResponseBody getBody() {
        return this.body;
    }

}
