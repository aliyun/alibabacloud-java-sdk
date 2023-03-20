// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class DeleteInvoiceEntityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteInvoiceEntityResponseBody body;

    public static DeleteInvoiceEntityResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteInvoiceEntityResponse self = new DeleteInvoiceEntityResponse();
        return TeaModel.build(map, self);
    }

    public DeleteInvoiceEntityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteInvoiceEntityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteInvoiceEntityResponse setBody(DeleteInvoiceEntityResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteInvoiceEntityResponseBody getBody() {
        return this.body;
    }

}
