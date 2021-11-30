// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class ListRevokeCertificateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListRevokeCertificateResponseBody body;

    public static ListRevokeCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRevokeCertificateResponse self = new ListRevokeCertificateResponse();
        return TeaModel.build(map, self);
    }

    public ListRevokeCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRevokeCertificateResponse setBody(ListRevokeCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRevokeCertificateResponseBody getBody() {
        return this.body;
    }

}
