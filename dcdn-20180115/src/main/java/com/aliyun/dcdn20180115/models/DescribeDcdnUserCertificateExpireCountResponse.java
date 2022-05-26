// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnUserCertificateExpireCountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDcdnUserCertificateExpireCountResponseBody body;

    public static DescribeDcdnUserCertificateExpireCountResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnUserCertificateExpireCountResponse self = new DescribeDcdnUserCertificateExpireCountResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnUserCertificateExpireCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnUserCertificateExpireCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnUserCertificateExpireCountResponse setBody(DescribeDcdnUserCertificateExpireCountResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnUserCertificateExpireCountResponseBody getBody() {
        return this.body;
    }

}
