// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeStorageResourceUsageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeStorageResourceUsageResponseBody body;

    public static DescribeStorageResourceUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeStorageResourceUsageResponse self = new DescribeStorageResourceUsageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeStorageResourceUsageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeStorageResourceUsageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeStorageResourceUsageResponse setBody(DescribeStorageResourceUsageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeStorageResourceUsageResponseBody getBody() {
        return this.body;
    }

}
