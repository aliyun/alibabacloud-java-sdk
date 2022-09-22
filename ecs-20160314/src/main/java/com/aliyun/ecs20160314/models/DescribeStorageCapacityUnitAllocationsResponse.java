// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeStorageCapacityUnitAllocationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeStorageCapacityUnitAllocationsResponseBody body;

    public static DescribeStorageCapacityUnitAllocationsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeStorageCapacityUnitAllocationsResponse self = new DescribeStorageCapacityUnitAllocationsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeStorageCapacityUnitAllocationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeStorageCapacityUnitAllocationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeStorageCapacityUnitAllocationsResponse setBody(DescribeStorageCapacityUnitAllocationsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeStorageCapacityUnitAllocationsResponseBody getBody() {
        return this.body;
    }

}
