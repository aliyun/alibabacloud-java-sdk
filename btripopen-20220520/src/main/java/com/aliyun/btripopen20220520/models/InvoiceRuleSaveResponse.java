// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class InvoiceRuleSaveResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InvoiceRuleSaveResponseBody body;

    public static InvoiceRuleSaveResponse build(java.util.Map<String, ?> map) throws Exception {
        InvoiceRuleSaveResponse self = new InvoiceRuleSaveResponse();
        return TeaModel.build(map, self);
    }

    public InvoiceRuleSaveResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InvoiceRuleSaveResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InvoiceRuleSaveResponse setBody(InvoiceRuleSaveResponseBody body) {
        this.body = body;
        return this;
    }
    public InvoiceRuleSaveResponseBody getBody() {
        return this.body;
    }

}
