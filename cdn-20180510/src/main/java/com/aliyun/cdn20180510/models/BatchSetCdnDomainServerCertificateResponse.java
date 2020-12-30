// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class BatchSetCdnDomainServerCertificateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public BatchSetCdnDomainServerCertificateResponse setBody(BatchSetCdnDomainServerCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchSetCdnDomainServerCertificateResponseBody getBody() {
        return this.body;
    }

}
