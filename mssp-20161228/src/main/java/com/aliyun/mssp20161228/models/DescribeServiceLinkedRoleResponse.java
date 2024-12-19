// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mssp20161228.models;

import com.aliyun.tea.*;

public class DescribeServiceLinkedRoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeServiceLinkedRoleResponseBody body;

    public static DescribeServiceLinkedRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceLinkedRoleResponse self = new DescribeServiceLinkedRoleResponse();
        return TeaModel.build(map, self);
    }

    public DescribeServiceLinkedRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeServiceLinkedRoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeServiceLinkedRoleResponse setBody(DescribeServiceLinkedRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeServiceLinkedRoleResponseBody getBody() {
        return this.body;
    }

}
