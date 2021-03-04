// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ListCertificatesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListCertificatesResponse setBody(ListCertificatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCertificatesResponseBody getBody() {
        return this.body;
    }

}
