// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class InvoiceAddResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InvoiceAddResponseBody body;

    public static InvoiceAddResponse build(java.util.Map<String, ?> map) throws Exception {
        InvoiceAddResponse self = new InvoiceAddResponse();
        return TeaModel.build(map, self);
    }

    public InvoiceAddResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InvoiceAddResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InvoiceAddResponse setBody(InvoiceAddResponseBody body) {
        this.body = body;
        return this;
    }
    public InvoiceAddResponseBody getBody() {
        return this.body;
    }

}
