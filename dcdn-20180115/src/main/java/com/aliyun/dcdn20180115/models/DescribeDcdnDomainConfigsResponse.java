// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainConfigsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDcdnDomainConfigsResponseBody body;

    public static DescribeDcdnDomainConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainConfigsResponse self = new DescribeDcdnDomainConfigsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnDomainConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnDomainConfigsResponse setBody(DescribeDcdnDomainConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnDomainConfigsResponseBody getBody() {
        return this.body;
    }

}
