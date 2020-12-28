// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class BatchCreateTablesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchCreateTablesResponseBody body;

    public static BatchCreateTablesResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateTablesResponse self = new BatchCreateTablesResponse();
        return TeaModel.build(map, self);
    }

    public BatchCreateTablesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchCreateTablesResponse setBody(BatchCreateTablesResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchCreateTablesResponseBody getBody() {
        return this.body;
    }

}
