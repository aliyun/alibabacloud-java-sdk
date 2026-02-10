// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class CreateDigitalSmsTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDigitalSmsTemplateResponseBody body;

    public static CreateDigitalSmsTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDigitalSmsTemplateResponse self = new CreateDigitalSmsTemplateResponse();
        return TeaModel.build(map, self);
    }

    public CreateDigitalSmsTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDigitalSmsTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDigitalSmsTemplateResponse setBody(CreateDigitalSmsTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDigitalSmsTemplateResponseBody getBody() {
        return this.body;
    }

}
