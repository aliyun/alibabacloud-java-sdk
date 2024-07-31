// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeRtcRobotInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRtcRobotInstanceResponseBody body;

    public static DescribeRtcRobotInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRtcRobotInstanceResponse self = new DescribeRtcRobotInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRtcRobotInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRtcRobotInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRtcRobotInstanceResponse setBody(DescribeRtcRobotInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRtcRobotInstanceResponseBody getBody() {
        return this.body;
    }

}
