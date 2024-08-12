// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class RunChatResultGenerationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunChatResultGenerationResponseBody body;

    public static RunChatResultGenerationResponse build(java.util.Map<String, ?> map) throws Exception {
        RunChatResultGenerationResponse self = new RunChatResultGenerationResponse();
        return TeaModel.build(map, self);
    }

    public RunChatResultGenerationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunChatResultGenerationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunChatResultGenerationResponse setBody(RunChatResultGenerationResponseBody body) {
        this.body = body;
        return this;
    }
    public RunChatResultGenerationResponseBody getBody() {
        return this.body;
    }

}
