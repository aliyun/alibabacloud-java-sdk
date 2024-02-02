// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstanceRamRoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInstanceRamRoleResponseBody body;

    public static DescribeInstanceRamRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceRamRoleResponse self = new DescribeInstanceRamRoleResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceRamRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceRamRoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstanceRamRoleResponse setBody(DescribeInstanceRamRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceRamRoleResponseBody getBody() {
        return this.body;
    }

}
