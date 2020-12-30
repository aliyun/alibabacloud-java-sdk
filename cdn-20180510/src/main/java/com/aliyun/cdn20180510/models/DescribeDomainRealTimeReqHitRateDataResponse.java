// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainRealTimeReqHitRateDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeDomainRealTimeReqHitRateDataResponse setBody(DescribeDomainRealTimeReqHitRateDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainRealTimeReqHitRateDataResponseBody getBody() {
        return this.body;
    }

}
