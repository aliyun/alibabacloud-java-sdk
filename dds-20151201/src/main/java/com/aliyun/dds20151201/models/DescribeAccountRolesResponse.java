// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeAccountRolesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAccountRolesResponseBody body;

    public static DescribeAccountRolesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccountRolesResponse self = new DescribeAccountRolesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAccountRolesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAccountRolesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAccountRolesResponse setBody(DescribeAccountRolesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAccountRolesResponseBody getBody() {
        return this.body;
    }

}
