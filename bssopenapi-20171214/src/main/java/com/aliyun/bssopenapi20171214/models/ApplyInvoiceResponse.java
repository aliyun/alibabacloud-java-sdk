// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class ApplyInvoiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ApplyInvoiceResponseBody body;

    public static ApplyInvoiceResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyInvoiceResponse self = new ApplyInvoiceResponse();
        return TeaModel.build(map, self);
    }

    public ApplyInvoiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyInvoiceResponse setBody(ApplyInvoiceResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyInvoiceResponseBody getBody() {
        return this.body;
    }

}
