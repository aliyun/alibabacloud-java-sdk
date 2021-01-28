// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainHttpCodeDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDcdnDomainHttpCodeDataResponseBody body;

    public static DescribeDcdnDomainHttpCodeDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainHttpCodeDataResponse self = new DescribeDcdnDomainHttpCodeDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainHttpCodeDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnDomainHttpCodeDataResponse setBody(DescribeDcdnDomainHttpCodeDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnDomainHttpCodeDataResponseBody getBody() {
        return this.body;
    }

}
