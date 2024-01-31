// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class InvoiceRuleDeleteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InvoiceRuleDeleteResponseBody body;

    public static InvoiceRuleDeleteResponse build(java.util.Map<String, ?> map) throws Exception {
        InvoiceRuleDeleteResponse self = new InvoiceRuleDeleteResponse();
        return TeaModel.build(map, self);
    }

    public InvoiceRuleDeleteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InvoiceRuleDeleteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InvoiceRuleDeleteResponse setBody(InvoiceRuleDeleteResponseBody body) {
        this.body = body;
        return this;
    }
    public InvoiceRuleDeleteResponseBody getBody() {
        return this.body;
    }

}
