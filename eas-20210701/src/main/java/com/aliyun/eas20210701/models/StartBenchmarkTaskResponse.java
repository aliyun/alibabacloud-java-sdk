// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class StartBenchmarkTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartBenchmarkTaskResponseBody body;

    public static StartBenchmarkTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        StartBenchmarkTaskResponse self = new StartBenchmarkTaskResponse();
        return TeaModel.build(map, self);
    }

    public StartBenchmarkTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartBenchmarkTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartBenchmarkTaskResponse setBody(StartBenchmarkTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public StartBenchmarkTaskResponseBody getBody() {
        return this.body;
    }

}
