// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainRealTimeSrcHttpCodeDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDomainRealTimeSrcHttpCodeDataResponseBody body;

    public static DescribeDomainRealTimeSrcHttpCodeDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainRealTimeSrcHttpCodeDataResponse self = new DescribeDomainRealTimeSrcHttpCodeDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainRealTimeSrcHttpCodeDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainRealTimeSrcHttpCodeDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainRealTimeSrcHttpCodeDataResponse setBody(DescribeDomainRealTimeSrcHttpCodeDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainRealTimeSrcHttpCodeDataResponseBody getBody() {
        return this.body;
    }

}
