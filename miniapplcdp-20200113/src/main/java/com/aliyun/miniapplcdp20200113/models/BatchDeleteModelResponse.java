// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class BatchDeleteModelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchDeleteModelResponseBody body;

    public static BatchDeleteModelResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteModelResponse self = new BatchDeleteModelResponse();
        return TeaModel.build(map, self);
    }

    public BatchDeleteModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchDeleteModelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchDeleteModelResponse setBody(BatchDeleteModelResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchDeleteModelResponseBody getBody() {
        return this.body;
    }

}
