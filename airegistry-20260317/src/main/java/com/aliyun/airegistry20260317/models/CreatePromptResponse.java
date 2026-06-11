// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airegistry20260317.models;

import com.aliyun.tea.*;

public class CreatePromptResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePromptResponseBody body;

    public static CreatePromptResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePromptResponse self = new CreatePromptResponse();
        return TeaModel.build(map, self);
    }

    public CreatePromptResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePromptResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePromptResponse setBody(CreatePromptResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePromptResponseBody getBody() {
        return this.body;
    }

}
