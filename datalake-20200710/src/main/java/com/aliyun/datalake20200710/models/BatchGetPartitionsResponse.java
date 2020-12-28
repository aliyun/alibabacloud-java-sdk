// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class BatchGetPartitionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchGetPartitionsResponseBody body;

    public static BatchGetPartitionsResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchGetPartitionsResponse self = new BatchGetPartitionsResponse();
        return TeaModel.build(map, self);
    }

    public BatchGetPartitionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchGetPartitionsResponse setBody(BatchGetPartitionsResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchGetPartitionsResponseBody getBody() {
        return this.body;
    }

}
