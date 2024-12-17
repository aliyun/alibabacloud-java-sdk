// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunSearchGenerationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunSearchGenerationResponseBody body;

    public static RunSearchGenerationResponse build(java.util.Map<String, ?> map) throws Exception {
        RunSearchGenerationResponse self = new RunSearchGenerationResponse();
        return TeaModel.build(map, self);
    }

    public RunSearchGenerationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunSearchGenerationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunSearchGenerationResponse setBody(RunSearchGenerationResponseBody body) {
        this.body = body;
        return this;
    }
    public RunSearchGenerationResponseBody getBody() {
        return this.body;
    }

}
