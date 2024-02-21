// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class CreateAdamBenchTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAdamBenchTaskResponseBody body;

    public static CreateAdamBenchTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAdamBenchTaskResponse self = new CreateAdamBenchTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateAdamBenchTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAdamBenchTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAdamBenchTaskResponse setBody(CreateAdamBenchTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAdamBenchTaskResponseBody getBody() {
        return this.body;
    }

}
