// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainRealTimeTrafficDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLiveDomainRealTimeTrafficDataResponseBody body;

    public static DescribeLiveDomainRealTimeTrafficDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainRealTimeTrafficDataResponse self = new DescribeLiveDomainRealTimeTrafficDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainRealTimeTrafficDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveDomainRealTimeTrafficDataResponse setBody(DescribeLiveDomainRealTimeTrafficDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveDomainRealTimeTrafficDataResponseBody getBody() {
        return this.body;
    }

}
