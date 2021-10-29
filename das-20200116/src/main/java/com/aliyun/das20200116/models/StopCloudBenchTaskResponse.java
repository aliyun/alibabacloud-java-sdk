// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class StopCloudBenchTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public StopCloudBenchTaskResponse setBody(StopCloudBenchTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public StopCloudBenchTaskResponseBody getBody() {
        return this.body;
    }

}
