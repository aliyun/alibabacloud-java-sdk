// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainOriginTrafficDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDcdnDomainOriginTrafficDataResponseBody body;

    public static DescribeDcdnDomainOriginTrafficDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainOriginTrafficDataResponse self = new DescribeDcdnDomainOriginTrafficDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainOriginTrafficDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnDomainOriginTrafficDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnDomainOriginTrafficDataResponse setBody(DescribeDcdnDomainOriginTrafficDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnDomainOriginTrafficDataResponseBody getBody() {
        return this.body;
    }

}
