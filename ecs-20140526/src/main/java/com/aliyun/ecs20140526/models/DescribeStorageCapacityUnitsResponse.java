// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeStorageCapacityUnitsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeStorageCapacityUnitsResponseBody body;

    public static DescribeStorageCapacityUnitsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeStorageCapacityUnitsResponse self = new DescribeStorageCapacityUnitsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeStorageCapacityUnitsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeStorageCapacityUnitsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeStorageCapacityUnitsResponse setBody(DescribeStorageCapacityUnitsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeStorageCapacityUnitsResponseBody getBody() {
        return this.body;
    }

}
