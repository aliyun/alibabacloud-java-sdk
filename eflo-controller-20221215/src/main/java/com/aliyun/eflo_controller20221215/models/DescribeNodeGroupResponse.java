// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class DescribeNodeGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeNodeGroupResponseBody body;

    public static DescribeNodeGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNodeGroupResponse self = new DescribeNodeGroupResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNodeGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNodeGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeNodeGroupResponse setBody(DescribeNodeGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNodeGroupResponseBody getBody() {
        return this.body;
    }

}
