// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainRealTimeTrafficDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDomainRealTimeTrafficDataResponseBody body;

    public static DescribeDomainRealTimeTrafficDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainRealTimeTrafficDataResponse self = new DescribeDomainRealTimeTrafficDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainRealTimeTrafficDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainRealTimeTrafficDataResponse setBody(DescribeDomainRealTimeTrafficDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainRealTimeTrafficDataResponseBody getBody() {
        return this.body;
    }

}
