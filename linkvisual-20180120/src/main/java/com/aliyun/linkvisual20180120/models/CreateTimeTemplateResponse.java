// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class CreateTimeTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateTimeTemplateResponseBody body;

    public static CreateTimeTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTimeTemplateResponse self = new CreateTimeTemplateResponse();
        return TeaModel.build(map, self);
    }

    public CreateTimeTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTimeTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTimeTemplateResponse setBody(CreateTimeTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTimeTemplateResponseBody getBody() {
        return this.body;
    }

}
