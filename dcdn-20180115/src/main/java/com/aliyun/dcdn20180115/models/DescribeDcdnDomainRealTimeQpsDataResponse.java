// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainRealTimeQpsDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDcdnDomainRealTimeQpsDataResponseBody body;

    public static DescribeDcdnDomainRealTimeQpsDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainRealTimeQpsDataResponse self = new DescribeDcdnDomainRealTimeQpsDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainRealTimeQpsDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnDomainRealTimeQpsDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnDomainRealTimeQpsDataResponse setBody(DescribeDcdnDomainRealTimeQpsDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnDomainRealTimeQpsDataResponseBody getBody() {
        return this.body;
    }

}
