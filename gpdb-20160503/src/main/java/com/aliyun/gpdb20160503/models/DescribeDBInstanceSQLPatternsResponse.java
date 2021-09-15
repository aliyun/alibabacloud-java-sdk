// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceSQLPatternsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDBInstanceSQLPatternsResponseBody body;

    public static DescribeDBInstanceSQLPatternsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceSQLPatternsResponse self = new DescribeDBInstanceSQLPatternsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceSQLPatternsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBInstanceSQLPatternsResponse setBody(DescribeDBInstanceSQLPatternsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBInstanceSQLPatternsResponseBody getBody() {
        return this.body;
    }

}
