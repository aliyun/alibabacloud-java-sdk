// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20190620.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceForDmsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDBInstanceForDmsResponseBody body;

    public static DescribeDBInstanceForDmsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceForDmsResponse self = new DescribeDBInstanceForDmsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceForDmsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBInstanceForDmsResponse setBody(DescribeDBInstanceForDmsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBInstanceForDmsResponseBody getBody() {
        return this.body;
    }

}
