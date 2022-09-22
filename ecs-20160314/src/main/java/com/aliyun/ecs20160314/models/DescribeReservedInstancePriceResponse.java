// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeReservedInstancePriceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeReservedInstancePriceResponseBody body;

    public static DescribeReservedInstancePriceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeReservedInstancePriceResponse self = new DescribeReservedInstancePriceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeReservedInstancePriceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeReservedInstancePriceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeReservedInstancePriceResponse setBody(DescribeReservedInstancePriceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeReservedInstancePriceResponseBody getBody() {
        return this.body;
    }

}
