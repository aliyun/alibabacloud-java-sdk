// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainRealTimeSrcBpsDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDomainRealTimeSrcBpsDataResponseBody body;

    public static DescribeDomainRealTimeSrcBpsDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainRealTimeSrcBpsDataResponse self = new DescribeDomainRealTimeSrcBpsDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainRealTimeSrcBpsDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainRealTimeSrcBpsDataResponse setBody(DescribeDomainRealTimeSrcBpsDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainRealTimeSrcBpsDataResponseBody getBody() {
        return this.body;
    }

}
