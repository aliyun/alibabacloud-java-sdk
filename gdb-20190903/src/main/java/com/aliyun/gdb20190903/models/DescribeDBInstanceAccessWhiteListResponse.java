// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gdb20190903.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceAccessWhiteListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDBInstanceAccessWhiteListResponseBody body;

    public static DescribeDBInstanceAccessWhiteListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceAccessWhiteListResponse self = new DescribeDBInstanceAccessWhiteListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceAccessWhiteListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBInstanceAccessWhiteListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBInstanceAccessWhiteListResponse setBody(DescribeDBInstanceAccessWhiteListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBInstanceAccessWhiteListResponseBody getBody() {
        return this.body;
    }

}
