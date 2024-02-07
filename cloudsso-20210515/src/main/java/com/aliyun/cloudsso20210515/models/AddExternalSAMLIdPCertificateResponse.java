// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class AddExternalSAMLIdPCertificateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddExternalSAMLIdPCertificateResponseBody body;

    public static AddExternalSAMLIdPCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        AddExternalSAMLIdPCertificateResponse self = new AddExternalSAMLIdPCertificateResponse();
        return TeaModel.build(map, self);
    }

    public AddExternalSAMLIdPCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddExternalSAMLIdPCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddExternalSAMLIdPCertificateResponse setBody(AddExternalSAMLIdPCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public AddExternalSAMLIdPCertificateResponseBody getBody() {
        return this.body;
    }

}
