// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainReqHitRateDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDomainReqHitRateDataResponseBody body;

    public static DescribeDomainReqHitRateDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainReqHitRateDataResponse self = new DescribeDomainReqHitRateDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainReqHitRateDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainReqHitRateDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainReqHitRateDataResponse setBody(DescribeDomainReqHitRateDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainReqHitRateDataResponseBody getBody() {
        return this.body;
    }

}
