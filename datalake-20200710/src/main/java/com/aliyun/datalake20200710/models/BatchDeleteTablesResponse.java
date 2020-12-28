// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class BatchDeleteTablesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public BatchDeleteTablesResponse setBody(BatchDeleteTablesResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchDeleteTablesResponseBody getBody() {
        return this.body;
    }

}
