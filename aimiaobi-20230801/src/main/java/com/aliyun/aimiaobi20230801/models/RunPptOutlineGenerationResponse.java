// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunPptOutlineGenerationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunPptOutlineGenerationResponseBody body;

    public static RunPptOutlineGenerationResponse build(java.util.Map<String, ?> map) throws Exception {
        RunPptOutlineGenerationResponse self = new RunPptOutlineGenerationResponse();
        return TeaModel.build(map, self);
    }

    public RunPptOutlineGenerationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunPptOutlineGenerationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunPptOutlineGenerationResponse setBody(RunPptOutlineGenerationResponseBody body) {
        this.body = body;
        return this;
    }
    public RunPptOutlineGenerationResponseBody getBody() {
        return this.body;
    }

}
