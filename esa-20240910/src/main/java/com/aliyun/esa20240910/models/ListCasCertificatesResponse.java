// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListCasCertificatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCasCertificatesResponseBody body;

    public static ListCasCertificatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCasCertificatesResponse self = new ListCasCertificatesResponse();
        return TeaModel.build(map, self);
    }

    public ListCasCertificatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCasCertificatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCasCertificatesResponse setBody(ListCasCertificatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCasCertificatesResponseBody getBody() {
        return this.body;
    }

}
