// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class QueryEffectiveInvoiceListByBillNosResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryEffectiveInvoiceListByBillNosResponseBody body;

    public static QueryEffectiveInvoiceListByBillNosResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEffectiveInvoiceListByBillNosResponse self = new QueryEffectiveInvoiceListByBillNosResponse();
        return TeaModel.build(map, self);
    }

    public QueryEffectiveInvoiceListByBillNosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryEffectiveInvoiceListByBillNosResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryEffectiveInvoiceListByBillNosResponse setBody(QueryEffectiveInvoiceListByBillNosResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryEffectiveInvoiceListByBillNosResponseBody getBody() {
        return this.body;
    }

}
