// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainConfigsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeDcdnDomainConfigsResponse setBody(DescribeDcdnDomainConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnDomainConfigsResponseBody getBody() {
        return this.body;
    }

}
