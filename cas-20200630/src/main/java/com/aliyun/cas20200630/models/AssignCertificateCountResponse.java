// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class AssignCertificateCountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AssignCertificateCountResponseBody body;

    public static AssignCertificateCountResponse build(java.util.Map<String, ?> map) throws Exception {
        AssignCertificateCountResponse self = new AssignCertificateCountResponse();
        return TeaModel.build(map, self);
    }

    public AssignCertificateCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssignCertificateCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AssignCertificateCountResponse setBody(AssignCertificateCountResponseBody body) {
        this.body = body;
        return this;
    }
    public AssignCertificateCountResponseBody getBody() {
        return this.body;
    }

}
