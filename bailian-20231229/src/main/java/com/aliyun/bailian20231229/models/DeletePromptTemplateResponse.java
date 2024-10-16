// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class DeletePromptTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeletePromptTemplateResponseBody body;

    public static DeletePromptTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePromptTemplateResponse self = new DeletePromptTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DeletePromptTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePromptTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePromptTemplateResponse setBody(DeletePromptTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePromptTemplateResponseBody getBody() {
        return this.body;
    }

}
