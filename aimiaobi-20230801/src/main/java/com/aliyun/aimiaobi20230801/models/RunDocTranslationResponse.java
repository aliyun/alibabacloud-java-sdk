// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunDocTranslationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunDocTranslationResponseBody body;

    public static RunDocTranslationResponse build(java.util.Map<String, ?> map) throws Exception {
        RunDocTranslationResponse self = new RunDocTranslationResponse();
        return TeaModel.build(map, self);
    }

    public RunDocTranslationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunDocTranslationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunDocTranslationResponse setBody(RunDocTranslationResponseBody body) {
        this.body = body;
        return this;
    }
    public RunDocTranslationResponseBody getBody() {
        return this.body;
    }

}
