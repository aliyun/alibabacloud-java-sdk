// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainRealTimeSrcBpsDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDcdnDomainRealTimeSrcBpsDataResponseBody body;

    public static DescribeDcdnDomainRealTimeSrcBpsDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainRealTimeSrcBpsDataResponse self = new DescribeDcdnDomainRealTimeSrcBpsDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainRealTimeSrcBpsDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnDomainRealTimeSrcBpsDataResponse setBody(DescribeDcdnDomainRealTimeSrcBpsDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnDomainRealTimeSrcBpsDataResponseBody getBody() {
        return this.body;
    }

}
