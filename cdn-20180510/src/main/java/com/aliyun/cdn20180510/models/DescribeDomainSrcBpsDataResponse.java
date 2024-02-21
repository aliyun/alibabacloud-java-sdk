// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainSrcBpsDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDomainSrcBpsDataResponseBody body;

    public static DescribeDomainSrcBpsDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainSrcBpsDataResponse self = new DescribeDomainSrcBpsDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainSrcBpsDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainSrcBpsDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainSrcBpsDataResponse setBody(DescribeDomainSrcBpsDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainSrcBpsDataResponseBody getBody() {
        return this.body;
    }

}
