// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class AddInvoiceEntityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddInvoiceEntityResponseBody body;

    public static AddInvoiceEntityResponse build(java.util.Map<String, ?> map) throws Exception {
        AddInvoiceEntityResponse self = new AddInvoiceEntityResponse();
        return TeaModel.build(map, self);
    }

    public AddInvoiceEntityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddInvoiceEntityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddInvoiceEntityResponse setBody(AddInvoiceEntityResponseBody body) {
        this.body = body;
        return this;
    }
    public AddInvoiceEntityResponseBody getBody() {
        return this.body;
    }

}
