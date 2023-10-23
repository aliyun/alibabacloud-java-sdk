// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainsBySourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDcdnDomainsBySourceResponseBody body;

    public static DescribeDcdnDomainsBySourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainsBySourceResponse self = new DescribeDcdnDomainsBySourceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainsBySourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnDomainsBySourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnDomainsBySourceResponse setBody(DescribeDcdnDomainsBySourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnDomainsBySourceResponseBody getBody() {
        return this.body;
    }

}
