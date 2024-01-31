// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class InvoiceModifyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InvoiceModifyResponseBody body;

    public static InvoiceModifyResponse build(java.util.Map<String, ?> map) throws Exception {
        InvoiceModifyResponse self = new InvoiceModifyResponse();
        return TeaModel.build(map, self);
    }

    public InvoiceModifyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InvoiceModifyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InvoiceModifyResponse setBody(InvoiceModifyResponseBody body) {
        this.body = body;
        return this;
    }
    public InvoiceModifyResponseBody getBody() {
        return this.body;
    }

}
