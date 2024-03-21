// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class SetFingerPrintTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetFingerPrintTemplateResponseBody body;

    public static SetFingerPrintTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        SetFingerPrintTemplateResponse self = new SetFingerPrintTemplateResponse();
        return TeaModel.build(map, self);
    }

    public SetFingerPrintTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetFingerPrintTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetFingerPrintTemplateResponse setBody(SetFingerPrintTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public SetFingerPrintTemplateResponseBody getBody() {
        return this.body;
    }

}
