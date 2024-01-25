// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class CreateBenchmarkTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateBenchmarkTaskResponseBody body;

    public static CreateBenchmarkTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBenchmarkTaskResponse self = new CreateBenchmarkTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateBenchmarkTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateBenchmarkTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateBenchmarkTaskResponse setBody(CreateBenchmarkTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateBenchmarkTaskResponseBody getBody() {
        return this.body;
    }

}
