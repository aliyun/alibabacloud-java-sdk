// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnIpaDomainConfigsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDcdnIpaDomainConfigsResponseBody body;

    public static DescribeDcdnIpaDomainConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnIpaDomainConfigsResponse self = new DescribeDcdnIpaDomainConfigsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnIpaDomainConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnIpaDomainConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnIpaDomainConfigsResponse setBody(DescribeDcdnIpaDomainConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnIpaDomainConfigsResponseBody getBody() {
        return this.body;
    }

}
