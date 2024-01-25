// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DeleteBenchmarkTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteBenchmarkTaskResponseBody body;

    public static DeleteBenchmarkTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBenchmarkTaskResponse self = new DeleteBenchmarkTaskResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBenchmarkTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteBenchmarkTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteBenchmarkTaskResponse setBody(DeleteBenchmarkTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteBenchmarkTaskResponseBody getBody() {
        return this.body;
    }

}
