// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class BatchGetFigureClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchGetFigureClusterResponseBody body;

    public static BatchGetFigureClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchGetFigureClusterResponse self = new BatchGetFigureClusterResponse();
        return TeaModel.build(map, self);
    }

    public BatchGetFigureClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchGetFigureClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchGetFigureClusterResponse setBody(BatchGetFigureClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchGetFigureClusterResponseBody getBody() {
        return this.body;
    }

}
