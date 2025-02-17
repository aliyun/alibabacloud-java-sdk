// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunCommentGenerationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunCommentGenerationResponseBody body;

    public static RunCommentGenerationResponse build(java.util.Map<String, ?> map) throws Exception {
        RunCommentGenerationResponse self = new RunCommentGenerationResponse();
        return TeaModel.build(map, self);
    }

    public RunCommentGenerationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunCommentGenerationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunCommentGenerationResponse setBody(RunCommentGenerationResponseBody body) {
        this.body = body;
        return this;
    }
    public RunCommentGenerationResponseBody getBody() {
        return this.body;
    }

}
