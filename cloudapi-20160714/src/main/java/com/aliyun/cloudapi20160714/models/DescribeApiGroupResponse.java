// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeApiGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeApiGroupResponseBody body;

    public static DescribeApiGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiGroupResponse self = new DescribeApiGroupResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApiGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApiGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApiGroupResponse setBody(DescribeApiGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApiGroupResponseBody getBody() {
        return this.body;
    }

}
