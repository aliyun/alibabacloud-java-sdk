// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainTrafficDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDcdnDomainTrafficDataResponseBody body;

    public static DescribeDcdnDomainTrafficDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainTrafficDataResponse self = new DescribeDcdnDomainTrafficDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainTrafficDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnDomainTrafficDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnDomainTrafficDataResponse setBody(DescribeDcdnDomainTrafficDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnDomainTrafficDataResponseBody getBody() {
        return this.body;
    }

}
