// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class BatchSetDcdnDomainCertificateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchSetDcdnDomainCertificateResponseBody body;

    public static BatchSetDcdnDomainCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchSetDcdnDomainCertificateResponse self = new BatchSetDcdnDomainCertificateResponse();
        return TeaModel.build(map, self);
    }

    public BatchSetDcdnDomainCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchSetDcdnDomainCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchSetDcdnDomainCertificateResponse setBody(BatchSetDcdnDomainCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchSetDcdnDomainCertificateResponseBody getBody() {
        return this.body;
    }

}
