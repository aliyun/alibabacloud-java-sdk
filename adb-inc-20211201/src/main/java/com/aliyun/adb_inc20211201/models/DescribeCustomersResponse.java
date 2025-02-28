// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class DescribeCustomersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCustomersResponseBody body;

    public static DescribeCustomersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomersResponse self = new DescribeCustomersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCustomersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCustomersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCustomersResponse setBody(DescribeCustomersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCustomersResponseBody getBody() {
        return this.body;
    }

}
