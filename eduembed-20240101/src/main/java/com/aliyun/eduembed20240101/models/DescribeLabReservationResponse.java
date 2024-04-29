// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eduembed20240101.models;

import com.aliyun.tea.*;

public class DescribeLabReservationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLabReservationResponseBody body;

    public static DescribeLabReservationResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLabReservationResponse self = new DescribeLabReservationResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLabReservationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLabReservationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLabReservationResponse setBody(DescribeLabReservationResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLabReservationResponseBody getBody() {
        return this.body;
    }

}
