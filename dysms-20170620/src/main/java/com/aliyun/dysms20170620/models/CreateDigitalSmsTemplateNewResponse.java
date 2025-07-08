// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class CreateDigitalSmsTemplateNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDigitalSmsTemplateNewResponseBody body;

    public static CreateDigitalSmsTemplateNewResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDigitalSmsTemplateNewResponse self = new CreateDigitalSmsTemplateNewResponse();
        return TeaModel.build(map, self);
    }

    public CreateDigitalSmsTemplateNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDigitalSmsTemplateNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDigitalSmsTemplateNewResponse setBody(CreateDigitalSmsTemplateNewResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDigitalSmsTemplateNewResponseBody getBody() {
        return this.body;
    }

}
