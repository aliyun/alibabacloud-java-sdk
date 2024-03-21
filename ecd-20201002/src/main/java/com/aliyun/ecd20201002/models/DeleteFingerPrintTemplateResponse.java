// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class DeleteFingerPrintTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteFingerPrintTemplateResponseBody body;

    public static DeleteFingerPrintTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFingerPrintTemplateResponse self = new DeleteFingerPrintTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFingerPrintTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteFingerPrintTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteFingerPrintTemplateResponse setBody(DeleteFingerPrintTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFingerPrintTemplateResponseBody getBody() {
        return this.body;
    }

}
