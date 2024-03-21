// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainPvDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDcdnDomainPvDataResponseBody body;

    public static DescribeDcdnDomainPvDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainPvDataResponse self = new DescribeDcdnDomainPvDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainPvDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnDomainPvDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnDomainPvDataResponse setBody(DescribeDcdnDomainPvDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnDomainPvDataResponseBody getBody() {
        return this.body;
    }

}
