// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class ListClientCertificateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListClientCertificateResponseBody body;

    public static ListClientCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClientCertificateResponse self = new ListClientCertificateResponse();
        return TeaModel.build(map, self);
    }

    public ListClientCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClientCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListClientCertificateResponse setBody(ListClientCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClientCertificateResponseBody getBody() {
        return this.body;
    }

}
