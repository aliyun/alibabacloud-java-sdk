// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class StopCloudBenchTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopCloudBenchTaskResponseBody body;

    public static StopCloudBenchTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        StopCloudBenchTaskResponse self = new StopCloudBenchTaskResponse();
        return TeaModel.build(map, self);
    }

    public StopCloudBenchTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopCloudBenchTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopCloudBenchTaskResponse setBody(StopCloudBenchTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public StopCloudBenchTaskResponseBody getBody() {
        return this.body;
    }

}
