// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainCnameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDcdnDomainCnameResponseBody body;

    public static DescribeDcdnDomainCnameResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainCnameResponse self = new DescribeDcdnDomainCnameResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainCnameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnDomainCnameResponse setBody(DescribeDcdnDomainCnameResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnDomainCnameResponseBody getBody() {
        return this.body;
    }

}
