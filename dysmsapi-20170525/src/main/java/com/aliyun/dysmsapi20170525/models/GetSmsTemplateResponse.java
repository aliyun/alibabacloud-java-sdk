// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class GetSmsTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSmsTemplateResponseBody body;

    public static GetSmsTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSmsTemplateResponse self = new GetSmsTemplateResponse();
        return TeaModel.build(map, self);
    }

    public GetSmsTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSmsTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSmsTemplateResponse setBody(GetSmsTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSmsTemplateResponseBody getBody() {
        return this.body;
    }

}
