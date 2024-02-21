// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainRealTimeReqHitRateDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDomainRealTimeReqHitRateDataResponseBody body;

    public static DescribeDomainRealTimeReqHitRateDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainRealTimeReqHitRateDataResponse self = new DescribeDomainRealTimeReqHitRateDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainRealTimeReqHitRateDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainRealTimeReqHitRateDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainRealTimeReqHitRateDataResponse setBody(DescribeDomainRealTimeReqHitRateDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainRealTimeReqHitRateDataResponseBody getBody() {
        return this.body;
    }

}
