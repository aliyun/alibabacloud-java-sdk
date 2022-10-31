// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeDomainWithIntegrityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDomainWithIntegrityResponseBody body;

    public static DescribeDomainWithIntegrityResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainWithIntegrityResponse self = new DescribeDomainWithIntegrityResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainWithIntegrityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainWithIntegrityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainWithIntegrityResponse setBody(DescribeDomainWithIntegrityResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainWithIntegrityResponseBody getBody() {
        return this.body;
    }

}
