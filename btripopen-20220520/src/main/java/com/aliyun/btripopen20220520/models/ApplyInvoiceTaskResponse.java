// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ApplyInvoiceTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ApplyInvoiceTaskResponseBody body;

    public static ApplyInvoiceTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyInvoiceTaskResponse self = new ApplyInvoiceTaskResponse();
        return TeaModel.build(map, self);
    }

    public ApplyInvoiceTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyInvoiceTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ApplyInvoiceTaskResponse setBody(ApplyInvoiceTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyInvoiceTaskResponseBody getBody() {
        return this.body;
    }

}
