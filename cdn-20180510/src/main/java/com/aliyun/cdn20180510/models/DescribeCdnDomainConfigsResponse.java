// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnDomainConfigsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCdnDomainConfigsResponseBody body;

    public static DescribeCdnDomainConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnDomainConfigsResponse self = new DescribeCdnDomainConfigsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCdnDomainConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCdnDomainConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCdnDomainConfigsResponse setBody(DescribeCdnDomainConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCdnDomainConfigsResponseBody getBody() {
        return this.body;
    }

}
