// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListCertificatesByRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCertificatesByRecordResponseBody body;

    public static ListCertificatesByRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCertificatesByRecordResponse self = new ListCertificatesByRecordResponse();
        return TeaModel.build(map, self);
    }

    public ListCertificatesByRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCertificatesByRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCertificatesByRecordResponse setBody(ListCertificatesByRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCertificatesByRecordResponseBody getBody() {
        return this.body;
    }

}
