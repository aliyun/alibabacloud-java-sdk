// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainBpsDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDcdnDomainBpsDataResponseBody body;

    public static DescribeDcdnDomainBpsDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainBpsDataResponse self = new DescribeDcdnDomainBpsDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainBpsDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnDomainBpsDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnDomainBpsDataResponse setBody(DescribeDcdnDomainBpsDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnDomainBpsDataResponseBody getBody() {
        return this.body;
    }

}
