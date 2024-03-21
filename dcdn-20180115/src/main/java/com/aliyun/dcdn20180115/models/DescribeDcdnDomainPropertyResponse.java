// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainPropertyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDcdnDomainPropertyResponseBody body;

    public static DescribeDcdnDomainPropertyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainPropertyResponse self = new DescribeDcdnDomainPropertyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainPropertyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnDomainPropertyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnDomainPropertyResponse setBody(DescribeDcdnDomainPropertyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnDomainPropertyResponseBody getBody() {
        return this.body;
    }

}
