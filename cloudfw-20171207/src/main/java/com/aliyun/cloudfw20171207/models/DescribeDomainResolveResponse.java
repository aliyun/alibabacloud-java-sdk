// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeDomainResolveResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDomainResolveResponseBody body;

    public static DescribeDomainResolveResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainResolveResponse self = new DescribeDomainResolveResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainResolveResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainResolveResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainResolveResponse setBody(DescribeDomainResolveResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainResolveResponseBody getBody() {
        return this.body;
    }

}
