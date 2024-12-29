// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeAPSADBInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAPSADBInstancesResponseBody body;

    public static DescribeAPSADBInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAPSADBInstancesResponse self = new DescribeAPSADBInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAPSADBInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAPSADBInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAPSADBInstancesResponse setBody(DescribeAPSADBInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAPSADBInstancesResponseBody getBody() {
        return this.body;
    }

}
