// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class UpdatePromptTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdatePromptTemplateResponseBody body;

    public static UpdatePromptTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePromptTemplateResponse self = new UpdatePromptTemplateResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePromptTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePromptTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePromptTemplateResponse setBody(UpdatePromptTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePromptTemplateResponseBody getBody() {
        return this.body;
    }

}
