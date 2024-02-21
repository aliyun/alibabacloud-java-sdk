// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainSrcTrafficDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDomainSrcTrafficDataResponseBody body;

    public static DescribeDomainSrcTrafficDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainSrcTrafficDataResponse self = new DescribeDomainSrcTrafficDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainSrcTrafficDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainSrcTrafficDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainSrcTrafficDataResponse setBody(DescribeDomainSrcTrafficDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainSrcTrafficDataResponseBody getBody() {
        return this.body;
    }

}
