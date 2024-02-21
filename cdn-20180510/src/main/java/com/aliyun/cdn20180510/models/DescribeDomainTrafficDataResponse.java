// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainTrafficDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDomainTrafficDataResponseBody body;

    public static DescribeDomainTrafficDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainTrafficDataResponse self = new DescribeDomainTrafficDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainTrafficDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainTrafficDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainTrafficDataResponse setBody(DescribeDomainTrafficDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainTrafficDataResponseBody getBody() {
        return this.body;
    }

}
