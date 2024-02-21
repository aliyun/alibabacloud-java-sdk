// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainRealTimeQpsDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDomainRealTimeQpsDataResponseBody body;

    public static DescribeDomainRealTimeQpsDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainRealTimeQpsDataResponse self = new DescribeDomainRealTimeQpsDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainRealTimeQpsDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainRealTimeQpsDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainRealTimeQpsDataResponse setBody(DescribeDomainRealTimeQpsDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainRealTimeQpsDataResponseBody getBody() {
        return this.body;
    }

}
