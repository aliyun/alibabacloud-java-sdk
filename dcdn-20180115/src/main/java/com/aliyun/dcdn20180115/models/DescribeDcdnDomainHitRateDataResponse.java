// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainHitRateDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDcdnDomainHitRateDataResponseBody body;

    public static DescribeDcdnDomainHitRateDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainHitRateDataResponse self = new DescribeDcdnDomainHitRateDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainHitRateDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnDomainHitRateDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnDomainHitRateDataResponse setBody(DescribeDcdnDomainHitRateDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnDomainHitRateDataResponseBody getBody() {
        return this.body;
    }

}
