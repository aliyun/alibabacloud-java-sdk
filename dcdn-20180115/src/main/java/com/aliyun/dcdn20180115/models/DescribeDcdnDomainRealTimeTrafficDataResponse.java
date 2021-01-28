// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainRealTimeTrafficDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDcdnDomainRealTimeTrafficDataResponseBody body;

    public static DescribeDcdnDomainRealTimeTrafficDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainRealTimeTrafficDataResponse self = new DescribeDcdnDomainRealTimeTrafficDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainRealTimeTrafficDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnDomainRealTimeTrafficDataResponse setBody(DescribeDcdnDomainRealTimeTrafficDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnDomainRealTimeTrafficDataResponseBody getBody() {
        return this.body;
    }

}
