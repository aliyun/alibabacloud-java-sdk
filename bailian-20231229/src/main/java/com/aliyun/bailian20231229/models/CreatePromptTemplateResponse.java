// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class CreatePromptTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePromptTemplateResponseBody body;

    public static CreatePromptTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePromptTemplateResponse self = new CreatePromptTemplateResponse();
        return TeaModel.build(map, self);
    }

    public CreatePromptTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePromptTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePromptTemplateResponse setBody(CreatePromptTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePromptTemplateResponseBody getBody() {
        return this.body;
    }

}
