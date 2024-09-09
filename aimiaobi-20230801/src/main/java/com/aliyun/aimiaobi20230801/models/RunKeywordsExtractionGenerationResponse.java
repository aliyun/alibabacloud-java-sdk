// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunKeywordsExtractionGenerationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunKeywordsExtractionGenerationResponseBody body;

    public static RunKeywordsExtractionGenerationResponse build(java.util.Map<String, ?> map) throws Exception {
        RunKeywordsExtractionGenerationResponse self = new RunKeywordsExtractionGenerationResponse();
        return TeaModel.build(map, self);
    }

    public RunKeywordsExtractionGenerationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunKeywordsExtractionGenerationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunKeywordsExtractionGenerationResponse setBody(RunKeywordsExtractionGenerationResponseBody body) {
        this.body = body;
        return this;
    }
    public RunKeywordsExtractionGenerationResponseBody getBody() {
        return this.body;
    }

}
