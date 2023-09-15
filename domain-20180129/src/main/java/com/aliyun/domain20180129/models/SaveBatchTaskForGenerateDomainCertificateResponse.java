// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveBatchTaskForGenerateDomainCertificateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SaveBatchTaskForGenerateDomainCertificateResponseBody body;

    public static SaveBatchTaskForGenerateDomainCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveBatchTaskForGenerateDomainCertificateResponse self = new SaveBatchTaskForGenerateDomainCertificateResponse();
        return TeaModel.build(map, self);
    }

    public SaveBatchTaskForGenerateDomainCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveBatchTaskForGenerateDomainCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveBatchTaskForGenerateDomainCertificateResponse setBody(SaveBatchTaskForGenerateDomainCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveBatchTaskForGenerateDomainCertificateResponseBody getBody() {
        return this.body;
    }

}
