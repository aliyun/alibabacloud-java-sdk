// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDomainNsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDomainNsResponseBody body;

    public static DescribeDomainNsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainNsResponse self = new DescribeDomainNsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainNsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainNsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainNsResponse setBody(DescribeDomainNsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainNsResponseBody getBody() {
        return this.body;
    }

}
