// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class CancelSmsTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelSmsTemplateResponseBody body;

    public static CancelSmsTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelSmsTemplateResponse self = new CancelSmsTemplateResponse();
        return TeaModel.build(map, self);
    }

    public CancelSmsTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelSmsTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelSmsTemplateResponse setBody(CancelSmsTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelSmsTemplateResponseBody getBody() {
        return this.body;
    }

}
