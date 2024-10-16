// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class GetPromptTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPromptTemplateResponseBody body;

    public static GetPromptTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPromptTemplateResponse self = new GetPromptTemplateResponse();
        return TeaModel.build(map, self);
    }

    public GetPromptTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPromptTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPromptTemplateResponse setBody(GetPromptTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPromptTemplateResponseBody getBody() {
        return this.body;
    }

}
