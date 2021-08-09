// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListListenerCertificatesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListListenerCertificatesResponse setBody(ListListenerCertificatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListListenerCertificatesResponseBody getBody() {
        return this.body;
    }

}
