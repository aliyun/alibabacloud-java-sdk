// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchGetEdgeInstanceDriverConfigsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public BatchGetEdgeInstanceDriverConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchGetEdgeInstanceDriverConfigsResponse setBody(BatchGetEdgeInstanceDriverConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchGetEdgeInstanceDriverConfigsResponseBody getBody() {
        return this.body;
    }

}
