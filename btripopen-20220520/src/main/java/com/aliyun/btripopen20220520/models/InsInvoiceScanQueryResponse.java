// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class InsInvoiceScanQueryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public InsInvoiceScanQueryResponseBody body;

    public static InsInvoiceScanQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        InsInvoiceScanQueryResponse self = new InsInvoiceScanQueryResponse();
        return TeaModel.build(map, self);
    }

    public InsInvoiceScanQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InsInvoiceScanQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InsInvoiceScanQueryResponse setBody(InsInvoiceScanQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public InsInvoiceScanQueryResponseBody getBody() {
        return this.body;
    }

}
