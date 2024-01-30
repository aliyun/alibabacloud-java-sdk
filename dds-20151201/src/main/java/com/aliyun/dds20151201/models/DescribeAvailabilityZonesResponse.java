// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeAvailabilityZonesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAvailabilityZonesResponseBody body;

    public static DescribeAvailabilityZonesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailabilityZonesResponse self = new DescribeAvailabilityZonesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAvailabilityZonesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAvailabilityZonesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAvailabilityZonesResponse setBody(DescribeAvailabilityZonesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAvailabilityZonesResponseBody getBody() {
        return this.body;
    }

}
