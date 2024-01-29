// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class CreateTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateTemplateResponseBody body;

    public static CreateTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTemplateResponse self = new CreateTemplateResponse();
        return TeaModel.build(map, self);
    }

    public CreateTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTemplateResponse setBody(CreateTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTemplateResponseBody getBody() {
        return this.body;
    }

}
