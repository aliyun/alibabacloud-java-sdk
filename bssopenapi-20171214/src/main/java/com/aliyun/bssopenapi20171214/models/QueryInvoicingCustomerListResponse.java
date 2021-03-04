// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryInvoicingCustomerListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public QueryInvoicingCustomerListResponse setBody(QueryInvoicingCustomerListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryInvoicingCustomerListResponseBody getBody() {
        return this.body;
    }

}
