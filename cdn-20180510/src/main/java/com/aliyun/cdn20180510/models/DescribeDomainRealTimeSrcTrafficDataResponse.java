// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainRealTimeSrcTrafficDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDomainRealTimeSrcTrafficDataResponseBody body;

    public static DescribeDomainRealTimeSrcTrafficDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainRealTimeSrcTrafficDataResponse self = new DescribeDomainRealTimeSrcTrafficDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainRealTimeSrcTrafficDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainRealTimeSrcTrafficDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainRealTimeSrcTrafficDataResponse setBody(DescribeDomainRealTimeSrcTrafficDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainRealTimeSrcTrafficDataResponseBody getBody() {
        return this.body;
    }

}
