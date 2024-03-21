// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainHttpCodeDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDcdnDomainHttpCodeDataResponseBody body;

    public static DescribeDcdnDomainHttpCodeDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainHttpCodeDataResponse self = new DescribeDcdnDomainHttpCodeDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainHttpCodeDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnDomainHttpCodeDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnDomainHttpCodeDataResponse setBody(DescribeDcdnDomainHttpCodeDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnDomainHttpCodeDataResponseBody getBody() {
        return this.body;
    }

}
