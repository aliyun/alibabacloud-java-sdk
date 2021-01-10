// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainTrafficDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLiveDomainTrafficDataResponseBody body;

    public static DescribeLiveDomainTrafficDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainTrafficDataResponse self = new DescribeLiveDomainTrafficDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainTrafficDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveDomainTrafficDataResponse setBody(DescribeLiveDomainTrafficDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveDomainTrafficDataResponseBody getBody() {
        return this.body;
    }

}
