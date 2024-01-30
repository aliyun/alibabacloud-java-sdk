// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeDBInstancesOverviewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDBInstancesOverviewResponseBody body;

    public static DescribeDBInstancesOverviewResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstancesOverviewResponse self = new DescribeDBInstancesOverviewResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstancesOverviewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBInstancesOverviewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBInstancesOverviewResponse setBody(DescribeDBInstancesOverviewResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBInstancesOverviewResponseBody getBody() {
        return this.body;
    }

}
