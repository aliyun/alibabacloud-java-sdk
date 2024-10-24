// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDomainH2FingerprintResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDomainH2FingerprintResponseBody body;

    public static DescribeDomainH2FingerprintResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainH2FingerprintResponse self = new DescribeDomainH2FingerprintResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainH2FingerprintResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainH2FingerprintResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainH2FingerprintResponse setBody(DescribeDomainH2FingerprintResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainH2FingerprintResponseBody getBody() {
        return this.body;
    }

}
