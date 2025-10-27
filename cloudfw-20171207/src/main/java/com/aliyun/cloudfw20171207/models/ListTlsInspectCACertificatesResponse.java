// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ListTlsInspectCACertificatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTlsInspectCACertificatesResponseBody body;

    public static ListTlsInspectCACertificatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTlsInspectCACertificatesResponse self = new ListTlsInspectCACertificatesResponse();
        return TeaModel.build(map, self);
    }

    public ListTlsInspectCACertificatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTlsInspectCACertificatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTlsInspectCACertificatesResponse setBody(ListTlsInspectCACertificatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTlsInspectCACertificatesResponseBody getBody() {
        return this.body;
    }

}
