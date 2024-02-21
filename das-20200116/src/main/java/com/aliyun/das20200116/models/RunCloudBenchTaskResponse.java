// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class RunCloudBenchTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunCloudBenchTaskResponseBody body;

    public static RunCloudBenchTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        RunCloudBenchTaskResponse self = new RunCloudBenchTaskResponse();
        return TeaModel.build(map, self);
    }

    public RunCloudBenchTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunCloudBenchTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunCloudBenchTaskResponse setBody(RunCloudBenchTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public RunCloudBenchTaskResponseBody getBody() {
        return this.body;
    }

}
