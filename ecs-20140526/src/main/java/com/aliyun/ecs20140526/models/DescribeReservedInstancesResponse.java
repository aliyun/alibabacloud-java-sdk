// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeReservedInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeReservedInstancesResponseBody body;

    public static DescribeReservedInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeReservedInstancesResponse self = new DescribeReservedInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeReservedInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeReservedInstancesResponse setBody(DescribeReservedInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeReservedInstancesResponseBody getBody() {
        return this.body;
    }

}
