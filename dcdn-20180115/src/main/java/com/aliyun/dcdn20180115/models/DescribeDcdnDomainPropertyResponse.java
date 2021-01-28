// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainPropertyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDcdnDomainPropertyResponseBody body;

    public static DescribeDcdnDomainPropertyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainPropertyResponse self = new DescribeDcdnDomainPropertyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainPropertyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnDomainPropertyResponse setBody(DescribeDcdnDomainPropertyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnDomainPropertyResponseBody getBody() {
        return this.body;
    }

}
