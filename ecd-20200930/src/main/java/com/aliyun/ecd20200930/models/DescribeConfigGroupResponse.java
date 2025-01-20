// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeConfigGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeConfigGroupResponseBody body;

    public static DescribeConfigGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeConfigGroupResponse self = new DescribeConfigGroupResponse();
        return TeaModel.build(map, self);
    }

    public DescribeConfigGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeConfigGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeConfigGroupResponse setBody(DescribeConfigGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeConfigGroupResponseBody getBody() {
        return this.body;
    }

}
