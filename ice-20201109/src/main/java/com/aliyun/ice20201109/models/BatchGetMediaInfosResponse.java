// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class BatchGetMediaInfosResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchGetMediaInfosResponseBody body;

    public static BatchGetMediaInfosResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchGetMediaInfosResponse self = new BatchGetMediaInfosResponse();
        return TeaModel.build(map, self);
    }

    public BatchGetMediaInfosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchGetMediaInfosResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchGetMediaInfosResponse setBody(BatchGetMediaInfosResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchGetMediaInfosResponseBody getBody() {
        return this.body;
    }

}
