// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainHitRateDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDomainHitRateDataResponseBody body;

    public static DescribeDomainHitRateDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainHitRateDataResponse self = new DescribeDomainHitRateDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainHitRateDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainHitRateDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainHitRateDataResponse setBody(DescribeDomainHitRateDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainHitRateDataResponseBody getBody() {
        return this.body;
    }

}
