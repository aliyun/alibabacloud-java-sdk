// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ListCertResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListCertResponseBody body;

    public static ListCertResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCertResponse self = new ListCertResponse();
        return TeaModel.build(map, self);
    }

    public ListCertResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCertResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCertResponse setBody(ListCertResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCertResponseBody getBody() {
        return this.body;
    }

}
