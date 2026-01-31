// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ListCertificatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCertificatesResponseBody body;

    public static ListCertificatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCertificatesResponse self = new ListCertificatesResponse();
        return TeaModel.build(map, self);
    }

    public ListCertificatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCertificatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCertificatesResponse setBody(ListCertificatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCertificatesResponseBody getBody() {
        return this.body;
    }

}
