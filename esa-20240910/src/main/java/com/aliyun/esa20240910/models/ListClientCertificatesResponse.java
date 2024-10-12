// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListClientCertificatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListClientCertificatesResponseBody body;

    public static ListClientCertificatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClientCertificatesResponse self = new ListClientCertificatesResponse();
        return TeaModel.build(map, self);
    }

    public ListClientCertificatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClientCertificatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListClientCertificatesResponse setBody(ListClientCertificatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClientCertificatesResponseBody getBody() {
        return this.body;
    }

}
