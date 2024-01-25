// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class UpdateBenchmarkTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateBenchmarkTaskResponseBody body;

    public static UpdateBenchmarkTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateBenchmarkTaskResponse self = new UpdateBenchmarkTaskResponse();
        return TeaModel.build(map, self);
    }

    public UpdateBenchmarkTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateBenchmarkTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateBenchmarkTaskResponse setBody(UpdateBenchmarkTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateBenchmarkTaskResponseBody getBody() {
        return this.body;
    }

}
