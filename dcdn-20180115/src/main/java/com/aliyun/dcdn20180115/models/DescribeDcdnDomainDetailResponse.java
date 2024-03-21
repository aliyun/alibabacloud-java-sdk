// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDcdnDomainDetailResponseBody body;

    public static DescribeDcdnDomainDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainDetailResponse self = new DescribeDcdnDomainDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnDomainDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnDomainDetailResponse setBody(DescribeDcdnDomainDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnDomainDetailResponseBody getBody() {
        return this.body;
    }

}
