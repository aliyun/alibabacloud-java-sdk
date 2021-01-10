// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainLimitResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLiveDomainLimitResponseBody body;

    public static DescribeLiveDomainLimitResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainLimitResponse self = new DescribeLiveDomainLimitResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainLimitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveDomainLimitResponse setBody(DescribeLiveDomainLimitResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveDomainLimitResponseBody getBody() {
        return this.body;
    }

}
