// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainReqHitRateDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeDomainReqHitRateDataResponse setBody(DescribeDomainReqHitRateDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainReqHitRateDataResponseBody getBody() {
        return this.body;
    }

}
