// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainRealTimeBpsDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLiveDomainRealTimeBpsDataResponseBody body;

    public static DescribeLiveDomainRealTimeBpsDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainRealTimeBpsDataResponse self = new DescribeLiveDomainRealTimeBpsDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainRealTimeBpsDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveDomainRealTimeBpsDataResponse setBody(DescribeLiveDomainRealTimeBpsDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveDomainRealTimeBpsDataResponseBody getBody() {
        return this.body;
    }

}
