// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainRealTimeHttpCodeDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDomainRealTimeHttpCodeDataResponseBody body;

    public static DescribeDomainRealTimeHttpCodeDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainRealTimeHttpCodeDataResponse self = new DescribeDomainRealTimeHttpCodeDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainRealTimeHttpCodeDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainRealTimeHttpCodeDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainRealTimeHttpCodeDataResponse setBody(DescribeDomainRealTimeHttpCodeDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainRealTimeHttpCodeDataResponseBody getBody() {
        return this.body;
    }

}
