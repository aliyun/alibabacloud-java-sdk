// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ImportCertificateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ImportCertificateResponse setBody(ImportCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportCertificateResponseBody getBody() {
        return this.body;
    }

}
