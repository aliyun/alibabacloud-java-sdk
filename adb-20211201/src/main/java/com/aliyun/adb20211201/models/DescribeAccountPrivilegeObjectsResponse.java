// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeAccountPrivilegeObjectsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAccountPrivilegeObjectsResponseBody body;

    public static DescribeAccountPrivilegeObjectsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccountPrivilegeObjectsResponse self = new DescribeAccountPrivilegeObjectsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAccountPrivilegeObjectsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAccountPrivilegeObjectsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAccountPrivilegeObjectsResponse setBody(DescribeAccountPrivilegeObjectsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAccountPrivilegeObjectsResponseBody getBody() {
        return this.body;
    }

}
