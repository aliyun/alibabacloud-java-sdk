// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airegistry20260317.models;

import com.aliyun.tea.*;

public class CreatePromptVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePromptVersionResponseBody body;

    public static CreatePromptVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePromptVersionResponse self = new CreatePromptVersionResponse();
        return TeaModel.build(map, self);
    }

    public CreatePromptVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePromptVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePromptVersionResponse setBody(CreatePromptVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePromptVersionResponseBody getBody() {
        return this.body;
    }

}
