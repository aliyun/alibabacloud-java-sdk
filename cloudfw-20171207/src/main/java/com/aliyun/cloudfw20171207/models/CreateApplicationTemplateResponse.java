// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateApplicationTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateApplicationTemplateResponseBody body;

    public static CreateApplicationTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationTemplateResponse self = new CreateApplicationTemplateResponse();
        return TeaModel.build(map, self);
    }

    public CreateApplicationTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateApplicationTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateApplicationTemplateResponse setBody(CreateApplicationTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateApplicationTemplateResponseBody getBody() {
        return this.body;
    }

}
