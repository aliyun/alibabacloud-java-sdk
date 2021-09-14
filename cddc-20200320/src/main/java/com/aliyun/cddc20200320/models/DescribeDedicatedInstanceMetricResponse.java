// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class DescribeDedicatedInstanceMetricResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDedicatedInstanceMetricResponseBody body;

    public static DescribeDedicatedInstanceMetricResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDedicatedInstanceMetricResponse self = new DescribeDedicatedInstanceMetricResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDedicatedInstanceMetricResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDedicatedInstanceMetricResponse setBody(DescribeDedicatedInstanceMetricResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDedicatedInstanceMetricResponseBody getBody() {
        return this.body;
    }

}
