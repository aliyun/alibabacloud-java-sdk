// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class CreateInvoiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateInvoiceResponseBody body;

    public static CreateInvoiceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateInvoiceResponse self = new CreateInvoiceResponse();
        return TeaModel.build(map, self);
    }

    public CreateInvoiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateInvoiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateInvoiceResponse setBody(CreateInvoiceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateInvoiceResponseBody getBody() {
        return this.body;
    }

}
