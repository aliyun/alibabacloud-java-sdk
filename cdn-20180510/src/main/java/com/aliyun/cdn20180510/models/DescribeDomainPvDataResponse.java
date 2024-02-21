// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainPvDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDomainPvDataResponseBody body;

    public static DescribeDomainPvDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainPvDataResponse self = new DescribeDomainPvDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainPvDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainPvDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainPvDataResponse setBody(DescribeDomainPvDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainPvDataResponseBody getBody() {
        return this.body;
    }

}
