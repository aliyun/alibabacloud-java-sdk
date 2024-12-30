// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class SubmitBatchTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitBatchTaskResponseBody body;

    public static SubmitBatchTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitBatchTaskResponse self = new SubmitBatchTaskResponse();
        return TeaModel.build(map, self);
    }

    public SubmitBatchTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitBatchTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitBatchTaskResponse setBody(SubmitBatchTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitBatchTaskResponseBody getBody() {
        return this.body;
    }

}
