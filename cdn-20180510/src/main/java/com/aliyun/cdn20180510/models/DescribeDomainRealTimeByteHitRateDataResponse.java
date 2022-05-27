// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainRealTimeByteHitRateDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDomainRealTimeByteHitRateDataResponseBody body;

    public static DescribeDomainRealTimeByteHitRateDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainRealTimeByteHitRateDataResponse self = new DescribeDomainRealTimeByteHitRateDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainRealTimeByteHitRateDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainRealTimeByteHitRateDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainRealTimeByteHitRateDataResponse setBody(DescribeDomainRealTimeByteHitRateDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainRealTimeByteHitRateDataResponseBody getBody() {
        return this.body;
    }

}
