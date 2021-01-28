// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainRealTimeSrcTrafficDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDcdnDomainRealTimeSrcTrafficDataResponseBody body;

    public static DescribeDcdnDomainRealTimeSrcTrafficDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainRealTimeSrcTrafficDataResponse self = new DescribeDcdnDomainRealTimeSrcTrafficDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainRealTimeSrcTrafficDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnDomainRealTimeSrcTrafficDataResponse setBody(DescribeDcdnDomainRealTimeSrcTrafficDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnDomainRealTimeSrcTrafficDataResponseBody getBody() {
        return this.body;
    }

}
