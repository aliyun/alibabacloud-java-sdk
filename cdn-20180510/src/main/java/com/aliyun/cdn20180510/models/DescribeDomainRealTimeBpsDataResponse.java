// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainRealTimeBpsDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDomainRealTimeBpsDataResponseBody body;

    public static DescribeDomainRealTimeBpsDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainRealTimeBpsDataResponse self = new DescribeDomainRealTimeBpsDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainRealTimeBpsDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainRealTimeBpsDataResponse setBody(DescribeDomainRealTimeBpsDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainRealTimeBpsDataResponseBody getBody() {
        return this.body;
    }

}
