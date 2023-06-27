// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20180501.models;

import com.aliyun.tea.*;

public class SendMessageWithTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SendMessageWithTemplateResponseBody body;

    public static SendMessageWithTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        SendMessageWithTemplateResponse self = new SendMessageWithTemplateResponse();
        return TeaModel.build(map, self);
    }

    public SendMessageWithTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendMessageWithTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendMessageWithTemplateResponse setBody(SendMessageWithTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public SendMessageWithTemplateResponseBody getBody() {
        return this.body;
    }

}
