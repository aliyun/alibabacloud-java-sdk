// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class DescribeCapacityReservationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCapacityReservationResponseBody body;

    public static DescribeCapacityReservationResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCapacityReservationResponse self = new DescribeCapacityReservationResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCapacityReservationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCapacityReservationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCapacityReservationResponse setBody(DescribeCapacityReservationResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCapacityReservationResponseBody getBody() {
        return this.body;
    }

}
