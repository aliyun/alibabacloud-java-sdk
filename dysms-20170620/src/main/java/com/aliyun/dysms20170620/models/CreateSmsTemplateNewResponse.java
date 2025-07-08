// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class CreateSmsTemplateNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSmsTemplateNewResponseBody body;

    public static CreateSmsTemplateNewResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSmsTemplateNewResponse self = new CreateSmsTemplateNewResponse();
        return TeaModel.build(map, self);
    }

    public CreateSmsTemplateNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSmsTemplateNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSmsTemplateNewResponse setBody(CreateSmsTemplateNewResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSmsTemplateNewResponseBody getBody() {
        return this.body;
    }

}
