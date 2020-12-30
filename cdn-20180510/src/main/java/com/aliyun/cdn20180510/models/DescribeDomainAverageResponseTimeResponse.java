// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainAverageResponseTimeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDomainAverageResponseTimeResponseBody body;

    public static DescribeDomainAverageResponseTimeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainAverageResponseTimeResponse self = new DescribeDomainAverageResponseTimeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainAverageResponseTimeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainAverageResponseTimeResponse setBody(DescribeDomainAverageResponseTimeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainAverageResponseTimeResponseBody getBody() {
        return this.body;
    }

}
