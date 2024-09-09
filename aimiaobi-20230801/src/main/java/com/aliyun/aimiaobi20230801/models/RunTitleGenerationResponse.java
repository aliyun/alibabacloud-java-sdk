// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunTitleGenerationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunTitleGenerationResponseBody body;

    public static RunTitleGenerationResponse build(java.util.Map<String, ?> map) throws Exception {
        RunTitleGenerationResponse self = new RunTitleGenerationResponse();
        return TeaModel.build(map, self);
    }

    public RunTitleGenerationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunTitleGenerationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunTitleGenerationResponse setBody(RunTitleGenerationResponseBody body) {
        this.body = body;
        return this;
    }
    public RunTitleGenerationResponseBody getBody() {
        return this.body;
    }

}
