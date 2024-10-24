// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDomainBpsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDomainBpsResponseBody body;

    public static DescribeDomainBpsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainBpsResponse self = new DescribeDomainBpsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainBpsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainBpsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainBpsResponse setBody(DescribeDomainBpsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainBpsResponseBody getBody() {
        return this.body;
    }

}
