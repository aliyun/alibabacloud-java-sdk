// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainCustomLogConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDomainCustomLogConfigResponseBody body;

    public static DescribeDomainCustomLogConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainCustomLogConfigResponse self = new DescribeDomainCustomLogConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainCustomLogConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainCustomLogConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainCustomLogConfigResponse setBody(DescribeDomainCustomLogConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainCustomLogConfigResponseBody getBody() {
        return this.body;
    }

}
