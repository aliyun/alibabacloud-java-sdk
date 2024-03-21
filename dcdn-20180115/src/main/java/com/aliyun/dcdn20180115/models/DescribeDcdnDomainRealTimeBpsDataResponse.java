// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainRealTimeBpsDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDcdnDomainRealTimeBpsDataResponseBody body;

    public static DescribeDcdnDomainRealTimeBpsDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainRealTimeBpsDataResponse self = new DescribeDcdnDomainRealTimeBpsDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainRealTimeBpsDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnDomainRealTimeBpsDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnDomainRealTimeBpsDataResponse setBody(DescribeDcdnDomainRealTimeBpsDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnDomainRealTimeBpsDataResponseBody getBody() {
        return this.body;
    }

}
