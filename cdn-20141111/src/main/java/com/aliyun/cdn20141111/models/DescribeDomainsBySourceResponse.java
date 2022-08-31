// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20141111.models;

import com.aliyun.tea.*;

public class DescribeDomainsBySourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDomainsBySourceResponseBody body;

    public static DescribeDomainsBySourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainsBySourceResponse self = new DescribeDomainsBySourceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainsBySourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainsBySourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainsBySourceResponse setBody(DescribeDomainsBySourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainsBySourceResponseBody getBody() {
        return this.body;
    }

}
