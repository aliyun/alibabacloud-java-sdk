// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchGetEdgeInstanceDriverConfigsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchGetEdgeInstanceDriverConfigsResponseBody body;

    public static BatchGetEdgeInstanceDriverConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchGetEdgeInstanceDriverConfigsResponse self = new BatchGetEdgeInstanceDriverConfigsResponse();
        return TeaModel.build(map, self);
    }

    public BatchGetEdgeInstanceDriverConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchGetEdgeInstanceDriverConfigsResponse setBody(BatchGetEdgeInstanceDriverConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchGetEdgeInstanceDriverConfigsResponseBody getBody() {
        return this.body;
    }

}
