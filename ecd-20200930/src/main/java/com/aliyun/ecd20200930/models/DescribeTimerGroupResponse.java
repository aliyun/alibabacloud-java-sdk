// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeTimerGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTimerGroupResponseBody body;

    public static DescribeTimerGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTimerGroupResponse self = new DescribeTimerGroupResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTimerGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTimerGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTimerGroupResponse setBody(DescribeTimerGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTimerGroupResponseBody getBody() {
        return this.body;
    }

}
