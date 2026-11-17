// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateWebFilterTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateWebFilterTemplateResponseBody body;

    public static CreateWebFilterTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateWebFilterTemplateResponse self = new CreateWebFilterTemplateResponse();
        return TeaModel.build(map, self);
    }

    public CreateWebFilterTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateWebFilterTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateWebFilterTemplateResponse setBody(CreateWebFilterTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateWebFilterTemplateResponseBody getBody() {
        return this.body;
    }

}
