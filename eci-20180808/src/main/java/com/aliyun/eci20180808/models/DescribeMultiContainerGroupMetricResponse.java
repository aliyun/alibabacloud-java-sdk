// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class DescribeMultiContainerGroupMetricResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeMultiContainerGroupMetricResponseBody body;

    public static DescribeMultiContainerGroupMetricResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMultiContainerGroupMetricResponse self = new DescribeMultiContainerGroupMetricResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMultiContainerGroupMetricResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMultiContainerGroupMetricResponse setBody(DescribeMultiContainerGroupMetricResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMultiContainerGroupMetricResponseBody getBody() {
        return this.body;
    }

}
