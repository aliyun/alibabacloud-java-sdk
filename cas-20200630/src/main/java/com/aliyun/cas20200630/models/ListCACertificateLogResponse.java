// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class ListCACertificateLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCACertificateLogResponseBody body;

    public static ListCACertificateLogResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCACertificateLogResponse self = new ListCACertificateLogResponse();
        return TeaModel.build(map, self);
    }

    public ListCACertificateLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCACertificateLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCACertificateLogResponse setBody(ListCACertificateLogResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCACertificateLogResponseBody getBody() {
        return this.body;
    }

}
