// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20190620.models;

import com.aliyun.tea.*;

public class DescribeDBInstancesForDmsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDBInstancesForDmsResponseBody body;

    public static DescribeDBInstancesForDmsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstancesForDmsResponse self = new DescribeDBInstancesForDmsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstancesForDmsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBInstancesForDmsResponse setBody(DescribeDBInstancesForDmsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBInstancesForDmsResponseBody getBody() {
        return this.body;
    }

}
