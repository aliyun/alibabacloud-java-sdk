// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeDomainQpsWithCacheResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDomainQpsWithCacheResponseBody body;

    public static DescribeDomainQpsWithCacheResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainQpsWithCacheResponse self = new DescribeDomainQpsWithCacheResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainQpsWithCacheResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainQpsWithCacheResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainQpsWithCacheResponse setBody(DescribeDomainQpsWithCacheResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainQpsWithCacheResponseBody getBody() {
        return this.body;
    }

}
