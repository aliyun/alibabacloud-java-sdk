// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class BatchDeleteTableVersionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchDeleteTableVersionsResponseBody body;

    public static BatchDeleteTableVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteTableVersionsResponse self = new BatchDeleteTableVersionsResponse();
        return TeaModel.build(map, self);
    }

    public BatchDeleteTableVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchDeleteTableVersionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchDeleteTableVersionsResponse setBody(BatchDeleteTableVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchDeleteTableVersionsResponseBody getBody() {
        return this.body;
    }

}
