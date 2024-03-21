// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainRealTimeSrcHttpCodeDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDcdnDomainRealTimeSrcHttpCodeDataResponseBody body;

    public static DescribeDcdnDomainRealTimeSrcHttpCodeDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainRealTimeSrcHttpCodeDataResponse self = new DescribeDcdnDomainRealTimeSrcHttpCodeDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainRealTimeSrcHttpCodeDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnDomainRealTimeSrcHttpCodeDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnDomainRealTimeSrcHttpCodeDataResponse setBody(DescribeDcdnDomainRealTimeSrcHttpCodeDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnDomainRealTimeSrcHttpCodeDataResponseBody getBody() {
        return this.body;
    }

}
