// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeAccountPrivilegesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAccountPrivilegesResponseBody body;

    public static DescribeAccountPrivilegesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccountPrivilegesResponse self = new DescribeAccountPrivilegesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAccountPrivilegesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAccountPrivilegesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAccountPrivilegesResponse setBody(DescribeAccountPrivilegesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAccountPrivilegesResponseBody getBody() {
        return this.body;
    }

}
