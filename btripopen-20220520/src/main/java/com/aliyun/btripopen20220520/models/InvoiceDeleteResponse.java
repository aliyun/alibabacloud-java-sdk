// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class InvoiceDeleteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InvoiceDeleteResponseBody body;

    public static InvoiceDeleteResponse build(java.util.Map<String, ?> map) throws Exception {
        InvoiceDeleteResponse self = new InvoiceDeleteResponse();
        return TeaModel.build(map, self);
    }

    public InvoiceDeleteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InvoiceDeleteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InvoiceDeleteResponse setBody(InvoiceDeleteResponseBody body) {
        this.body = body;
        return this;
    }
    public InvoiceDeleteResponseBody getBody() {
        return this.body;
    }

}
