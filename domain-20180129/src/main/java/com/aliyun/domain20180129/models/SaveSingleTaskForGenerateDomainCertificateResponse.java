// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForGenerateDomainCertificateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SaveSingleTaskForGenerateDomainCertificateResponseBody body;

    public static SaveSingleTaskForGenerateDomainCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveSingleTaskForGenerateDomainCertificateResponse self = new SaveSingleTaskForGenerateDomainCertificateResponse();
        return TeaModel.build(map, self);
    }

    public SaveSingleTaskForGenerateDomainCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveSingleTaskForGenerateDomainCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveSingleTaskForGenerateDomainCertificateResponse setBody(SaveSingleTaskForGenerateDomainCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveSingleTaskForGenerateDomainCertificateResponseBody getBody() {
        return this.body;
    }

}
