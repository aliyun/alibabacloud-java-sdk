// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class CreateCardSmsTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCardSmsTemplateResponseBody body;

    public static CreateCardSmsTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCardSmsTemplateResponse self = new CreateCardSmsTemplateResponse();
        return TeaModel.build(map, self);
    }

    public CreateCardSmsTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCardSmsTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCardSmsTemplateResponse setBody(CreateCardSmsTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCardSmsTemplateResponseBody getBody() {
        return this.body;
    }

}
