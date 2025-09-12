// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class ListPcaCaCertificateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPcaCaCertificateResponseBody body;

    public static ListPcaCaCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPcaCaCertificateResponse self = new ListPcaCaCertificateResponse();
        return TeaModel.build(map, self);
    }

    public ListPcaCaCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPcaCaCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPcaCaCertificateResponse setBody(ListPcaCaCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPcaCaCertificateResponseBody getBody() {
        return this.body;
    }

}
