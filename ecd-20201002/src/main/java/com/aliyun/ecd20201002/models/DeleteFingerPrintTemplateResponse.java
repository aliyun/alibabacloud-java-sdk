// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class DeleteFingerPrintTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DeleteFingerPrintTemplateResponse setBody(DeleteFingerPrintTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFingerPrintTemplateResponseBody getBody() {
        return this.body;
    }

}
