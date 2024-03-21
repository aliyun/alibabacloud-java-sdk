// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainIspDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDcdnDomainIspDataResponseBody body;

    public static DescribeDcdnDomainIspDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainIspDataResponse self = new DescribeDcdnDomainIspDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainIspDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnDomainIspDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnDomainIspDataResponse setBody(DescribeDcdnDomainIspDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnDomainIspDataResponseBody getBody() {
        return this.body;
    }

}
