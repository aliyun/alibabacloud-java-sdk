// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnIpaDomainDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDcdnIpaDomainDetailResponseBody body;

    public static DescribeDcdnIpaDomainDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnIpaDomainDetailResponse self = new DescribeDcdnIpaDomainDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnIpaDomainDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnIpaDomainDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnIpaDomainDetailResponse setBody(DescribeDcdnIpaDomainDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnIpaDomainDetailResponseBody getBody() {
        return this.body;
    }

}
