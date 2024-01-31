// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class VatInvoiceScanQueryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VatInvoiceScanQueryResponseBody body;

    public static VatInvoiceScanQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        VatInvoiceScanQueryResponse self = new VatInvoiceScanQueryResponse();
        return TeaModel.build(map, self);
    }

    public VatInvoiceScanQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VatInvoiceScanQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VatInvoiceScanQueryResponse setBody(VatInvoiceScanQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public VatInvoiceScanQueryResponseBody getBody() {
        return this.body;
    }

}
