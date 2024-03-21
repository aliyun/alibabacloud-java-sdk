// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnHttpsDomainListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDcdnHttpsDomainListResponseBody body;

    public static DescribeDcdnHttpsDomainListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnHttpsDomainListResponse self = new DescribeDcdnHttpsDomainListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnHttpsDomainListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnHttpsDomainListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnHttpsDomainListResponse setBody(DescribeDcdnHttpsDomainListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnHttpsDomainListResponseBody getBody() {
        return this.body;
    }

}
