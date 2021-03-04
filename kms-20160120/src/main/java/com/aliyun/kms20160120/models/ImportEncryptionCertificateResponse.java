// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ImportEncryptionCertificateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ImportEncryptionCertificateResponseBody body;

    public static ImportEncryptionCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportEncryptionCertificateResponse self = new ImportEncryptionCertificateResponse();
        return TeaModel.build(map, self);
    }

    public ImportEncryptionCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportEncryptionCertificateResponse setBody(ImportEncryptionCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportEncryptionCertificateResponseBody getBody() {
        return this.body;
    }

}
