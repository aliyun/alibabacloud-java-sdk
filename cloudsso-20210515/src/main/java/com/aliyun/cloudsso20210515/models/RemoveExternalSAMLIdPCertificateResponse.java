// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class RemoveExternalSAMLIdPCertificateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveExternalSAMLIdPCertificateResponseBody body;

    public static RemoveExternalSAMLIdPCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveExternalSAMLIdPCertificateResponse self = new RemoveExternalSAMLIdPCertificateResponse();
        return TeaModel.build(map, self);
    }

    public RemoveExternalSAMLIdPCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveExternalSAMLIdPCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveExternalSAMLIdPCertificateResponse setBody(RemoveExternalSAMLIdPCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveExternalSAMLIdPCertificateResponseBody getBody() {
        return this.body;
    }

}
