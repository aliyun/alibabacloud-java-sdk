// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainBpsDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLiveDomainBpsDataResponseBody body;

    public static DescribeLiveDomainBpsDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainBpsDataResponse self = new DescribeLiveDomainBpsDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainBpsDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveDomainBpsDataResponse setBody(DescribeLiveDomainBpsDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveDomainBpsDataResponseBody getBody() {
        return this.body;
    }

}
