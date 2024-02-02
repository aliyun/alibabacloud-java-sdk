// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeCapacityReservationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCapacityReservationsResponseBody body;

    public static DescribeCapacityReservationsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCapacityReservationsResponse self = new DescribeCapacityReservationsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCapacityReservationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCapacityReservationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCapacityReservationsResponse setBody(DescribeCapacityReservationsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCapacityReservationsResponseBody getBody() {
        return this.body;
    }

}
