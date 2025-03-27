// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mobi20240411.models;

import com.aliyun.tea.*;

public class CreateAppFromTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAppFromTemplateResponseBody body;

    public static CreateAppFromTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAppFromTemplateResponse self = new CreateAppFromTemplateResponse();
        return TeaModel.build(map, self);
    }

    public CreateAppFromTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAppFromTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAppFromTemplateResponse setBody(CreateAppFromTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAppFromTemplateResponseBody getBody() {
        return this.body;
    }

}
