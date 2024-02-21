// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainSrcHttpCodeDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDomainSrcHttpCodeDataResponseBody body;

    public static DescribeDomainSrcHttpCodeDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainSrcHttpCodeDataResponse self = new DescribeDomainSrcHttpCodeDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainSrcHttpCodeDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainSrcHttpCodeDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainSrcHttpCodeDataResponse setBody(DescribeDomainSrcHttpCodeDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainSrcHttpCodeDataResponseBody getBody() {
        return this.body;
    }

}
