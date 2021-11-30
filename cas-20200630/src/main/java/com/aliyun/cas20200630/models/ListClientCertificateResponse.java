// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class ListClientCertificateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListClientCertificateResponse setBody(ListClientCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClientCertificateResponseBody getBody() {
        return this.body;
    }

}
