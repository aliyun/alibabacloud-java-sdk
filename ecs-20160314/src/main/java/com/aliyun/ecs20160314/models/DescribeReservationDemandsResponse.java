// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeReservationDemandsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeReservationDemandsResponseBody body;

    public static DescribeReservationDemandsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeReservationDemandsResponse self = new DescribeReservationDemandsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeReservationDemandsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeReservationDemandsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeReservationDemandsResponse setBody(DescribeReservationDemandsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeReservationDemandsResponseBody getBody() {
        return this.body;
    }

}
