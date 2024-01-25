// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class StopBenchmarkTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopBenchmarkTaskResponseBody body;

    public static StopBenchmarkTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        StopBenchmarkTaskResponse self = new StopBenchmarkTaskResponse();
        return TeaModel.build(map, self);
    }

    public StopBenchmarkTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopBenchmarkTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopBenchmarkTaskResponse setBody(StopBenchmarkTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public StopBenchmarkTaskResponseBody getBody() {
        return this.body;
    }

}
