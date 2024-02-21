// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainHttpCodeDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDomainHttpCodeDataResponseBody body;

    public static DescribeDomainHttpCodeDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainHttpCodeDataResponse self = new DescribeDomainHttpCodeDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainHttpCodeDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainHttpCodeDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainHttpCodeDataResponse setBody(DescribeDomainHttpCodeDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainHttpCodeDataResponseBody getBody() {
        return this.body;
    }

}
