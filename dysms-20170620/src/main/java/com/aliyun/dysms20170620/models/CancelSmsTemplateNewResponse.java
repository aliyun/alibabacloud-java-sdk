// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class CancelSmsTemplateNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelSmsTemplateNewResponseBody body;

    public static CancelSmsTemplateNewResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelSmsTemplateNewResponse self = new CancelSmsTemplateNewResponse();
        return TeaModel.build(map, self);
    }

    public CancelSmsTemplateNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelSmsTemplateNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelSmsTemplateNewResponse setBody(CancelSmsTemplateNewResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelSmsTemplateNewResponseBody getBody() {
        return this.body;
    }

}
