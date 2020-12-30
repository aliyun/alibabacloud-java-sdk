// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainHttpCodeDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDomainHttpCodeDataResponseBody body;

    public static DescribeDomainHttpCodeDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainHttpCodeDataResponse self = new DescribeDomainHttpCodeDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainHttpCodeDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainHttpCodeDataResponse setBody(DescribeDomainHttpCodeDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainHttpCodeDataResponseBody getBody() {
        return this.body;
    }

}
