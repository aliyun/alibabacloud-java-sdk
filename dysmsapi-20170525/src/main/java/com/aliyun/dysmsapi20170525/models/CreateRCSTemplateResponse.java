// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class CreateRCSTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRCSTemplateResponseBody body;

    public static CreateRCSTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRCSTemplateResponse self = new CreateRCSTemplateResponse();
        return TeaModel.build(map, self);
    }

    public CreateRCSTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRCSTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRCSTemplateResponse setBody(CreateRCSTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRCSTemplateResponseBody getBody() {
        return this.body;
    }

}
