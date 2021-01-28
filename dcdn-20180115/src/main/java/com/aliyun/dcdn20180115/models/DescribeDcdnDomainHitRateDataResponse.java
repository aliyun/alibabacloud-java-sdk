// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainHitRateDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeDcdnDomainHitRateDataResponse setBody(DescribeDcdnDomainHitRateDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnDomainHitRateDataResponseBody getBody() {
        return this.body;
    }

}
