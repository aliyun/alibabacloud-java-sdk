// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class SetFingerPrintTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public SetFingerPrintTemplateResponse setBody(SetFingerPrintTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public SetFingerPrintTemplateResponseBody getBody() {
        return this.body;
    }

}
