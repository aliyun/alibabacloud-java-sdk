// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class ListInvoiceTitleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListInvoiceTitleResponseBody body;

    public static ListInvoiceTitleResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInvoiceTitleResponse self = new ListInvoiceTitleResponse();
        return TeaModel.build(map, self);
    }

    public ListInvoiceTitleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInvoiceTitleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListInvoiceTitleResponse setBody(ListInvoiceTitleResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInvoiceTitleResponseBody getBody() {
        return this.body;
    }

}
