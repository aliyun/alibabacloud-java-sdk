// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class ApplyInvoiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ApplyInvoiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ApplyInvoiceResponse setBody(ApplyInvoiceResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyInvoiceResponseBody getBody() {
        return this.body;
    }

}
