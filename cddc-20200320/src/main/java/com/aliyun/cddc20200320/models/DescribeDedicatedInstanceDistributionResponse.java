// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class DescribeDedicatedInstanceDistributionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDedicatedInstanceDistributionResponseBody body;

    public static DescribeDedicatedInstanceDistributionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDedicatedInstanceDistributionResponse self = new DescribeDedicatedInstanceDistributionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDedicatedInstanceDistributionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDedicatedInstanceDistributionResponse setBody(DescribeDedicatedInstanceDistributionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDedicatedInstanceDistributionResponseBody getBody() {
        return this.body;
    }

}
