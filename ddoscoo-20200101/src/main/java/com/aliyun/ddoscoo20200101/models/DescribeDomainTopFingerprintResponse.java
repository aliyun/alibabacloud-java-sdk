// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDomainTopFingerprintResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDomainTopFingerprintResponseBody body;

    public static DescribeDomainTopFingerprintResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainTopFingerprintResponse self = new DescribeDomainTopFingerprintResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainTopFingerprintResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainTopFingerprintResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainTopFingerprintResponse setBody(DescribeDomainTopFingerprintResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainTopFingerprintResponseBody getBody() {
        return this.body;
    }

}
