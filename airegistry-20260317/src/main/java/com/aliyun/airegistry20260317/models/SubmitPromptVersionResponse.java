// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airegistry20260317.models;

import com.aliyun.tea.*;

public class SubmitPromptVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitPromptVersionResponseBody body;

    public static SubmitPromptVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitPromptVersionResponse self = new SubmitPromptVersionResponse();
        return TeaModel.build(map, self);
    }

    public SubmitPromptVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitPromptVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitPromptVersionResponse setBody(SubmitPromptVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitPromptVersionResponseBody getBody() {
        return this.body;
    }

}
