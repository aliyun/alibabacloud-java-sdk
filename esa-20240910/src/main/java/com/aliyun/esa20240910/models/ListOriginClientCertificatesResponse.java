// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListOriginClientCertificatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListOriginClientCertificatesResponseBody body;

    public static ListOriginClientCertificatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOriginClientCertificatesResponse self = new ListOriginClientCertificatesResponse();
        return TeaModel.build(map, self);
    }

    public ListOriginClientCertificatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOriginClientCertificatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListOriginClientCertificatesResponse setBody(ListOriginClientCertificatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOriginClientCertificatesResponseBody getBody() {
        return this.body;
    }

}
