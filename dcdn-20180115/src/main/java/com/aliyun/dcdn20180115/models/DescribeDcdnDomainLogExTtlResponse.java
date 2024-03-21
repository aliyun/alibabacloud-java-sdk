// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainLogExTtlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDcdnDomainLogExTtlResponseBody body;

    public static DescribeDcdnDomainLogExTtlResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainLogExTtlResponse self = new DescribeDcdnDomainLogExTtlResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainLogExTtlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnDomainLogExTtlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnDomainLogExTtlResponse setBody(DescribeDcdnDomainLogExTtlResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnDomainLogExTtlResponseBody getBody() {
        return this.body;
    }

}
