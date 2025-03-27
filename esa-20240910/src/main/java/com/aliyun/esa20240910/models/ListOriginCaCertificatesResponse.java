// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListOriginCaCertificatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListOriginCaCertificatesResponseBody body;

    public static ListOriginCaCertificatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOriginCaCertificatesResponse self = new ListOriginCaCertificatesResponse();
        return TeaModel.build(map, self);
    }

    public ListOriginCaCertificatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOriginCaCertificatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListOriginCaCertificatesResponse setBody(ListOriginCaCertificatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOriginCaCertificatesResponseBody getBody() {
        return this.body;
    }

}
