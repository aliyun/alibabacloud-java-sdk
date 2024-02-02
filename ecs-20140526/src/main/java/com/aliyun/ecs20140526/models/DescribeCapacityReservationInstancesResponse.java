// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeCapacityReservationInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCapacityReservationInstancesResponseBody body;

    public static DescribeCapacityReservationInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCapacityReservationInstancesResponse self = new DescribeCapacityReservationInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCapacityReservationInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCapacityReservationInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCapacityReservationInstancesResponse setBody(DescribeCapacityReservationInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCapacityReservationInstancesResponseBody getBody() {
        return this.body;
    }

}
