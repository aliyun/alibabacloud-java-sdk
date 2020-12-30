// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainRealTimeDetailDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDomainRealTimeDetailDataResponseBody body;

    public static DescribeDomainRealTimeDetailDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainRealTimeDetailDataResponse self = new DescribeDomainRealTimeDetailDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainRealTimeDetailDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainRealTimeDetailDataResponse setBody(DescribeDomainRealTimeDetailDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainRealTimeDetailDataResponseBody getBody() {
        return this.body;
    }

}
