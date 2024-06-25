// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class AddSmsTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddSmsTemplateResponseBody body;

    public static AddSmsTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        AddSmsTemplateResponse self = new AddSmsTemplateResponse();
        return TeaModel.build(map, self);
    }

    public AddSmsTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddSmsTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddSmsTemplateResponse setBody(AddSmsTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public AddSmsTemplateResponseBody getBody() {
        return this.body;
    }

}
