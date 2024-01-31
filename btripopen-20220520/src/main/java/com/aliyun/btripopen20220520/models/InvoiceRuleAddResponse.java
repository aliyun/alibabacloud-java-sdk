// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class InvoiceRuleAddResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InvoiceRuleAddResponseBody body;

    public static InvoiceRuleAddResponse build(java.util.Map<String, ?> map) throws Exception {
        InvoiceRuleAddResponse self = new InvoiceRuleAddResponse();
        return TeaModel.build(map, self);
    }

    public InvoiceRuleAddResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InvoiceRuleAddResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InvoiceRuleAddResponse setBody(InvoiceRuleAddResponseBody body) {
        this.body = body;
        return this;
    }
    public InvoiceRuleAddResponseBody getBody() {
        return this.body;
    }

}
