// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainUvDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDcdnDomainUvDataResponseBody body;

    public static DescribeDcdnDomainUvDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainUvDataResponse self = new DescribeDcdnDomainUvDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainUvDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnDomainUvDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnDomainUvDataResponse setBody(DescribeDcdnDomainUvDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnDomainUvDataResponseBody getBody() {
        return this.body;
    }

}
