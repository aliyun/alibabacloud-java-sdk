// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class UpdateSmsTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateSmsTemplateResponseBody body;

    public static UpdateSmsTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSmsTemplateResponse self = new UpdateSmsTemplateResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSmsTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSmsTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSmsTemplateResponse setBody(UpdateSmsTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSmsTemplateResponseBody getBody() {
        return this.body;
    }

}
