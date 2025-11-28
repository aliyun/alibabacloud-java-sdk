// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class DescribeAccountRoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAccountRoleResponseBody body;

    public static DescribeAccountRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccountRoleResponse self = new DescribeAccountRoleResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAccountRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAccountRoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAccountRoleResponse setBody(DescribeAccountRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAccountRoleResponseBody getBody() {
        return this.body;
    }

}
