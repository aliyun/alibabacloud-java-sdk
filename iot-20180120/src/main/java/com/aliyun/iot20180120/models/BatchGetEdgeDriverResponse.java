// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchGetEdgeDriverResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public BatchGetEdgeDriverResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchGetEdgeDriverResponse setBody(BatchGetEdgeDriverResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchGetEdgeDriverResponseBody getBody() {
        return this.body;
    }

}
