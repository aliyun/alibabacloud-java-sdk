// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeUnhealthyHostAvailabilityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeUnhealthyHostAvailabilityResponseBody body;

    public static DescribeUnhealthyHostAvailabilityResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUnhealthyHostAvailabilityResponse self = new DescribeUnhealthyHostAvailabilityResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUnhealthyHostAvailabilityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUnhealthyHostAvailabilityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUnhealthyHostAvailabilityResponse setBody(DescribeUnhealthyHostAvailabilityResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUnhealthyHostAvailabilityResponseBody getBody() {
        return this.body;
    }

}
