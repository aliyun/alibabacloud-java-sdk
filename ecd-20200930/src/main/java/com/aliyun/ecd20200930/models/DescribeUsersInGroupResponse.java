// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeUsersInGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeUsersInGroupResponseBody body;

    public static DescribeUsersInGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUsersInGroupResponse self = new DescribeUsersInGroupResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUsersInGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUsersInGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUsersInGroupResponse setBody(DescribeUsersInGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUsersInGroupResponseBody getBody() {
        return this.body;
    }

}
