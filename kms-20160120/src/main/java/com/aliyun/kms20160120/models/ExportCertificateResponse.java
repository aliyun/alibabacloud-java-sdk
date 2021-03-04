// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ExportCertificateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExportCertificateResponseBody body;

    public static ExportCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportCertificateResponse self = new ExportCertificateResponse();
        return TeaModel.build(map, self);
    }

    public ExportCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportCertificateResponse setBody(ExportCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportCertificateResponseBody getBody() {
        return this.body;
    }

}
