// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceOnECSAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDBInstanceOnECSAttributeResponseBody body;

    public static DescribeDBInstanceOnECSAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceOnECSAttributeResponse self = new DescribeDBInstanceOnECSAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceOnECSAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBInstanceOnECSAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBInstanceOnECSAttributeResponse setBody(DescribeDBInstanceOnECSAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBInstanceOnECSAttributeResponseBody getBody() {
        return this.body;
    }

}
