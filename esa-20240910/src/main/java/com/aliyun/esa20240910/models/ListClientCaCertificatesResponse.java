// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListClientCaCertificatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListClientCaCertificatesResponseBody body;

    public static ListClientCaCertificatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClientCaCertificatesResponse self = new ListClientCaCertificatesResponse();
        return TeaModel.build(map, self);
    }

    public ListClientCaCertificatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClientCaCertificatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListClientCaCertificatesResponse setBody(ListClientCaCertificatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClientCaCertificatesResponseBody getBody() {
        return this.body;
    }

}
