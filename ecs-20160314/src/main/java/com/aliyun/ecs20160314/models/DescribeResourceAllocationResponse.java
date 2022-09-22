// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeResourceAllocationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeResourceAllocationResponseBody body;

    public static DescribeResourceAllocationResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceAllocationResponse self = new DescribeResourceAllocationResponse();
        return TeaModel.build(map, self);
    }

    public DescribeResourceAllocationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeResourceAllocationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeResourceAllocationResponse setBody(DescribeResourceAllocationResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeResourceAllocationResponseBody getBody() {
        return this.body;
    }

}
