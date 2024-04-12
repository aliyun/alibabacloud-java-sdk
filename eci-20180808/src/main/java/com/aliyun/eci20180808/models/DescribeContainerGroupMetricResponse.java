// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class DescribeContainerGroupMetricResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeContainerGroupMetricResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeContainerGroupMetricResponse setBody(DescribeContainerGroupMetricResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeContainerGroupMetricResponseBody getBody() {
        return this.body;
    }

}
