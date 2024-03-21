// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnIpaDomainCidrResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDcdnIpaDomainCidrResponseBody body;

    public static DescribeDcdnIpaDomainCidrResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnIpaDomainCidrResponse self = new DescribeDcdnIpaDomainCidrResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnIpaDomainCidrResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnIpaDomainCidrResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnIpaDomainCidrResponse setBody(DescribeDcdnIpaDomainCidrResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnIpaDomainCidrResponseBody getBody() {
        return this.body;
    }

}
