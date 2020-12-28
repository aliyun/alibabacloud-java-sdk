// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeCapacityReservationInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeCapacityReservationInstancesResponse setBody(DescribeCapacityReservationInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCapacityReservationInstancesResponseBody getBody() {
        return this.body;
    }

}
