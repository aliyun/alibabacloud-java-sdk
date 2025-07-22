// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class ListInvoiceCandidateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListInvoiceCandidateResponseBody body;

    public static ListInvoiceCandidateResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInvoiceCandidateResponse self = new ListInvoiceCandidateResponse();
        return TeaModel.build(map, self);
    }

    public ListInvoiceCandidateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInvoiceCandidateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListInvoiceCandidateResponse setBody(ListInvoiceCandidateResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInvoiceCandidateResponseBody getBody() {
        return this.body;
    }

}
