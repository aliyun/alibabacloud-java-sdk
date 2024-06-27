// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeRolesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRolesResponseBody body;

    public static DescribeRolesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRolesResponse self = new DescribeRolesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRolesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRolesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRolesResponse setBody(DescribeRolesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRolesResponseBody getBody() {
        return this.body;
    }

}
