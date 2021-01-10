// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class DescribeContainerGroupMetricResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeContainerGroupMetricResponseBody body;

    public static DescribeContainerGroupMetricResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeContainerGroupMetricResponse self = new DescribeContainerGroupMetricResponse();
        return TeaModel.build(map, self);
    }

    public DescribeContainerGroupMetricResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeContainerGroupMetricResponse setBody(DescribeContainerGroupMetricResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeContainerGroupMetricResponseBody getBody() {
        return this.body;
    }

}
