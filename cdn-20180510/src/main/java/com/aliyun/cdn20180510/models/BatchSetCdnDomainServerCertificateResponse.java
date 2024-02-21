// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class BatchSetCdnDomainServerCertificateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchSetCdnDomainServerCertificateResponseBody body;

    public static BatchSetCdnDomainServerCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchSetCdnDomainServerCertificateResponse self = new BatchSetCdnDomainServerCertificateResponse();
        return TeaModel.build(map, self);
    }

    public BatchSetCdnDomainServerCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchSetCdnDomainServerCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchSetCdnDomainServerCertificateResponse setBody(BatchSetCdnDomainServerCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchSetCdnDomainServerCertificateResponseBody getBody() {
        return this.body;
    }

}
