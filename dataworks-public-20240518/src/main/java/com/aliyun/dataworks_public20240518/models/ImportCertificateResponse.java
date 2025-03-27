// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ImportCertificateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ImportCertificateResponseBody body;

    public static ImportCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportCertificateResponse self = new ImportCertificateResponse();
        return TeaModel.build(map, self);
    }

    public ImportCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImportCertificateResponse setBody(ImportCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportCertificateResponseBody getBody() {
        return this.body;
    }

}
