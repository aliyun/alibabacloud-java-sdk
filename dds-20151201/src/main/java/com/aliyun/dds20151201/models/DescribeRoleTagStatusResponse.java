// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeRoleTagStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRoleTagStatusResponseBody body;

    public static DescribeRoleTagStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRoleTagStatusResponse self = new DescribeRoleTagStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRoleTagStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRoleTagStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRoleTagStatusResponse setBody(DescribeRoleTagStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRoleTagStatusResponseBody getBody() {
        return this.body;
    }

}
