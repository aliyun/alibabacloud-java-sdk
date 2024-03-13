// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryInvoicingCustomerListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryInvoicingCustomerListResponseBody body;

    public static QueryInvoicingCustomerListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryInvoicingCustomerListResponse self = new QueryInvoicingCustomerListResponse();
        return TeaModel.build(map, self);
    }

    public QueryInvoicingCustomerListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryInvoicingCustomerListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryInvoicingCustomerListResponse setBody(QueryInvoicingCustomerListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryInvoicingCustomerListResponseBody getBody() {
        return this.body;
    }

}
