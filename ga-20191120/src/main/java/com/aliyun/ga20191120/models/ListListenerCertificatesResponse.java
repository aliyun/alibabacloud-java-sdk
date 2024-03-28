// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListListenerCertificatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListListenerCertificatesResponseBody body;

    public static ListListenerCertificatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListListenerCertificatesResponse self = new ListListenerCertificatesResponse();
        return TeaModel.build(map, self);
    }

    public ListListenerCertificatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListListenerCertificatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListListenerCertificatesResponse setBody(ListListenerCertificatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListListenerCertificatesResponseBody getBody() {
        return this.body;
    }

}
