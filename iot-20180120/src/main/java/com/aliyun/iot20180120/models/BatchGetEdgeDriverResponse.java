// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchGetEdgeDriverResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchGetEdgeDriverResponseBody body;

    public static BatchGetEdgeDriverResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchGetEdgeDriverResponse self = new BatchGetEdgeDriverResponse();
        return TeaModel.build(map, self);
    }

    public BatchGetEdgeDriverResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchGetEdgeDriverResponse setBody(BatchGetEdgeDriverResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchGetEdgeDriverResponseBody getBody() {
        return this.body;
    }

}
