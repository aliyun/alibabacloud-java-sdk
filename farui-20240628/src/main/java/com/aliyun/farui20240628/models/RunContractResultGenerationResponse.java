// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.farui20240628.models;

import com.aliyun.tea.*;

public class RunContractResultGenerationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunContractResultGenerationResponseBody body;

    public static RunContractResultGenerationResponse build(java.util.Map<String, ?> map) throws Exception {
        RunContractResultGenerationResponse self = new RunContractResultGenerationResponse();
        return TeaModel.build(map, self);
    }

    public RunContractResultGenerationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunContractResultGenerationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunContractResultGenerationResponse setBody(RunContractResultGenerationResponseBody body) {
        this.body = body;
        return this;
    }
    public RunContractResultGenerationResponseBody getBody() {
        return this.body;
    }

}
