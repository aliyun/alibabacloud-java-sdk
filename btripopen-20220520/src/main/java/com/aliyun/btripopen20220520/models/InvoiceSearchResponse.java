// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class InvoiceSearchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InvoiceSearchResponseBody body;

    public static InvoiceSearchResponse build(java.util.Map<String, ?> map) throws Exception {
        InvoiceSearchResponse self = new InvoiceSearchResponse();
        return TeaModel.build(map, self);
    }

    public InvoiceSearchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InvoiceSearchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InvoiceSearchResponse setBody(InvoiceSearchResponseBody body) {
        this.body = body;
        return this;
    }
    public InvoiceSearchResponseBody getBody() {
        return this.body;
    }

}
