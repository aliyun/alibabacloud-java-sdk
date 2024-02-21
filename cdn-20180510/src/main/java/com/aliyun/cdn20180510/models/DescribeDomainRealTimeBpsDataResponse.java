// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainRealTimeBpsDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDomainRealTimeBpsDataResponseBody body;

    public static DescribeDomainRealTimeBpsDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainRealTimeBpsDataResponse self = new DescribeDomainRealTimeBpsDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainRealTimeBpsDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainRealTimeBpsDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainRealTimeBpsDataResponse setBody(DescribeDomainRealTimeBpsDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainRealTimeBpsDataResponseBody getBody() {
        return this.body;
    }

}
