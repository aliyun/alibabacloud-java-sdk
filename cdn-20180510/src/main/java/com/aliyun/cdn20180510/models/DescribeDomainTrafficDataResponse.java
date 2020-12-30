// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainTrafficDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDomainTrafficDataResponseBody body;

    public static DescribeDomainTrafficDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainTrafficDataResponse self = new DescribeDomainTrafficDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainTrafficDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainTrafficDataResponse setBody(DescribeDomainTrafficDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainTrafficDataResponseBody getBody() {
        return this.body;
    }

}
