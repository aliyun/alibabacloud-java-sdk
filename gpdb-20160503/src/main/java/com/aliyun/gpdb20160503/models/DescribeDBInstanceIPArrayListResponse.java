// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceIPArrayListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDBInstanceIPArrayListResponseBody body;

    public static DescribeDBInstanceIPArrayListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceIPArrayListResponse self = new DescribeDBInstanceIPArrayListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceIPArrayListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBInstanceIPArrayListResponse setBody(DescribeDBInstanceIPArrayListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBInstanceIPArrayListResponseBody getBody() {
        return this.body;
    }

}
