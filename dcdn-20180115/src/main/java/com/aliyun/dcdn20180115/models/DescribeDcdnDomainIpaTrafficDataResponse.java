// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainIpaTrafficDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDcdnDomainIpaTrafficDataResponseBody body;

    public static DescribeDcdnDomainIpaTrafficDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainIpaTrafficDataResponse self = new DescribeDcdnDomainIpaTrafficDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainIpaTrafficDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnDomainIpaTrafficDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnDomainIpaTrafficDataResponse setBody(DescribeDcdnDomainIpaTrafficDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnDomainIpaTrafficDataResponseBody getBody() {
        return this.body;
    }

}
