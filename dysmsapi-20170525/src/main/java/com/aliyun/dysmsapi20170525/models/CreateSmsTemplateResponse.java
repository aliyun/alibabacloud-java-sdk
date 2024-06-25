// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class CreateSmsTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSmsTemplateResponseBody body;

    public static CreateSmsTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSmsTemplateResponse self = new CreateSmsTemplateResponse();
        return TeaModel.build(map, self);
    }

    public CreateSmsTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSmsTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSmsTemplateResponse setBody(CreateSmsTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSmsTemplateResponseBody getBody() {
        return this.body;
    }

}
