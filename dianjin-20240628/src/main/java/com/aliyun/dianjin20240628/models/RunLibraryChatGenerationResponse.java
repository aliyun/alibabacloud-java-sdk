// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class RunLibraryChatGenerationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunLibraryChatGenerationResponseBody body;

    public static RunLibraryChatGenerationResponse build(java.util.Map<String, ?> map) throws Exception {
        RunLibraryChatGenerationResponse self = new RunLibraryChatGenerationResponse();
        return TeaModel.build(map, self);
    }

    public RunLibraryChatGenerationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunLibraryChatGenerationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunLibraryChatGenerationResponse setBody(RunLibraryChatGenerationResponseBody body) {
        this.body = body;
        return this;
    }
    public RunLibraryChatGenerationResponseBody getBody() {
        return this.body;
    }

}
