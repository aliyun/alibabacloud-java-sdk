// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class DescribeDedicatedHostMetricResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDedicatedHostMetricResponseBody body;

    public static DescribeDedicatedHostMetricResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDedicatedHostMetricResponse self = new DescribeDedicatedHostMetricResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDedicatedHostMetricResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDedicatedHostMetricResponse setBody(DescribeDedicatedHostMetricResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDedicatedHostMetricResponseBody getBody() {
        return this.body;
    }

}
