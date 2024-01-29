// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateCustomTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCustomTemplateResponseBody body;

    public static CreateCustomTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomTemplateResponse self = new CreateCustomTemplateResponse();
        return TeaModel.build(map, self);
    }

    public CreateCustomTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCustomTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCustomTemplateResponse setBody(CreateCustomTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCustomTemplateResponseBody getBody() {
        return this.body;
    }

}
